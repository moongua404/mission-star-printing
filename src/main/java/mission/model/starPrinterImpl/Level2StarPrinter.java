package mission.model.starPrinterImpl;

import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level2StarPrinter implements StarPrinter {
    public int getLevel() {
        return 2;
    }

    public void print(int size) {
        IntStream.range(0, size)
                .forEach(i -> System.out.printf(("*".repeat(size - i)) + "%n"));
    }
}
