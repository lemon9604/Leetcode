width = [7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9]
S = "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie"
width = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "abcdefghijklmnopqrstuvwxyz"
print len(S)
line = 1
cnt = 0
for i in range(0, len(S)):
	print ord(S[i]) - 97
	if 100-cnt > width[ord(S[i]) - 97]:
		cnt += width[ord(S[i]) - 97]
	elif 100 - cnt == width[ord(S[i]) - 97]:
		cnt = 0
		line += 1;
	else:
		cnt = width[ord(S[i]) - 97]
		line += 1;
	
print line, cnt