import edu.foxyfnaf.CaesarCipher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SzyfrCezaraTest {
    //If you want to run the test, first comment out the calls to askUserForText and shiftParameterChoice in the encrypt and decrypt methods.
    //Remember to assign the value to the text variable
    @Test
    public void givenPlainTextAndKey_whenEncrypting_thenReturnsEncryptedText() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals("c", caesarCipher.encrypt(3));
    }

    @Test
    public void decrypting() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals("a", caesarCipher.decrypt( 3));
    }
}
