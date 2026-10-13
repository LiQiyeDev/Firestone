package com.firestone;

import com.botmaker.sdk.api.input.Mouse;
import com.firestone.plugins.sdk.Spots;

public class Screens {

    public static void openSettings() {
        Mouse.click(Spots.SETTINGS);
    }
}
