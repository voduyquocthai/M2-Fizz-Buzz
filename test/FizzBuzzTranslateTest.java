import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {

    @Test
    public void translateFizzBuzz3() {
        int number = 3;
        String expect = "Fizz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz5() {
        int number = 5;
        String expect = "Buzz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz15() {
        int number = 15;
        String expect = "FizzBuzz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz21() {
        int number = 21;
        String expect = "Fizz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz55() {
        int number = 55;
        String expect = "Buzz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz53() {
        int number = 53;
        String expect = "Buzz-Fizz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz34() {
        int number = 34;
        String expect = "Fizz-four";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz56() {
        int number = 56;
        String expect = "Buzz-six";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz16() {
        int number = 16;
        String expect = "one-six";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }@Test
    public void translateFizzBuzz74() {
        int number = 74;
        String expect = "seven-four";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expect,result);
    }
}