public class Question3PartA implements Runnable {

    @Override
    public void run() {
        int oneHundred = 100;

        for (int i = 0; i <=oneHundred; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Question3PartA question3PartA = new Question3PartA();
        question3PartA.run();
        System.out.println("THE END");
    }
}
