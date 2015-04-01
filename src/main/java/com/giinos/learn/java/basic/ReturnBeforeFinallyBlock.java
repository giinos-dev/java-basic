package com.giinos.learn.java.basic;

/**
 * This example show us that you should beware on return on catch block and finally block will be ignored.
 * */
public class ReturnBeforeFinallyBlock {

	public static void main(String[] args) {
		
		
		System.out.println("result of concatString1 : " + concatString1());
		System.out.println("You see? finally block does not called.");
		System.out.println("result of concatString2 : " + concatString2());
		System.out.println("But If we return it in finally block. It will be called. Amazing!! ah?");
	}
	
	private static String concatString1(){
		String result = null;
		try{
			String s = null;
			result = s.concat("bobby"); //intend to make it null exception.
					
		} catch (NullPointerException ex) {
			System.out.println("null exception catch.");
			return null;
		} finally{
			result = "I am string in finally block";	
		}
		return result;
	}
	
	private static String concatString2(){
		String result = null;
		try{
			String s = null;
			result = s.concat("bobby"); //intend to make it null exception.
					
		} catch (NullPointerException ex) {
			System.out.println("null exception catch.");
			return null;
		} finally{
			result = "I am string in finally block";
			return result;
			
		}
		//return result;
	}

}
