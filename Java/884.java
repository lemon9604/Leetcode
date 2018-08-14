class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] asplit = A.split(" ");
	String[] bsplit = B.split(" ");
	Map<String, Integer> rt = new HashMap<String, Integer>();
	Map<String, Integer> realrt = new HashMap<String, Integer>();
	for (String as: asplit){
		if (!rt.containsKey(as)){
			rt.put(as, 1);
		}
		else{
			rt.put(as, rt.get(as) + 1);
		}
	}
	for (String bs: bsplit){
		if (!rt.containsKey(bs)){
			rt.put(bs, 1);
		}
		else{
			rt.put(bs, rt.get(bs) + 1);
		}
	}
	for (String key: rt.keySet()){
		if (rt.get(key) == 1){
			realrt.put(key, 1);
		}
	}
	String[] uncommon = new String[realrt.size()];
    
	int i = 0;
	for (String key: realrt.keySet()){
		uncommon[i] = key;
		i++;
	}
	return uncommon;
    }
}