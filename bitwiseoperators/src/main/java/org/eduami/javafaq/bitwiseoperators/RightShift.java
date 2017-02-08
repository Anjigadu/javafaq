package org.eduami.javafaq.bitwiseoperators;

public class RightShift {
	public static void main(String[] args) {
		int i=4;
		System.out.println(i>>1);//right shift by one
		//Check whether third bit is set or not		
		System.out.println(((i>>3-1)&1) ==1);
	}

}
