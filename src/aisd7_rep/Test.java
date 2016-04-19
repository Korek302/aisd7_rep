package aisd7_rep;

public class Test
{
	public static void main(String args[])
	{
		final int value = 18;
		final int size = 100;

		int[] array = new int[size];
		
		for(int i = 0; i < size; i ++)
		{
			array[i] = i;
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		
		System.out.println("Binary search: ");
		BinarySearch1 searcher1 = new BinarySearch1();
		System.out.println("searched number: " + searcher1.search(array, value));
		System.out.println("number of comparisons: " + searcher1.counter);
		
		System.out.println("\nInterpolative search: ");
		BinarySearch2 searcher2 = new BinarySearch2();
		System.out.println("searched number: " + searcher2.search(array, value));
		System.out.println("number of comparisons: " + searcher2.counter+"\n");
		
		
		Tree bst = new BST();
		
		System.out.println(bst.find(new Vehicle(4, "audi")));
		bst.insert(new Vehicle(4, "audi"));
		System.out.println(bst.find(new Vehicle(4, "audi")));
		bst.insert(new Vehicle(4, "budi"));
		System.out.println(bst.find(new Vehicle(4, "")));
	}
}
