import All
All.entry()
takal_seat=3
regular_seat=12
total_seat=takal_seat+regular_seat
destination={"Hosur":75,"Vaniyambadi":250,"Vellore":500,"Walaja":600,"Chennai":750}
Mainmenu=0
while Mainmenu!=3:
    Mainmenu=int(input("1.booking\n2.Cancelling\n3.Exit\nEnter your choice : "))
    if Mainmenu==1:
        All.book()
        total_seat=total_seat-1
    elif Mainmenu==2:
        All.cancel()
        total_seat=total_seat-1
print("Book your seats before everyseats gets booked.Because only ",total_seat,"seats are pending.")