package exercise;
class Empolyee{
	public void work() {
		System.out.println("work hard");
	}
	
	public void getSalary() {
		System.out.println("get salary for your work");
	}
}
public class HrManager extends Empolyee{
	 public void work() {
		  System.out.println("from hr : work hard");
	  }
	  public void addEmpolyee() {
		  System.out.println("HR will add more empolyee");
	  }
	public static void main(String[] args) {
		
		 HrManager hr = new HrManager();
		 hr.addEmpolyee();
		 hr.work();
		 hr.getSalary();
	}

}
