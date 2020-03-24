package HW3;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class TestIndividualWork {


    public void testTestIndividualWork(){
        System.out.println("проверка1:");
        testTable();

        System.out.println("Проверка2:");
        testBus(7, "Комсомольская");
        testBus(8, "Комсомольская");
        testBus(9, "Ленина");
        testBus(11, "Ленина");
        testBus(12, "Тимирязевская");
        testBus(14, "Тимирязевская");
        testBus(15, "Комсомольская");
    }

    private void testBus(double time, String expect_res) {
        System.out.println(time+"минут");
        String actual_res = new IndividualWork().bus(time);
        Assert.assertEquals(actual_res, expect_res, "Тест не пройден");
        System.out.println("Тест пройден" );
    }

    private void testTable() {
        IndividualWork work = new IndividualWork();
        work.table();
    }
}
