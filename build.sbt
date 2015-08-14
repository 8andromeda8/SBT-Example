import spray.revolver.RevolverPlugin._

name := "SBT-Example"

version := "1.0"

scalaVersion := "2.11.7"

Revolver.settings
//releaseSettings
//scalariformSettings

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % "test",
  "com.novocode" % "junit-interface" % "0.8" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "io.spray" %% "spray-can" % "1.3.3" withSources() withJavadoc(),
  "io.spray" %% "spray-routing" % "1.3.3" withSources() withJavadoc(),
  "io.spray" %% "spray-testkit" % "1.3.3" % "test"
)

publishTo := {

  val nexus = "http://nexus.seven4n.com/content/repositories/s4n-capacitaciones/sbt"

  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("Nexus Snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("Nexus Releases" at nexus + "content/repositories/releases")
}

credentials += Credentials("Sonatype Nexus Repository Manager", "alexandra" , "s4n-capacitaciones" , "capacitaciones")
    