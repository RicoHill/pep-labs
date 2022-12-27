
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    Parrot p = new Parrot();

    /**
     * If p.copy is passed "hello", it should return "hello".
     */
    @Test
    public void parrotTestHello(){
        String input = "hello";
        String expected = "hello";
        String actual = "hello";
        String input = new p.copy;
        Assert.assertEquals(expected, actual);
        System.out.println(p.copy(input));
        System.out.println(expected);
        System.out.println(actual);

      

    }
    /**
     * If p.copy is passed "polly", it should return "polly".
     */
    @Test
    public void parrotTestPolly(){
        String input = "polly";
        String expected = "polly";
        String p.copy =  "polly"; 
        String p.copy = new 
        
       /*  System.out.println(expected); */
       /*  System.out.println(input); */
        System.out.println(p.copy(input));
    }
}
