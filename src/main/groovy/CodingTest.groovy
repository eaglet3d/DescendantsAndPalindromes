/**
 * Groovy class for the Coding Test at MediaTek.
 * This Solution is coded by Ralph A. Navarro Jr.
 *
 * Write a function that takes a number and returns how many total
 * palindromes exist in the set of the number and its descendants.
 *
 * Palindromes are strings/numbers that can be read the same way
 * forwards and backwards, eg 21312, 494, 1, etc.
 *
 * Let’s define a child of a number as being a number whose digits
 * are created by summing groups of up to 3 consecutive digits of the
 * parent.
 *
 * The groupings start greedily from the left, so 45678 is grouped
 * as (456)(78) and becomes 1515 ((4+5+6) (7+8) = 15 15).  The
 * summation can form more than one new digit.
 *
 * 1) Given 123213
 *  * Descendants 66 ((1+2+3) (2+1+3) = 6 6), (6+6 = 12), and 3 (1+2)
 *  * 2 palindromes (66, 3)
 *
 * 2) Given 1234213
 *  * Descendants 673 ((1+2+3) (4+2+1) (3) = 6 7 3), 16 (6+7+3) and 7 (1+6).
 *  * 1 palindromes (7)
 *
 * 3) Given 1992341
 *  * Descendants 1991, 191, 11, 2
 *  * 4 palindromes (1991, 191, 11, 2)
 *
 * @author Ralph A. Navarro Jr.
 * @phone +1(508)287-0190
 * @copyright 2019 Navarro Computing LLC.
 * @licence MIT
 */
class CodingTest {

    def palindromes = []
    def descendants = []

    /**
     * Add the descendant and check for a palindrome.
     *
     * @param numStr A number as a String to be checked for palindromeness.
     */
    def addDescendant(String numStr) {
        // Check for Palindrome and capture it
        if (numStr == numStr.reverse()) {
            this.palindromes << numStr
        }
        this.descendants << numStr
    }

    /**
     * Clear the descendants and palindromes
     *
     * @return null
     */
    def clearCodingTest() {
        this.palindromes = []
        this.descendants = []
    }

    /**
     * Generate descendants of a specified Integer.
     * Recursively calls itself until there are no more descendants.
     *
     * @param i An integer to be analyzed for descendants.
     */
    def generateDescendants(Integer i) {
        String numStr = i.toString()
        def descendant
        Integer descendantPart = 0
        def descendantParts = []
        def child = ""

        while (numStr.length() > 0) {
            descendant = numStr.take(3)
            descendant.each { digit ->
                descendantPart += digit as Integer
            }
            descendantParts << descendantPart as String
            descendantPart = 0

            //println numStr.length()

            numStr = numStr.drop(3)
        }

        descendantParts.each { digit ->
            child += digit as String
        }

        addDescendant( child )
        //println "descendantParts ${descendantParts}"
        if ( child.size() > 1 ) {
            generateDescendants( child as Integer )
        }
    }

    /**
     * Print a report showing the descendants and palindromes of a number
     *
     * @param num The Integer used for this report
     * @return null
     */
    def printReport(Integer num) {
        println "-------------- ${num} --------------"
        println "${this.descendants.size()} descendants ${this.descendants}"
        println "${this.palindromes.size()} palindromes ${this.palindromes}"
        clearCodingTest()
    }
}
