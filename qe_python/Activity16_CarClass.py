class Car:
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accelerate(self,manufacturer,model):
        print(self.manufacturer,self.model,"is Moving")
    def stop(self,manufacturer,model):
        print(self.manufacturer,self.model,"has Stopped")
mftr=input("Enter manufacturer name")
model=input("Enter Model")
make=int(input("Enter making year"))
transmission=input("Enter transimission")
color=input("Enter color")
obj1=Car(mftr,model,make,transmission,color)
obj1.accelerate(mftr,model)
obj1.stop(mftr,model)
