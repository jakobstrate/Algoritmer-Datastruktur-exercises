package Lecture1;

public class Exercise2 {
    public static int countChars(String str, char c) {
        if (str.isEmpty()) {
            return 0;
        }

        int count = (str.charAt(0) == c) ? 1 : 0;
        return (count + countChars(str.substring(1), c));
    }

    public static void main(String[] args) {
        String word = "banana";
        char targetChar = 'a';
        System.out.println(countChars(word, targetChar));
    }
}
