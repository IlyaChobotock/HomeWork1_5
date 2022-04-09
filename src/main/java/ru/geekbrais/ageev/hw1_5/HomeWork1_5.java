package ru.geekbrais.ageev.hw1_5;

public class HomeWork1_5 {

    public static void main(String[] args) {

        // Возраст для проверки

        int ageCheck = 40;

        // Создаем массив из 5 сотрудников в соответсвии с задачей 4

        Employee[] person = new Employee[5];
        person[0] = new Employee("Иванов Петр", "Инженер", "ivpetr@mail.ru", "+79105221487", 40000, 51);
        person[1] = new Employee("Петров Иван", "Инженер 3 кат.", "petriv@inbox.ru", "+79225478710", 50000, 28);
        person[2] = new Employee("Семен Негодяев", "Инженер 2 кат.", "semenych@bk.ru", "+79321354148", 55000, 42);
        person[3] = new Employee("Игорь Пришвин", "Инженер 1 кат.", "gareee@mail.ru", "+79115221000", 70000, 40);
        person[4] = new Employee("Михаил Лермонтов", "Начальник отдела", "Lermontov@ya.ru", "+79109101010", 150000, 207);

        // С помощью цикла ищем сотрудников старше 40 лет

        for (Employee e : person){
            if (e.getAge() > ageCheck){
                e.printInfo();
            }
        }
    }
}
