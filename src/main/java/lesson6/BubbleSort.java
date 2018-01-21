package lesson6;

public class BubbleSort {

    public static void main(String[] args) {

        //  int[] arr = {1, 34, 5, 6, 1, 0, 100, 11, -2, -111};
        int[] arr = {1, 2, 3, 4};


        for (int j = 0; j < arr.length; j++) {
            int opt = 0;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] >= arr[i + 1]) {
                    opt = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = opt;
                }
            }


            if (opt == 0) {
                break;
            }
        }


        for (int a : arr) {
            System.out.println(a);
        }

    }
}


