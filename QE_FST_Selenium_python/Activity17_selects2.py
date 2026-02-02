from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown=driver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/section/div[2]/select")
    select = Select(dropdown)
    select.select_by_visible_text("HTML")
    select.select_by_index(4)
    select.select_by_index(5)
    select.select_by_index(6)
    select.select_by_value("nodejs")
    select.deselect_by_index(5)