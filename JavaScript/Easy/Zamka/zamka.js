const readLine = require("readline");

let inputNumbers = [];

const rl = readLine.createInterface({input: process.stdin, output:process.stdout});

var lowNumber, highNumber, compNumber;

rl.on('line', (line) =>
{
    inputNumbers.push(parseInt(line));
    if(inputNumbers.length == 3) rl.close();   
});

rl.on('close', (close) =>
{
    lowNumber = inputNumbers[0];
    highNumber = inputNumbers[1];
    compNumber = inputNumbers[2];
    console.log(loopThroughNumbersLow(lowNumber, highNumber, compNumber));
    console.log(loopThroughNumbersHigh(lowNumber, highNumber, compNumber));
});

 function loopThroughNumbersHigh( low,  high,  comp)
        {
            for (let i = high; i >= low; i--)
            {
                
                var answer = CalcSumOfNumber(i);
                //console.log(answer);
                if(comp == answer) return i;
            }
            return 10003;
        }

        function loopThroughNumbersLow( low,  high,  comp)
        {
            for (let i = low; i <= high; i++)
            {
                var answer = CalcSumOfNumber(i);
                if(comp == answer) return i;
            }
            return 10002;
        }

        function CalcSumOfNumber(number)
        {
            var sumNumber = 0;
            while(number != 0)
            {
                sumNumber += number % 10;
                number = Math.floor(number / 10);
            }
            
            return sumNumber;
        }