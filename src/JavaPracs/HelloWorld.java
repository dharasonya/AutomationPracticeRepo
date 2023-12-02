package JavaPracs;

public class HelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test();
		System.out.println(t1.getAge());
		System.out.println(t1.getName());	
		
	}
	
	

}
class Test{
	
	private String name="Sonyarani";
	private int age=10;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
	
class Test2{
	
	private String name="Sonyarani";
	private int age=10;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
	
	