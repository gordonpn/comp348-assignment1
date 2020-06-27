public class Question1 {

    interface InterfaceA {

        double getDouble();

    }

    interface InterfaceB {

        String getNumber(int a);

    }

    interface InterfaceC {

        boolean isEqual(int i, String s);
    }

    public static void main(String[] args) {

        InterfaceA interfaceA = () -> 5.5;
        InterfaceB interfaceB = (a) -> String.format("The number is %d", a);
        InterfaceC interfaceC = (int i, String s) -> i == Integer.parseInt(s);

        System.out.println(interfaceA.getDouble());
        System.out.println(interfaceB.getNumber(5));
        System.out.println(interfaceC.isEqual(5, "5"));
    }
}