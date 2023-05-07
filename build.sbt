lazy val root = (project in file(".")).
  settings(
    name := "cosc250assignment3",
    version := "2023.0",
    scalaVersion := "3.2.2"
  )

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.wbillingsley" %% "amdram" % "0.0.0+6-099e455a-SNAPSHOT"
)

libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test

// We also need to register munit as a test framework in sbt so that "sbt test" will work and the IDE will recognise
// tests
testFrameworks += new TestFramework("munit.Framework")
