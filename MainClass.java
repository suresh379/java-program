package exercise;
class Animal{
	 public void makeSound() {
		 System.out.println("different animals makes different sound");
	 }

}
class CatClass  extends Animal{
	@Override
  public void makeSound() {
	 System.out.println("bark");
 }
}
public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CatClass obj = new CatClass();
		 obj.makeSound();
		 

	}


}
