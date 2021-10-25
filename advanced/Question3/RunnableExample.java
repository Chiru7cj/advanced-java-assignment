package advanced.Question3;

class  RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable is running");
    }

    public static void main(String... args) {
        RunnableExample obj = new RunnableExample();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
