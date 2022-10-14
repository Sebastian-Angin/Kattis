Create a new file with .js extension.

Run with coderunner

Read file from file:

const fs = require("fs");

fs.readFile("a002.in", (err, data) => {
    if(err) throw err;
    var input = data.toString();
    var firstThree = input.slice(0,3);

    if(firstThree === "555"){console.log("1");}
    else {console.log("0");}
})


Read from Kattis:

const readLine = require("readline");

const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});


rl.on('line', (line) => {
    var input = line;
    var firstThree = input.slice(0,3);

    if(firstThree === "555"){console.log("1");}
    else {console.log("0");}
});