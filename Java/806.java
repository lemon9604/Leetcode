public int[] numberOfLines(int[] widths, String S){
	char[] str = S.toCharArray();
	int cnt = 0;
	int line = 1;
	int i = 0;
	for (i = 0; i < str.length; i++){
		char s = str[i];
		
		if (100 - cnt > widths[(byte)s - 97]){
			cnt = cnt + widths[(byte)s - 97];
		}
		else if (100 -cnt == widths[(byte)s - 97]){
			cnt = 0;
			line ++;
		}
		else{
			cnt = widths[(byte)s - 97];
			line ++;
		}
	}
	int[] results = new int[2];
	
	results[0] = line;
	results[1] = cnt;

	return results;
}
