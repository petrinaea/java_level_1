package lesson7;

public class Plate {
  private int foodCount;

  public Plate(int foodCount) {
    this.foodCount = foodCount;
  }

  public void printInfo(){
    System.out.format(" В тарелке осталось %s еды\n", foodCount);
  }

  @Override
  public String toString() {
    return "Plate{" +
            "foodCount=" + foodCount +
            '}';
  }

  public void decreaseFood(int catEatFoodCount) {
    if (foodCount < catEatFoodCount){
      System.out.println("Еда закончилась");
    } else  foodCount -= catEatFoodCount;
  }

  public int getFoodCount() {
    return foodCount;
  }

  public void setFoodCount(int foodCount) {
    this.foodCount = foodCount;
  }

  public int addFood(int foodCount){
    return this.foodCount += foodCount;
  };
}
