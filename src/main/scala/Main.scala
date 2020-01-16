object Main {
  def flatten(list: List[_]): List[Any] = {
    list match {
      case Nil => Nil
      case (head:List[_]) :: tail => flatten(head) ++ flatten(tail)
      case head :: tail => head :: flatten(tail)
    }
  }
}
