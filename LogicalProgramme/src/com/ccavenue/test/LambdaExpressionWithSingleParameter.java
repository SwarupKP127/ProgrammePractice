package com.ccavenue.test;

interface Sayabl{  
    public String say(String name);  
} 

public class LambdaExpressionWithSingleParameter {

	public static void main(String[] args) {
		
		Sayabl s = (name)->{
			return name;
		};
		System.out.println("name is -------->"+s.say("kamson"));
		
		
		  Sayabl sOne = (name)->{ 
			  return name; 
	      };
		 
		System.out.println("name is =========>"+sOne.say("horny"));;
	}

}
