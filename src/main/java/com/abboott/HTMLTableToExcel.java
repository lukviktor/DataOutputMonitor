package com.abboott;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;

public class HTMLTableToExcel {
    public static void main(String[] args) {
        try {
            // Получаем HTML-страницу с помощью библиотеки Jsoup
            Document doc = Jsoup.connect("http://example.com").get();

            // Выбираем таблицу на странице
            Element table = doc.select("table").first();
            assert table != null;
            Elements rows = table.select("tr");

            // Указываем путь и имя файла для сохранения таблицы Exel
            String filePath = "src/main/resources/NewTable.xlsx";

            // Создаем новую файловую книгу Excel
            Workbook workbook = new XSSFWorkbook();

            // Создаем новый лист
            Sheet sheet = workbook.createSheet("newList");

            int rowNum = 0;
            for (Element row : rows) {
                Elements cells = row.select("td");
                Row excelRow = sheet.createRow(rowNum++);
                int cellNum = 0;
                for (Element cell : cells) {
                    Cell excelCell = excelRow.createCell(cellNum++);
                    excelCell.setCellValue(cell.text());
                }
            }

            // Записываем файл Excel
            FileOutputStream outputStream = new FileOutputStream("output.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Таблица успешно сохранена в файл output.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
