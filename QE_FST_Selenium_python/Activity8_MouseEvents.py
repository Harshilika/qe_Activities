from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
import time
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    print(driver.title)
    actions = ActionChains(driver)
    cargoLock=driver.find_element(By.XPATH,"//*[@id='stage']/div[1]/div[1]/div/h1")
    actions.click(cargoLock).perform()
    print(driver.find_element(By.XPATH,"//*[@id='result']").text)
    time.sleep(1)
    cargoToml=driver.find_element(By.XPATH,"//*[@id='stage']/div[1]/div[2]/div/h1")
    actions.move_to_element(cargoToml).click().perform()
    print(driver.find_element(By.XPATH,"//*[@id='result']").text)
    time.sleep(1)
    srcButton=driver.find_element(By.XPATH,"//*[@id='stage']/div[1]/div[3]/div/h1")
    actions.double_click(srcButton).perform()
    print(driver.find_element(By.XPATH,"//*[@id='result']").text)
    time.sleep(1)
    targetButton=driver.find_element(By.XPATH,"//*[@id='stage']/div[1]/div[4]/div/h1")
    actions.context_click(targetButton).perform()
    time.sleep(1)
    openButton=driver.find_element(By.XPATH,"//*[@id='menu']/div/ul/li[1]/button/span")
    actions.click(openButton).perform()
    print(driver.find_element(By.XPATH,"//*[@id=\"result\"]").text)
    time.sleep(1)


   ## <p id="result" data-testid="result" class= contenteditable="" style="height: auto; padding: 1rem;">You tried to <strong> open</strong> target</p>


 

