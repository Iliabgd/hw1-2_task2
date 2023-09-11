fun main() {
    val likes = 141
    val whoLikesTxt: String
    val whoLikesNum = likes % 10
    val whoLikesNum11 = likes % 100
    whoLikesTxt = if (whoLikesNum == 1 && whoLikesNum11 != 11) "человеку" else "людям"
    println("Понравилось $likes $whoLikesTxt")
}

