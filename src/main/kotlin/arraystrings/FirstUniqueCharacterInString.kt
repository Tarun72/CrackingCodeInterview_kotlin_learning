package arraystrings

/**
 * Given a string s,
 * find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
class FirstUniqueCharacterInString {
    val questionUrl = "https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=list&envId=x5sb3e07";
    fun firstUniqChar(s: String): Int {

        //return bruteForceSolution(s)
        return improveRuntimeOperation(s)
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
        val hashMap:HashMap<Char,UniqueHelper> = HashMap()
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

}
data class UniqueHelper(val value:Char, val index:Int)
















