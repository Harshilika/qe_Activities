from selenium import webdriver
import time
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events")
    keyboard=driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/h1")
    time.sleep(3)
    print(keyboard.text)