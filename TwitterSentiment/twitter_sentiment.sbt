name := "TwitterSentiments"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.1"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.3.1"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.3.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.1"
//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.1"
//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.1" classifier "models-english"

