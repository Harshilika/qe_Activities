try:
    file=open("./Activity8_First","r")
    for line in file:
        print(line)
except Exception as e:
    print("File Not Found")
    print("Error Message",e)
