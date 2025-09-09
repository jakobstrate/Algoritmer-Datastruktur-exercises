package Lecture1;

public class Exercise6 {
    public static boolean linear(String s, char c, int n) {
        if (n == 0) {
            return false;
        }
        if (s.charAt(n -1)== c){
            return true;
        }
        return linear(s,c,n-1);
    }

    public static void main(String[] args) {
        String test = "recursion";
        System.out.println("linear(\"" + test + "\", 'r', " + test.length() + ") = " + linear(test, 'r', test.length()));
        System.out.println("linear(\"" + test + "\", 'z', " + test.length() + ") = " + linear(test, 'z', test.length()));

    }
}
