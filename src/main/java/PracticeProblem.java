public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static void q1() {
		//Write question 1 code here
		
	}
	public static int[] bubbleSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		boolean swapped = true;
		for (int i = 0; i < nums.length - 1 && swapped; i++) {
			swapped = false;
			for (int j = 0; j < nums.length - 1 - i; j++) {
				steps++;
				if (nums[j] > nums[j + 1]) {
					double temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swaps += 3;
					swapped = true;
				}
			}
		}
		return new int[]{swaps, steps};
	}
	public static int[] selectionSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				steps++;
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
					swaps += 1;
				}
			}
			
			double temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			swaps += 3;
			
		}
		return new int[]{swaps, steps};
	}


	public static int[] insertionSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		for (int i = 1; i < nums.length; i++) {
			double key = nums[i];
			swaps += 1; 
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				steps++;
				nums[j + 1] = nums[j];
				swaps += 1; 
				j--;
			}
			nums[j + 1] = key;
			swaps += 1;
		}
		return new int[]{swaps, steps};
	}

	public static void q2() {
		//Write question 2 code here
	}
	public static String leastSwaps(double[] nums) {
		
		int b = bubbleSort(nums.clone())[0];
    	int s = selectionSort(nums.clone())[0];
    	int i = insertionSort(nums.clone())[0];

		if (b <= s && b <= i)
			return "Bubble";
		if (s <= i)
			return "Selection";
		return "Insertion";
	}

	public static void q3() {
		//Write question 3 code here
	}
	public static String leastIterations(double[] nums) {
		
	int b = bubbleSort(nums.clone())[1];
    int s = selectionSort(nums.clone())[1];
    int i = insertionSort(nums.clone())[1];

		if (b <= s && b <= i)
			return "Bubble";
		if (s <= i)
			return "Selection";
		return "Insertion";
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	
}
