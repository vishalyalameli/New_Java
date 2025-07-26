class MyThread extends Thread{
	public void run(){
		System.out.println(" In : " +getName());
	}
}
class client{
	public static void main(String [] args){
		MyThread t1 = new MyThread();
		t1.setName("Core2 Java");
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("java Awsome");
		t2.start();
	}
}

