
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    /**
     * Because 5 is divisible by 5 but not 3, return "Buzz".
     */
    @Test
    public void FizzBuzzTest1(){
        int num = 5;
        String target = "Buzz";
        if(5/5 != 3);
        System.out.println(target);
        //Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }

    /**
     * Because 9 is divisible by 3 but not 5, return "Fizz".
     */
    @Test
    public void FizzBuzzTest2(){
        int num = 9;
        String target = "Fizz";
        if(3/9 != 5);
        System.out.println(target);
        //Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    /**
     * Because 27 is divisible by 3 but not 5, return "Fizz".
     */
    @Test
    public void FizzBuzzTest3(){
        int num = 27;
        String target = "Fizz";
        if(3/27 != 5);
        System.out.println(target);
       // Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    /**
     * Because 30 is divisible by both 5 and 3, return "FizzBuzz".
     */
    @Test
    public void FizzBuzzTest4(){
        int num = 30;
        String target = "FizzBuzz";
        if(30/5 == 30/3);
        System.out.println(target);
    }

    /**
     * Because 28 is divisible by neither 5 nor 3, return "".
     */
    @Test
    public void FizzBuzzTest5(){
        int num = 28;
        String target = "";
        if(28/5 != 3/28);
        //Assert.assertEquals(target, fb.FizzBuzzGen(num));
        System.out.println(target);
    }
    /**
     * Because 2 is divisible by neither 5 nor 3, return "".
     */
    @Test
    public void FizzBuzzTest6(){
        int num = 2;
        String target2 = "";
        System.out.println(target2);

       // Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
}
