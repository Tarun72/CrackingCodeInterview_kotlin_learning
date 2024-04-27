package arraystrings

class IsUnique: CrackingCodingInterviewQuestionInfo() {
    override var questionDetail: String = "Implement an algorithm to determine if a string has all unique characters." +
            "what if you can not use any data structure ?"
    override var isTestCasesAvailable: Boolean= false
    override var onLineQuestionUrl: String = ""
    override var chapter: Int = 1
    override var questionNumber: Int = 1
    override var difficult: Int = 1
    /**
     * Brute force approach will be going through every character of string and check
     * if duplicates present or not
     */
     fun isUniqueCharsBF(word:String):Boolean{
         for (i in word.indices){
             for (j in (i+1)..<word.length){
                 if(word[i] ==  word[j]){
                     return false
                 }
             }
         }
        return true
     }

    /**
     * Final Answer
     * using ascii value of character to find duplicates
     */
    private fun isUniqueChars(word:String):Boolean{
        if(word.length>128){
            return false
        }
        val characterArray = BooleanArray(128)
        for (i in word.indices){
           var c = word[i]
            if(characterArray[c.code]){
                return false
            }
            characterArray[c.code] = true
        }
        return true
    }

    fun executeTestCase(){
        val testWords = arrayOf("abcde", "hello", "apple", "kite", "padle","tarunn","batmanb")

        for (word in testWords) {
            val wordA: Boolean = isUniqueChars(word)
            val wordB: Boolean = isUniqueChars(word)
            if (wordA == wordB) {
                println("$word: $wordA")
            } else {
                println("$word: $wordA vs $wordB")
            }
        }
    }
}

fun main() {
    IsUnique().executeTestCase()
}




































