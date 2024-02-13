class Human:
    leg_count = 4
    can_walk = True

    def get_description(self):
        print("This is a human")


    def nu_meth(self):
        return str(self.leg_count)


Text = Human()
Text.get_description()
print(Text.nu_meth())

# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add another attribute can_walk with the value of True
# Create a method called get_description, the method should print "This is human"
# Create another method that return the leg count, the name of the method is your choice
#
# Optionally you can instantiate the class and invoke the method get_description() and invoke your method that returns leg count.

