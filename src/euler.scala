object euler {
    def main(args: Array[String]) = {
        p5
        p6
    }
    
    def p5 = {
        def r(max: Int, curr: Int = 1, temp: Int = 1, acc: Int = 1): Int = 
            if (acc % curr == 0 && curr < max) r(max, curr + 1, acc, acc)
            else if (acc % curr != 0) r(max, curr, temp, acc + temp)
            else acc
        val result = r(20)
        println("p5", result)
    }

    def p6 = {
        val result = math.pow((1 to 100).sum, 2) - (1 to 100).map( i => i*i ).sum
        println("p6", result)
    }
}