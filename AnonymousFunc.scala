object AnonymousFunc extends App {


  def customFunction1(x:Double): Double = x * 2

  def customFunction2(x: Double, y: Double): Double = {

    x + y
  }

  println(customFunction1(5))
  println(customFunction2(5, 19))

  // Anonymous Functions

  val customAnonymous: Double => Double = x => x * 2
  val customAnonymous2 = (x: Double) => x * 2


  println("result of custom anonymous1")
  println(customAnonymous(5))
  println("result of custom anonymous 2")
  println(customAnonymous2(5))


  // Anonymous Functions

  val customAnonymous3: (Double, Double) => Double = (x,y) => x + y

  println(customAnonymous3(5,19))


  // Map and Filters
  // Map function receives a function
  // They are applied on an Iterable e.g., a list
  val customList = List(0,3, 6, 9, 12, 15)

  val customList2 = customList.map(item => item * 2)

  val customList3 = customList.map(_ * 2)

  customList2.foreach(println)
  println("------")
  customList3.foreach(println)

  // Filter the even values = keep the even values
  val customListFilter = customList.filter(item => item % 2 == 0)
  println("printing filtered list")
  customListFilter.foreach(println)



}
