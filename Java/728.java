public static boolean checkdivede(int n){
		List<Integer> divides = new ArrayList<>();
		int raw = n;
		while (n != 0){
			divides.add(n % 10);
			if (n % 10 == 0){
				return false;
			}
			n = n / 10;
		}
		for (int i=0, len = divides.size(); i < len; i++){
			if (raw % divides.get(i) == n){
				divides.remove(i);
				len --;
				i --;
			}
		}
		if (divides.size() == 0){
			return true;
		}
		else{
			return false;
		}
	}

	
	public static List<Integer> selfDividingNumbers(int left, int right){
		List<Integer> output = new ArrayList<>();
		for (int n = left; n <= right; n++){
			if (checkdivede(n)){
				output.add(n);
			}
		}
		return output;

	}