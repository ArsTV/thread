package Test2;

public class Main {
	public static void main(String[] args) {		
		Store store = new Store();
		Producer producer = new Producer(store);
        Customer consumer = new Customer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
