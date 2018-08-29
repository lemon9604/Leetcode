406. Queue Reconstruction by Height

public int[][] reconstructQueue(int[][] people){
	int h = 0;
	int k = 0;
	int i;
	// rank the heights
	for (i = 0; i < people.length; i ++){
		for (int j = i + 1; j < people.length; j++){
			if (people[i][0] > people[j][0] || (people[i][0] == people[j][0] && people[i][1] > people[j][1])){
				h = people[i][0];
				k = people[i][1];
				people[i][0] = people[j][0];
				people[i][1] = people[j][1];
				people[j][0] = h;
				people[j][1] = k;
			}
		}
	}
	i --;
	while (i >= 0){
		int end = i;
		int tmp = people[i][0];
		while (i >= 0 && people[i][0] == tmp){
			i --;
		}
		int start = i + 1;
		for (int index = end; index >= start; index --){
			if (people[index][1] != index - start){
				int move = people[index][1] - index + start;
				h = people[index][0];
				k = people[index][1];
				for (int j = index; j < index + move; j ++){
					people[j][0] = people[j + 1][0];
					people[j][1] = people[j + 1][1];
				}
				people[index + move][0] = h;
				people[index + move][1] = k;
			}
		}
	}
	return people;
}