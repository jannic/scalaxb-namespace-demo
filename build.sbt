import ScalaxbKeys._

scalaVersion := "2.11.2"

scalaxbSettings

sourceGenerators in Compile <+= scalaxb in Compile

async in (Compile, scalaxb) := false

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"
