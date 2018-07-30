class Solution{
	public static void main(String[] args){
		System.out.println(numJewelsInStones("ab","AaBBBBBbbc"));
	}

	public static int numJewelsInStones(String J, String S){
		int cnt = 0;
		char[] stones = S.toCharArray();
		char[] jews = J.toCharArray();
		for (char jew : jews){
			for (char stone:stones){
				if (jew ==stone){
					cnt = cnt + 1;
				}
			}

		}

		return cnt;

	}
}