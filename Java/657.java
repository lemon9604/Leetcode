public static boolean judgeCircle(String moves){
		char[] movements = moves.toCharArray();
		int vertical = 0;
		int horizon = 0;
		for (char movement : movements){
			switch(movement){
				case 'U':
				vertical ++;
				break;

				case 'D':
				vertical --;
				break;

				case 'R':
				horizon ++;
				break;

				case 'L':
				horizon --;
				break;

			}
		}
		if (vertical == 0 && horizon == 0){
			return true;
		}
		else{
			return false;
		}

	}