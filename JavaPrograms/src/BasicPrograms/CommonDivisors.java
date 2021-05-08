package BasicPrograms;

public class CommonDivisors {
	public static boolean check(int k, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i % k)) {
				return false;
			}

		}
		return true;
	}

	public static int CommonCheck(String a, String b) {
		int n = a.length();
		int m = b.length();
		int count = 0;
		for (int i = 1; i <= Math.min(n, m); i++) {
			if (n % i == 0 && m % i == 0) {
				if (a.substring(0, i).equals(b.substring(0, i))) {
					if (check(i, a) && check(i, b)) {
						count++;
					}

				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String a = "lrbb", b = "lrbblrbb";
		System.out.println(CommonCheck(a, b));
	}

}
