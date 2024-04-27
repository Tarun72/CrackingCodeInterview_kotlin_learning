package arraystrings

/**
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 * Example 1:
 *
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */
//https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2001.%20Arrays%20and%20Strings
class PermutationInString {
    val questionUrl = "https://leetcode.com/problems/permutation-in-string/description/";
    val questionNumber = 1.2
    val totalQuestionsSoFar = 2;

    fun checkInclusion(s1: String, s2: String): Boolean {

        return bruteForceStratergies(s1, s2)
    }

    fun bruteForceStratergies(s1: String, s2: String): Boolean {
        val map: MutableMap<Char, Int> = mutableMapOf<Char, Int>()
        for (i in s1.indices) {
            map[s1[i]] = i
        }
        for (k in s2.indices) {
            val valueOFI = k
            val endIndex = valueOFI + s1.length
            if (endIndex <= s2.length) {
                var subStringOfS2 = s2.subSequence(k, endIndex)
                var isPermutationInString = true
                for (j in subStringOfS2.indices) {
                    if (!map.containsKey(subStringOfS2[j])) {
                        isPermutationInString = false
                    }
                }
                if (isPermutationInString) {
                    return true
                }
            }

        }
        return false;
    }

    /**
     * How to find permutations of String
     */


}





























