
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComparatorsTest {
    static Comparators c;
    @BeforeClass
    public static void setUp(){
        c = new Comparators();
    }

    /**
     * If isEqual is passed two numbers that are equal, isEqual should return true.
     */
    @Test
    public void isEqualTest1(){
        int a = 1;
        int b = 1;
        boolean c = true;
        
        if(a ==b);
        System.out.println(c);
    }
        
    

        



       
    

    /**
     * If isEqual is passed two numbers that are not equal, isEqual should return false.
     */
    @Test
    public void isEqualTest2(){
        int a = 1;
        int b = 2;
        boolean c = (a != b);
        System.out.println(c);
        
    }

    /**
     * If greaterThan is passed two numbers where a is greater than b, greaterThan should return true.
     */
    @Test
    public void greaterThanTest1(){
        int a = 2;
        int b = 1;
        boolean c = true;
        if(a > b);
        System.out.println(c);
    }

    /**
     * If greaterThan is passed two numbers where a is less than b, greaterThan should return false.
     */
    @Test
    public void greaterThanTest2(){
        int a = 1;
        int b = 2;
        boolean c = (a < b);
        System.out.println(c);
    }


    /**
     * If greaterThan is passed two numbers where a is equal to b, greaterThan should return false.
     */
    @Test
    public void greaterThanTest3(){
        int a = 2;
        int b = 2;
        boolean c = false;
        if(a == b);
        System.out.println(c);
        }

    /**
     * If lessThan is passed two numbers where a is less than b, greaterThan should return true.
     */
    @Test
    public void lessThanTest1(){
        int a = 1;
        int b = 2;
        if(a < b);
        boolean c = true;
        System.out.println(c);
    }
    /**
     * If lessThan is passed two numbers where a is equal to b, greaterThan should return false.
     */
    @Test
    public void lessThanTest2(){
        int a = 2;
        int b = 2;
        boolean c = false;
        if(a == b)
        System.out.println(c);
    }
    /**
     * If lessThan is passed two numbers where a is greater than b, greaterThan should return false.
     */
    @Test
    public void lessThanTest3(){
        int a = 2;
        int b = 1;
        boolean c = false;
        if(a > b);
        System.out.println(c);
    }
    /**
     * If greaterThanOrEqualTo is passed two numbers where a is greater than b, then greaterThanOrEqualTo
     * should return true.
     */
    @Test
    public void greaterThanOrEqualToTest1(){
        int a = 2;
        int b = 1;
        boolean c = true;
        if(a >= b);
        System.out.println(c);
    }
    /**
     * If greaterThanOrEqualTo is passed two numbers where a is equal to b, then greaterThanOrEqualTo
     * should return true.
     */
    @Test
    public void greaterThanOrEqualToTest2(){
        int a = 2;
        int b = 2;
        boolean c = true;
        if(a == b);
        System.out.println(c);
    }
    
    /**
     * If greaterThanOrEqualTo is passed two numbers where a is less than b, then greaterThanOrEqualTo
     * should return false.
     */
    @Test
    public void greaterThanOrEqualToTest3(){
        int a = 3;
        int b = 4;
        boolean c = false;
        if(a >= b);
        System.out.println(c);
    }
    /**
     * If lessThanOrEqualTo is passed two numbers where a is less than b, then lessThanOrEqualTo
     * should return true.
     */
    @Test
    public void lessThanOrEqualToTest1(){
        int a = 1;
        int b = 2;
        boolean c = true;
        if(a <= b);
        System.out.println(c);
    }
    /**
     * If lessThanOrEqualTo is passed two numbers where a is equal to b, then lessThanOrEqualTo
     * should return true.
     */
    @Test
    public void lessThanOrEqualToTest2(){
        int a = 2;
        int b = 2;
        boolean c = true;
         if(a == b);
        System.out.println(c);
    }
    /**
     * If lessThanOrEqualTo is passed two numbers where a is greater than b, then lessThanOrEqualTo
     * should return false.
     */
    @Test
    public void lessThanOrEqualToTest3(){
        int a = 4;
        int b = 2;
        boolean c = false;
        if(a > b);
        System.out.println(c);

    }



    /**
     * If notEqualTo is passed two numbers where a == b, then notEqualTo
     * should return false.
     */
    @Test
    public void notEqualToTest1(){
        int a = 1;
        int b = 1;
        boolean c = false;
        if(a != b);
        System.out.println(c);
    }
    /**
     * If notEqualTo is passed two numbers where a != b, then notEqualTo
     * should return true.
     */
    @Test
    public void notEqualToTest2(){
        int a = 1;
        int b = 2;
        boolean c = true;
        if(a != b);
        System.out.println(c);
    }
}
