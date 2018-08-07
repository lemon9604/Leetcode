public int[] numberOfLines(int[] widths, String S){
	char[] str = S.toCharArray();
	int cnt = 0;
	for (int i = 0; i < str.length - 1; i++){
		char s = str[i];
		cnt = cnt + widths[int(s) - 97];
	}
	int[] results = new int[2];

	results[0] = cnt / 100;
	results[1] = cnt % 100;
	if ((results[1] + widths[int(str[i]) - 97]) / 100 != 0){
		results[1] = widths[int(str[i]) - 97];
		
	}
	else{
		results[1] = results[1] + widths[int(str[i]) - 97];
	}
	results[0] ++;

	return results;
}

[7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9]
"zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie"