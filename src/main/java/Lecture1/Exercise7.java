package Lecture1;

public class Exercise7 {
    public static boolean binarySearch(int[] arr, int left, int right, int value) {

        if (left > right) {
            return false;
        }

        // middle index
        int mid = left + (right - left) / 2;

        // middle element
        if (arr[mid] == value) {
            return true;
        }

        // If value is smaller, search left half; otherwise, right half
        if (value < arr[mid]) {
            return binarySearch(arr, left, mid - 1, value);
        } else {
            return binarySearch(arr, mid + 1, right, value);
        }
    }
    public static boolean binarySearch(int[] arr, int value) {
        return binarySearch(arr, 0, arr.length - 1, value);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("binarySearch(arr, 7) = " + binarySearch(arr, 7));
        System.out.println("binarySearch(arr, 14) = " + binarySearch(arr, 14));
    }
}
