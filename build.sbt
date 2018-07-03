name := "test-graal"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5-SNAPSHOT"
)

unmanagedJars in Compile += file(sys.env("JAVA_HOME") + "/jre/lib/svm/builder/svm.jar")
