object LCS {
    def main(args: Array[String]) {
        var string1 = "bdcaba"
        var string2 = "abcbdab"
        println( "LCS of the string is : " + getLCS(string1, string2) );
    }

    def getLCS (a:String, b:String ) : String = {
        var LCS = Array.ofDim[Int](a.length+1, b.length+1)
        var i = 0;
        var j = 0;

        for (i <- 1 to a.length ) {
            for (j <- 1 to b.length ) {
                if (a(i-1) == b(j-1) ) {
                    LCS(i)(j) = LCS(i-1)(j-1) + 1
                } else {
                    LCS(i)(j) = genmax(LCS(i-1)(j), LCS(i)(j-1) );
                }
            }
        }
        
        var length =  LCS(a.length)(b.length)
        var lcs = ""

        i = a.length
        j = b.length

        while(i>0 && j>0) {
            if( a(i-1) == b(j-1) ) {
                lcs += a(i-1)
                i -= 1
                j -= 1
            } else if ( LCS(i-1)(j) > LCS(i)(j-1) ) {
                i -= 1
            } else {
                j-= 1
            }
        }
        return lcs.reverse
    }
    
    def genmax (a:Int, b:Int) : Int = {
        return if(a > b) a else b
    }
}
