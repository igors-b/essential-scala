package chapter_3_objects_and_classes

object CounterDemo {
  def main(args: Array[String]): Unit = {
    val counter:Int = new Counter(10).inc.dec.inc.inc.count
    println(counter)

    val counter2: Int = new Counter2(10).inc().inc.dec(2).count
    println(counter2)
  }

}
