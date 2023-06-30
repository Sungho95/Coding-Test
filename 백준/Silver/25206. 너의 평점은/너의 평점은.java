import java.util.Scanner;

public class Main {

    static final int LINE = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumGrade = 0;
        double sumScore = 0;

        for (int i = 0; i < LINE; i++) {
            String title = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            if (!grade.equals("P")) {
                sumGrade += gradeCalculator(score, grade);
                sumScore += score;
            }
        }

        double result = sumGrade / sumScore;

        System.out.printf("%f", result);
    }
    
    private static double gradeCalculator(double score, String grade) {
        double sum = 0;
        
        switch (grade) {
            case "A+":
                sum += score * 4.5;
                break;
            case "A0":
                sum += score * 4.0;
                break;
            case "B+":
                sum += score * 3.5;
                break;
            case "B0":
                sum += score * 3.0;
                break;
            case "C+":
                sum += score * 2.5;
                break;
            case "C0":
                sum += score * 2.0;
                break;
            case "D+":
                sum += score * 1.5;
                break;
            case "D0":
                sum += score * 1.0;
                break;
        }
        return sum;
    }
}
