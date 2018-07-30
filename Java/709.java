public static String ToLowerCase(String str){
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++){
			int ascii = Integer.valueOf(strArray[i]);
			if (ascii >= 65 && ascii <=90){
				ascii += 32;
				strArray[i] = (char)ascii;
			}
		}
		String newstr = new String(strArray);
		return newstr;
	}