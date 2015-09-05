object BinarySearch {
    def main(args: Array[String]) {
      var arr = List(1, 2, 3, 7, 20, 300, 641)
      var num = 3
      searchNum(num, 0, arr.length, arr)
    }

    def searchNum(num: Int, start: Int, end: Int, arr: List[Int]): Boolean = {
      if (arr(start) == num) {
        println("Number Exists")
        return true
      } else if (start >= end) {
        println("Number doesnt exist")
        println(start)
        println(end)
        return false
      }else {
        searchNum(num,start,end/2,arr)
        searchNum(num,end/2+1,end,arr)
      }
    }
}

