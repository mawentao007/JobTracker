name := "JobTracker"

version := "1.0"

scalaVersion := "2.10.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "net.sf.barcode4j" % "barcode4j" % "2.1"
)

