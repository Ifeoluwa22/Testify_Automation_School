// Return the number of vowels in a string
const vowels = ['a', 'A', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u']

function count(string) {
    let noOfVowels = 0

    for (let i = 0; i < vowels.length; i++) {
        if (string.includes(vowels[i])) {
            noOfVowels ++
        } 
        
    }
    return noOfVowels
}

console.log(count("Ifeoluwa"))