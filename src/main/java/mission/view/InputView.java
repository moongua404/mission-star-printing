package mission.view;

import java.util.Scanner;
import mission.utils.MessageConstants;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public int getLevel() {
        System.out.println(MessageConstants.INPUT_LEVEL_GUIDE.getMessage());
        return Integer.parseInt(scanner.nextLine());
    }

    public int getSize() {
        System.out.println(MessageConstants.INPUT_SIZE_GUIDE.getMessage());
        return Integer.parseInt(scanner.nextLine());
    }
}
