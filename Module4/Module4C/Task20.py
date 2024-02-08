class Human:
    leg_count = 4

    def get_gender(self):
        print("Unknown")


class Man(Human):
    pass

person = Man()
person.get_gender()


# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add a method called get_gender() that returns "Unknown" in the Human class
# Create another class called Man that extends Human