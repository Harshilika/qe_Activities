def fibnocciSeries(n):                                    
    if(n<=1):
        return n
    else:
        return fibnocciSeries(n-1)+fibnocciSeries(n-2)
n=int(input("Enter number")) 
for i in range(n):
    print(fibnocciSeries(i),end=' ')



'''n=int(input("Enter value"))
a=0
b=1
print(a," ",end='')
print(b," ",end='')
for i in range(n-2):
    c=a+b
    a=b
    b=c
    print(c," ",end='')
'''