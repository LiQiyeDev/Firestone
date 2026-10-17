package com.firestone;

import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Pick;
import com.botmaker.sdk.api.vision.ImageWaiter;
import com.firestone.plugins.sdk.Activities;
import com.firestone.plugins.sdk.Pictures;
import com.firestone.plugins.sdk.Screens;

import java.time.Duration;

public class Tavern {

    public static Activities.Tavern body() {
        // Buy beer until the Buy button greys out.
        Navigate.press(Screens.MARKET.beerBuyTavern, Pick.untilNone());
        if (!Navigate.to(Screens.TAVERN)) return Activities.Tavern.NEXT;
        // The speed button cycles x1 → x10 → x50: press it until it shows x50.
        for (int i = 0; i < 3 && Navigate.state(Screens.TAVERN.speedX50Tavern).isEmpty(); i++) {
            Navigate.press(Screens.TAVERN.speedTavern);
        }
        // Play until Play greys out: each play deals six cards, one pick turns them all over.
        while (Navigate.press(Screens.TAVERN.playTavern).done()) {
            ImageWaiter.waitFor(Pictures.CARD_TAVERN, Duration.ofMillis(3000L));
            Navigate.press(Screens.TAVERN.cardTavern, Pick.untilNone());
            ImageWaiter.waitFor(Pictures.PLAY_TAVERN, Duration.ofMillis(5000L));
        }
        return Activities.Tavern.NEXT;
    }
}
