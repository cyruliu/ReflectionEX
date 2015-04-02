package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadEx extends Thread{
	boolean isRunning =true;
	int timer=0;
	
	@Override
	public void run(){
		while (isRunning){
			try{
				Thread.currentThread();
				Thread.sleep(1000);
				timer++;
				System.out.println("��ȥ��"+timer+"��");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}	

	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();
		t1.start();
		System.out.println("��ʱ������...");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			String line=br.readLine();
			if(line.equalsIgnoreCase("1")) t1.isRunning=false;
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
