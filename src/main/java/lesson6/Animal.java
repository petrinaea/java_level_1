package lesson6;

public abstract class Animal {
  private static int countAnimals = 0;

  private String name;
  private int length;

  public Animal(String name, int length) {
    this.name = name;
    this.length = length;

    countAnimals++;
  }

  public String getName() {
    return name;
  }

  public int getLength() {
    return length;
  }

  protected void doRun(int length){
    System.out.format("Дистанция забега животного %s равна %s метров\n",name,length);
  };
  protected void doSwim(int length){
    System.out.format("Дистанция заплыва животного %s равна %s метров\n",name,length);
  };

  public static int getAnimalsCount() {

    return countAnimals;
  }




}
