package Üb4;

public class Üb_4 {
    public static void main(String[] args){

        String words = "Hunde";
        int number = 5;

        if (words.length() < number){
            System.out.println("Kleine als " + number);
        } if (words.length() == number) {
            System.out.println("Es ist = wie " + number);
        }
        else {
            System.out.println("Große als " + number);
        }
    }
}
