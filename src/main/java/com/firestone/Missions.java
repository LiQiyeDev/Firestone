package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.screens.Button;
import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Order;
import com.botmaker.sdk.api.screens.Pick;
import com.botmaker.sdk.api.screens.Pressed;
import com.firestone.plugins.sdk.Screens;

import java.util.List;

public class Missions {

    public static Activities.Missions body() {
        Navigate.press(Screens.MAP.claimMap, Pick.untilNone());
        for (Button pin : List.of(Screens.MAP.swordPinMap, Screens.MAP.telescopePinMap, Screens.MAP.dragonPinMap,
                Screens.MAP.scrollPinMap)) {
            for (int nth = 1; ; nth++) {
                // The map's ways name a pin's first copy only, so a later copy is judged by where it landed.
                Pressed opened = Navigate.press(pin, Pick.nth(nth, Order.NORTH));
                if (opened.landed() == Screens.MISSION_IN_PROGRESS) {
                    Navigate.press(Screens.MISSION_IN_PROGRESS.closeMission);
                } else if (opened.landed() != Screens.SWORD_PIN) {
                    break;
                } else {
                    Navigate.press(Screens.SWORD_PIN.startMissionMap);
                    if (Navigate.isOn(Screens.SWORD_PIN)) {
                        return Activities.Missions.NEXT;
                    }
                }
            }
        }
        return Activities.Missions.NEXT;
    }
}
