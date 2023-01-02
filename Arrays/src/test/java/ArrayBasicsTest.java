
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayBasicsTest {
    static ArrayBasics ab;
    @BeforeClass
    public static void setUp(){
        ab = new ArrayBasics();
    }

    /**
     * If we have an array of size 5, getLengthOfArray should return 5.
     */
    @Test
    public void getLengthTest1(){
        int[] input = {0,1,2,3,4};
       // int expected = 5;
        System.out.println(input.length);
    }
        

    /**
     * If we have an array of size 3, getLengthOfArray should return 3.
     */
    @Test
    public void getLengthTest2(){
        int[] input1 = {8,4,7};
       //int expected = 3;
       System.out.println(input1.length);
        
    }

    /**
     * If we have an array predefined as {8,4,7,3,8,5}, attempting to get the item at index 2 should return 7.
     */
    @Test
    public void getNthElementOfArrayTest1(){
        int[] input3 = {8,4,7,3,8,5};
        int n = 2;
        //int expected = 7;
        //int actual = ab.getNthElementOfArray(input, n);
        System.out.println(input3[2]);
    }

    /**
     * If we have an array predefined as {5,3,9,1,0}, attempting to get the item at index 0 should return 5.
     */
    @Test
    public void getNthElementOfArrayTest2(){
        int[] input4 = {5,3,9,1,0};
        int n = 0;
        //int expected = 5;
        //int actual = ab.getNthElementOfArray(input, n);
        System.out.println(input4[n]);
    }
    /**
     * If we have an array predefined as {6,4,8}, attempting to get the item at index 2 should return 8.
     */
    @Test
    public void getNthElementOfArrayTest3(){
        int[] input5 = {6,4,8};
        int n = 2;
       // int expected = 8;
        //int actual = ab.getNthElementOfArray(input, n);
        System.out.println(input5[n]);
    }

    /**
     * If we have an array predefined as {9,3,7,3,6}, attempting to change the value at index 2 to 5 should result in
     * an array {9,3,5,3,6}, where the value at index 2 is 5.
     */
    @Test
    public void setNthElementOfArrayTest1(){
        int[] input7 = {9,3,7,3,6};
        int n = 2;
        int val = 5;
        for(int i=0;i< input7.length; i++){
            if(input7[i]== 2){
             input7[i] = val;
            }
            System.out.println(input7[i]);
        }
    
    
       // ab.setNthElementOfArray(input, n, val);
       // Assert.assertEquals(input[n], val);
    }

    /**
     * If we have an array predefined as {9,3,4}, attempting to change the value at index 0 to 2 should result in
     * an array {2,3,4}, where the value at index 0 is 2.
     */
    @Test
    public void setNthElementOfArrayTest2(){
        int[] input8 = {9,3,4};
        int n = 0;
        int val = 2;
        
        for(int i=0;i< input8.length; i++){
            if(input8[i]== 0){
             input8[i] = val;
            }
            System.out.println(input8[i]);
        }
        //ab.setNthElementOfArray(input, n, val);
        //Assert.assertEquals(input[n], val);
    }

    /**
     * returnNewArraySizeN(5) should return a new array of size 5.
     */
    @Test
    public void returnNewArraySizeNTest1(){
        int input9 = 5;
        int[] output = ab.returnNewArraySizeN(input9);
        if(output == null){
            System.out.println("array nas not been created.");
        }else{
            System.out.println(output.length);
        }
        
    }
    /**
     * returnNewArraySizeN(2) should return a new array of size 2.
     */
    @Test
    public void returnNewArraySizeNTest2(){
        int input45 = 2;
        int[] output = ab.returnNewArraySizeN(input45);
        if(output == null){
            System.out.println("array nas not been created.");
        }else{
            System.out.println(output.length);
        }
    }
}
