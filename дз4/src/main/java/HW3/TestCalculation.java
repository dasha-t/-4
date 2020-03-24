package HW3;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TestCalculation {
    public void testTestCalculation() throws Exception {
        System.out.println();

        testDiscount(12,15);
        testDiscount(14,15);
        testDiscount(15,0);
        testDiscount(16,0);
        System.out.println();
        testCountTicketPrice(100,20,80);
        testCountTicketPrice(100,0,100);
        testCountTicketPrice(0,20,0);
    }


    public void testDiscount (double salary, double discnt) throws Exception{
        double res =0;
        System.out.println(salary);
        res =Calculation.discount(salary);
        System.out.println("Ожидаемый результат-"+ discnt+"%.Фактический результат-"+res+"%");
        Assert.assertEquals(res, discnt, "Тест не пройден");


    }
    public void testCountTicketPrice(double starting_Price, double discount, double discount_Price){
        double res=0;
        System.out.println(discount);
        res= Calculation.countTicketPrice((int) starting_Price, discount);
        Assert.assertEquals(res, discount_Price, "Тест не пройден");
        System.out.println("Ожидаемый результат-"+discount_Price+"Фактический результат-"+ res);

    }


}
