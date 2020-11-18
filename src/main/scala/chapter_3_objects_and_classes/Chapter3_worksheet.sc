class Counter(val count: Int) {
  def inc(): Counter = new Counter(count + 1)
  def dec(): Counter = new Counter(count - 1)
}

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

class Counter2(val count: Int) {
  def inc: Counter2 = inc()
  def dec: Counter2 = dec()
  def inc(in: Int = 1): Counter2 = new Counter2(count + in)
  def dec(in: Int = 1): Counter2 = new Counter2(count - in)
  def adjust(adder: Adder): Counter2 =
    new Counter2(adder.add(count))
}

val counter:Int = new Counter(10).inc.dec.inc.inc.count


val counter2: Int = new Counter2(10).inc().inc.dec(2).count

class Adder2(amount: Int) {
  def apply(in: Int) = in + amount
}

val add3 = new Adder2(3)
add3.apply(2)
add3(4)

class Person(val firstName: String, val secondName: String)
object Person {
  def apply(wholeName: String): Person = {
    val name: Array[String] = wholeName.split(" ")
    new Person(name(0), name(1))
  }
}

Person("Igors Bartkevics").secondName
