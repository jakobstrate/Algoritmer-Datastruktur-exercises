package Lecture1;


public class Exercise1 {
    public static int logTwo(int N){
        if (N==1){
            return 0;
        }
        return 1 + logTwo(N / 2);
    }
    public static void main(String[] args) {
        System.out.println(logTwo(32));
        System.out.println(logTwo(4096));
    }
}
