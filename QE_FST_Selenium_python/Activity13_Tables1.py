from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    rows=driver.find_elements(By.XPATH,"//table/tbody/tr")
    print(len(rows))
    columns=driver.find_elements(By.XPATH,"//table/tbody/tr[1]/td")
    print(len(columns))
    ThirdRow=driver.find_elements(By.XPATH,"//table/tbody/tr[3]/td")
    for val in ThirdRow:
        print(val.text)
    data=driver.find_element(By.XPATH,"//table/tbody/tr[2]/td[2]")
    print(data.text)