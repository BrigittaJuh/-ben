package FizzBuzz;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<FizzBuzzCheck> checker =
                List.of(new ModuloThreeChecker(),
                        new ModuloFiveCheck(),
                        new ModuloThreeChecker());
        Runner runner = new Runner(checker);
        runner.run();

    }
}
