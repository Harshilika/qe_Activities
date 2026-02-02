from selenium import webdriver
import time
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    print(driver.title)
    confirm=driver.find_element(By.ID,"confirmation")
    confirm.click()
    alert = driver.switch_to.alert
    time.sleep(1)
    print(alert.text)
    alert.accept()
    res=driver.find_element(By.ID,"result")
    print(res.text)
    confirm.click()
    driver._switch_to.alert
    alert.dismiss()
    print(res.text)


    
