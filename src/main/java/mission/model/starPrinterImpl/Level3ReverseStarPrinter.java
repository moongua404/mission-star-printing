package mission.model.starPrinterImpl;

import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level3ReverseStarPrinter implements StarPrinter {
    public int getLevel() {
        return -1;
    }

    public void print(int size) {
        IntStream.range(0, size)
                .forEach(i -> System.out.printf(
                        " ".repeat(size - i) +
                        "*".repeat(2 * (i) + 1
                ) + "%n"));
    }
}
