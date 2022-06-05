val finchVersion = "0.32.1"
val circeVersion = "0.14.1"
val scalatestVersion = "3.2.12"

lazy val root = (project in file("."))
  .settings(
    organization := "com.techmonad",
    name := "learning-finch",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "com.github.finagle" %% "finchx-core"  % finchVersion,
      "com.github.finagle" %% "finchx-circe"  % finchVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "org.scalatest"      %% "scalatest"    % scalatestVersion % "test"
    )
  )