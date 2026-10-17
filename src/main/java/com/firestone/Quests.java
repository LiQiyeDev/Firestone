package com.firestone;

import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Pick;
import com.firestone.plugins.sdk.Activities;
import com.firestone.plugins.sdk.Screens;

public class Quests {

    public static Activities.Quests body() {
        Navigate.press(Screens.QUESTS.dailyTabOff);
        Navigate.press(Screens.QUESTS.questClaim, Pick.untilNone());
        Navigate.press(Screens.QUESTS.weeklyTabOff);
        Navigate.press(Screens.QUESTS.questClaim, Pick.untilNone());
        return Activities.Quests.NEXT;
    }
}
