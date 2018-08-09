public static char getKey(HashMap<Character, Integer> map, int value){
    	char key = '-';
    	for (char getKey: map.keySet()){
    		if (map.get(getKey).equals(value)){
    			return getKey;
    		}
    	}
    	return key;
    }

    public static int getEnd(HashMap<Character, Integer> startmap, HashMap<Character, Integer> endmap, int min, int max){
    	int rawmax = max;
    	for (char key:startmap.keySet()){
				if (startmap.get(key) < max && startmap.get(key) > min){
					if (max < endmap.get(key)){
						max = endmap.get(key);
				}
			}
		}
		if (rawmax != max){
			max = getEnd(startmap, endmap, rawmax, max);
		}
		return max;
    }
	
	public static List<Integer> partitionLabels(String S){
		List<Integer> parts = new ArrayList<Integer>();
		char[] inputs = S.toCharArray();
		HashMap<Character, Integer> startmap = new HashMap();
		HashMap<Character, Integer> endmap = new HashMap();
		for (int i = 0; i < inputs.length; i ++){
			char temp = inputs[i];
			if (startmap.containsKey(temp)){
				endmap.put(temp, i);
			}
			else{
				startmap.put(temp, i);
				endmap.put(temp, i);
			}
		}
		int min = 0;
		int max = 0;
		int end;

		while (min != inputs.length){
			System.out.println(min);
			end = endmap.get(getKey(startmap, min));
			if (max < end){
				max = end;
			}
			max = getEnd(startmap, endmap, min, max);
			parts.add(max-min+1);
			min = max + 1;
		}
		
	return parts;
		
	}