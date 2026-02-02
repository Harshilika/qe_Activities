from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    name=driver.find_element(By.XPATH,"//input[starts-with(@name,'full-name')]")
    email=driver.find_element(By.XPATH,"//input[contains(@placeholder,'Email Address')]")
    doe=driver.find_element(By.XPATH,"//input[contains(@name,'event-date')]")
    additional=driver.find_element(By.XPATH,"//textarea[contains(@name,'additional-details')]")
    submit=driver.find_element(By.XPATH,"//button[text()='Submit']")
    name.send_keys("Harshilika")
    email.send_keys("harsh@gmail.com")
    doe.send_keys("2026-01-21")
    additional.send_keys("Welcome to Party")
    submit.click()
    result=driver.find_element(By.ID,"action-confirmation")
    print(result.text)