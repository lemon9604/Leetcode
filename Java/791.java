791. Custom Sort String

public String customSortString(String S, String T){
	char[] orders = S.toCharArray();
	char[] unsorteds = T.toCharArray();
	char[] rt = new char[unsorteds.length];
	int cnt = 0;
	for (char order: orders){
		for (int i = 0; i < unsorteds.length; i++){
			if (unsorteds[i] == order){
				unsorteds[i] = 'A';
				rt[cnt] = order;
				cnt ++;
			}
		}
	}
	for (int i = 0; i < unsorteds.length; i++){
		if (unsorteds[i] != 'A'){
			rt[cnt] = unsorteds[i];
			cnt ++;
		}
	}
	String rtstr = new String(rt);
	return rtstr;
}