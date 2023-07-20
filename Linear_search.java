public class Linear_search {
	static int recursiveSearch(int arr[], int l, int r,
							int x)
	{

		if (r < l)
			return -1;

		if (arr[l] == x)
			return l;

		if (arr[r] == x)
			return r;

	
		return recursiveSearch(arr, l + 1, r - 1, x);
	}

	
	public static void main(String[] args)
	{
		
		int x = 3;

		// Declaring and initializing the integer array
		int arr[] = new int[] { 25, 60, 18, 10 };

		int index
			= recursiveSearch(arr, 0, arr.length - 1, x);

		// If index is found means element exists
		if (index != -1)

			// Print the element and its index
			System.out.println("Element " + x
							+ " is present at index "
							+ index);

		// If we hit else case means element is not present in the array
		else

			// Simply display the corresponding element is not present
			System.out.println("Element " + x
							+ " is not present");
	}
}

    
