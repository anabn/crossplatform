package lastLabs.crossplatform;

public class firstLab {
    private static int CONSTANT =  16909060;
    public static void main(String[] args) {

        BigEndian bigEndian = new BigEndian(CONSTANT);
        LittleEndian littleEndian = new LittleEndian(CONSTANT);

        byte[] arrayBig = bigEndian.toEndian();
        byte[] arrayLittle = littleEndian.toEndian();

        bigEndian.toString();
        littleEndian.toString();

        bigEndian.setArray(arrayBig);
        littleEndian.setArray(arrayLittle);

        System.out.println("our array (Big) is converted to int = " + bigEndian.convertToInt());
        System.out.println("our array (Little) is converted to int = " + littleEndian.convertToInt());

    }
}
