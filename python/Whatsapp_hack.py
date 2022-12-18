import pyautogui
import time
time.sleep(3)
count=0
while count<=75:#number of times
    pyautogui.typewrite("Sandu panni"+str(count))#word
    pyautogui.press("enter")
    count=count+1
    
    
