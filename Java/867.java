public static int[][] tranpose(int[][] A){
		int len = A.length;
		int wid = A[0].length;
		int[][] trans = new int[wid][len];

		for (int i = 0; i < len; i ++){
			for (int j = 0 ; j < wid; j++){
				trans[j][i] = A[i][j];
			}
		}

		return trans;
	
		
	}