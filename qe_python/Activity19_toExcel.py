from pandas import ExcelWriter
from pandas import ExcelFile
import pandas as pd
data={
    "FirstName":["Sathvik","Avinash","Lahari"],
    "LastName":["Shah","Kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":[3845932910,1234567890,9876543211]
}
df=pd.DataFrame(data)
df.to_excel("Activity19.xlsx",index=False)