package demo.module1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    

    @Test
    void testGreet() {
    
        var greeter = new Greeter();
        Assertions.assertEquals("Hello World",greeter.greet("World"));
    }
}
