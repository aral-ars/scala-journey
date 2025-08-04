ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalafmtOnCompile := true
ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "scala-journey"
  )
