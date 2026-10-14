package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;
import com.firestone.plugins.sdk.Pictures;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.vision.ImageWaiter;
import java.time.Duration;

public class Research {

    public static Activities.Research body() {
        ImageFinder.untilFind(
                Pictures.LIBRARY_TOWN, () -> {
                    ImageClicker.click(Pictures.HOME);
                    ImageWaiter.waitFor(
                            Pictures.LIBRARY_TOWN,
                            Duration.ofMillis(3000L));
                });
        ImageFinder.untilFind(
                Pictures.METEORITE_TAB_LIBRARY, () -> {
                    ImageClicker.click(Pictures.LIBRARY_TOWN);
                    ImageWaiter.waitFor(
                            Pictures.METEORITE_TAB_LIBRARY,
                            Duration.ofMillis(3000L));
                });
        ImageFinder.untilFind(
                Pictures.GEMS_LIBRARY, () -> {
                    ImageClicker.click(Pictures.FIRESTONE_TAB_LIBRARY);
                    ImageWaiter.waitFor(
                            Pictures.GEMS_LIBRARY,
                            Duration.ofMillis(3000L));
                });
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
