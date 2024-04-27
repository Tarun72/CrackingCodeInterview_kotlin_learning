package arraystrings.trial

/**
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
class ContainsDuplication {
    val questionUrl = "https://leetcode.com/problems/contains-duplicate/"
    val questionNumber =  1.1
    val totalQuestionsSoFar = 2;
    fun containsDuplicate(nums: IntArray): Boolean {
//       return bruteForce(nums)
   return betterApproach(nums)
    }

    fun bruteForce(nums: IntArray):Boolean{
            for (i in nums.indices){
                for (j in (i+1)..nums.size-1){
                    if(nums[i] == nums[j]) return true
                }
            }
        return false;
    }
    fun betterApproach(nums: IntArray):Boolean{
        val hashMap: MutableMap<Int, Int> = mutableMapOf<Int,Int>()
        for (i in nums.indices){
            if(hashMap.containsKey(nums[i])){
                return true
            }
            hashMap[nums[i]] = 0
        }
        return false
    }

}