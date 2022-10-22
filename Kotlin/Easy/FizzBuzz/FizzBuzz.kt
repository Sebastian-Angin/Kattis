fun main ()
{
    var line = readLine()

    while(line != null)
    {
        val (divOne, divTwo, range) = line.split(' ')
        var x = 1;

        while(x <= range.toLong())
        {
            if(x%divOne.toInt() == 0 && x%divTwo.toInt() == 0) println("FizzBuzz");
            else if(x%divOne.toInt() == 0) println("Fizz");
            else if(x%divTwo.toInt() == 0) println("Buzz");
            else println(x)
            x++

        }
 
        
        line = readLine()
    }
}