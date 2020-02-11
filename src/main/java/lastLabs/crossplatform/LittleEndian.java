package lastLabs.crossplatform;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class LittleEndian extends ByteOrders{
    private int number;
    private byte[] array;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public byte[] getArray() {
        return array;
    }

    public void setArray(byte[] array) {
        this.array = array;
    }

    public LittleEndian() {
    }

    public LittleEndian(int number) {
        this.number = number;
    }

    public byte[] toEndian() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(size);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(number);
        return byteBuffer.array();
    }

    int convertToInt() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(array.length);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(array);
        return byteBuffer.getInt(0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
