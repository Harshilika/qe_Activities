list1=list(map(int, input("Enter numbers: ").split()))
list2=list(map(int, input("Enter numbers: ").split()))
listCombine=[]
for val1 in list1:
    if(val1%2!=0):
        listCombine.append(val1)
for val2 in list2:
    if(val2%2==0):
        listCombine.append(val2)
print(listCombine)

