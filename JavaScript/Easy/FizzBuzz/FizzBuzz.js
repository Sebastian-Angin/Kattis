const readLine = require("readline");

const rl = readLine.createInterface({input: process.stdin, output:process.stdout});

rl.on('line', (line) => {
    var input = line.split(' ');
    var divOne = parseInt(input[0])
    var divTwo = parseInt(input[1])
    var range = parseInt(input[2])

    for (let i = 1; i <= range; i++) {
        if (i%divOne == 0 && i%divTwo == 0 ) console.log("FizzBuzz");
        else if (i%divOne == 0 ) console.log("Fizz");
        else if (i%divTwo == 0 ) console.log("Buzz");
        else console.log(i);
        
    }

    
});