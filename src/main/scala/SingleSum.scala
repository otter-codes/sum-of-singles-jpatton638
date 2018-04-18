object SingleSum extends App {

  def getCount(list: List[Int]) : Int = {

    def filterInt(index: Int): Int = {
      val stripped = list.patch(index, Nil, 1)
      if (stripped.contains(list(index))) 0
      else list(index)
    }

    list.zipWithIndex.map(x =>
      filterInt(x._2)
    ).sum
  }

}
