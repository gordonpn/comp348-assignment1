public class Question3PartCv {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            int oneHundred = 100;

            for (int i = 0; i <= oneHundred; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("THE END");
    }
}
