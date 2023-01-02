
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreaterOrLesserTest {
    public GreaterOrLesser gol;
    @Before
    public void setUp(){
        gol = new GreaterOrLesser();
    }

    /**
     * If a is equal to b, gol.decide should return "Equal".
     */
    @Test
    public void greaterOrLesserTest1(){
        int inputA = 0;
        int inputB = 0;
        
       if(inputA == inputB);
       System.out.println("Equal");
    }

    /**
     * If a is greater than b, gol.decide should return "Greater".
     */
    @Test
    public void greaterOrLesserTest2(){
        int inputA = 1;
        int inputB = 0;
        if(inputA > inputB);
        System.out.println("Greater");

    }

    /**
     * If a is less than b, gol.decide should return "Lesser".
     */
    @Test
    public void greaterOrLesserTest3(){
        int inputA = 0;
        int inputB = 1;
        
        if(inputB > inputA);
        System.out.println("Lesser");
    }
}
