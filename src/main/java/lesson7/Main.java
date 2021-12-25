package lesson7;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Cat cat1 = new Cat("Матроскин");
    Cat cat2 = new Cat("Лютер");
    Cat cat3 = new Cat("Васька");
    Cat cat4 = new Cat("Барсик");

    Cat [] cats = {cat1,cat2,cat3,cat4};

    Plate plate = new Plate(0);

    while (true){
      plate.addFood(10);
      for (Cat cat : cats) {
        cat.eat(plate);
        System.out.format("Сытость кота %s равна %b\n", cat.getName(), cat.isSatiety());
      }
      plate.printInfo();
      Thread.sleep(3000);
    }
  }

}
