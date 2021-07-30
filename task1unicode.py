a= int(input())
b= {}

for _ in range(a):
  w = input()
  if w in b.keys():
    b[w]+=1
  else:
    b.update({w:1})

print(len(b.keys()))
print(*b.values())

