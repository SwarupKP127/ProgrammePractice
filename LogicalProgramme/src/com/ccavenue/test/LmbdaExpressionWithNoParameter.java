package com.ccavenue.test;

interface Sayab {
	public String say();
}//interface name should be unique in  package

public class LmbdaExpressionWithNoParameter {

	public static void main(String[] args) {

		Sayab s=()->{
			return "I have nothing to Say";
		};
       System.out.println(s.say());
	}

}
