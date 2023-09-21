data class DateTime(
    val day: String,

    val idMonth: String,
    val month: String?,

    val year: String,

    val hour: String,
    val minutes: String
) {
    override fun toString(): String {
        return "${day}.${idMonth}.${year} ${hour}:${minutes}"
    }
}
