public int[] shortestToChar(String S, char C){
	char[] chars = S.toCharArray();
	int[] rt = new int[chars.length];
	List<Integer> cs = new ArrayList<Integer>();

	for (int i = 0; i < chars.length; i++){
		if (chars[i] == C){
			rt[i] = 0;
			cs.add(i);
		}
	}

	int front = 0;
	int back = 0;
	for (int i = 0; i < cs.get(0); i++){
		rt[i] = cs.get(0) - i;
	}
	for (int i = 0; i < cs.size()-1; i++){
		front = cs.get(i);
		back = cs.get(i + 1);
		for (int j = front + 1; j <= (front+back)/2; j++){
			rt[j] = j - front;
		}
		for (int j = (front+back)/2 +1; j < back; j++){
			rt[j] = back - j;
		}
	}
	for (int i = cs.get(cs.size()-1) + 1; i < chars.length; i++){
		rt[i] = i - cs.get(cs.size()-1);
	}
	
	return rt;
}