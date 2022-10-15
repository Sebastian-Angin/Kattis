const readLine = require("readline");

const rl = readLine.createInterface({input: process.stdin, output:process.stdout});

rl.on('line', (line) => {
    var input = line.split(' ');
    var eyes = parseInt(input[0])
    var nose = parseInt(input[1])
    var mouths = parseInt(input[2])

    var result = eyes*nose*mouths;

    console.log(result);
});