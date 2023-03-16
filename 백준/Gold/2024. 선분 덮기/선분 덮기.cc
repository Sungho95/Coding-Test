#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
 
vector<pair<int,int> > v;
int m;
int answer=0;
 
 
bool cmp(pair<int,int> a,  pair<int,int> b){
    if(a.first == b.first){
        return a.second < b.second;
    }
    return a.first < b.first;
}
 
 
int main(void){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    cin >> m;
    
    int l, r;
    while(true){
        cin >> l >> r;
        
        // 시작과 끝의 조건을 절대값으로 안내되어서 아래와 같이 조정이 필요  
        if(l>r){
            int tmp = l;
            l = r;
            r = tmp;
        }
        
        if(l==0 && r==0) break;
        if(r<0 || l>m || l==r) continue;
        
        v.push_back({l, r});
    }
    
    // 시작점 오름차순, 끝점 오름차순  
    sort(v.begin(), v.end(), cmp);
    
    int cur = 0;
    int idx = 0;
    
    while(true){
        
        int maxNum = -1;
        
        for(; idx<v.size(); idx++){
            if(v[idx].first <= cur){ // 다음에 들어오는 값이 현재 지점 이하인가  
                if(v[idx].second > maxNum) // 저장된 최대 끝지점 보다 큰 가? 
                    maxNum = v[idx].second;
            }
            else break;    
        }
        
        // 다음에 들어오는 시작점이 현재 시작점을 포함하지 못하므로 선분을 덮을 수 없음  
        if(maxNum == -1){
            cout << "0" << endl;
            break;
        }
        
        answer ++;
        if(maxNum >= m){
            cout <<  answer << endl;
            break;
        }
        // 시작점을 최대 끝지점으로 변경  
        cur = maxNum;
    }
}
