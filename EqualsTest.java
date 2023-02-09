public class EqualsTest {
    public static void main(String[] args) {
        compareObjectsUsingOperator();
        System.out.println("----------");
        compareObjectUsingEquals();
        System.out.println("----------");
        compareStringUsingEquals();
    }

    public static void compareObjectsUsingOperator() {
        String string1 = new String("Whizlabs");
        String string2 = "Whizlabs";
        String string3 = "Whizlabs";

        System.out.println(string1 == string2); //false
        System.out.println(string2 == string3); //true
    }

    public static void compareObjectUsingEquals() {
        Data data1 = new Data(0);
        Data data2 = new Data(0);
        System.out.println(data1.equals(data2)); //false, when overiden true
    }

    public static void compareStringUsingEquals() {
        String string1 = new String("Whizlabs");
        String string2 = new String("Whizlabs");
        String string3 = "Whizlabs";
        System.out.println(string1.equals(string2)); //true
        System.out.println(string2.equals(string3)); //true
    }
}
