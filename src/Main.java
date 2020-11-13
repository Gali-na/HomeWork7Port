public class Main {
    public static void main(String[] args) {
        Port port = new Port();
        ThreadForShip shipOne = new ThreadForShip(1, port, 1);
        ThreadForShip shipTwo = new ThreadForShip(2, port, 2);
        ThreadForShip shipThree = new ThreadForShip(3, port, 1);
        Thread threadOne = new Thread(shipOne);
        Thread threadTwo = new Thread(shipTwo);
        Thread threadThree = new Thread(shipThree);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        try {
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(port.getInfoAboutInDok());
    }
}
