package lesson6;

public class MaxNum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, -1, 0};
        int maxNum = maxNum(arr);

        System.out.println(maxNum);

        int minNum = minNum(arr);

        System.out.println(minNum);
    }

    public static int maxNum(int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minNum(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

}

