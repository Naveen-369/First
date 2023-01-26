
import pyautogui
import time
time.sleep(3)
count=0
while count<=18:#number of times
    pyautogui.typewrite("Hello Madam"+str(count))#word
    pyautogui.press("enter")
    count=count+1
    
    
