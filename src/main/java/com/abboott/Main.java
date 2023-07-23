package com.abboott;

import com.abboott.cycle_timer.UpdateTimer;
import com.abboott.getting_data.GetDataFromWebsite;
import com.abboott.parsing_data.DataArrayWriter;
import com.abboott.parsing_data.ExcelWriter;
import com.abboott.visual.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Как хотиле выводить данные? Window or Exel" + "\n");

        Scanner scanner = new Scanner(System.in);

        String hawInput = scanner.nextLine();

        if (hawInput.toLowerCase().contains("exel")) {
            GetDataFromWebsite getDataFromWebsite = new GetDataFromWebsite();
            UpdateTimer timer = new UpdateTimer();
            String data = getDataFromWebsite.searchElement();
            timer.startFetchingData(data);

            ExcelWriter excelWriter = new ExcelWriter();
            excelWriter.writeDataToExcel(data);
        } else if (hawInput.toLowerCase().contains("window")) {
            DataArrayWriter dataArrayWriter = new DataArrayWriter();
            dataArrayWriter.dataArray().forEach(System.out::println);

            // Данные для таблицы
            Object[][] data = {
                    {"JohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohn", "Doe", 30},
                    {"Jane", "Smith", 25},
                    {"Robert", "Johnson", 35}
            };
            Table table = new Table();
            table.setUp(data);
        }
    }
}
