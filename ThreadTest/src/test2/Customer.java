package test2;

class Customer implements Runnable{
	Store store;
	
	Customer(Store store){
		this.store=store; 
	    }
	public void run(){
		for (int i = 1; i < 6; i++) {
			store.get();
	        }
	    }

}
