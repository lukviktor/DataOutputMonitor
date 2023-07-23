package com.abboott.visual;

import com.abboott.data.DataProgram;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class Table {
    public void setUp(Object[][] data) {
        TableSettings tableSettings = new TableSettings();

        // Заголовки столбцов
        String[] columnNames = tableSettings.columnNames();

        // Создаем таблицу с данными и заголовками
        JTable table = new JTable(data, columnNames);

        // Создание панели и добавление таблицы в нее
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Создание кнопки "Выход"
        JButton exitButton = new JButton(DataProgram.BUTTON_EXIT);
        exitButton.addActionListener(e -> System.exit(0));

        // Добавление кнопки "Выход" вверху панели
        panel.add(exitButton, BorderLayout.SOUTH);

        // Создание фрейма и добавление панели на него
        JFrame frame = new JFrame(DataProgram.FRAME_TABLE);
        frame.getContentPane().add(panel);

        // Установка размеров фрейма и отображение его на экране
        frame.setSize(DataProgram.SIZE_WINDOW[0], DataProgram.SIZE_WINDOW[1]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Получение объекта столбца для каждого столбца таблицы
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn firstNameColumn = columnModel.getColumn(0);
        TableColumn lastNameColumn = columnModel.getColumn(1);
        TableColumn ageColumn = columnModel.getColumn(2);

        // Установка предпочтительной ширины для каждого столбца
        firstNameColumn.setPreferredWidth(100);
        lastNameColumn.setPreferredWidth(100);
        ageColumn.setPreferredWidth(50);

        frame.setVisible(true);
    }

}