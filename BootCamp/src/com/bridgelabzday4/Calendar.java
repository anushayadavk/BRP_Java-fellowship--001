package com.bridgelabzday4;
public class Calendar {
	private static final String DAY_OF_WEEK = null;

	public static void main(String []args){
	     // Create a default calendar
	        Calendar cal = Calendar.getInstance();
	    //Set your date: cal.setTime(yourDate);
		System.out.println();
	        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	        System.out.println("Day of the week : " + dayOfWeek); 
		System.out.println();
	    }

	private int get(String dayOfWeek) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
