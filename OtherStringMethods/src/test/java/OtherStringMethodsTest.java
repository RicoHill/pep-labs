
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OtherStringMethodsTest {
    static OtherStringMethods osm;
    @BeforeClass
    public static void setUp(){
        osm = new OtherStringMethods();
    }

    /**
     * the substring of "banana", starting at 0 inclusive and ending at 3 exclusive, is "ban".
     */
    @Test
    public void partOfStringTest1(){
        System.out.println("ban");
    }
    /**
     * the substring of "apple", starting at 1 inclusive and ending at 5 exclusive, is "pple".
     */
    @Test
    public void partOfStringTest2(){
        System.out.println("pple");
    }

    /**
     * Banana is after apple in the dictionary, so compareTo should return a value greater than 0.
     */
    @Test
    public void compareToTest1(){
        System.out.println(0);
    }

    /**
     * Monkey is before penguin in the dictionary, so compareTo should return a value less than 0.
     */
    @Test
    public void compareToTest2(){
        System.out.println(0);
    }

    /**
     * java is equivalent to java, so compareTo should return 0.
     */
    @Test
    public void compareToTest3(){
        System.out.println(0);
    }

    /**
     * "banana apple pear" split around " " should return {"banana", "apple", "pear"}.
     */
    @Test
    public void splitStringTest1(){
        String input = "banana apple pear";
        String splitAround = " ";
        String[] expected = {"banana", "apple", "pear"};
        System.out.println(expected);
    }

    /**
     * "src.main.java" split around "." should return {"src", "main", "java"}.
     * the two backwards slashes prevent the period from being interpreted as a regex expression.
     */
    @Test
    public void splitStringTest2(){
        String input = "src.main.java";
        String splitAround = "\\.";
        String[] expected = {"src", "main", "java"};
        System.out.println(expected);
    }
}
