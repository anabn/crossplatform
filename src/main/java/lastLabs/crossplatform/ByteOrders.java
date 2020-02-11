package lastLabs.crossplatform;

public abstract class ByteOrders {
    protected int size = 4;

    abstract byte[] toEndian();
    abstract int convertToInt();

    @Override
    public String toString() {
        System.out.print( this.getClass().getSimpleName() + " = ");
        byte[] array = toEndian();
        for (byte arrays: array) {
            System.out.print(arrays + ", ");
        }
        System.out.println();
        return "";
    }
}
