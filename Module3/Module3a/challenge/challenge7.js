// Sort an array of numbers in descending order

let ascending = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]

let descending = [ ]

for (let i = ascending.length - 1; i >= 0; i--) {
    const element = ascending[i];
    descending.push(element)   
}
console.log(descending)

//Check how to use pop
