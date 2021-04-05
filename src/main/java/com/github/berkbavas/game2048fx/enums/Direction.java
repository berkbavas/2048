package com.github.berkbavas.game2048fx.enums;

import javafx.scene.input.KeyCode;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static Direction valueOf(KeyCode keyCode) {
        return valueOf(keyCode.name());
    }

}
