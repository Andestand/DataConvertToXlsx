
import jxl.Workbook
import jxl.format.Alignment
import jxl.format.Colour
import jxl.format.UnderlineStyle
import jxl.write.*

import java.io.File

class XlsxConverter {
    fun convertToXlsx(data: List<Report>, filePath: String) {
        val workbook: WritableWorkbook = Workbook.createWorkbook(File(filePath))
        val sheet: WritableSheet = workbook.createSheet("Data", 0)

        val headerFormat = WritableCellFormat()
        headerFormat.setBackground(Colour.GREY_25_PERCENT)
        headerFormat.setAlignment(Alignment.CENTRE)
        headerFormat.setWrap(true)
        headerFormat.setFont(WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.WHITE))

        val headers = arrayOf("ФИО мастера", "название работы", "количество", "дата и время", "адрес")

        // Создание заголовков столбцов
        for (i in headers.indices) {
            val label = Label(i, 0, headers[i], headerFormat)
            sheet.addCell(label)
            sheet.setColumnView(i, 15) // Установка ширины столбца
        }

        var currentRowNum = 1
        var currentWorker = ""
        for (report in data) {
            if (currentWorker != report.worker) {
                val workerCell: Label = Label(0, currentRowNum, report.worker)
                workerCell.setCellFormat(headerFormat)
                sheet.addCell(workerCell)
                sheet.mergeCells(0, currentRowNum, headers.size - 1, currentRowNum)
                currentWorker = report.worker
                currentRowNum++
            }

            sheet.addCell(Label(0, currentRowNum, report.worker))
            sheet.addCell(Label(1, currentRowNum, report.work.workName))
            sheet.addCell(jxl.write.Number(2, currentRowNum, report.work.sizeWork.toDouble()))
            sheet.addCell(Label(3, currentRowNum, report.datetime.toString()))
            sheet.addCell(Label(4, currentRowNum, report.address))

            currentRowNum++
        }

        workbook.write()
        workbook.close()
    }
}