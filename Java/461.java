public static int HammingDistance(int x, int y){
		int cnt = 0;
		int x_tail, y_tail;
		if (x <= y){
			int m = x;
			x = y;
			y = m;
		}
		while (y != 0){
			y_tail = y % 2;
			x_tail = x % 2;
			y = y / 2;
			x = x / 2;
			if (x_tail != y_tail){
				cnt ++;
			}
		}
		while (x != 0){
			if (x % 2 ==1){
				cnt ++;
			}
			x = x / 2;
		}
		return cnt;
	}