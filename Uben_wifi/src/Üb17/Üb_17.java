package Üb17;

public class Üb_17 {
    public static void main(String[] args) {
       int[] number = {1,5,6,8,7,9,4,};

        for (int i = 0; i < number.length -1; i++) {
            for (int j = 0; j < number.length  -1 -i; j++) {
                if(number[j] > number[i +1]){
                    int tem = number[j];
                    number[j] += number[j +1];
                    number[j +1] = tem;
                }

            }

        }
        System.out.println("rendezett szamok : ");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");

        }

    }
}
