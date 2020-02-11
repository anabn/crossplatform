package lastLabs.crossplatform;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BigEndianTest {

    private static int CONSTANT = 16909060;

    private static int var1 = 98765432;
    private static int var2 = 19875432;
    private static int var3 = 21976543;
    private static int var4 = 43298765;
    private static int var5 = 123456789;

    @Test
    public void toEndian() {
        BigEndian bigEndian = new BigEndian(CONSTANT);
        byte[] expect = new byte[]{1, 2, 3, 4};
        byte[] actual = bigEndian.toEndian();
        assertArrayEquals(expect, actual);
    }

    @Test
    public void toBigEndianVars(){
        BigEndian bigEndian = new BigEndian(var1);

        byte[] expect = new byte[]{5, -29, 10, 120};
        byte[] actual = bigEndian.toEndian();
        assertArrayEquals(expect, actual);

        BigEndian bigEndian2 = new BigEndian(var2);
        byte[] expectVar2 = new byte[]{1, 47, 70, 104};
        byte[] actualVar2 = bigEndian2.toEndian();
        assertArrayEquals(expectVar2, actualVar2);

        BigEndian bigEndian3 = new BigEndian(var3);
        byte[] expectVar3 = new byte[]{1, 79, 85, -33};
        byte[] actualVar3 = bigEndian3.toEndian();
        assertArrayEquals(expectVar3, actualVar3);

        BigEndian bigEndian4 = new BigEndian(var4);
        byte[] expectVar4 = new byte[]{2, -108, -81, -51};
        byte[] actualVar4 = bigEndian4.toEndian();// 12 F 46 68
        assertArrayEquals(expectVar4, actualVar4);
    }

    @Test
    public void convert(){
        BigEndian bigEndian4 = new BigEndian();
        byte[] expectVar4 = new byte[]{2, -108, -81, -51};
        bigEndian4.setArray(expectVar4);
        assertEquals(var4, bigEndian4.convertToInt());

    }
    @Test
    public void varOfChecking(){
        BigEndian bigEndian5 = new BigEndian(var5);
        int variable = var5;
        byte[] expect = new byte[4];
        expect[0] = (byte) (variable >> 24 & 0xFF);
        expect[1] = (byte) ((variable >> 16) & 0xFF);
        expect[2] = (byte) ((variable >> 8) & 0xFF);
        expect[3] = (byte) ((variable) & 0xFF);
        assertArrayEquals(expect, bigEndian5.toEndian());
    }

    @Test
    public void checkBigEndian() {
        BigEndian bigEndian = new BigEndian(CONSTANT);
        bigEndian.setArray(bigEndian.toEndian());
        int result = bigEndian.convertToInt();
        assertEquals(CONSTANT, result);
    }

    // Negative test
    @Test
    public void checkBigEndianVar2() {
        BigEndian bigEndian = new BigEndian(var2);
        BigEndian bigEndian1 = new BigEndian(var3);

        bigEndian.setArray(bigEndian.toEndian());
        bigEndian1.setArray(bigEndian1.toEndian());

        int result = bigEndian.convertToInt();
        int result1 = bigEndian1.convertToInt();

        assertNotEquals(CONSTANT, result);
        assertNotEquals(result, result1);
    }
}
