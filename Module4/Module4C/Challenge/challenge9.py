vowels = ['a', 'A', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u']

def count(str):
    no = 0
    for i in str:
        if i in vowels:
            no += 1
    return no


print(count("Ifeoluwakiishi"))


# Return the number of vowels in a string
