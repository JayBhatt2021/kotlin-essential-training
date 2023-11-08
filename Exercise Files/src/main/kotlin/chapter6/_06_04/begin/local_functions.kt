package chapter6._06_04.begin

fun main() {
    // Determines which Collection Elements are Palindromes
    val words = listOf("racecar", "civic", "level", "butter")
    for (word in words) {
        println("Is $word a palindrome? ${isPalindrome(word)}")
    }
}

// Outer Function
fun isPalindrome(word: String): Boolean {
    // Local Function (has access to the outer variable - word)
    fun doCharsMatch(front: Int, back: Int): Boolean {
        if (front >= back) return true
        if (word[front].toUpperCase() != word[back].toUpperCase()) return false
        return doCharsMatch(front + 1, back - 1)
    }
    if (word.length < 2) return true
    return doCharsMatch(0, word.lastIndex)
}
