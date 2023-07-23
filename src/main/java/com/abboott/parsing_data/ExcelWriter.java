package com.abboott.parsing_data;

import com.abboott.data.DataProgram;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {
    // запись данных в Exel
    public void writeDataToExcel(String data) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        String[] lines = data.split("\n");
        for (int i = 0; i < lines.length; i++) {
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(lines[i]);
        }

        // Создаем поток вывода данных в файл
        try (FileOutputStream outputStream = new FileOutputStream(DataProgram.PATH_TO_FILE_EXEL)) {
            workbook.write(outputStream);
            System.out.println("Данные записаны в Excel файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}