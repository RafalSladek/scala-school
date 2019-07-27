val versions = new {
  val scala     = "2.12.8"
  val scalatest = "3.0.8"
}

lazy val root = project
  .in(file("."))
  .settings(
    organization := "com.scout24",
    name := "traits-and-currying",
    scalaVersion := versions.scala,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % versions.scalatest % "test"
    )
  )
