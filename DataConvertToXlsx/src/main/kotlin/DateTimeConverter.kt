
class DateTimeConverter {
    fun fromDateTime(dt: DateTime): String {
        return "${dt.day}.${dt.idMonth}.${dt.year} ${dt.hour}:${dt.minutes}"
    }

    fun toDateTime(dt: String): DateTime {
        val (day, idMonth, year, hour, minutes) = dt.split(".", " ", ":")

        return DateTime(
            day = day,
            idMonth = idMonth,
            month = null,
            year = year,
            hour = hour,
            minutes = minutes
        )
    }
}