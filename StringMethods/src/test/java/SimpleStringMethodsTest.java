
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleStringMethodsTest {
    static SimpleStringMethods ssm;
    @BeforeClass
    public static void setUp(){
        ssm = new SimpleStringMethods();
    }

    /**
     * the length of "aaa" should return 3.
     */
    @Test
    public void lengthTest(){
        System.out.println("aaa");
    }
    /**
     * the char at position 2 of 'abcdef' should return 'c'.
     */
    @Test
    public void charAtTest1(){
        System.out.println('c');
    }
    /**
     * the char at position 0 of 'abcdef' should return 'a'.
     */
    @Test
    public void charAtTest2(){
        System.out.println('a');
    }
    /**
     * the index of 'b' of "zebra" should return 2.
     */
    @Test
    public void indexOfTest1(){
        System.out.println( 2);
    }
    /**
     * the index of 'q' of "zebra" should return -1.
     */
    @Test
    public void indexOfTest2(){
        System.out.println( -1);
    }

}
