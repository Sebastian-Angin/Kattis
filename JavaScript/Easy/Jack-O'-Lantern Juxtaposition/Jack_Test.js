const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => { // line = "1 2 3"
    console.log(line)
    var input = line.split(' '); // input = ['1', '2', '3']
    console.log(input)
    var a = parseInt(input[0]);
    var b = parseInt(input[1]);
    var c = parseInt(input[2]);
   
    var result = a * b * c;

    console.log(result)
});