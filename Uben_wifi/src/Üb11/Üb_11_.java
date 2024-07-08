package Üb11;

public class Üb_11_ {
    public static void main(String[] args) {
     int[] numb = {1,2,3,4,5,6,7,8,9,9};
     int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += numb[i];
        }
        double average = (double) sum / 10;

        System.out.println(average);

    }
}
