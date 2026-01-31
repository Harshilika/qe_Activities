from selenium import webdriver
from selenium.webdriver.common.by import By
import time
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/target-practice")
    print(driver.title)
    print(driver.find_element(By.XPATH, "//h3[contains(@class, 'text-orange-600')]").text)
    print(driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/h5").value_of_css_property("color"))
    print(driver.find_element(By.XPATH,"//button[text()='Purple']").get_attribute("class"))
    print(driver.find_element(By.XPATH,"//button[text()='Slate']").text)
    driver.quit()

