package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Indah"
    val lastName: String = "Larasati"
    val age: Int = 20
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}
fun main() {
    myProfile()
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")

    println("Group Members:")
    for (member in groupMembers) {
        println("- $member")
    }

    println("Session: $session")
    return Any()
}
fun main() {
    val groupId = "G001"
    val members = listOf("Adi", "Theo", "Indah", "Messi", "Aulia")
    val session = "Afternoon Session"

    groupDetail(groupId, members, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Adi", "Aulia", "Indah", "Theo", "Messi")
    val myName = teamMembers[2]

    return teamMembers
}

fun main() {
    val team = myTeam()
    println("Daftar Anggota Tim:")
    for (member in team) {
        println("- $member")
    }
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Mentor1", "Mentor2", "Mentor3")
    val countOfGroup = arrayOf("Member1", "Member2", "Member3", "Member4", "Member5")
    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {
    val totalMember = totalMember()
    println("Total Member group: $totalMember")
}

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    fun main() {
        val groupId = "G001"
        val groupMembers = listOf("Adi", "Aulia", "Indah", "Theo", "Messi")
        val session = "Afternoon Session"

        groupDetail(groupId, groupMembers, session)
    }