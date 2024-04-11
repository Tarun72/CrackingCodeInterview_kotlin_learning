import arraystrings.FirstUniqueCharacterInString

fun main(args: Array<String>) {
    // https://leetcode.com/list/x5sb3e07/
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    FirstUniqueCharacterInString().firstUniqChar("Tarun Sharma ")

    println("brute force result leetcode ${ FirstUniqueCharacterInString().firstUniqChar("leetcode")}")
    println("brute force result  loveleetcode ${ FirstUniqueCharacterInString().firstUniqChar("loveleetcode")}")
    println("brute force result aabb ${ FirstUniqueCharacterInString().firstUniqChar("aabb")}")
}