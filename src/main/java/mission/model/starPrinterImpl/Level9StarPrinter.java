package mission.model.starPrinterImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import mission.model.StarPrinter;

public class Level9StarPrinter implements StarPrinter {
    public int getLevel() {
        return 9;
    }

    private List<String> starX(int size) {
        int width = 4 * size - 3;
        List<String> starX = new ArrayList<>(IntStream.range(0, size).mapToObj(lineIndex -> {
            StringBuilder line = new StringBuilder(" ".repeat(width));
            if (lineIndex == 0) {
                line.replace(lineIndex, lineIndex + size - 1, "*".repeat(size));
                line.replace(width - size - lineIndex, width - lineIndex, "*".repeat(size));
            }
            line.setCharAt(lineIndex, '*');
            line.setCharAt(size + lineIndex - 1, '*');
            line.setCharAt(width - lineIndex - 1, '*');
            line.setCharAt(width - (size + lineIndex), '*');
            return line.toString();
        }).toList());

        List<String> temp = new ArrayList<>(starX);
        Collections.reverse(temp);
        temp.remove(0);
        starX.addAll(temp);
        return starX;
    }

    public void print(int size) {
        starX(size).forEach(System.out::println);
    }
}


//1에서 2씩 더해지는거야
// length * 4 - 3

/*
*

 ** **
  ***
 ** **

***   ***
 * * * *
  * * *
 * * * *
***   ***

****     ****
 *  *   *  *
  *  * *  *
   *  *  *
  *  * *  *
 *  *   *  *
****     ****

 *****       *****
  *   *     *   *
   *   *   *   *
    *   * *   *
     *   *   *
    *   * *   *
   *   *   *   *
  *   *     *   *
 *****       *****


*/
