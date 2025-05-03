import levelupjava.booleanCheck;
import levelupjava.isPassWordComplex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerifyResult {

    @Test
    public void isEven_true(){
         Assertions.assertTrue(booleanCheck.isEven(0));
        Assertions.assertTrue(booleanCheck.isEven(2));
        Assertions.assertTrue(booleanCheck.isEven(4));
        Assertions.assertTrue(booleanCheck.isEven(6));
        Assertions.assertTrue(booleanCheck.isEven(8));
        Assertions.assertTrue(booleanCheck.isEven(10));
    }

    @Test
    public void isPasswordComplex(){
        Assertions.assertTrue(isPassWordComplex.isPasswordComplex("Reshma@001"));
        Assertions.assertTrue(isPassWordComplex.isPasswordComplex("Resha1"));
        Assertions.assertFalse(isPassWordComplex.isPasswordComplex("UPPER1"));
        Assertions.assertFalse(isPassWordComplex.isPasswordComplex("lower1"));
        Assertions.assertFalse(isPassWordComplex.isPasswordComplex("327371938"));
    }
}
