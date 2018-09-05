package zolando;
import java.util.Arrays;

/**
 * Get least positive integer number from array. if 0 return 1.
 * @author THUGG
 *
 */
public class ArrayLeastNumber {
	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 4, 1, 2, 1, 2, 3 };
		int a1[] = { 1, 3, 2 };
		int a2[] = { -1, -3 };

		int result = getleastNumber(a);
		System.out.println("Result  :" + result);

		int result1 = getleastNumber(a1);
		System.out.println("Result1 :" + result1);

		int result2 = getleastNumber(a2);
		System.out.println("Result2 :" + result2);
	}

	private static int getleastNumber(int[] arr) {
		int small = 1;
		int val = 0;
		int len = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (val >= arr[i]) {
				small--;
				len--;
				if (i == arr.length - 1) {
					small = 1;
				}
			} else {
				val = arr[i];
				if ((small + i) == val) {
					// do nothing
				} else {
					small = (small + i);
					break;
				}
				if (i == arr.length - 1) {
					small = len + 1;
				}
			}
		}
		return small;
	}
}
