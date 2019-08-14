enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.8" // or any other Scala version >= 2.10.2; 2.13.0 causes unresolved dependencies

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.7",
  "org.querki" %%% "jquery-facade" % "1.2",
  //x"be.doeraene" %%% "scalajs-jquery" % "0.9.1",
  "com.lihaoyi" %%% "scalatags" % "0.7.0"
)

skip in packageJSDependencies := false

// still works?? for release optimisation and fullOptJs (vs fastOptJS)
//set scalaJSStage in Global := FullOptStage

jsDependencies +=
  "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.1" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")