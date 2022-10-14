import java.io.File

fun main() {
    /*// Read file
    val inputFile = "C:/Users/zeb_a/Documents/Kattis/Kotlin/Easy/FYI/fyi/a002.in"
    val input: String = File(inputFile).readText()
    */

    var line = readLine()

    while(line != null)
    {
        val input: String = line

        val firstThree: String = input.substring(0,3)

        var output: String
    
        if (firstThree == "555") output = "1"
        else output = "0"
    
        println(output);
        line = readLine()
    }
}