package com.javaex.ex02;

public class DigitThreadImpl implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
