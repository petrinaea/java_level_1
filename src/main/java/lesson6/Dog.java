package lesson6;

public class Dog extends Animal{
  private final int lengthMaxRun = 500;
  private final int lengthMaxSwim = 10;

  public Dog(String name, int length) {
    super(name, length);
  }

  @Override
  public void doRun(int length) {
    if (length > 500){
      System.out.println(getName() + " не может бежать больше, чем " + lengthMaxRun + " метров");
    } else super.doRun(getLength());
  }

  @Override
  protected void doSwim(int length) {
    if (length > 10){
      System.out.println(getName() + " не может плавать больше, чем " + lengthMaxSwim + " метров");
    } else super.doRun(getLength());
  }
}
