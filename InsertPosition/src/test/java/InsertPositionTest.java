
import org.h2.command.dml.Insert;
import org.junit.Assert;
import org.junit.Test;

public class InsertPositionTest {
    InsertPosition ip = new InsertPosition();
    System.out.println(ip);

    /**
     * In the array {1, 3, 5, 6}, 4 would be inserted at index 2.
     */
    @Test
    public void testSearchInsert1() {
        //int[] nums = {1, 3, 5, 6};
        /int target = 4;
        int [] nums2 = {1, 3, 4, 6};

        System.out.println.(num2[2]);
    }
    /**
     * In the array {1, 3, 5, 6}, 2 would be inserted at index 1.
     */
    @Test
    public void testSearchInsert2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        System.out.println(target);
    }
    /**
     * In the array {1, 3, 5, 6}, 7 would be inserted at index 4.
     */
    @Test
    public void testSearchInsert3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        Assert.assertEquals(4, ip.searchInsert(nums, target));
    }
    /**
     * In the array {2}, 1 would be inserted at index 0.
     */
    @Test
    public void testSearchInsert4() {
       // int[] nums = {2};
        //int target = 1;
        int[] nums1 ={1};

        System.out.println(nums1);
    }
    /**
     * In the array {1, 3, 5, 6, 8}, 7 would be inserted at index 4.
     */
    @Test
    public void testSearchInsert5() {
        int[] nums = {1, 3, 5, 6, 8};
        int target = 7;
        nums 
        

        }
    

        System.out.println(nums);
    }
