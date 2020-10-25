name := "spark2livedemo"

version := "0.1"

scalaVersion := "2.12.6"

lazy val Versions = new {

  val spark = "2.4.4"
  val hadoop = "2.6.5"
}



libraryDependencies += "com.typesafe" % "config" % "1.3.2"
libraryDependencies += "org.apache.spark" %% "spark-sql" % Versions.spark

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % Versions.hadoop
libraryDependencies += "org.apache.spark" %% "spark-core" % Versions.spark


assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

