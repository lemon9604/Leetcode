public int binaryGap(int N){
	int beishu = 1;
	int yushu = 0;
	int max = 0;
	int cnt = 0;
	while (N != 0){
		yushu = N % 2;
		N = N / 2;
		if (yushu == 1){
			if (cnt == 0){
				cnt = 1;
			}
			else{
				if (max < cnt){
					max = cnt;
				}
				cnt = 1;
			}
		}
		else{
			if (cnt != 0){
				cnt ++;
			}
		}
	}
	return max;
}