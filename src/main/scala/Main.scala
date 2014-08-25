import generated._

object Main extends App {
  val parent1 = scalaxb.toXML(Parent1("content"), None, Some("P"), defaultScope)
  println(s"xml with qualified child: $parent1")
  val parsedParent1 = scalaxb.fromXML[Parent1](parent1)
  println(s"parsed xml with qualified child: $parsedParent1")

  val parent2 = scalaxb.toXML(Parent2("content"), None, Some("P"), defaultScope)
  println(s"xml with unqualified child: $parent2")
  val parsedParent2 = scalaxb.fromXML[Parent2](parent2)
  println(s"parsed xml with unqualified child: $parsedParent2")
}
