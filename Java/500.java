public static int checkword(List<Character> row, char[] chars){
	int cnt = 0;
	for (char c: chars){
		if (!row.contains(c)){
			cnt ++;
		}
	}
	if (cnt == 0){
		return 1;
	}
	return 0;
}

public String[] findWords(String[] words){
	List<Character> firstrow = new ArrayList<Character>();
	firstrow.add('q');
	firstrow.add('w');
	firstrow.add('e');
	firstrow.add('r');
	firstrow.add('t');
	firstrow.add('y');
	firstrow.add('u');
	firstrow.add('i');
	firstrow.add('o');
	firstrow.add('p');
	List<Character> secondrow = new ArrayList<Character>();
	secondrow.add('a');
	secondrow.add('s');
	secondrow.add('d');
	secondrow.add('f');
	secondrow.add('g');
	secondrow.add('h');
	secondrow.add('j');
	secondrow.add('k');
	secondrow.add('l');
	List<Character> thirdrow = new ArrayList<Character>();
	thirdrow.add('z');
	thirdrow.add('x');
	thirdrow.add('c');
	thirdrow.add('v');
	thirdrow.add('b');
	thirdrow.add('n');
	thirdrow.add('m');
	List<String> rtlist = new ArrayList<String>();
	for (String s : words){
		String lowers = s.toLowerCase();
		int confirm = 0;
		char[] chars = lowers.toCharArray();
		if (firstrow.contains(chars[0])){
			confirm = checkword(firstrow, chars);
		}
		else if (secondrow.contains(chars[0])){
			confirm = checkword(secondrow, chars);
		}
		else{
			confirm = checkword(thirdrow, chars);
		}
		if (confirm == 1){
			rtlist.add(s);
		}
	}
	String[] rt = rtlist.toArray(new String[rtlist.size()]);
	return rt;
}