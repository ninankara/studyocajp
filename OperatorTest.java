public class OperatorTest {
    public static void main(String[] args) {
        multiplyPrefix();
        booleanOperator();
        shiftingOperator();
    }

    public static void multiplyPrefix() {
        int i1 = 1, i2 = 2;
        int i = i2 * ++i1 * i1; //prefix is executed first, then multiplication
        System.out.println(i);
    }

    public static void booleanOperator() {
        boolean b1 = false, b2 = true;
        boolean b = (!b1 || !b2) && b1;
        System.out.println(b);
    }

    public static void shiftingOperator() {
        int i = 4 << 4 / 2; //  4/2 = 2; move bit to the left 2x | 0100 -> 10000 = 2^4 = 16
        System.out.println(i);
    }
}
