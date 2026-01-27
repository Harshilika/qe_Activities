def add_numbers(n):
    if(n<=1):
        return n
    else:
        return n+add_numbers(n-1)
n=int(input("Enter n value"))
print(add_numbers(n))