import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instanceCorrectly(){
        CaesarCipher testCaesarCipher =new CaesarCipher("a",2);
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_readAString_a(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("a",testCaesarCipher.getStatement());
    }
    @Test
    public void newCaesarCipher_readKey_2(){
        CaesarCipher testCaesarCipher =new CaesarCipher("a",2);
        assertEquals(2,testCaesarCipher.getKey());

    }
    @Test
    public void newCaesarCipher_replaceLetter_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("b",testCaesarCipher.isEncrypted());
    }
    @Test
    public void newCaesarCipher_replaceLetterByUsingKey_c(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",2);
        assertEquals("c", testCaesarCipher.isActuallyEncrypted("a",2));
    }


}