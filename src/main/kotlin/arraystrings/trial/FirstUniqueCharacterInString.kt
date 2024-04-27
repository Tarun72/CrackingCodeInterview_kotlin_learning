package arraystrings.trial

/**
 * Given a string s,
 * find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * branch created
 */
class FirstUniqueCharacterInString {
    val questionUrl = "https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=list&envId=x5sb3e07";
    fun firstUniqChar(s: String): Int {

        //return bruteForceSolution(s)
//        return improveRuntimeOperation(s)
        return moreImprovedApproached(s)
    }

    private fun bruteForceSolution(s: String):Int{
        val visited = mutableListOf<Boolean>()
       for (k in s.indices){
           visited.add(k,false);

       }
        for (i in s.indices){
            for (j in (i+1)..<s.length){
                if(s[i] == s[j]){
                    visited[i] = true;
                    visited[j]= true;
                    break
                }
            }
        }
        var index = -1;
        for (l in 0..<visited.size){
            if(!visited[l]){
                index = l
                break;
            }
        }
       return index
    }

    private fun improveRuntimeOperation(s: String):Int{
        val hashMap:HashMap<Char, UniqueHelper> = HashMap()
        for (i in s.indices){
            val char = s[i]
            if(hashMap.contains(char)) {
                hashMap[char] = UniqueHelper(char, -1)
            }else{
                hashMap[char] = UniqueHelper(char, i)

            }
        }
        var result = -1;
        hashMap.forEach {
            val currentIndex =  it.value.index
            if(currentIndex != -1){
                if(result == -1){
                    result = currentIndex
                }
                if(result>currentIndex){
                    result = currentIndex
                }
            }
        }
        return result
    }
    private fun moreImprovedApproached(s: String):Int{
        val hashMap:HashMap<Char,Int> = HashMap()
        for (i in s.indices){
            val char = s[i]
            if(hashMap.contains(char)) {
                hashMap[char] = Int.MAX_VALUE
            }else{
                hashMap[char] = i

            }
        }
        var result = -1;
        hashMap.forEach {
            val index = it.value
            if(index != Int.MAX_VALUE){
                if(result == -1){
                    result = index;
                }else if(result > index){
                    result = index
                }
            }
        }
        return result

    }

    fun firstUniqChar2(s: String): Int {
        val count = HashMap<Char, Int>()
        val n = s.length
        // build hash map : character and how often it appears
        for (i in 0 until n) {
            val c = s[i]
            count[c] = count.getOrDefault(c, 0) + 1
        }

        // find the index
        for (i in 0 until n) {
            if (count[s[i]] == 1)
                return i
        }
        return -1
    }
}
data class UniqueHelper(val value:Char, val index:Int)





































