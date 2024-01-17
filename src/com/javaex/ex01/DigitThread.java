package com.javaex.ex01;

public class DigitThread extends Thread {

	public void run() {

		for (int i = 0; i <= 30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
