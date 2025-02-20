package com.thread;

class Table {

	//t1,t2
	public synchronized void printTable(int no) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " * " + no + " = " + (no * i));
		}
	}
}

class Thread11 extends Thread {

	// null
	Table t;

	public Thread11(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(10);
	}
}

class Thread22 extends Thread {

	Table t;

	public Thread22(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(100);

	}

}

public class ThreadDemo6 {

	public static void main(String[] args) {

		Table table = new Table();

		Thread11 t1 = new Thread11(table);
		Thread22 t2 = new Thread22(table);
		t1.start();
		t2.start();

	}
}
