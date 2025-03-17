package mission.model.starPrinterImpl;

import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level3StarPrinter implements StarPrinter {
    public int getLevel() {
        return 3;
    }

    public void print(int size) {
        IntStream.range(0, size)
                .forEach(i -> System.out.printf(
                        " ".repeat(i) +
                        "*".repeat(2 * (size - i) - 1
                ) + "%n"));
    }
}
