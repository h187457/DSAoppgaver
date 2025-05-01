package tidligereEksamener.eksamenVOR24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class oppgave7Test {

    @Test
    public void testDesimalTilBinaer() {
        assertEquals("0", oppgave7.desimalTilBinaer(0));
        assertEquals("1", oppgave7.desimalTilBinaer(1));
        assertEquals("10", oppgave7.desimalTilBinaer(2));
        assertEquals("11", oppgave7.desimalTilBinaer(3));
        assertEquals("1010", oppgave7.desimalTilBinaer(10));
    }
}
