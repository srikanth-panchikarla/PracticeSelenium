package practice;

public class ICICIclass implements BankInterface{

	public static void main(String[] args) {
		
		BankInterface icici= new ICICIclass();
		BankInterface hdfc=new HDFCclass();
		
		hdfc.firstMethod();
		hdfc.secondMethod(2);
		hdfc.thirdMethod();
		
		icici.secondMethod(1);
		
	}

	@Override
	public void firstMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void thirdMethod() {
		// TODO Auto-generated method stub
		
	}


{
	

}
	
	

}
