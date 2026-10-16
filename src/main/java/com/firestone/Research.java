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

public class Research {

    public static Activities.Research body() {
        Navigate.to(Screens.LIBRARY);
        ImageFinder.whileFindAny(ImageTemplateGroup.of(Pictures.RESEARCH_CLAIM),
                claim -> {
                    ImageClicker.clickLast();
                });
        ImageFinder.whileFindAny(ImageTemplateGroup.of(Pictures.FREE_SLOT_LIBRARY),
                slot -> {
                    ImageFinder.ifFindAny(
                            ImageTemplateGroup.of(Pictures.HEALTH_NODE_LIBRARY, Pictures.ARMOR_NODE_LIBRARY,
                                    Pictures.GUARDIAN_NODE_LIBRARY, Pictures.PROJECTILES_NODE_LIBRARY),
                            it -> {
                                ImageClicker.clickLast();
                                ImageWaiter.waitFor(
                                        Pictures.RESEARCH_START_LIBRARY,
                                        Duration.ofMillis(3000L));
                            });
                    ImageFinder.whileFindAny(ImageTemplateGroup.of(Pictures.RESEARCH_START_LIBRARY),
                            it -> {
                                ImageClicker.clickLast();
                            });
                });
        return Activities.Research.NEXT;
    }
}
