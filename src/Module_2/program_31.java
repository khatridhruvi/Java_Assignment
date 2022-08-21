/*pr_31 W.A.J. P to create one thread by extending Thread class in another Class. */

package Module_2;

class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread is running....");
	}
}

public class program_31 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.run();
	}
}
