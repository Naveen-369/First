class friend():
    def __init__(self,name, phone, email,instaId):
        self.name = name
        self.phone = phone
        self.email = email
        self.instaId = instaId
    def details(self):
        print(self.name, self.phone, self.email, self.instaId)

    def update(self, newName='', newPhone='0000000000', newEmail='', newInsta=''):
        if newName!='':
            self.name=newName
        if newPhone!='0000000000':
            self.phone=newPhone
        if newEmail!='':
            self.email = newEmail
        if newInsta!='':
            self.instaId = newInsta
        self.details()
friend1=friend(name='Kishan', phone='1329820498', email='kishansadeesh13@gmail.com' , instaId='lkasdjf' )
friend1.details()
friend1.update(newName='naveen')