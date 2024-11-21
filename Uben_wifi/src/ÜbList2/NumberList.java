package ÜbList2;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Integer> numbers;

    public NumberList(){
        numbers = new ArrayList<>();
    }

    public void addNumber(int number){
        numbers.add(number);
    }
    public void removeNumber (int number){
        numbers.remove(Integer.valueOf(number));
    }

    public int sum (){
        int total = 0;
        for (int number : numbers){
            total += number;
        }
        return total;
    }
    public double average(){
        if (numbers.isEmpty()){
            return 0;
        }
        return (double) sum() / numbers.size();
    }

    public void listNumber(){
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
