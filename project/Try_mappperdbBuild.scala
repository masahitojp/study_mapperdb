import sbt._
import sbt.Keys._

object Try_mappperdbBuild extends Build {

  lazy val try_mappperdb = Project(
    id = "try_mappperdb",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "try_mappperDb",
      organization := "me.masahito",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        // test
        "org.scalatest" %% "scalatest" % "1.9.1" % "test",
	      "org.scalacheck" %% "scalacheck" % "1.10.1" % "test",
        "com.h2database" % "h2" % "1.3.172",
        "commons-dbcp" % "commons-dbcp" % "1.4",
        "com.googlecode.mapperdao" % "mapperdao" % "1.0.0.rc23-2.10.1",

  //log
        "org.clapper" %% "grizzled-slf4j" % "1.0.1",
        "ch.qos.logback" % "logback-classic" % "1.0.13"
      )
      // add other settings here
    )
  )
}
