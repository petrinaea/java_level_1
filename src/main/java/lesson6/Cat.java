package lesson6;

public class Cat extends Animal{
  private final int lengthMax = 200;
  public Cat(String name, int length) {
    super(name, length);
  }

  @Override
  public void doRun(int length) {
    if (length > 200){
      System.out.println(getName() + " не может бежать больше, чем " + lengthMax + " метров");
    } else super.doRun(getLength());

  }

  @Override
  protected void doSwim(int length) {
    System.out.format("%s не умеет плавать\n",getName());
  }
}
