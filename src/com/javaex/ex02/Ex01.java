package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		// 출력 1~20
		Thread thread = new Thread(new DigitThreadImpl());
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {

			System.out.println(ch);
			Thread.sleep(1000);

		}

	}

}
