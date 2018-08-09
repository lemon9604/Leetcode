public static int[][] movecolumn(int[][] A, int column){
    	for (int i = 0; i < A.length; i++){
    		A[i][column] = 1 - A[i][column];
    	}
    	return A;
    }
	
	public static int matrixScore(int[][] A){
		int cnt = 0;
		int lensec = A.length / 2 + A.length % 2;
		int wid = A[0].length;

		for (int i = 0; i < A.length; i ++){
			if (A[i][0] == 0){
				A[i] = moverow(A[i]);
			}
		}

		for (int j = 1; j < A[0].length; j++){
			cnt = 0;
			for (int i = 0; i < A.length; i++){
				if (A[i][j] == 1){
					cnt ++;
				}
			}
			if (cnt < lensec){
				A = movecolumn(A, j);
			}

		}

		int sum = 0;
		int rowsum = 0;
		int beishu = 1;
		for (int i = 0; i < A.length; i ++){
			rowsum = 0;
			beishu = 2;
			for (int j = 0; j < wid; j++){
				System.out.print(A[i][j]);
				System.out.print("  ");
				System.out.print(beishu);
				System.out.print("  ");
				
				rowsum = rowsum * beishu + A[i][j];
				
				System.out.println(rowsum);
			}
			System.out.println(rowsum);
			sum = sum + rowsum;
		}
		return sum;

	}