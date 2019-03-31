public class Person {
    String name = " ";
    String surname = " ";
    String secondname = " ";
    String position = " ";
    String email = " ";
    long phone;
    int salary;
    int age;

    Person(String name, String surname, String secondname, String position, String email,
           long phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Меня зовут " + name + " " + secondname + " " + surname + " , мой возраст  " +
                age);
        System.out.println("Моя электронная почта " + email);
        System.out.println("Мой телефон " + phone);
        System.out.println("Я работаю на должности " + position + " с зарплатой " + salary + " руб.");
        System.out.println();
    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Василий", "Гайкин", "Иваныч",
                "инженер", "gaikin@mail.ru", 880555353, 63000, 42);
        persArray[1] = new Person("Андрей", "Иванов", "Петрович",
                "рабочий", "coolAndrey@mail.ru", 812355353, 17000, 55);
        persArray[2] = new Person("Изя", "Шниперсон", "сын Адама",
                "топ-менеджер", "IziaJud@yahoo.com", 77777777, 1500000, 35);
        persArray[3] = new Person("Ольга", "Аникеева", "Николаевна",
                "программист", "nyash_myash@mail.ru", 865412366, 150000, 41);
        persArray[4] = new Person("Гадя", "Хренова", "Петрович",
                "квнщица", "hh_bu_ga_ga@bk.ru", 898564521, 250000, 30);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].printPerson();
            }
        }
    }
}
