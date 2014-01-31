package tooltest;

import java.util.Arrays;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a=new Integer[]{1,2};
		boolean result=Arrays.asList(new Integer[]{0,1,2,3,4,5,}).contains(5);
		System.out.println("result:"+result);

	}

}
