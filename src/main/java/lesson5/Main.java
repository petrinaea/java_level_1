package lesson5;

public class Main {
  public static void main(String[] args) {
    Employee [] employees = new Employee[5];
    employees[0] = new Employee("Ivanov Alex","Teacher","ivanov23@gmail.com","87775552211",45623.4,24);
    employees[1] = new Employee("Sidorov Andrey","Engineer","sidorov_AND@gmail.com","83695552711",120500.50,26);
    employees[2] = new Employee("Petrov Danila","Assistant","petrov187@gmail.com","87575552211",17000,18);
    employees[3] = new Employee("Koshkina Nastya","Doctor","koshkina_Nast@gmail.com","87375552211",250000,41);
    employees[4] = new Employee("Komarov Petr","Driver","komar_56@gmail.com","88005553535",75000,45);

    for (Employee employee : employees) {
      if (employee.getAge() > 40){
        employee.printInfo();
      }
    }

  }


}
