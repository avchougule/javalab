/*3. Use the String Class Methods like length, hashCode,equals, replace, trim,
subString, concatinate , compare , charAt, subString etc.. for a given String(s)
*/
package lab4;

public class StringMethod {

	public static void main(String[] args) {
		String s1="Java Programming";
		String s2=" Java Programming ";
		
		
		//length
		System.out.println("The length of S1:"+s2.length());
		
		//hashcode
		System.out.println("Hashcode of s2:"+s2.hashCode());
		
		//equals
		System.out.println("Length is equal? :"+s2.equals(s1));
		
		//trim
		String trimmed=s1.trim();
		System.out.println("After Trim of S1:"+trimmed+"");
		
		//concat
		System.out.println("The concat:"+s2.concat(s1)); 
		// charAt()
        System.out.println("Character at index 5 in s2: " + s2.charAt(3));

        // substring()
        System.out.println("Substring from 5 to 16 in s2: " + s2.substring(5, 16));

	}

}
