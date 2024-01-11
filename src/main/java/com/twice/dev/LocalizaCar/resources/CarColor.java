package com.twice.dev.LocalizaCar.resources;

import java.util.ArrayList;

public enum CarColor {

    WHITE("#ffffff"),
    BLACK("#000000"),
    RED("#ff0000"),
    SILVER("#c0c0c0");

    private String rgb;

    CarColor(String rgb) {
        this.rgb = rgb;
    }

}
