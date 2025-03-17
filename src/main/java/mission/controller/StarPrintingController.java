package mission.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mission.model.starPrinterImpl.Level1StarPrinter;
import mission.model.starPrinterImpl.Level2StarPrinter;
import mission.model.starPrinterImpl.Level3StarPrinter;
import mission.model.starPrinterImpl.Level4StarPrinter;
import mission.model.StarPrinter;
import mission.model.starPrinterImpl.Level5StarPrinter;
import mission.model.starPrinterImpl.Level6StarPrinter;
import mission.model.starPrinterImpl.Level7StarPrinter;
import mission.model.starPrinterImpl.Level8StarPrinter;
import mission.model.starPrinterImpl.Level9StarPrinter;
import mission.view.InputView;

public class StarPrintingController {
    InputView inputView = new InputView();

    public void run() {
        switcher(inputView.getLevel()).print(inputView.getSize());

    }

    private List<StarPrinter> composeStarPrinters() {
        List<StarPrinter> printers = new ArrayList<StarPrinter>();
        printers.add(new Level1StarPrinter());
        printers.add(new Level2StarPrinter());
        printers.add(new Level3StarPrinter());
        printers.add(new Level4StarPrinter());
        printers.add(new Level5StarPrinter());
        printers.add(new Level6StarPrinter());
        printers.add(new Level7StarPrinter());
        printers.add(new Level8StarPrinter());
        printers.add(new Level9StarPrinter());
        return printers;
    }

    public StarPrinter switcher(int level) {
        return composeStarPrinters().stream()
                .filter(printer -> printer.getLevel() == level)
                .findFirst()
                .orElseThrow();
    }
}
