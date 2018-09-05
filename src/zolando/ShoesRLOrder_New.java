package zolando;
import java.util.HashMap;
import java.util.Map;

public class ShoesRLOrder_New {

	public static void main(String[] args) {
		String s = "RLRRLLRLRRLL";
		String s1 = "RLLLRRRLLR";
		String s2 = "LLRLRLRLRLRLRR";

		int result = getComb(s);
		System.out.println("Result :" + result);
		int result1 = getComb(s1);
		System.out.println("Result :" + result1);
		int result2 = getComb(s2);
		System.out.println("Result :" + result2);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static int getComb(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}
		char c = 0;
		String str = null;
		int counter = 0;
		Map map = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			if (map.isEmpty()) {
				c = s.charAt(i);
				str = c + "";
				map.put(c, c);
			} else {
				if (c != s.charAt(i)) {
					str = str + s.charAt(i) + "";
					//
					map.clear();
					map.put(str, str);
					if ((str.length() % 2 == 0) && (str.equals("LLLRRR") || str.equals("RRRLLL") || str.equals("LLRR")
							|| str.equals("RRLL") || str.equals("RL") || str.equals("LR"))) {
						s = s.substring(i + 1);
						map.clear();
						counter += 1;
						i = -1;
					}
				} else {
					str = str + s.charAt(i) + "";
					map.clear();
					map.put(str, str);
				}
			}
		}
		return counter + map.size();
	}
}
