from selenium import webdriver
from selenium.webdriver.common.by import By
import time
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    if(driver.find_element(By.ID,"checkbox").is_displayed()):
        print("checkbox is displayed")
    else:
        print("checkbox is not displayed")
    ToggleCheckbox=driver.find_element(By.XPATH,"//button[text()='Toggle Checkbox']")
    ToggleCheckbox.click()
    if(driver.find_element(By.ID,"checkbox").is_displayed()):
        print("checkbox is displayed")
    else:
        print("checkbox is not displayed")

