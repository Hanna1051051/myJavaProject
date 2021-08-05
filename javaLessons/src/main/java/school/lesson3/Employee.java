package school.lesson3;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата,
//возраст.

public class Employee {
    private String name;
    private String position;
    private String email;
    private int telephone;
    private int wage;
    private int age;

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об
    //объекте в консоль.
    public void info() {
        System.out.println("ФИО: " + name + "; Контактные данные: эл почта" +
                email + ", телефон " + telephone + "; Должность: " + position + "; Возраст: " + age);
    }

    //2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String name, String position, String email, int telephone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
    }

//4. Создать массив из 5 сотрудников.

    public static void main(String[] args) {

        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Ivan Ivanovich", "manager", "11@gmail.com", 2221111, 98, 45);
        emplArray[1] = new Employee("Stepan Stepanovich", "team lead", "22@gmail.com", 2222222, 83, 41);
        emplArray[2] = new Employee("Anna Stepanovich", "developer", "33@gmail.com", 2221221, 55, 27);
        emplArray[3] = new Employee("Anton Buzo", "analyst", "44@gmail.com", 2224444, 71, 43);
        emplArray[4] = new Employee("Aleks Montik", "qa", "55@gmail.com", 2225555, 86, 25);

//С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age > 40) {
                emplArray[i].info();
            }
        }

    }
}

