ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "OtusScalaHomework2",
    idePackagePrefix := Some("ru.red.otus2")
  )
