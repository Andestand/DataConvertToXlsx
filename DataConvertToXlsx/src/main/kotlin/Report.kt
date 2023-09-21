

data class Report(
    val id: Long? = null,

    val worker: String,

    val work: Work,

    val datetime: DateTime,

    val address: String,

    val geoPoint: GeoPoint
)

