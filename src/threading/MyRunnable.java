package threading;

import java.io.File;

public class MyRunnable implements Runnable {
	private Thread runner;
	private boolean isEnd;
	private  File directory;
	
	
	public MyRunnable(File directory) {
		this.directory = directory;
		// TODO Auto-generated constructor stub
	}
	
	public void start(){
		this.isEnd=false;
		this.runner=new Thread(this,"MyRunnableThread");
		this.runner.start();
		
	}
	
	public void stop(){
		try {
			this.isEnd=true;
			this.runner.join(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(!this.isEnd){
			if(this.directory.list().length!=0){
				//processing
			}
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		}
		
	}

}
