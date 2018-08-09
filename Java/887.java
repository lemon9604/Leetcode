public static int projectionArea(int[][] grid){
		int area = 0;
		int line = 0;
		int group = 0;
		for (int i = 0; i < grid.length; i ++){
			group = 0;
			for (int j = 0; j < grid[0].length; j++){
				if (grid[i][j] > group){
					group = grid[i][j];
				}
				if (grid[i][j] != 0){
					area ++;
				}
			}
			area = area + group;
		}
		for (int j = 0; j < grid[0].length; j++){
			line = 0;
			for (int i = 0; i < grid.length; i++){
				if (grid[i][j] > line){
					line = gird[i][j];
				}
			}
			area = area + line;
		}
		
		return area;
	}