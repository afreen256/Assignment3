package labassign3;

abstract class Empl implements Payable{
	private int rate;
	public Empl(){
		
	}
	
	public abstract int getSalary();
	public int getRate(){
		return rate;
	}
	public void setRate(int rate){
		this.rate=rate;
		
	}
}
