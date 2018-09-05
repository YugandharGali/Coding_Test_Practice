package zolando;
import java.util.ArrayList;
import java.util.List;

public class TotalNoOftimesPlayed {

	public static void main(String[] args) {

		System.out.println(totalNoOftimesPlayed(18, 2));
	}

	public static int totalNoOftimesPlayed(int N, int K) {

		int noOftimesPlayed = 0;

		List<Integer> allinBetList = new ArrayList<>();
		int x = N;
		for (int i = K; i > 0;) {
			x = x / 2;
			allinBetList.add(x);
			i--;
		}

		for (int i = 1; i <= N;) {

			if (allinBetList.contains(i)) {
				i = i * 2;
			} else {
				i = i + 1;
			}

			if (!(i == N)) {
				noOftimesPlayed++;
			}
		}

		return noOftimesPlayed;

	}

}