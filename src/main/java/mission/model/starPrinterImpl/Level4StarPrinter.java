package mission.model.starPrinterImpl;

import mission.model.StarPrinter;

public class Level4StarPrinter implements StarPrinter {
    public int getLevel() {
        return 4;
    }

    public void print(int size) {
        Level3StarPrinter level3StarPrinter = new Level3StarPrinter();
        Level3ReverseStarPrinter level3ReverseStarPrinter = new Level3ReverseStarPrinter();

        level3ReverseStarPrinter.print(size-1);
        level3StarPrinter.print(size);
    }
}
