public class Main {
    public static void main(String[] args) throws Exception {
        ThreadGroup group = new ThreadGroup("Group");
        MyThread threadFirst = new MyThread(group, "First");
        MyThread threadSecond = new MyThread(group, "Second");
        MyThread threadThird = new MyThread(group, "Third");
        MyThread threadFourth = new MyThread(group, "Fourth");

        threadFirst.start();
        threadSecond.start();
        threadThird.start();
        threadFourth.start();

        try {
            Thread.sleep(15_000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        group.interrupt();
    }
}