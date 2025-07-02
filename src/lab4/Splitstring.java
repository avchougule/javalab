//5. Write a java program to split string by “blank space” and “-” patterns
package lab4;

public class Splitstring {

	public static void main(String[] args) {
		
		String text ="my name is ak";
		String[] parts = text.split("[ -]+"); //regex: space OR hyphen (one or more)

        // Print the parts
        System.out.println("Split words:");
        for (String part : parts) {
            System.out.println(part);

	}

}
}