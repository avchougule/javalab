//Write a singleton class(Singleton class is is a class which has only one object)
package lab3;

class SDemo{
	static SDemo sd=null;
	private SDemo() {
		System.out.println("Object is created.");
	}
	
	static void getInstance(){
		if(sd==null){
			sd= new SDemo();
		}else
		{
			System.out.println("No more object is created.");
		}
	}
	
}
public class Singleton {
	public static void main(String[] args) {
		SDemo.getInstance();
		SDemo.getInstance();
		SDemo.getInstance();
		SDemo.getInstance();
	}
}