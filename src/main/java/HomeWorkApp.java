public class HomeWorkApp {

  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
  }

  static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");

  }

  static void checkSumSign() {
    int a = 10;
    int b = -7;
    int c = a + b;
    if (c >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  private static void printColor() {
    int value = 58;
    if (value <= 0) {
      System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
      System.out.println("Желтый");
    } else if (value > 100) {
      System.out.println("Зеленый");
    }

  }

  private static void compareNumbers() {
    int a = 125;
    int b = -95;
    if (a >= b) {
      System.out.println("a>=b");
    } else System.out.println("a<b");
  }

}