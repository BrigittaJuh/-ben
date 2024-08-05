package Üben17;

public class Üb_17 {
    public static void main(String[] args) {
        int[] number = {5,6,8,2,3,4,9,7,1};

        for (int i = 0; i < number.length -1; i++) {
            for (int j = 0; j < number.length -1 -i; j++) {
                if(number[j] > number[j + 1]){
                    int temp = number[j];
                    number[j] = number[j +1];
                    number[j + 1] = temp;
                }
            }
        }
        System.out.println("rendezett szamok kiiratasa");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }

    }
}
