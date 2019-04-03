package practice;

interface BankInterface {
	
	void firstMethod() ;
	
	default void  secondMethod(int a) {
		System.out.println("Hi I am from BankInterface secondMethod");
	}
	
	void thirdMethod();
	
}



	
	
	
