package ua.university;

import java.util.Arrays;

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

    public static String dayOfWeek(int d) {
        if (d == 1) return "Monday";
        if (d == 2) return "Tuesday";
        if (d == 3) return "Wednesday";
        if (d == 4) return "Thursday";
        if (d == 5) return "Friday";
        if (d == 6) return "Saturday";
        if (d == 7) return "Sunday";
        throw new IllegalArgumentException("Day must be 1..7");
    }

    public static int[] countdown(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative n not allowed");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        long fact = 1;
        int i = 2;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static int[] reverseArray(int[] data) {
        if (data == null) throw new IllegalArgumentException("Array is null");
        int[] copy = Arrays.copyOf(data, data.length);
        for (int l = 0, r = copy.length - 1; l < r; l++, r--) {
            int tmp = copy[l];
            copy[l] = copy[r];
            copy[r] = tmp;
        }
        return copy;
    }

    public static int sumMatrix(int[][] m) {
        if (m == null) throw new IllegalArgumentException("Matrix is null");
        int total = 0;
        for (int[] row : m) {
            for (int val : row) {
                total += val;
            }
        }
        return total;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("Null string");
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Empty array");
        int min = arr[0], max = arr[0];
        for (int el : arr) {
            if (el < min) min = el;
            else if (el > max) max = el;
        }
        return new int[]{min, max};
    }

    public static int[][] multiplicationTable(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be > 0");
        int[][] table = new int[n][n];
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                table[r - 1][c - 1] = r * c;
            }
        }
        return table;
    }

    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) return new int[0];
        int[] res = new int[n / 2];
        for (int i = 0; i < res.length; i++) {
            res[i] = 2 * (i + 1);
        }
        return res;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0) return false;
        }
        return true;
    }

    public static int countVowels(String s) {
        if (s == null) throw new IllegalArgumentException("Null string");
        int cnt = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    cnt++;
            }
        }
        return cnt;
    }

    public static int[] fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int[][] transpose(int[][] m) {
        if (m == null || m.length == 0) throw new IllegalArgumentException("Bad matrix");
        int r = m.length;
        int c = m[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = m[i][j];
            }
        }
        return res;
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Null array");
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted;
    }
}
