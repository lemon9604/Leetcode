public String reverseString(String s) {
    char[] chars = s.toCharArray();
    char exchange;
    for (int i = 0; i < chars.length/2; i ++){
        exchange = chars[i];
        chars[i] = chars[chars.length - i - 1];
        chars[chars.length - i - 1] = exchange;
    }
    s = new String(chars);
    return s;
}