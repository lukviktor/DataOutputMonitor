package com.abboott.cycle_timer;

import java.util.Timer;
import java.util.TimerTask;

public class UpdateTimer {
    private Timer timer = new Timer();

    public void startFetchingData(String t) {
        // Создаем таймер и задачу для выполнения кода каждую минуту

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (t != null) {
                    System.out.println(t);
                }
            }
        };

        // Запускаем таймер
        timer.schedule(task, 0, 60000);
    }

    // Для остановки таймера
    public void stopFetchingData() {
        // Останавливаем таймер
        timer.cancel();
        timer.purge();
        System.out.println("Таймер остановлен.");
    }
}
