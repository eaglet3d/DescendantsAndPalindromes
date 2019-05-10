import spock.lang.Specification
import spock.lang.Unroll

/**
 * Tests the CodingTest class methods
 */
class CodingTestSpec extends Specification {

  @Unroll
  def "test generateDescendants() using #num"() {
    given:
    CodingTest ct = new CodingTest()

    when:
    ct.generateDescendants(num)

    then:
    ct.descendants == expectedDescendants &&
    ct.palindromes == expectedPalindromes

    where:
    num      || expectedDescendants         | expectedPalindromes
    123213   || ["66", "12", "3"]           | ["66", "3"]
    1234213  || ["673", "16", "7"]          | ["7"]
    1992341  || ["1991", "191", "11", "2"]  | ["1991", "191", "11", "2"]
  }

}