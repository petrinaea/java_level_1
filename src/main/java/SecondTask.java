public class SecondTask {


  public static void main(String[] args) {
    boolean x = inputAndCheckNumbers(5,17);
    System.out.println(x);

    checkNumber(-89);

    boolean a =  checkNumberThroughtBoolean(45);
    System.out.println(a);

    printString("test",6);

    boolean b = checkYear(4);
    System.out.println(b);
  }




  static boolean inputAndCheckNumbers(int a, int b) {
    int sum = a + b;
    if( sum >= 10 && sum <= 20){
      return true;
    } else return false;
  }

  private static void checkNumber(int a) {
    if (a >= 0){
      System.out.println("Число положительное");
    } else System.out.println("Число отрицательное");
  }

  static boolean checkNumberThroughtBoolean(int a) {
    if (a >= 0){
      return false;
    } else return true;
  }

  private static void printString(String str, int a) {
    for (int i = 0; i < a; i++) {
      System.out.println(str);
    }

  }

  static boolean checkYear(int year) {
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0 ))){
      return true;
    } else return false;

  }


}
