package Lecture1;

public class Exercise3 {
    public static int sum (int n){
        if (n == 1){
            return 1;
        }
        return (2 * n - 1) + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(6));
    }
}
