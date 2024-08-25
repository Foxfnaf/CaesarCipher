import edu.foxyfnaf.CaesarCipher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SzyfrCezaraTest {
    //If you want to run the test, first comment out the calls to askUserForText and shiftParameterChoice in the encrypt and decrypt methods.
    @Test
    public void givenPlainTextAndKey_whenEncrypting_thenReturnsEncryptedText() {

        assertEquals("c", CaesarCipher.encrypt("a", 3));
    }

    @Test
    public void decrypting() {
        assertEquals("a", CaesarCipher.decrypt("c", 3));
    }
}
