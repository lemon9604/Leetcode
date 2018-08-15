public String reverseWords(String s) {
    String[] splits = s.split(" ");
    for (int cnt = 0; cnt < splits.length; cnt ++){
        String temp = splits[cnt];
        char[] chars = temp.toCharArray();
        char exchange;
        for (int i = 0; i < chars.length/2; i ++){
            exchange = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = exchange;
        }
        splits[cnt] = new String(chars);
    }
    String rt = splits[0];
    for (int i = 1; i < splits.length; i++){
        rt = rt + " " + splits[i];
    }

    return rt;
}