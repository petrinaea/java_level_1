package lesson5;

public class Employee {
  private String fullName;
  private String position;
  private String email;
  private String numberPhone;
  private double salary;
  private int age;

  public Employee(String fullName, String position, String email, String numberPhone, double salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.numberPhone = numberPhone;
    this.salary = salary;
    this.age = age;
  }

  public String toString() {
    return String.format("У сотрудника %s(позиция: %s), электронный адрес %s, мобильный номер - %s зарплата равна - %f , возраст %d ", fullName, position, email,numberPhone, salary,age);
  }

  public void printInfo(){
    System.out.println(this);
  }

  public int getAge() {
    return age;
  }
}
