public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domains = new HashMap<String, Integer>();
        for (String cpdomain:cpdomains){
            String[] pair = cpdomain.split(" ");
            String[] splits = pair[1].split("\\.");
            String tempdomain = "";
            int cnt = Integer.valueOf(pair[0]);
            for (int i = splits.length - 1; i >= 0; i--){
                if (i != splits.length - 1){
                    tempdomain = splits[i] + "." + tempdomain;
                }
                else{
                    tempdomain = splits[i] + tempdomain;
                }
                
                if (!domains.containsKey(tempdomain)){
                    domains.put(tempdomain, cnt);
                }
                else{
                    int oldcnt = domains.get(tempdomain);
                    domains.put(tempdomain, cnt + oldcnt);
                }
            }
        }
        List<String> rt = new ArrayList<String>();
        for (String key : domains.keySet()){
            String analyse = String.valueOf(domains.get(key)) + " " + key;
            rt.add(analyse);
        }
        return rt;
    }