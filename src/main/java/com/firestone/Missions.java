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

public class Missions {

    public static Activities.Missions body() {
        Navigate.to(Screens.MAP);
        ImageFinder.whileFindAny(ImageTemplateGroup.of(Pictures.CLAIM_MAP),
                it -> {
                    ImageClicker.clickLast();
                });
        ImageFinder.whileFindAny(
                ImageTemplateGroup.of(Pictures.SWORD_PIN_MAP, Pictures.TELESCOPE_PIN_MAP, Pictures.DRAGON_PIN_MAP,
                        Pictures.SCROLL_PIN_MAP),
                it -> {
                    ImageClicker.clickLast();
                    ImageWaiter.waitFor(Pictures.START_MISSION_MAP,
                            Duration.ofMillis(3000L));
                    ImageFinder.whileFindAny(
                            ImageTemplateGroup.of(Pictures.START_MISSION_MAP),
                            it2 -> {
                                ImageClicker.clickLast();
                            });
                });
        return Activities.Missions.NEXT;
    }
}
