package com.dnd_fan.dnd_program;

import javafx.stage.Stage;

public class MainWindow {
    private static Stage sMainStage;

    public static void set(Stage mainStage) {
        sMainStage = mainStage;
    }

    public static Stage get() {
        return sMainStage;
    }
}
