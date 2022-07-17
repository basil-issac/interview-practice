// LeetCode Link: https://leetcode.com/problems/word-search/

class WordSearch {
    
    fun exist(board: Array<CharArray>, word: String): Boolean { 
        val row = board.size
        val col = board[0].size
        
        for(i in 0 until row) {
            for (j in 0 until col) {
                if (dfs(board, i, j, 0, word)) {
                    return true
                }
            } 
        }
        return false 
    }
    
    fun dfs(board: Array<CharArray>, i: Int, j: Int, start: Int, word: String) : Boolean {
        if(start >= word.length) {
            return true
        }
        
        if(i < 0 
           || j < 0 
           || i >= board.size 
           || j >= board[0].size
           || board[i][j] != word[start]
          ) {
            return false
        }
        
        val tempChar = board[i][j]
        board[i][j] = '.'
        
        val result = 
        dfs(board, i + 1, j, start + 1, word)
        || dfs(board, i - 1, j, start + 1, word)
        || dfs(board, i, j + 1, start + 1, word)
        || dfs(board, i, j - 1, start + 1, word)
        
        board[i][j] = tempChar
        
        return result
    }
}