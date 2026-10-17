package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.screens.Button;
import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Pick;
import com.firestone.plugins.sdk.Screens;

import java.util.List;

public class Missions {

    public static Activities.Missions body() {
        Navigate.press(Screens.MAP.claimMap, Pick.untilNone());
        for (Button pin : List.of(Screens.MAP.swordPinMap, Screens.MAP.telescopePinMap, Screens.MAP.dragonPinMap,
                Screens.MAP.scrollPinMap)) {
            while (Navigate.press(pin).done()) {
                Navigate.press(Screens.SWORD_PIN.startMissionMap);
                if (Navigate.isOn(Screens.SWORD_PIN)) {
                    return Activities.Missions.NEXT;
                }
            }
        }
        return Activities.Missions.NEXT;
    }
}
