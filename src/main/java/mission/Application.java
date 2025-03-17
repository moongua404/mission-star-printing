package mission;

import mission.controller.StarPrintingController;

public class Application {
    public static void main(String[] args) {
        //Todo: 프로그램 구현
        StarPrintingController starPrintingController = new StarPrintingController();

        starPrintingController.run();
    }
}
