//Create a function that filters out negative numbers

let numbers = [2, 6, -8, 90, 18, -54, -33, 27, -29, 7, -4]

let reversed = []

function newd(arr) {
    for (let i = 0; i < numbers.length; i++) {      
        arr = numbers.pop();
        console.log(arr)
    }
}

newd()

/*
let numbers = [7, -2, 3, 4, 5, -1, 6];

function newFunc(numbers){

      while (numbers.length && numbers[numbers.length - 1] < 0) {
       numbers.pop();
     }
     for (var i = numbers.length - 1; i >= 0; i--) {
       if (numbers[i] < 0) {

        numbers[i] = numbers[x.length - 1];
        numbers.pop();
      }
    }
    return numbers;
  }

    
    console.log(newFunc(numbers)); */