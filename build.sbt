organization := "it.nerdammer.bigdata"

name := "spark-hbase-connector"

version := "2.0.0"

scalaVersion := "2.12.8"

libraryDependencies +=  "org.apache.spark" %% "spark-core" % "3.3.1" % "provided"
libraryDependencies +=  "org.apache.hbase" % "hbase-common" % "1.4.14" % "provided"
libraryDependencies +=  "org.apache.hbase" % "hbase-server" % "1.4.14" % "provided"
//TODO:test cases to be updated
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "provided"


licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")











