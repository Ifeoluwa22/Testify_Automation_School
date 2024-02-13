class Human:
    leg_count = 4
    can_walk = True

    def __init__(self, name):
        self.name = name

leg_state = Human("Rue")
print(leg_state.can_walk)
print(leg_state.leg_count)

# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add another attribute can_walk with value of True
#
# Optionally you can instantiate the class and prints out the leg_count and can_walk attributes