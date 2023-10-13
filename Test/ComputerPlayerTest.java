
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;



public class ComputerPlayerTest {
    String name = "Computadora";
    @Test
    public void testNameComputer(){

        ComputerPlayer player = new ComputerPlayer(name, 30);
        String NamePlayer =  player.getName();
        assertEquals(name, NamePlayer);
        /*assertNotNull(NamePlayer);*/
    }

    @Test
    public void testInitialization() {
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer", 20);
        assertEquals(-1, computerPlayer.getLastHumanGuess());
        assertEquals(-1, computerPlayer.getLastComputerGuess());
    }
    @Test
    public void testMakeGuess(){
        int targetNumber = 30;
        ComputerPlayer computerPlayer = new ComputerPlayer(name, targetNumber);

        int numberComputer = computerPlayer.getLastComputerGuess();
        assertNotNull(computerPlayer);
        assertTrue(numberComputer < targetNumber);
        assertFalse(numberComputer > targetNumber);
        assertNotEquals(numberComputer, targetNumber);

    }
}