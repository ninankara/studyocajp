public class WrapperTest {
    public static void main(String[] args) {
        booleanExample();
        integralExample();
        floatingExample();
        characterExample();
        defineCharacterEx();
        // doubleToIntEx();
    }

    public static void booleanExample() {
        Boolean bool = Boolean.logicalAnd(false, true);
        int compare = bool.compareTo(false);
        System.out.println(compare);
    }

    public static void integralExample() {
        int sum = Integer.sum(1, 2);
        System.out.println(sum);
    }

    public static void floatingExample() {
        double max = Double.max(1.1, 2.2);
        System.out.println(max);
    }

    public static void characterExample() {
        int codePoint = Character.codePointAt("OCAJP 8", 2);
        System.out.println(codePoint);
    }

    public static void defineCharacterEx() {
        boolean defined = Character.isDefined('@');
        System.out.println(defined);
    }

    // public static void doubleToIntEx() {
    //     Double wrapper = new Double(1.5); 
    //     long primitive = wrapper.intValue();
    //     System.out.println(primitive);

    // }

}
