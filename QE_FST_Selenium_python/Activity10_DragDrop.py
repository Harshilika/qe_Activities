from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/drag-drop")
    print(driver.title)
    actions = ActionChains(driver)
    ball=driver.find_element(By.ID,"ball")
    dropzone1=driver.find_element(By.ID,"dropzone1")
    dropzone2=driver.find_element(By.ID,"dropzone2")
    actions.drag_and_drop(ball,dropzone1).perform()
    dropped1=driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/div[1]/span")
    actions.drag_and_drop(ball,dropzone2).perform()
    if(dropped1.text=="Dropped!"):
        print("Ball is dropped in dropzone1")
    dropped2=driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/div[2]/span")
    if(dropped2.text=="Dropped!"):
        print("Ball is dropped in dropzone2")