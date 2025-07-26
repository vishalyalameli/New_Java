class  MyThread extends Thread{
	public void run(){
		for(int i = 0; i<10; i++){
			System.out.println("In Fun");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){

			}

		}
	}
}
class client {
	public static void main(String [] args) throws InterruptedException{
		MyThread t1 = new MyThread();
		t1.start();
		for(int i =0 ; i<10; i++){
			System.out.println("Main Thread ");
			Thread.sleep(2000);
		}
	}
}



