package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;
import com.firestone.plugins.sdk.Pictures;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.input.Keyboard;
import com.botmaker.sdk.api.input.Key;
import com.botmaker.sdk.api.vision.ImageWaiter;
import java.time.Duration;

public class Tavern {

    public static Activities.Tavern body() {
        ImageFinder.untilFind(Pictures.TAVERN_TOWN, () -> {
            ImageClicker.click(Pictures.TOWN_HOME);
        });
        ImageFinder.untilFind(Pictures.TAVERN_CHOICE_TOWN, () -> {
            ImageClicker.click(Pictures.TAVERN_TOWN);
        });
        ImageFinder.untilFind(Pictures.MARKET_TAVERN, () -> {
            ImageClicker.click(Pictures.TAVERN_CHOICE_TOWN);
        });
        ImageFinder.untilFind(Pictures.MARKET_TITLE_TAVERN, () -> {
            ImageClicker.click(Pictures.MARKET_TAVERN);
        });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.BEER_BUY_TAVERN),
                ImageTemplateGroup.of(Pictures.BEER_BUY_OFF_TAVERN), it -> {
                    ImageClicker.clickLast();
                });
        ImageFinder.whileFind(Pictures.MARKET_TITLE_TAVERN, it -> {
            Keyboard.tap(Key.ESCAPE);
        });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.PLAY_TAVERN),
                ImageTemplateGroup.of(Pictures.MARKET_TITLE_TAVERN), it -> {
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
