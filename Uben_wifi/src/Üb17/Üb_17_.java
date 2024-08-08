package Üb17;

public class Üb_17_ {
    public static void main(String[] args) {
        int[] number = {2,5,9,7,6};

        for (int i = 0; i < number.length -1; i++) {
            for (int j = 0; j < number.length -1 -i; j++) {
                if (number[j] > number[i +1]){
                    int temp = number[j];
                    number[j] = number[j +1];
                    number[ j +1] = temp;

                }

            }

        }
        System.out.println("Rendezett szamok");
        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i] + " ");
        }

        }


    }

