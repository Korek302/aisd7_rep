package aisd7_rep;

public class BinarySearch2 implements ArraySearcher
{
	int counter = 0;
	public int binarySearch(int[] arr, int value, int lower, int upper)
	{
		counter ++;
		if(lower > upper)
			return -(lower +1);
		int index = lower + ((value - arr[lower])*(upper - lower))/(arr[upper] - arr[lower]);
		int cmp = value - arr[index];
		if(cmp > 0) 
			return binarySearch(arr, value, index + 1, upper);
		if(cmp < 0) 
			return binarySearch(arr, value, lower, index - 1);
		return index;
	}

	public int search(int[] arr, int value)
	{
		return binarySearch(arr, value, 0, arr.length - 1);
	}
	
}
