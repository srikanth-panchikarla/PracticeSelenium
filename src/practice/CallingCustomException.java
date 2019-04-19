package practice;

import practice.InvalidValue;

public class CallingCustomException  {
	
	public static void main(String[] args) throws InvalidValue {
		
		
		CallingCustomException.age();
		
	}
		
		public static  void age() throws InvalidValue
		
		{
			
			int a=1;
			int b=2;			
			if(a-b<0)
			{
				try {
					throw new InvalidValue("Negative value is not allowed, this method called from other Class");
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
			}
			
		}

	

}
