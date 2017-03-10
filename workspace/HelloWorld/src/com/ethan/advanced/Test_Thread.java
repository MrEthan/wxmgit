/**
 * 
 */
package com.ethan.advanced;

public class Test_Thread {
	public static void main(String[] args){
		NewThread thread1 = new NewThread();
		NewThread thread2 = new NewThread();
		
		thread1.start();
		thread2.start();
	}
}

class NewThread extends Thread {
	
	public static int threadID = 0; //shared by all
	
	//constructor
	public NewThread(){
		super("ID:" + (++threadID));
	}
	/**
	 * convert object to string 
	 * toString()��Object����ķ��������︲��������������ת�����ַ�����
	 */
	public String toString(){
		return super.getName();
	}
	
	public void run(){
		System.out.println(this);
	}
}
