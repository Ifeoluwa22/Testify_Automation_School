//Create a function that filters out negative numbers

let numbers = [2, 6, -8, 90, 18, -54, -33, 27, -29, 7, -4]

function newFunc(positiveNumbers) {
    return positiveNumbers > 0
}

let newNumbers = numbers.filter(newFunc)

console.log(newNumbers)