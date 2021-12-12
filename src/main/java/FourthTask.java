import java.util.Random;
import java.util.Scanner;

public class FourthTask {
  private static final int SIZE = 5;
  private static final int WIN_SIZE = 3;
  private static final char DOT_EMPTY = '•';
  private static final char DOT_HUMAN = 'X';
  private static final char DOT_AI = '0';
  private static final char[][] MAP = new char[SIZE][SIZE];
  private static final Scanner in = new Scanner(System.in);
  private static final Random random = new Random();
  private static final String HEADER_FIRST_SYMBOL = "♥";
  private static final String SPACE_MAP = " ";
  private static int turnsCount;
  private static int count;
  private static int LAST_ROW_NUMBER;
  private static int LAST_COLUMN_NUMBER;


  public static void turnGame() {
    do {
      System.out.println("Игра начинается!");
      init();
      printMap();
      playGame();
    } while (isContinueGame());
    endGame();
  }

  private static void init() {
    turnsCount = 0;
    initMap();
  }

  private static void initMap() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        MAP[i][j] = DOT_EMPTY;

      }
    }
  }

  private static void printMap() {
    printHeaderMap();
    printBodyMap();
  }

  private static void printHeaderMap() {
    System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
    for (int i = 0; i < SIZE; i++) {
      printMapNumber(i);
    }
    System.out.println();
  }

  private static void printBodyMap() {
    for (int i = 0; i < SIZE; i++) {
      printMapNumber(i);
      for (int j = 0; j < SIZE; j++) {
        System.out.print(MAP[i][j] + SPACE_MAP);

      }
      System.out.println();
    }
  }

  private static void printMapNumber(int i) {
    System.out.print(i + 1 + SPACE_MAP);
  }

  private static void playGame() {

    while (true) {
      turnHuman();
      printMap();
      if (checkEnd(DOT_HUMAN)){
        break;
      }

      turnAI();
      printMap();
      if (checkEnd(DOT_AI)){
        break;
      }
    }
  }

  private static void turnHuman() {
    System.out.println("ХОД ЧЕЛОВЕКА");
    int rowNumber, columnNumber;
    while (true) {
      rowNumber = getValidNumberFromUser() - 1;
      columnNumber = getValidNumberFromUser() - 1;
      if (isCellFree(rowNumber,columnNumber)){
        break;
      }
      System.out.println("\nВы выбрали занятую ячейку");
    }
    MAP[rowNumber][columnNumber] = DOT_HUMAN;
    LAST_ROW_NUMBER = rowNumber;
    LAST_COLUMN_NUMBER = columnNumber;
    turnsCount++;
  }

  private static boolean isCellFree(int rowNumber, int columnNumber){
    return MAP[rowNumber][columnNumber] == DOT_EMPTY;

  }

  private static void turnAI() {
    System.out.println("ХОД КОМПЬЮТЕРА");
    int rowNumber, columnNumber;

    do {
      rowNumber = random.nextInt(SIZE);
      columnNumber = random.nextInt(SIZE);
    } while (!isCellFree(rowNumber,columnNumber));

    MAP[rowNumber][columnNumber] = DOT_AI;
    LAST_ROW_NUMBER = rowNumber;
    LAST_COLUMN_NUMBER = columnNumber;
    turnsCount++;
  }

  private static boolean checkEnd(char symbol) {
    if (checkWin(symbol)){
      if (symbol == DOT_HUMAN){
        System.out.println("Ура, вы победили");
      }else {
        System.out.println("Восстание близко...ИИ победил");
      }
      return true;
    }

    if (checkDraw(symbol)){
      System.out.println("Ничья");
      return true;
  }
    return false;
}

  private static boolean checkWin(char symbol) {
    count = 0;
    for (int i = LAST_ROW_NUMBER, j = 0; j < SIZE; j++) {
      if (symbol == MAP[i][j]){
        count++;
      } else count = 0;
      if (count == WIN_SIZE){
        return true;
      }


    }
    for (int i = 0, j = LAST_COLUMN_NUMBER; i < SIZE; i++) {
      if (symbol == MAP[i][j]){
        count++;
      } else count = 0;
      if (count == WIN_SIZE){
        return true;
      }

    }
    return false;
  }

  private static boolean checkDraw(char symbol) {
    return turnsCount >= SIZE * SIZE;

    }

  private static int getValidNumberFromUser() {
    while (true) {
      System.out.print("Введите координату(1-" + SIZE + "): ");
      if (in.hasNextInt()){
        int n = in.nextInt();
        if (isNumberValid(n)){
          return n;
        }
        System.out.println("\nПроверьте значение координаты. Должно быть от 1 до " + SIZE);

      } else {
        in.next();
        System.out.println("\nВвод допускает лишь целый числа");
      }
    }
  }

  private static boolean isNumberValid(int n) {
    return n >= 1 && n <= SIZE;
  }

  private static boolean isContinueGame() {
    System.out.println("Хотите продолжить? y\\n");
    return switch (in.next()){
      case "y","yes","+","да","ok","конечно" -> true;
      default -> false;
    };
  }

  private static void endGame() {
    in.close();
    System.out.println("Ты заходи,если что :)");
  }

}

