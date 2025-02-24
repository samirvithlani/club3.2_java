package com.thread;

class Cloud {

	public void storage(String name) {

		System.out.println("auth by" +Thread.currentThread().getName());

		synchronized (this) {

			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread  " + Thread.currentThread().getName() + " ...is accessing clound..." + name);
			}
		}
		
		System.out.println("auth done..."+Thread.currentThread().getName());

	}

}

class Gdrive extends Thread {

	Cloud c;

	public Gdrive(Cloud c) {
		this.c = c;
	}

	public void run() {

		c.storage("Google Drive..");

	}

}

class Dropbox extends Thread {

	Cloud c;

	public Dropbox(Cloud c) {
		this.c = c;
	}

	@Override
	public void run() {

		c.storage("dropbox");
	}

}

public class ThreadDemo9 {

	public static void main(String[] args) {

		Cloud c = new Cloud();//
		Gdrive t1 = new Gdrive(c);
		Dropbox t2 = new Dropbox(c);

		t1.start();
		t2.start();

	}
}
