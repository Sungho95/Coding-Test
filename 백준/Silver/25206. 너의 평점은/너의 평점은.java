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
            case "A+" -> sum += score * 4.5;
            case "A0" -> sum += score * 4.0;
            case "B+" -> sum += score * 3.5;
            case "B0" -> sum += score * 3.0;
            case "C+" -> sum += score * 2.5;
            case "C0" -> sum += score * 2.0;
            case "D+" -> sum += score * 1.5;
            case "D0" -> sum += score;
        }
        return sum;
    }
}