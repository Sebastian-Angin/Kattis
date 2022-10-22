from ast import For
import sys

for input in sys.stdin:
    splitKey = input.split()
    divOne = int(splitKey[0])
    divTwo = int(splitKey[1])
    loopRange = int(splitKey[2])

    for x in range(1, loopRange + 1):
        if x%divOne == 0 and x%divTwo == 0: print("FizzBuzz")
        elif x%divOne == 0: print("Fizz")
        elif x%divTwo == 0: print("Buzz")
        else: print(x)
        
