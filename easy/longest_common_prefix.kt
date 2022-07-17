// LeetCode Link: https://leetcode.com/problems/longest-common-prefix/

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        
        var result = ""
        
        for (index in 0 until strs[0].length) { 
            
            val letter = strs[0][index]
            
            for (wordIndex in 1 until strs.size) {
                
                if (index < strs[wordIndex].length) { 
                    
                    if (strs[wordIndex][index] != letter) {
                        return result
                    }
                    
                } else {
                    return result
                }
            }
            
            result = result + letter  
        }
        return result   
    }
}
