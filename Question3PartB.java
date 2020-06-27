public class Question3PartB extends Thread implements Runnable {

    @Override
    public void run() {
        int oneHundred = 100;

        for (int i = 0; i <=oneHundred; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Question3PartB question3PartB = new Question3PartB();
        question3PartB.start();
        System.out.println("THE END");
    }
}
