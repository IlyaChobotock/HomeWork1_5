package ru.geekbrais.ageev.hw1_5;

public class Employee {

    // Сначала заполняем поля в соответствии с Задачей 1 (отвечают за состояние объекта)

    private int id; // Уникальный идентификатор сотрудника (по итогу нигде не использовал)
    private String fullName; // ФИО сотрудника
    private String position; // Должность сотрудника
    private String eMail; // Почта сотрудника
    private String phoneNumber; // Номер телефона сотрудника
    private int salary; // Зарплата сотрудника
    private int age; // Возраст сотрудника

    // Создаем конструктор класса в соответсвии с Задачей 2

    public Employee(String fullName, String position,String eMail, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Создаем метод, который выводит информацию об объекте в консоль в соответствии с Задачей 3

    public void printInfo (){
        System.out.printf("ФИО: %s\t Должность:%s\t Почта:%s\t Номер телефона:%s\t Зарплата:%d\t Возраст:%d\t", fullName, position, eMail, phoneNumber, salary, age);
        System.out.println();
    }

    // Геттер для получения возраста

    public int getAge(){
        return age;
    }
}
