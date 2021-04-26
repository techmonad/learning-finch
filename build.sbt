val finchVersion = "0.26.1"
val circeVersion = "0.10.1"
val scalatestVersion = "3.0.9"

lazy val root = (project in file("."))
  .settings(
    organization := "com.techmonad",
    name := "learning-finch",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.13",
    libraryDependencies ++= Seq(
      "com.github.finagle" %% "finchx-core"  % finchVersion,
      "com.github.finagle" %% "finchx-circe"  % finchVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "org.scalatest"      %% "scalatest"    % scalatestVersion % "test"
    )
  )