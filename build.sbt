enablePlugins(ScalaJSPlugin)

val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "felix",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.0.0",
      "com.lihaoyi" %%% "scalatags" % "0.11.0",
      "com.lihaoyi" %%% "utest" % "0.7.10" % "test",
    ),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
