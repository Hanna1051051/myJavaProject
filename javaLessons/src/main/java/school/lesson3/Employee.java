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


    //   public void info() {
    //    System.out.println("ФИО: " + name + "; Контактные данные: эл почта" +
    //            email + ", телефон " + telephone + "; Должность: " + position + "; Возраст: " + age);
    //}

    //2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String name, String position, String email, int telephone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }


    //3. Вариант 2 с get  set - Внутри класса «Сотрудник» написать метод, который выводит информацию об
    //объекте в консоль.
    public int getAge() {
        return this.age;
    }
    public void setAge( int ageNew) {
        if (ageNew >= 0) {
            this.age = ageNew;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setTelephone (int telephone) {
        this.telephone = telephone;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setWage(int wage) {
        this.age = age;
    }
    public int getWage() {
        return wage;
    }

    public void getInfo() {
        System.out.printf("ФИО: %s, должность: %s, возраст: %d, контактные данные: эл почта - %s, телефон - %d , зарплата -%d", getName(), getPosition(), getAge(), getEmail(),getTelephone(), getWage());
        System.out.println();
    }

//4. Создать массив из 5 сотрудников.

    public static void main(String[] args) {

        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Ivan Ivanovich", "manager", "11@gmail.com", 2221111, 9800, 45);
        emplArray[1] = new Employee("Stepan Stepanovich", "team lead", "22@gmail.com", 2222222, 8300, 41);
        emplArray[2] = new Employee("Anna Stepanovich", "developer", "33@gmail.com", 2221221, 5500, 27);
        emplArray[3] = new Employee("Anton Buzo", "analyst", "44@gmail.com", 2224444, 2100, 43);
        emplArray[4] = new Employee("Aleks Montik", "qa", "55@gmail.com", 2225555, 1600, 25);



//         for (int i = 0; i < emplArray.length; i++) {
//            if (emplArray[i].age > 40) {
//                emplArray[i].info();
//            }
//        }
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
// Стр 107  добавила как пример использования setAge, но по условиям задачи этого не требовалось - поэтому закомментировала ее
        for (int j = 0; j < emplArray.length; j++) {
//            emplArray[j].setAge(j+38);
            if (emplArray[j].getAge() > 25) {
                emplArray[j].getInfo();
            }
        }

    }
}

