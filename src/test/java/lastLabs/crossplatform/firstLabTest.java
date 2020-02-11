package lastLabs.crossplatform;

import org.junit.Test;
import static org.junit.Assert.*;

public class firstLabTest {
  private static int var4 = 43298765;
  private static byte[] expectVar2Little = new byte[]{104, 70, 47, 1};
  private static int var2 = 19875432;

  @Test
    public void checkMain() {
    LittleEndian littleEndian = new LittleEndian(var4);
    littleEndian.setArray(littleEndian.toEndian());
    assertEquals(var4, littleEndian.convertToInt());
  }

  @Test
  public void chArray(){
    LittleEndian littleEndian = new LittleEndian();
    littleEndian.setArray(expectVar2Little);
    assertEquals(var2, littleEndian.convertToInt());
  }


}
