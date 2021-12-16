package lesson6;

public class Main {
  private int count = 0;
  public static void main(String[] args) {
    Cat cat1 = new Cat("Матроскин", 201);
    Cat cat2 = new Cat("Кыся", 12);
    Dog dog1 = new Dog("Шарик", 200);
    Dog dog2 = new Dog("Сэм", 75);

    Animal[] animals = {cat1, cat2, dog1, dog2};

    cat1.doRun(cat1.getLength());
    cat1.doSwim(cat1.getLength());
    dog1.doRun(dog1.getLength());
    dog1.doSwim(dog1.getLength());

    System.out.println("Кол-во всех животных: " + Animal.getAnimalsCount());
  }
}
