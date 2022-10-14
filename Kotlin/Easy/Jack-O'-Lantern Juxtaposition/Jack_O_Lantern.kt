fun main(args: Array<String>) {
    var line = readLine()

    while(line != null)
    {
        var (eyes, nose, mouths) = line.split(' ')

        var product: Int = eyes.toInt() * nose.toInt() * mouths.toInt();

        println(product)

        line = readLine();
    }
}