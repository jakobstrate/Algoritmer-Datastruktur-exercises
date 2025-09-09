package Lecture1;

public class Exercise4 {
    public static int evensquares(int n) {
        if (n == 1){
            return 4;
        }
        return (2 * n) * (2 * n) + evensquares(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(evensquares(3)); // (2^2 + 4^2 + 6^2 + 8^2)
    }
}
