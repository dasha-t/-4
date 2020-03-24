package HW3;

import java.io.IOException;



public class Test {
    public static void main(String[]args) throws Exception {
        //test TestCalculation
        TestCalculation a = new TestCalculation();
        a.testDiscount(12,15);
        a.testDiscount(14,15);
        a.testDiscount(16,0);
        a.testDiscount(3,30);
        a.testDiscount(9,20);
        a.testDiscount(0,30);


        TestCalculation b = new TestCalculation();
        b.testCountTicketPrice(100,20,80);

        // Вывести несколько сотрудников с разнымии параметрами.
        // Используйте метод toString для вывода информации о работнике.
        // Пример: Имя работника - Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - мужской.

        TestEmployeeCard c = new TestEmployeeCard();
        c.testEmployeeCard("Антон",28,15.5,20,  false);



        TestIndividualWork d= new TestIndividualWork();
        d.testTestIndividualWork();

    }
}
