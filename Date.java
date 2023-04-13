package JavaProject;

public class Date {
	private char date[];
	private String data;
	
	public Date(String dt) {
		try {
			if(dt.length()==10) {
				if(
				Character.isDigit(dt.charAt(0))
				&&Character.isDigit(dt.charAt(1))
				&&dt.charAt(2)=='/'
				&&Character.isDigit(dt.charAt(3))
				&&Character.isDigit(dt.charAt(4))
				&&dt.charAt(5)=='/'
				&&Character.isDigit(dt.charAt(6))
				&&Character.isDigit(dt.charAt(7))
				&&Character.isDigit(dt.charAt(8))
				&&Character.isDigit(dt.charAt(9))
				) {
					this.date = dt.toCharArray();
					this.data = dt;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDate() {
		return this.data;
	}
	
	public void printDate() {
		System.out.println(this.date);
	}
}
