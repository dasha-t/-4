package HW3;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class TestEmployeeCard {

    public static void testEmployeeCard(String name, int age,double effective,  double salary, boolean isWoman) {
        String sex ="";
        if(isWoman) {sex="Женский";} else sex="Мужской";

        String expect_res= "Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - "+sex;
        String actual_res= new EmployeeCard(name, age,effective, salary,isWoman).toString();
        System.out.println("expect_res:"+expect_res);
        System.out.println("actual_res:"+actual_res);
        Assert.assertEquals(actual_res, expect_res, "Тест не пройден");


        //EmployeeCard employeeCard = new EmployeeCard(name,effective,salary,isWoman);
        //System.out.println (employeeCard.toString());




    }

}
