package aisd7_rep;

import java.util.Random;

public class Test
{
	public static void main(String args[])
	{
		final int valueRange = 200;
		final int size = 100;
		
		int[] array = new int[size];
		Random rand = new Random();
		for(int i = 0; i < size; i++)
		{
			array[i] = rand.nextInt(valueRange + 1);
		}
		
		java.util.Arrays.sort(array);
		
		for(int i = 0; i < size; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		final int value = array[rand.nextInt(size-1)];
		System.out.println("\n"+value);
		
		System.out.println("Binary search: ");
		BinarySearch1 searcher1 = new BinarySearch1();
		System.out.println("index of searched number: " + searcher1.search(array, value));
		System.out.println("searched number: " + array[searcher1.search(array, value)]);
		System.out.println("number of comparisons: " + searcher1.counter);
		
		System.out.println("\nInterpolative search: ");
		BinarySearch2 searcher2 = new BinarySearch2();
		System.out.println("index of searched number: " + searcher2.search(array, value));
		System.out.println("searched number: " + array[searcher2.search(array, value)]);
		System.out.println("number of comparisons: " + searcher2.counter+"\n");
		
		
		BST bst = new BST();
		
		System.out.println(bst.find(4));
		bst.insert(new Vehicle(4, "audi"));
		System.out.println(bst.find(4));
		bst.insert(new Vehicle(4, "budi"));
		System.out.println(bst.find(4));
		bst.insert(new Vehicle(0, "cudi"));
		bst.insert(new Vehicle(2, "dudi"));
		bst.insert(new Vehicle(6, "eudi"));
		bst.insert(new Vehicle(10, "fudi"));
		bst.insert(new Vehicle(9, "gudi"));
		System.out.println(bst.toString(bst.root));
		bst.delete(9);
		System.out.println(bst.find(9));
		System.out.println(bst.toString(bst.root));
		bst.delete(5);
		System.out.println(bst.toString(bst.root));
		
		
		
		/*int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < 10; i++)
		{
			int[] array1 = new int[size];
			Random rand1 = new Random();
			for(int j = 0; j < size; j++)
			{
				array1[j] = rand1.nextInt(5001);
			}
			java.util.Arrays.sort(array1);
			final int value1 = array1[rand1.nextInt(size-1)];
			BinarySearch1 searcher1a = new BinarySearch1();
			searcher1a.search(array1, value1);
			sum1 += searcher1a.counter;
			
			BinarySearch2 searcher2a = new BinarySearch2();
			searcher2a.search(array1, value1);
			sum2 += searcher2a.counter;
		}
		System.out.println(sum1 / 10);
		System.out.println(sum2 / 10);*/
	}
}
