package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int[] values = new int[100];
		values[0] = 1000;
		values[99] = 93432;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[99]);
//		System.out.println(values[100]); // throws an error
		String[] words = new String[] {"My", "name", "is"};
		System.out.println(words[2]); // print "is"
		// try to print an integer as a double
		System.out.println((double)values[99]);
	}

}
