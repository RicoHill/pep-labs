
import org.junit.Assert;
import org.junit.Test;

/**
 * See 'player' class for challenge instructions.
 * This is a harder problem.
 */
public class PlayerTest {
    private static final boolean Player = false;
    /**
     * If a new player is instantiated using the argument "Frodo", their name should be "Frodo",
     * and their level should be 1.
     */
    private static final boolean Null = false;
    @Test
    public void player1ArgConstructorTest1(){
        Player p = new Player(p.playerName:"Frodo");
        Assert.assertEquals(p.playerName, "Frodo");
        Assert.assertEquals(p.level, 1);
        if(p.playerName == "Frodo")
        if(p.level == 1);
        boolean c = false; 
        System.out.println(c);


        
        
        
        
        System.out.println("Frodo" + p.level);
    
    }

    private String playerName(String string) {
        return null;
    }

    /**
     * If a new player is instantiated using the argument "Sam", their name should be "Sam",
     * and their level should be 1.
     */
    @Test
    public void player1ArgConstructorTest2(){
        Player p = new Player("Sam");
        
        Assert.assertEquals(p.playerName, "Sam");
        Assert.assertEquals(p.level, 1);
        
        
    /**
     * If a new player is instantiated using the arguments "Gollum" and 5, their name should be "Gollum",
     * and their level should be 5.
     */
    @Test
    public void player2ArgConstructorTest1(){
        Player p = new Player("Gollum", 5);
        Assert.assertEquals(p.playerName, "Gollum");
        Assert.assertEquals(p.level, 5);
        if(p.playerName == "Fredo" + 5);
        boolean c = true;
        System.out.println(c);
    }
}