from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    wait = WebDriverWait(driver, 10)
    checkboxx=(By.ID,"checkbox")
    togglebtn=driver.find_element(By.XPATH,"//button[contains(text(),'Toggle')]")
    togglebtn.click()
    wait.until(EC.invisibility_of_element_located(checkboxx))
    print("Checkbox is disappeared")
    togglebtn.click()
    wait.until(EC.visibility_of_element_located(checkboxx))
    print("Checkbox is visible")
    driver.find_element(*checkboxx).click()
    if(driver.find_element(*checkboxx).is_selected):
        print("checkbox is selected")
