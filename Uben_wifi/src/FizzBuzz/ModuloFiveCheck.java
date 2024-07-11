package FizzBuzz;

public class ModuloFiveCheck implements FizzBuzzCheck{
    @Override
    public boolean check(int number) {
        return number % 5 == 0;
    }

    @Override
    public void print() {
        System.out.println("Buzz");

    }
}
