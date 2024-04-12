import arraystrings.ContainsDuplication
import arraystrings.FirstUniqueCharacterInString

fun main(args: Array<String>) {
    // https://leetcode.com/list/x5sb3e07/


    println(ContainsDuplication().containsDuplicate(intArrayOf(1,2,3,1)))
    println(ContainsDuplication().containsDuplicate(intArrayOf(3,3)))

    println(ContainsDuplication().containsDuplicate(intArrayOf(1,2,3,4)))
    println(ContainsDuplication().containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))




    FirstUniqueCharacterInString().firstUniqChar("Tarun Sharma ")

    println("brute force result leetcode ${ FirstUniqueCharacterInString().firstUniqChar("leetcode")}")
    println("brute force result  loveleetcode ${ FirstUniqueCharacterInString().firstUniqChar("loveleetcode")}")
    println("brute force result aabb ${ FirstUniqueCharacterInString().firstUniqChar("aabb")}")
}