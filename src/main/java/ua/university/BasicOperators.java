package ua.university;

import java.util.Arrays;

/
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /
     * Returns the sum and average of three integers.
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    /
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /
     * Returns the corresponding grade letter for a given numeric score.
     */
    public static char gradeFromScore(int score) {
        if (score < 0  score > 100) throw new IllegalArgumentException("Invalid score");
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: throw new IllegalArgumentException("Invalid day");
        }
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = n - i;
        return arr;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative factorial");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Null array");
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length / 2; i++) {
            int tmp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = tmp;
        }
        return copy;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException("Null matrix");
        int sum = 0;
        for (int[] row : matrix) for (int v : row) sum += v;
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("Null string");
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null  arr.length == 0) throw new IllegalArgumentException("Empty array");
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if (n <= 0) throw new IllegalArgumentException("Invalid size");
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                table[i][j] = (i + 1) * (j + 1);
        return table;
    }
/
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) return new int[]{};
        int[] arr = new int[n / 2];
        for (int i = 0; i < arr.length; i++) arr[i] = 2 * (i + 1);
        return arr;
    }

    /
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    /
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException("Null string");
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) if (vowels.indexOf(c) >= 0) count++;
        return count;
    }

    /
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative n");
        int[] arr = new int[n];
        if (n > 0) arr[0] = 0;
        if (n > 1) arr[1] = 1;
        for (int i = 2; i < n; i++) arr[i] = arr[i - 1] + arr[i - 2];
        return arr;
    }

    /
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) throw new IllegalArgumentException("Invalid matrix");
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }

    /
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Null array");
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }
}
