numbers = [2, 6, -8, 90, 18, -54, -33, 27, -29, 7, -4]


def positive_numbers(number):
    return [number for number in numbers if number >= 0]


print(positive_numbers(numbers))


# Create a function that filters out negative numbers.
