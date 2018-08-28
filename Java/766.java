766. Toeplitz Matrix

public boolean isToeplitzMatrix(int[][] matrix){
	int wid = matrix.length;
	int len = matrix[0].length;
	int l = 0;
	while (l < len){
		int i = 0;
		int j = l;
		int tmp = matrix[i][j];
		while (i < wid && j < len){
			if (tmp != matrix[i][j]){
				return false;
			}
			j ++;
			i ++;
		}
		l ++;
	}
	int w = 1;
	while (w < wid){
		int j = 0;
		int i = w;
		int tmp = matrix[i][j];
		while (i < wid && j < len){
			if (tmp != matrix[i][j]){
				return false;
			}
			i ++;
			j ++;
		}
		w ++;
	}
	return true;

}