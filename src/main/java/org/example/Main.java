package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int number) {
        int absNumber = Math.abs(number);
        String str = String.valueOf(absNumber);

        for (int i = 0; i < str.length() / 2; i++) {
            char first = str.charAt(i);
            char last = str.charAt(str.length() - 1 - i);

            if (first != last) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number > 1;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String str = String.valueOf(number);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);

            switch (digit) {
                case '0': result += "Zero "; break;
                case '1': result += "One "; break;
                case '2': result += "Two "; break;
                case '3': result += "Three "; break;
                case '4': result += "Four "; break;
                case '5': result += "Five "; break;
                case '6': result += "Six "; break;
                case '7': result += "Seven "; break;
                case '8': result += "Eight "; break;
                case '9': result += "Nine "; break;
            }
        }

        return result.trim();
    }
}