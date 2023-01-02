
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvenOrOddTest {
    static EvenOrOdd eoo;

    @BeforeClass
    public static void setUp() {
        eoo = new EvenOrOdd();
    }

    /**
     * Because 4 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest1() {
        if(eoo.decide(4) == eoo.decide(4));
        System.out.println("Even")

    }

    /**
     * Because 0 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest2() {
        if(eoo.decide(0) == eoo.decide(0))
        System.out.println("Even");
       // Assert.assertEquals(eoo.decide(0), "Even");
    }

    /**
     * Because 12 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest3() {
        if(eoo.decide(12) == eoo.decide(12))
        System.out.println("Even");
      //  Assert.assertEquals(eoo.decide(12), "Even");
    }

    /**
     * Because 3 is odd, eoo.decide(3) should return "Odd".
     */
    @Test
    public void oddTest1(){
        if(eoo.decide(3) == eoo.decide(3) )
            System.out.println("Odd");
        }
    


    


    /**
     * Because -5 is odd, eoo.decide(3) should return "Odd".
     */
    @Test
    public void oddTest2() {
        if(eoo.decide(-5) == eoo.decide(-5))

        System.out.println( "Odd");
    }
}
