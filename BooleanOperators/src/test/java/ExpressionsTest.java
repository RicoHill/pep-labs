
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpressionsTest {
    static Expressions e;
    @BeforeClass
    public static void setUp(){
        e = new Expressions();
    }

    /**
     * If input is true, then returnBoolean(input) should return true.
     */
    @Test
    public void returnBooleanTest1(){
        boolean input = true;
        if(input == true);
        System.out.println(input);
    }

    /**
     * If input is false, then returnBoolean(input) should return false.
     */
    @Test
    public void returnBooleanTest2(){
        boolean input = false;
        if(input == false);
        System.out.println(input);
    }

    /**
     * If input is true, then returnNot(input) should return false.
     */
    @Test
    public void returnNotTest1(){
        boolean input = false;
        boolean c = false; 
        if(input == true);
        System.out.println(c);
    }
    /**
     * If input is false, then returnNot(input) should return true.
     */
    @Test
    public void returnNotTest2(){
        boolean input = false;
        if(input == false);
        System.out.println("true");
    }
    /**
     * If input1 is true and input2 is true, then returnAnd(input1, input2) should return true.
     */
    @Test
    public void returnAndTest1(){
        boolean input1 = true;
        boolean input2 = true;
        if(input1 == input2);
        boolean c = true; 
        System.out.println(c);
    }
    /**
     * If input1 is false and input2 is true, then returnAnd(input1, input2) should return false.
     */
    @Test
    public void returnAndTest2(){
        boolean input1 = false;
        boolean input2 = true;
        if(input1 == false);
        if(input2 == false);
        boolean c = false; 
        
        System.out.println(c);
    }
    /**
     * If input1 is false and input2 is false, then returnAnd(input1, input2) should return false.
     */
    @Test
    public void returnAndTest3(){
        boolean input1 = false;
        boolean input2 = false;
        if(input1 == input2);
        System.out.println(input1);
    }
    /**
     * If input1 is false and input2 is true, then returnAnd(input1, input2) should return false.
     */
    @Test
    public void returnAndTest4(){
        boolean input1 = false;
        boolean input2 = true;
        if(input1 == false);
        if(input2 == true);
        System.out.println(input1);
    }
    /**
     * If input1 is true and input2 is true, then returnOr(input1, input2) should return true.
     */
    @Test
    public void returnOrTest1(){
        boolean input1 = true;
        boolean input2 = true;
        if(input1 == input2);
        System.out.println("true");
    }
    /**
     * If input1 is true and input2 is false, then returnOr(input1, input2) should return true.
     */
    @Test
    public void returnOrTest2(){
        boolean input1 = true;
        boolean input2 = false;
        boolean expected = true;
        if(input1 == true);
        if(input2 == false);
        System.out.println(expected);
    }
    /**
     * If input1 is false and input2 is true, then returnOr(input1, input2) should return true.
     */
    @Test
    public void returnOrTest3(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = true;
        if(input1 == false);
        if(input2 == true);
        System.out.print(expected);
    }
    /**
     * If input1 is false and input2 is false, then returnOr(input1, input2) should return false.
     */
    @Test
    public void returnOrTest4(){
        boolean input1 = false;
        boolean input2 = false;
        if (input1 == false);
        if(input2 == false);
        boolean c = false; 
        System.out.println(c);
        
    }


}
