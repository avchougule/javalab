/*1. Create an abstract class Instrument which is having the abstract function
play. Create three more sub classes from Instrument which is Piano, Flute,
Guitar. Override the play method inside all three classes printing a message .
“Piano is playing tan tan tan tan ” for Piano class
“Flute is playing toot toot toot toot” for Flute class
“Guitar is playing tin tin tin ” for Guitar class
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of play method.
Use the instanceof operator to print that which object stored at which index of
instrument array. */

package lab6;


abstract class Instrument{
	abstract void play(); 
}
class Piano extends Instrument
{
	@Override
	void play() {
		System.out.println("This is Piano: Piano is playing tan tan tan tan ");
	}
}
class Flute extends Instrument
{
	@Override
	void play() {
		
		System.out.println("This is Flute: flute is playing toot toot toot toot ");
	}	
}
class Guitar extends Instrument
{
	@Override
	void play() {
		
		System.out.println("This is Guitar: Guitar is playing tin tin tin ");
	}	
	
}
public class Ass_1 {

	public static void main(String[] args) {
		Instrument[] instruments=new Instrument[10];
		
		// Assigning different instruments
        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0)
                instruments[i] = new Piano();
            else if (i % 3 == 1)
                instruments[i] = new Flute();
            else
                instruments[i] = new Guitar();
        }

        // Displaying which object is at which index
        for (int i = 0; i < instruments.length; i++) {
            System.out.print("Index " + i + ": ");

            if (instruments[i] instanceof Piano) {
                System.out.println("Piano object");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Flute object");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Guitar object");
            }

            // Polymorphic behavior: call play()
            instruments[i].play();
            System.out.println();
        }

	}

}
