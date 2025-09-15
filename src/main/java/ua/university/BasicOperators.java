public class BasicOperators {

    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score out of range 0–100");
        }

        switch (score / 10) {
            case 10:
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            case 5: return 'E';
            default: return 'F';
        }
    }

    public static String dayOfWeek(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: throw new IllegalArgumentException("Day must be between 1 and 7");
        }
    }

    public static void main(String[] args) {
        // Приклади викликів:

        double[] result = sumAndAverage(3, 6, 9);
        System.out.println("Sum = " + result[0] + ", Avg = " + result[1]);

        System.out.println("Max of (4, 8, 2): " + maxOfThree(4, 8, 2));

        System.out.println("Grade for 87: " + gradeFromScore(87));

        System.out.println("Day 5: " + dayOfWeek(5));
    }
}
