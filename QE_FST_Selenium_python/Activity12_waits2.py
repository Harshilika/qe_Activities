from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-content")
    print(driver.title)
    wait = WebDriverWait(driver, 30)
    clickButton=driver.find_element(By.ID,"genButton")
    clickButton.click()
    words=(By.ID,"word")
    wait.until(EC.text_to_be_present_in_element(words, "release"))
    print(driver.find_element(*words).text)
