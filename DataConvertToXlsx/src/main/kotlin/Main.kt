
val converter = XlsxConverter()
fun main(args: Array<String>) {

    converter.convertToXlsx(Reports.reports.toList(), "data.xls")
}