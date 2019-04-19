package practice;


//This is custom exception 
	 class InvalidValue extends Exception{
		
		InvalidValue(String s) {
			super(s);

		}
		
	}
	

public class CustomeException {

	
	static void calculation(int a, int b) throws InvalidValue {
		//Negative value
		if(a+b<0)
		{
			throw new InvalidValue("invalid");		
		}
		else
		{
			System.out.println("positive value");
		}
			
	}
	
	
	public  static void main(String[] args){
		try {
			CustomeException.calculation(1,2);
		}catch (Exception e) {
			System.out.println("Error message :" +e);
		}
		
			
	}
}
	

	


