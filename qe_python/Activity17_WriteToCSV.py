import pandas as pd
from pandas import ExcelWriter
from pandas import ExcelFile
data={
    'Usernames':["admin","Charles","Deku"],
    'passwords':["password","Charl13","AllMight"]
}
dataframe=pd.DataFrame(data)
dataframe.to_csv("Activity17.csv",index=False)
print("Successfully completed")