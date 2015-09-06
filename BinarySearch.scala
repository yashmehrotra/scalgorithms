object BinarySearch {
    def main(args: Array[String]) {
      var arr = List(1, 2, 3, 7, 20, 300, 641)
      var num = 3
      searchNum(num, 0, 6, arr)
    }

    def searchNum(num: Int, start: Int, end: Int, arr: List[Int]): Int = {
      var mid = start + ((end - 1)/2)

      if (start >= end) {
        println("Doesnt Exists")
        return -1
      }
      if (arr(mid) == num) {
        println("Number Exists")
        return mid
      } 

     if (arr(mid) > num) {
        return searchNum(num, mid+1, end, arr)
      } else {
        return searchNum(num,start,mid-1,arr)
      }
    }
}

