package Quadratzahlen;


import java.util.Arrays;
import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (int number : numbers){
            int square = number * number;
            System.out.println(number + " Quadrat :" + square);
        }

    }
}
