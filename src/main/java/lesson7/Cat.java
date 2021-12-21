package lesson7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cat {
  private String name;

  Random random = new Random();

  private final int MAX_SATIETY = random.nextInt(4) + 4;

  private int satiety;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cat(String name) {
    this.name = name;
  }

  public void eat(Plate plate) {
    satiety = Math.max(satiety - random.nextInt(5), 0);
    int appetite = MAX_SATIETY - satiety;
    int foodCount = plate.getFoodCount();
    if (foodCount >= appetite) {
      plate.decreaseFood(appetite);
      satiety = MAX_SATIETY;
    } else {
      plate.decreaseFood(foodCount);
      satiety += foodCount;
    }

  }

  public boolean isSatiety(){
    return satiety == MAX_SATIETY;
  }
}
