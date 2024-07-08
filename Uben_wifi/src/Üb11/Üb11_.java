package Üb11;

public class Üb11_ {
    public static void main(String[] args) {
        int[] numbers = {5,1,1,1,1,1,1,1,1,2};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
        }
        double average = (double)sum / 10;

        System.out.println(average);
    }
}
