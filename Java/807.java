public static int MaxIncreasetoKeepCitySkyline(int[][] grid){
		int len = grid.length;
		int wid = grid[0].length;
		int value = 0;
		int sum = 0;
		for (int l = 0; l < len; l++){
			for (int w = 0; w < wid; w++){
				int value_x = 0;
				for (int x = 0; x < wid; x++){
					if (grid[l][x] > value_x){
						value_x = grid[l][x];
					}
				}
				int value_y = 0;
				for (int y = 0; y < len; y++){
					if (grid[y][w] > value_y){
						value_y = grid[y][w];
					}
				}
				if (value_x > value_y){
					value = value_y;
				}
				else{
					value = value_x;
				}
				sum += value - grid[l][w];
			}
		}
		return sum;
	}