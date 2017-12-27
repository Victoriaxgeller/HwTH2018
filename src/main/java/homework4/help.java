package homework4;

public class help {

    public static void main(String[] args) {
        int ar[] = {4, 2, 9, 7, 9, 9, 9, 9, 9};
        int min = ar[0];
        int max = ar[0];
        for (int i : ar){
            if (i<min)
                min = i;
            if (i>max)
                max = i;
        }
        int count = 0;
        for(int x : ar){
            if(max==x)
                count++;
        }
        System.out.println("min number: " +min);
        System.out.println("max number: " +max);
        System.out.println("max number appears: " +count+ " times");

    }

}
