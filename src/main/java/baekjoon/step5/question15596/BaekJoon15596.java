package baekjoon.step5.question15596;

public class BaekJoon15596 {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
        
        return ans;
    }
}
