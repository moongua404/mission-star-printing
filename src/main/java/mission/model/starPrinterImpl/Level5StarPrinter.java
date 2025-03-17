package mission.model.starPrinterImpl;

import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level5StarPrinter implements StarPrinter {
    public int getLevel() {
        return 5;
    }

    public void print(int size) {
        IntStream.range(0, size * 2).forEach(row -> {
            IntStream.range(0, size).forEach(col -> {
                if ((row + col) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            });
            System.out.println();
        });
    }
}
