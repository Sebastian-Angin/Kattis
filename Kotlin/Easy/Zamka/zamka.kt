fun main()
{
    var lowNumber: Long = readLine()!!.toLong()
    var highNumber = readLine()!!.toLong()
    var compNumber = readLine()!!.toLong()

    println(loopThroughNumbersLow(lowNumber, highNumber, compNumber))
    println(loopThroughNumbersHigh(highNumber, lowNumber, compNumber))
}

fun loopThroughNumbersHigh(_start: Long, _end: Long, comp: Long): Long
{
    for (i in _start downTo _end) {
        var answer: Long = CalcSumOfNumber(i);
        if(comp == answer) return i;
    }
    return 9999L
}

fun loopThroughNumbersLow(_start: Long, _end: Long, comp: Long): Long
{
    for (i in _start .. _end) {
        var answer: Long = CalcSumOfNumber(i);
        if(comp == answer) return i;
    }
    return 9999L
}

fun CalcSumOfNumber(_number: Long): Long 
{
    var sumNumber = 0L
    var number = _number
    while(number != 0L)
        {
            sumNumber += number % 10L;
            number /= 10L;
        }

        return sumNumber;
}