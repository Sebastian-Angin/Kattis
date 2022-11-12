import math
import sys

lowNumber = int(sys.stdin.readline()) 
highNumber = int(sys.stdin.readline()) 
compNumber = int(sys.stdin.readline()) 

def getSum(n):
    sum = 0
    for i in str(n):
        sum += int(i)
    return sum


def calNumber(number):
    sumNumber = 0

    while(number != 0):
        sumNumber += number%10
        number = math.floor(number / 10);
    return sumNumber

def LoopThroughNumbersHigh (_start, _end, _comp):
    for i in range(_start, _end -1, -1):
        if getSum(i) == _comp: return i    
    return 9999

def LoopThroughNumbersLow (_start, _end, _comp):
    for i in range(_start, _end + 1):
        if getSum(i) == _comp: return i    
    return 9999


print(LoopThroughNumbersLow(lowNumber, highNumber, compNumber))
print(LoopThroughNumbersHigh(highNumber, lowNumber, compNumber))


