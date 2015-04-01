package com.giinos.learn.java.basic;

/**
 * This example show performance comparison between non-try-block and try-block
 * @author thaweechok
 *
 */
public class TryOrNotTry {
	public static void main(String[] args) {
		withTryBlock();
		withoutTryBlock();
		System.out.println("So, you should NOT use try-block on normal statement, handling exception only when it need to.");
	}

	private static void withTryBlock(){
		long start = System.nanoTime();
		try {
			int x = 0;
			for (int i = 0; i < 50000; i++) {
				x += 50;
				
				for (int j = 0; j < i*10; j++) {
					int y = x / 10;
				}
			}
		} catch (Exception ex) {
			System.out.println("just in case there is some exception occure.");
		}
		long end = System.nanoTime();
		Long elapse = end - start;
		System.out.println("with try-block elapse time : " + elapse.toString());
		
	}
	private static void withoutTryBlock() {
		long start = System.nanoTime();
		int x = 0;
		for (int i = 0; i < 50000; i++) {
			x += 50;
			for (int j = 0; j < i*10; j++) {
				int y = x / 10;
			}
			//System.out.println(x);
		}
		long end = System.nanoTime();
		Long elapse = end - start;
		System.out.println("without try-block elapse time : " + elapse.toString());
	}
}
