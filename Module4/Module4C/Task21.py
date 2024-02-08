class Human:
    leg_count = 4

    def get_gender(self):
        print("Unknown")

class Man(Human):
    def get_gender(self):
        print("man")

class Woman(Human):
    def get_gender(self):
        print("woman")

man = Man()
man.get_gender()

woman = Woman()
woman.get_gender()