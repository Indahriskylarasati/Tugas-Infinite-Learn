package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        println("Masukkan angka:")
        val userInput = readLine()
        val number = userInput?.toInt() ?: throw NumberFormatException("Input bukan angka")

        println("memasukkan angka: $number")
    } catch (e: NumberFormatException) {
        println("Error: ${e.message}")
        println("Mohon masukkan input berupa angka.")
    }
}
