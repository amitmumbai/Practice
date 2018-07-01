
public class Country {
	private String state;
	private String capital;
	private String cities[];
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public static void main(String args[]){
		Country india=new Country();
		india.setState("Karnatka");
		india.setCapital("Bengalore");	
		System.out.println("state->"+india.getState()+"\nCapital->"+india.getCapital());
	}
	
}
