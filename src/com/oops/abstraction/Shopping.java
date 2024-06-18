package com.oops.abstraction;

interface Shop{
	
	void ac();
}
//extends
interface Bill extends Shop{
	
	//ac()* --> ac();
	void power();
	//void ac();
	
}

public class Shopping implements Bill {

	@Override
	public void ac() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		
	}

	

}
