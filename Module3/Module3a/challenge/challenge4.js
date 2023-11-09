//Print a table containing multiplication tables
function multiplication(number) {
    for (let i = 0; i <= 12; i++) {
        let multi = number * i
        console.log("The multiplication table for " + number + " is " + number + " x " + i + " = " + multi )
        
    }
}

console.log(multiplication(10))