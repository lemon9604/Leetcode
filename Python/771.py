J = 'z'
S = 'ZZ'

jews = J.split()
stones = S.split()
cnt = 0
for stone in S:
	if stone in J:
		cnt += 1

print cnt