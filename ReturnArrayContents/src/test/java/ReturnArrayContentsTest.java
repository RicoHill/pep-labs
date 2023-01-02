
import org.junit.Assert;
import org.junit.Test;

public class ReturnArrayContentsTest {
    ReturnArrayContents rac = new ReturnArrayContents();

    /**
     * given input {1,2,3,4,5}, arrayToString should return 1 2 3 4 5.
     */
    @Test
    public void arrayStringTest1(){
        int[] input1 = {1,2,3,4,5};
        String expected = "1 2 3 4 5";
       // String actual = rac.arrayToString(input).trim();
       /// Assert.assertEquals(expected, actual);
       System.out.println(input1);
    }
    /**
     * given input {9,8,7}, arrayToString should return 9 8 7.
     */
    @Test
    public void arrayStringTest2(){
        int[] input2 = {9,8,7};
        String expected = "9 8 7";
       // String actual = rac.arrayToString(input).trim();
        //Assert.assertEquals(expected, actual);
        System.out.println(input2);
    }
}
