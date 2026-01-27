def list_sum(list1):
    sum=0
    for i in list1:
        sum+=i
    return sum
list1=list(map(int,input("Enter numbers").split()))
print('The sum is:')
print(list_sum(list1))