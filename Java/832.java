public static int[][] FlippinganImage(int[][] A){
		int len = A.length;
		int wid = A[0].length;
		int m;
		for (int l = 0; l < len; l++){
			for (int w = 0; w < wid/2; w++){
				m = A[l][w];
				A[l][w] = 1 - A[l][wid - w - 1];
				A[l][wid - w - 1] = 1 - m;
			}
		}
		if (wid % 2 == 1){
			for (int l = 0; l < len; l++){
				A[l][wid/2] = 1 - A[l][wid/2];
			}
		}
		return A;
	}