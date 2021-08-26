package ipzs;


public class Home {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello java!");
		while(true) {
			Thread.sleep(1000);
			System.out.println("Waiting for debugger to connect...");
		}
	}
}
