public class Question3PartCiv {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                int oneHundred = 100;

                for (int i = 0; i <= oneHundred; i++) {
                    System.out.println(i);
                }
            }
        };

        thread.start();
        System.out.println("THE END");
    }
}
