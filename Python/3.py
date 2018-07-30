s = "c"


i = 0
max = 0
cnt = 0
substr = []
while i < len(s):
    print s[i]
    if s[i] not in substr:
        cnt += 1
        substr.append(s[i])
    else:
        if max < cnt:
            max = cnt
        index = substr.index(s[i])
        
        cnt = cnt - index

        for j in range(index+1):
            substr.remove(substr[0])
        substr.append(s[i])
    i += 1

if cnt > max:
    max = cnt

print max

