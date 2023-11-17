const side1 = 66;
const side2 = 66;
const side3 = 66;

if ((side1 === side2 && side2=== side3)){
    console.log("Equilateral triangle")
}
else if (side1 === side2 || side2 === side3 || side1 === side3) {
    console.log("Isosceles triangle")
} else {
    console.log("Scalene triangle")
}

// In this task we use the if condition to calculate the type of triangles based on the set conditions