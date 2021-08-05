package cs1102;

public class loops {
	public static void main(String[] args) {
		
		// print 1 - 5
		
		int a = 0;
		// while loop
		while (a < 5) {
		  System.out.println(a);
		  a++;
		}
		// do while loop
		do {
			System.out.println(a);
			a++;
		}
		while(a < 5);
		
		// for loop 
		for (int b = 0; b < 5; b++) {
			System.out.println(a);
		}
		
		// countdown from 5 - 1 
		
		int b = 5;
		// do while loop
		do {
			System.out.println(b);				
			b--;
		}
		while(b >= 5);
		// while loop
		while (b >= 5) {
			  System.out.println(b);
			  b--;
		}
		
		
		// Iterate through an array 
		int[] nums = {1, 3, 5, 7, 9};
		for (int n : nums) {
			System.out.println(n*2);
		}
		
		// do...while style
		int i = 0;
		do {
			if(nums[i] < nums.length) {
				System.out.println(nums[i]*2);
			}
			i++;
		}
		
		while(i < nums.length);
		
		// while
		while(i < nums.length) { System.out.println(nums[i]*2); i++; }
		
		
		
	}
}

