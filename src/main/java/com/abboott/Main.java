package com.abboott;

import com.abboott.cycle_timer.UpdateTimer;
import com.abboott.getting_data.GetDataFromWebsite;
import com.abboott.parsing_data.ExcelWriter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Как хотиле выводить данные? Window or Exel");

        Scanner scanner = new Scanner(System.in);

        String hawInput = scanner.nextLine();

        if (hawInput.toLowerCase().contains("exel")) {
            GetDataFromWebsite getDataFromWebsite = new GetDataFromWebsite();
            UpdateTimer timer = new UpdateTimer();
            String data = getDataFromWebsite.searchElement();
            timer.startFetchingData(data);

            ExcelWriter excelWriter = new ExcelWriter();
            excelWriter.writeDataToExcel(data);
        }
    }
}
