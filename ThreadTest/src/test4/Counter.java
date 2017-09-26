package test4;

public class Counter {
	public static void main(String [] args){
		
		IncrementWithVolatile incrementWith = new IncrementWithVolatile();
		IncrementWithoutVolatile incrementWithout = new IncrementWithoutVolatile();
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1_000_000_000; i++){
			incrementWith.increase();			
		}
		long timeWithVolatile = System.currentTimeMillis() - start;
				
		start = System.currentTimeMillis();
		for(int i = 0; i < 1_000_000_000; i++){
			incrementWithout.increase();			
		}
		long timeWithoutVolatile = System.currentTimeMillis() - start;
		
		
		System.out.println("increment time with synchronized and with volatile " + timeWithVolatile);
		System.out.println("increment time only with synchronized " + timeWithoutVolatile);
	}
	
	
	static class IncrementWithVolatile{
		volatile int i;
		synchronized void increase(){
			i++;			
		}
	}
	
	static class IncrementWithoutVolatile{
		int i;
		synchronized void increase(){
			i++;			
		}
	}

}
