package mission.model.starPrinterImpl;

import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level6StarPrinter implements StarPrinter {
    public int getLevel() {
        return 6;
    }

    public void print(int size) {
        IntStream.range(0, size).forEach(i -> {
            System.out.print(" ".repeat(size-i-1));
            System.out.println("* ".repeat(i+1));
        });
    }
}
