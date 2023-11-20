package id.infinitelearning.KotlinSubmission.exercise5
class Hero(val name: String, val health: Int, val power: Int)
fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = Hero("Mr Celean", 100, 50)

    println("Hero Name: ${hero.name}")
    println("Health: ${hero.health}")
    println("Power: ${hero.power}")


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    fun setProfile(name: String, age: Int, height: Double) {
        println("Setting Profile...")
        println("Name: $name")
        println("Age: $age years old")
        println("Height: $height cm")
    }

    fun main() {
        setProfile("Indah", 20, 150)
    }



    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    data class Profile(val name: String, val age: Int, val height: Double)

    fun printProfile(profile: Profile) {
        println("Data Profile:")
        println("Name: ${profile.name}")
        println("Age: ${profile.age} years old")
        println("Height: ${profile.height} cm")
    }

    fun main() {
        val myProfile = Profile("Indah", 20, 150)
        printProfile(myProfile)
    }



    /**
    Challenge:
    ===============Class A Afternoon===============
    4Keys -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    CELESTIAL -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Strix -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Fast and Serious -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Kuda Terbang -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Geek Genius's Team -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Enforcers -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    HA HENG -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    End Game -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    Fly Without Wings -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Unity Force -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    11:11 ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x

    ===============Class B Afternoon===============
    FRINIGHT -> jalan 2x, lari 4x, makan 3x, minum 2x, lompat 1x, duduk 2x
    EnviGrowth -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x
    ZWH (Zero Waste Heroes) -> jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    Serenity -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    UNLIMITED INNOVATION -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Procyon -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    Beta+ -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    Elevens United -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    OmniDev -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    COSMOPOLITE -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    GrowZen -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Unpredictable (Group Merge 12)
    NusaVote -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Vortex -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    data class Activity(val name: String, val walk: Int, val run: Int, val eat: Int, val drink: Int, val jump: Int, val sit: Int)

    fun performActivity(activity: Activity) {
        println("${activity.name} -> jalan ${activity.walk}x, lari ${activity.run}x, makan ${activity.eat}x, minum ${activity.drink}x, lompat ${activity.jump}x, duduk ${activity.sit}x")
    }

    fun main() {
        // Menjalankan aktivitas-aktivitas sesuai dengan challenge
        performActivity(Activity("4Keys", 5, 2, 3, 1, 3, 1))
        performActivity(Activity("CELESTIAL", 2, 2, 1, 3, 1, 2))
        performActivity(Activity("Strix", 3, 1, 5, 1, 5, 3))
        performActivity(Activity("Fast and Serious", 5, 4, 4, 4, 3, 2))
        performActivity(Activity("Kuda Terbang", 4, 1, 3, 5, 5, 3))
        performActivity(Activity("Geek Genius's Team", 2, 4, 2, 2, 7, 4))
        performActivity(Activity("Enforcers", 1, 3, 1, 1, 2, 1))
        performActivity(Activity("HA HENG", 3, 2, 4, 1, 5, 1))
        performActivity(Activity("End Game", 4, 2, 1, 5, 2, 3))
        performActivity(Activity("Fly Without Wings", 1, 3, 2, 5, 4, 1))
        performActivity(Activity("Unity Force", 5, 3, 1, 2, 3, 2))
        performActivity(Activity("11:11 ->7", 1, 2, 3, 4, 5, 6))
    }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    data class Status(
        val name: String,
        var walkCount: Int = 0,
        var runCount: Int = 0,
        var eatCount: Int = 0,
        var drinkCount: Int = 0,
        var jumpCount: Int = 0,
        var sitCount: Int = 0
    )

    fun profile(status: Status) {
        println("${status.name} -> jalan ${status.walkCount}x, lari ${status.runCount}x, makan ${status.eatCount}x, minum ${status.drinkCount}x, lompat ${status.jumpCount}x, duduk ${status.sitCount}x")
    }

    fun main() {
        val status = Status("Indah")
        status.walkCount = 5
        status.runCount = 2
        status.eatCount = 3
        status.drinkCount = 1
        status.jumpCount = 3
        status.sitCount = 1

        profile(status)
    }


}