package lastLabs.crossplatform;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class LittleEndianTest {
    private static int CONSTANT = 16909060;

    private static int var1 = 98765432;
    private static int var2 = 19875432;
    private static int var3 = 21976543;
    private static int var4 = 43298765;
    private static int var5 = 123456789;

    @Test
    public void toLittleEndianVars() {
        LittleEndian littleEndian = new LittleEndian(var1);
        byte[] expect = new byte[]{120, 10, -29, 5};
        byte[] actual = littleEndian.toEndian();
        assertArrayEquals(expect, actual);

        LittleEndian littleEndian2 = new LittleEndian(var2);
        byte[] expectVar2 = new byte[]{104, 70, 47, 1};
        byte[] actualVar2 = littleEndian2.toEndian();
        assertArrayEquals(expectVar2, actualVar2);

        LittleEndian littleEndian3 = new LittleEndian(var3);
        byte[] expectVar3 = new byte[]{-33, 85, 79, 1};
        byte[] actualVar3 = littleEndian3.toEndian();
        assertArrayEquals(expectVar3, actualVar3);

        LittleEndian littleEndian4 = new LittleEndian(var4);
        byte[] expectVar4 = new byte[]{-51, -81, -108, 2};
        byte[] actualVar4 = littleEndian4.toEndian();
        assertArrayEquals(expectVar4, actualVar4);
    }


    @Test
    public void anotherVarOfChecking(){
        LittleEndian littleEndian = new LittleEndian(var1);
        int variable = var1; // var2; var3;
        byte[] expect = new byte[4];
        expect[0] = (byte) (variable & 0xFF);
        expect[1] = (byte) ((variable >> 8) & 0xFF);
        expect[2] = (byte) ((variable >> 16) & 0xFF);
        expect[3] = (byte) ((variable >> 24) & 0xFF);

        assertArrayEquals(expect, littleEndian.toEndian());
    }

    @Test
    public void checkLittleEndian(){
        LittleEndian littleEndian = new LittleEndian(var2);
        littleEndian.setArray(littleEndian.toEndian());
        int result = littleEndian.convertToInt();
        assertEquals(var2, result);
    }


}
