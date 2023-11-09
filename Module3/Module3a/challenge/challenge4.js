//Print a table containing multiplication tables
// This table prints multiplication tables from 1 to the number in the function parameter
function multiplication(number) {
    for (let no = 1; no <= number; no++) {
        
        for (let i = 1; i <= 12; i++) {
            let multi = no * i
            console.log("The multiplication table for " + no + " is " + no + " x " + i + " = " + multi )
            
        }
    }
   
}

console.log(multiplication(5))