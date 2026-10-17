package com.firestone;

import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Pick;
import com.firestone.plugins.sdk.Activities;
import com.firestone.plugins.sdk.Pictures;
import com.firestone.plugins.sdk.Screens;

public class Tavern {

    public static Activities.Tavern body() {
        // Buy beer until the Buy button greys out.
        Navigate.press(Screens.MARKET.beerBuyTavern, Pick.untilNone());
        Navigate.press(Screens.TAVERN.speedTavern, Pick.until(Pictures.SPEED_X50_TAVERN));
        // Play until Play greys out: each play deals six cards, one pick turns them all over.
        while (Navigate.press(Screens.TAVERN.playTavern).done()) {
            Navigate.press(Screens.TAVERN.cardTavern, Pick.untilNone());
        }
        return Activities.Tavern.NEXT;
    }
}
