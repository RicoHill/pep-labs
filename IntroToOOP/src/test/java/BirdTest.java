
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    /**
     * If ageMonths is less than 3, birds should say "Tweet".
     */
    @Test
    public void birdTest1(){
        Bird b1 = new Bird();
        b1.ageMonths = 0;
        
        if(b1.ageMonths < 3);
        System.out.println("Tweet");

    }
    /**
     * If ageMonths is less than 3, birds should say "Chirp".
     */
    @Test
    public void birdTest2(){
        Bird b1 = new Bird();
        b1.ageMonths = 4;
        
        if(b1.ageMonths < 3);
        System.out.println("Chirp");
    }
    /**
     * If ageMonths is less than 3, birds should say "Chirp".
     */
    @Test
    public void birdTest3(){
        Bird b1 = new Bird();
        b1.ageMonths = 3;
        if(b1.ageMonths < 3);
        System.out.println("Chirp");
    }
}
