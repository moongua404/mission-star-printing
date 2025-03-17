package mission.model.starPrinterImpl;

import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level1StarPrinter implements StarPrinter {
    public int getLevel() {
        return 1;
    }

    public void print(int size) {
        IntStream.range(1, size+1)
                .forEach(i -> System.out.printf(("*".repeat(i)) + "%n"));
    }
}
