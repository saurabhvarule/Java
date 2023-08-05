

class Program8 {

	public static void main(String[] args) throws InterruptedException{
		int num = 7;
		for(int i=num; i>0; i--) {
			if(i==1) {
				System.out.println(i + " day remaining...");

			} else {
				System.out.println(i + " days remaining...");
			}
			Thread.sleep(1000);
		}
		System.out.println("0 days Assignment is Overdue");
	}
}
