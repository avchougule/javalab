/*1.Write class game{ } class boardgame extends game{ } class chess extends boardgame{ }
class gamedemo{
public static void main(String[] args) {
chess ch=new chess(); }
}
*/
package lab5;
class game{
 game()
 {
	 System.out.println("Hi this is parent class");
 }
}

class boardgame extends game{
	boardgame(){
		System.out.println("This is boardgame"); 
	}
}

class chess extends boardgame{
	chess(){
		System.out.println("This is chess");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		chess ch=new chess();
		

	}

}
