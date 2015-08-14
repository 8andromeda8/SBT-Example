logLevel := Level.Warn

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.0")  //para hacer release

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")       //

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")  //generacion de .jar

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")  // ya no es necesario en intelij 14.
