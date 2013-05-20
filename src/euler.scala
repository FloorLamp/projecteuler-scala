package euler

class euler {
    def p6 = {
        var sum = 0;
        var sum_squared = 0;
        for (i <- 1 to 100) {
            sum += i;
            sum_squared += math.pow(i, 2).toInt;
        }
        println(sum*sum - sum_squared);
    }
    
    def p5 = {
        var prod = 1
        for (i <- 1 to 20) {
            var old = prod
            while (prod % i != 0) {
                prod += old
                println(prod)
            }
        }
    }
}