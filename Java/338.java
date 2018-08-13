public int[] countBits(int num){
	int[] rt = new int[num+1];
	int beishu = 2;
	if (num == 0){
		rt[0] = 0;
	}
	else if (num == 1){
		rt[0] = 0;
		rt[1] = 1;
		return rt;
	}
	else{
		rt[0] = 0;
		rt[1] = 1;
		int cnt = 1;
		while (cnt < num){
			cnt ++;
			if (cnt == beishu){
				beishu = beishu * 2;
				rt[cnt] = 1;
			}
			else{
				rt[cnt] = rt[cnt - (beishu/2)] + 1;
			}
		}
		return rt;
	}

}