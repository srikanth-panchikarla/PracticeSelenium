package practice;

 class ClassA {

	  void OverrideMethod(int a, int b) {
		  int c;
		   c=a+b;
		
		   System.out.println("I am in OverrideMethod of class A:"+ c );
			
		}
	  
	  void SecondOverideMethod() {
		  
		  System.out.println("I am in SecondOverideMethod of Class A");
		  
	  }
	  
	  
void thirdOverideMethod() {
		  
		  System.out.println("I am in thirdOverideMethod of Class A");
		  
	  }
	  
	 	 
 }	 
public  class ClassB extends ClassA {

			 void OverrideMethod(int a, int b){
				 int c;
				   c=a-b;
				System.out.println("I am in OverrideMethod of class B "+ c);
				
			}
			 
			 void  SecondOverideMethod() {
				 System.out.println("I am in SecondOverideMethod of Class B");
				 
			 }
			 			 
			 void FourthOverideMethod() {
				  
				  System.out.println("I am in FourthOverideMethod of Class B");
				  
			  }
			
			 public static void main(String[] args) {
					
				 //Creating reference of ClassA and obj of Class B
				 ClassA b=new ClassB();
				 b.OverrideMethod(1,2);
				 b.thirdOverideMethod();			 
				 
				 //Creating object of Class B 
				 ClassB bb= new ClassB();
				 bb.SecondOverideMethod();
				 
				 
				 
						 
			 		
			}
                  
			
}
	 
	 
	 
	 
