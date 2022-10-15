import sys

for input in sys.stdin:
    splitKey = input.split()
    eyes = int(splitKey[0])
    nose = int(splitKey[1])
    mouths = int(splitKey[2])

    result = eyes * nose * mouths

    print(result)