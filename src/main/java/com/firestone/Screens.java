package com.firestone;

import com.botmaker.sdk.api.input.Mouse;
import com.firestone.plugins.sdk.Spots;
import com.botmaker.sdk.api.input.Keyboard;
import com.botmaker.sdk.api.input.Key;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.firestone.plugins.sdk.Pictures;

public class Screens {

    public static void openSettings() {
        Mouse.click(Spots.SETTINGS);
    }

    public static void tour() {
        Mouse.click(1820, 620);
        Keyboard.tap(Key.ESCAPE);
        ImageClicker.clickAll(Pictures.RESEARCH_CLAIM);
    }
}
