package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;
import com.firestone.plugins.sdk.Pictures;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.vision.ImageWaiter;
import java.time.Duration;
import com.botmaker.sdk.api.screens.Navigate;
import com.firestone.plugins.sdk.Screens;

public class Tavern {

    public static Activities.Tavern body() {
        Navigate.to(Screens.MARKET);
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.BEER_BUY_TAVERN),
                ImageTemplateGroup.of(Pictures.BEER_BUY_OFF_TAVERN), it -> {
                    ImageClicker.clickLast();
                });
        Navigate.to(Screens.TAVERN);
        ImageFinder.untilFind(Pictures.SPEED_X50_TAVERN, () -> {
            ImageFinder.ifFindAny(
                    ImageTemplateGroup.of(Pictures.SPEED_TAVERN, Pictures.SPEED_X10_TAVERN), it -> {
                        ImageClicker.clickLast();
                    });
        });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.PLAY_TAVERN),
                ImageTemplateGroup.of(Pictures.PLAY_OFF_TAVERN), it -> {
                    ImageClicker.clickLast();
                    ImageWaiter.waitFor(Pictures.CARD_TAVERN,
                            Duration.ofMillis(3000L));
                    ImageFinder.whileFindAny(
                            ImageTemplateGroup.of(Pictures.CARD_TAVERN),
                            it2 -> {
                                ImageClicker.clickLast();
                            });
                    ImageWaiter.waitFor(Pictures.PLAY_TAVERN,
                            Duration.ofMillis(5000L));
                });
        return Activities.Tavern.NEXT;
    }
}
