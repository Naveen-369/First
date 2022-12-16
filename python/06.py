# Function to check whether the data entered by the employee is the valid PAN card number or not
def pan_check(pan):
    pan_list = list(pan)
    # Checks the length of the PAN
    if len(pan_list) != 10:
        return False
    # Checks the first half of the PAN
    for i in range(0, 5):
        if not pan_list[i].isalpha():
            return False
    # Checks the last character
    if not pan_list[-1].isalpha():
        return False
    # Checks the remaining characters
    for i in range(5, 9):
        if not pan_list[i].isnumeric():
            return False
    return True

# Main
employee_pan = input("Enter the PAN number : ")
if pan_check(employee_pan):
    print("Valid")
else:
    print("Invalid")