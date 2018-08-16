class Test2{
	public static void main(String[] args){
		
		int[][] nums = spiralMatrixIII(5,6,1,4);;
		for (int[] num : nums){
			System.out.print(num[0]);
			System.out.print("  ");
			System.out.println(num[1]);
		}
		
	}




	public static int[][] spiralMatrixIII(int R, int C, int r0, int c0){
		int[][] rt = new int[R*C][2];
		rt[0][0] = r0;
        rt[0][1] = c0;
		int right = 1;
		int left = 0;
		int up = 0;
		int down = 1;
		int i = 0;
		r0 = rt[i][0];
		c0 = rt[i][1];
		i ++;
		while(i<R*C){
			for (int cnt = 0; cnt < right; cnt++){
				if (i < R*C){
					c0 ++;
					if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C){
						rt[i][0] = r0;
                        rt[i][1] = c0;
						i ++;
						
					}
				}	
			}
			right = right + 2;
			left = right - 1;
			for (int cnt = 0; cnt < down; cnt++){
				if (i < R*C){
					r0 ++;
					if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C){
						rt[i][0] = r0;
                        rt[i][1] = c0;
						i ++;
						
					}
				}	
			}
			down = down + 2;
			up = down - 1;
			for (int cnt = 0; cnt < left; cnt++){
				if (i < R*C){
					c0 --;
					if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C){
						rt[i][0] = r0;
                        rt[i][1] = c0;
						i ++;
						
					}
				}	
			}
			for (int cnt = 0; cnt < up; cnt++){
				if (i < R*C){
					r0 --;
					if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C){
						rt[i][0] = r0;
                        rt[i][1] = c0;
						i ++;
						
					}
				}	
			}	
		}

		return rt;
	}
}