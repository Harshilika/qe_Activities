from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    textInput=driver.find_element(By.ID,"textInput")
    if(textInput.is_enabled()):
        print("TextInput is Enabled")
    else:
        print("TextInput is not Enabled")
    textInputButton=driver.find_element(By.ID,"textInputButton")
    textInputButton.click()
    if(textInput.is_enabled()):
        print("TextInput is Enabled")
    else:
        print("TextInput is not Enabled")
