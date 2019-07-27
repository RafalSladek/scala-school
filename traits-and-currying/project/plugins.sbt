resolvers += Resolver.url(
  "as24-ivy-releases",
  new URL("https://nexus.tools.autoscout24.com/nexus/content/repositories/as24-ivy-releases/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.autoscout24" % "sbt-scalascout" % "0.1.7")
addSbtPlugin("org.scalameta"   % "sbt-scalafmt"   % "2.0.0")
// or
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1") // before 1.6.0-RC4
