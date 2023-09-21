
object Reports {
    private val converter = DateTimeConverter()

    val reports = arrayOf(
        Report(
            id = 1,
            worker = "Андрей Яровой",
            work = Works.array[0],
            datetime = converter.toDateTime("01.05.2020 05:10"),
            address = "Город: Нижний Новгород, улица Молдавская, дом 40.",
            geoPoint = GeoPoint(
                56.29633500300676,
               44.03289493788921
            )
        ),

        Report(
            id = 2,
            worker = "Даня Соколов",
            work = Works.array[1],
            datetime = converter.toDateTime("29.05.2020 3:10"),
            address = "Город: Нижний Новгород, улица Родионова, дом 9, квартира 18.",
            geoPoint = GeoPoint(
                56.32020111313717,
               44.04741406004705
            )
        ),

        Report(
            id = 3,
            worker = "Виктор Резник",
            work = Works.array[2],
            datetime = converter.toDateTime("26.05.2020 7:33"),
            address = "Город: Нижний Новгород, улица Генерала Зимина, дом 18, квартира 5.",
            geoPoint = GeoPoint(
                56.326273557977636,
               43.93875564709215
            )
        ),

        Report(
            id = 4,
            worker = "Фёдор Андриянов",
            work = Works.array[3],
            datetime = converter.toDateTime("27.05.2020 15:00"),
            address = "Город: Нижний Новгород, улица Обухова, дом 20, квартира 15.",
            geoPoint = GeoPoint(
                56.31441996363606,
               43.93583608384418
            )
        ),

        Report(
            id = 5,
            worker = "Тёма Митрофанов",
            work = Works.array[4],
            datetime = converter.toDateTime("26.05.2020 17:19"),
            address = "Город: Шахунья, улица Адмирала Макарова, дом 8, квартира 25.",
            geoPoint = GeoPoint(
                56.28603797566956,
               43.94450570167052
            )
        ),

        Report(
            id = 6,
            worker = "Андрей Яровой",
            work = Works.array[0],
            datetime = converter.toDateTime("21.08.2023 5:43"),
            address = "Город: Нижний Новгород, улица Молдавская, дом 40.",
            geoPoint = GeoPoint(
                56.29633500300676,
                44.03289493788921
            )
        ),

        Report(
            id = 7,
            worker = "Даня Соколов",
            work = Works.array[1],
            datetime = converter.toDateTime("20.05.2023 3:10"),
            address = "Город: Нижний Новгород, улица Родионова, дом 9, квартира 18.",
            geoPoint = GeoPoint(
                56.32020111313717,
                44.04741406004705
            )
        ),

        Report(
            id = 8,
            worker = "Виктор Резник",
            work = Works.array[2],
            datetime = converter.toDateTime("29.08.2023 7:33"),
            address = "Город: Нижний Новгород, улица Генерала Зимина, дом 18, квартира 5.",
            geoPoint = GeoPoint(
                56.326273557977636,
                43.93875564709215
            )
        ),

        Report(
            id = 9,
            worker = "Фёдор Андриянов",
            work = Works.array[3],
            datetime = converter.toDateTime("30.05.2023 15:00"),
            address = "Город: Нижний Новгород, улица Обухова, дом 20, квартира 15.",
            geoPoint = GeoPoint(
                56.31441996363606,
                43.93583608384418
            )
        ),

        Report(
            id = 10,
            worker = "Тёма Митрофанов",
            work = Works.array[4],
            datetime = converter.toDateTime("15.07.2023 17:19"),
            address = "Город: Шахунья, улица Адмирала Макарова, дом 8, квартира 25.",
            geoPoint = GeoPoint(
                56.28603797566956,
                43.94450570167052
            )
        ),

        Report(
            id = 11,
            worker = "Андрей Яровой",
            work = Works.array[0],
            datetime = converter.toDateTime("03.08.2023 5:43"),
            address = "Город: Нижний Новгород, улица Молдавская, дом 40.",
            geoPoint = GeoPoint(
                56.29633500300676,
                44.03289493788921
            )
        ),

        Report(
            id = 12,
            worker = "Даня Соколов",
            work = Works.array[1],
            datetime = converter.toDateTime("09.08.2023 3:10"),
            address = "Город: Нижний Новгород, улица Родионова, дом 9, квартира 18.",
            geoPoint = GeoPoint(
                56.32020111313717,
                44.04741406004705
            )
        ),

        Report(
            id = 13,
            worker = "Виктор Резник",
            work = Works.array[2],
            datetime = converter.toDateTime("13.08.2023 7:33"),
            address = "Город: Нижний Новгород, улица Генерала Зимина, дом 18, квартира 5.",
            geoPoint = GeoPoint(
                56.326273557977636,
                43.93875564709215
            )
        ),

        Report(
            id = 14,
            worker = "Фёдор Андриянов",
            work = Works.array[3],
            datetime = converter.toDateTime("24.08.2023 15:00"),
            address = "Город: Нижний Новгород, улица Обухова, дом 20, квартира 15.",
            geoPoint = GeoPoint(
                56.31441996363606,
                43.93583608384418
            )
        ),

        Report(
            id = 15,
            worker = "Тёма Митрофанов",
            work = Works.array[4],
            datetime = converter.toDateTime("18.08.2023 17:19"),
            address = "Город: Шахунья, улица Адмирала Макарова, дом 8, квартира 25.",
            geoPoint = GeoPoint(
                56.28603797566956,
                43.94450570167052
            )
        ),

        Report(
            id = 16,
            worker = "Андрей Яровой",
            work = Works.array[0],
            datetime = converter.toDateTime("29.08.2023 5:43"),
            address = "Город: Нижний Новгород, улица Молдавская, дом 40.",
            geoPoint = GeoPoint(
                56.29633500300676,
                44.03289493788921
            )
        ),

        Report(
            id = 17,
            worker = "Даня Соколов",
            work = Works.array[1],
            datetime = converter.toDateTime("11.08.2023 3:10"),
            address = "Город: Нижний Новгород, улица Родионова, дом 9, квартира 18.",
            geoPoint = GeoPoint(
                56.32020111313717,
                44.04741406004705
            )
        ),

        Report(
            id = 18,
            worker = "Виктор Резник",
            work = Works.array[2],
            datetime = converter.toDateTime("01.07.2023 7:33"),
            address = "Город: Нижний Новгород, улица Генерала Зимина, дом 18, квартира 5.",
            geoPoint = GeoPoint(
                56.326273557977636,
                43.93875564709215
            )
        ),

        Report(
            id = 19,
            worker = "Фёдор Андриянов",
            work = Works.array[3],
            datetime = converter.toDateTime("30.077.2023 15:00"),
            address = "Город: Нижний Новгород, улица Обухова, дом 20, квартира 15.",
            geoPoint = GeoPoint(
                56.31441996363606,
                43.93583608384418
            )
        ),

        Report(
            id = 20,
            worker = "Тёма Митрофанов",
            work = Works.array[4],
            datetime = converter.toDateTime("16.08.2021 17:19"),
            address = "Город: Шахунья, улица Адмирала Макарова, дом 8, квартира 25.",
            geoPoint = GeoPoint(
                56.28603797566956,
                43.94450570167052
            )
        ),

        Report(
            id = 21,
            worker = "Тёма Митрофанов",
            work = Works.array[4],
            datetime = converter.toDateTime("18.05.2021 17:19"),
            address = "Город: Шахунья, улица Адмирала Макарова, дом 8, квартира 25.",
            geoPoint = GeoPoint(
                56.28603797566956,
                43.94450570167052
            )
        ),

        Report(
            id = 22,
            worker = "Андрей Яровой",
            work = Works.array[0],
            datetime = converter.toDateTime("28.07.2020 5:43"),
            address = "Город: Нижний Новгород, улица Молдавская, дом 40.",
            geoPoint = GeoPoint(
                56.29633500300676,
                44.03289493788921
            )
        ),

        Report(
            id = 23,
            worker = "Даня Соколов",
            work = Works.array[1],
            datetime = converter.toDateTime("11.07.2020 3:10"),
            address = "Город: Нижний Новгород, улица Родионова, дом 9, квартира 18.",
            geoPoint = GeoPoint(
                56.32020111313717,
                44.04741406004705
            )
        ),

        Report(
            id = 24,
            worker = "Виктор Резник",
            work = Works.array[2],
            datetime = converter.toDateTime("01.05.2021 7:33"),
            address = "Город: Нижний Новгород, улица Генерала Зимина, дом 18, квартира 5.",
            geoPoint = GeoPoint(
                56.326273557977636,
                43.93875564709215
            )
        ),

        Report(
            id = 25,
            worker = "Фёдор Андриянов",
            work = Works.array[3],
            datetime = converter.toDateTime("30.07.2021 15:00"),
            address = "Город: Нижний Новгород, улица Обухова, дом 20, квартира 15.",
            geoPoint = GeoPoint(
                56.31441996363606,
                43.93583608384418
            )
        )
    )
}
