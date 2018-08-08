
    public int findComplement(int num) {
        int yushu = 0;
        int beishu = 1;
        int rt = 0;
        while (num != 0){
            yushu = num % (2*beishu) / beishu;
            num = num - beishu * yushu;
            rt = rt + beishu * (1-yushu);
            beishu = beishu * 2;   
        }
        return rt;
    }
