import org.junit.Test;

/**
 * Created by ndizera on 11/24/16.
 */
public class testInterpreter {
    @Test
    public void testAddDangerousZone(){
        String command = "add dangerous_zone 4 5 10";
        Interpreter.interprete(command);
    }
}
