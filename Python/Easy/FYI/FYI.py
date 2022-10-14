import sys

#inputFile = "C:/Users/zeb_a/Documents/Kattis/Python/Easy/FYI/fyi/a002.in"
#input = open(inputFile, "r").read()




for i in sys.stdin:
    input = i
    firstThree = ""

    for x in range(0,3):
        firstThree += input[x]

    if(firstThree == "555"): print("1")
    else: print("0")

