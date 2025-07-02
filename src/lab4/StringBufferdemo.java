package lab4;

public class StringBufferdemo {
		public static void main(String[] args) {
			 // Creating StringBuffer object
	        StringBuffer  sb = new StringBuffer("Hello");

	        // 1. length() - returns number of characters
	        System.out.println("Length: " + sb.length());

	        // 2. capacity() - total allocated space (default 16 + initial string length)
	        System.out.println("Capacity: " + sb.capacity());

	        // 3. append() - adds string at the end
	        sb.append(" World");
	        System.out.println("After append: " + sb);

	        // 4. insert() - insert string at specific index
	        sb.insert(5, ",");
	        System.out.println("After insert: " + sb);

	        // 5. delete() - deletes characters from index start to end-1
	        sb.delete(5, 6);
	        System.out.println("After delete: " + sb);

	        // 6. replace() - replaces string between start and end-1 with new string
	        sb.replace(6, 11, "Java");
	        System.out.println("After replace: " + sb);

	        // 7. reverse() - reverses the entire string
	        sb.reverse();
	        System.out.println("After reverse: " + sb);

	        // 8. toString() - convert StringBuffer to String
	        String result = sb.toString();
	        System.out.println("Final string: " + result);
	    }
	}
