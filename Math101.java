public class Math101 {

    public static interface Callback<T> {
        void process(T notification);
    }

    public static void Divide(int a, int b, Callback<Integer> onSuccess, Callback<String> onError) {
        try {
            int result = a / b;
            onSuccess.process(result);
        } catch (Exception e) {
            onError.process(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Callback<Integer> integerCallback = notification -> System.out.println("The result of " + a + " / " + b + " is " + notification);
        Callback<String> stringCallback = notification -> {
            System.out.println("Error occurred: " + notification);
        };

        Divide(a, b, integerCallback, stringCallback);
        Divide(3, 0, integerCallback, stringCallback);
    }

}
