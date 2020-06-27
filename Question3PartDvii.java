public class Question3PartDvii {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            int oneHundred = 100;

            for (int i = 0; i <=oneHundred; i++){
                System.out.println(i);
            }
        };
        runnable.run();
        System.out.println("THE END");
    }
}
