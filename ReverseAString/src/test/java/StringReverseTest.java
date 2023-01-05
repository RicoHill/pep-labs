
import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {
    StringReverse sr = new StringReverse();

    /**
     * The reverse of "abc" is "cba".
     */
    @Test
    public void StringReverseTest1(){
        String s = "abc";
        String target = "cba";
        System.out.println(target);
    }

    /**
     * The reverse of "racecar" is "racecar".
     */
    @Test
    public void StringReverseTest2(){
        String s = "racecar";
        String target = "racecar";
        System.out.print(target);
    }

    /**
     * The reverse of "f" is "f".
     */
    @Test
    public void StringReverseTest3(){
        String s = "f";
        String target = "f";
        System.out.println(target);
    }

    /**
     * The reverse of "" is "".
     */
    @Test
    public void StringReverseTest4(){
        String s = "";
        String target = "";
        System.out.println(target);
    }

    /**
     * The reverse of "pillow" is "wollip".
     */
    @Test
    public void StringReverseTest5(){
        String s = "pillow";
        String target = "wollip";
        System.out.println(target);
    }
}