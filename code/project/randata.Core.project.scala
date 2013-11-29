package randata

import sbt._
import Keys._

object Core extends Build with Default with Dependencies {
  lazy val core = (
    scalaProject("Core")
    inject(
      scalax,
      scalaTime
    )
  )
}
