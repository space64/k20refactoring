package demo;

public class AnonymousExample {
	public void Execute() {
		Runnable sumCal = new Runnable() {
			int Total = 0;

			public void run() {
				for (int i = 0; i < 10000000; i++) {
					Total++;
				}
				System.out.println(Integer.toString(Total));
			}
		};
		sumCal.run();
	}
	 
}

