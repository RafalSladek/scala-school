// examples taken from http://danielwestheide.com/blog/2012/11/21/the-neophytes-guide-to-scala-part-1-extractors.html

object PatternMatching {

  trait User {
    def name: String
    def score: Int
  }

  case class FreeUserCC(name: String, score: Int, upgradeProbability: Double) extends User

  case class PremiumUserCC(name: String, score: Int) extends User

  class FreeUser(val name: String, val score: Int, val upgradeProbability: Double) extends User

  class PremiumUser(val name: String, val score: Int) extends User

  def personalizedGreeting(user: User): String = ???

  def freePremiumForThirdUser(s: Seq[User]): Option[String] = ???
}
