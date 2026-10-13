package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.vision.ImageWaiter;
import com.firestone.plugins.sdk.Pictures;
import java.time.Duration;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;

public class Research {

    public static Activities.Research body() {
        ImageWaiter.waitAndClick(
                Pictures.HOME,
                Duration.ofMillis(5000L));
        ImageWaiter.waitAndClick(
                Pictures.LIBRARY_TOWN,
                Duration.ofMillis(10000L));
        ImageWaiter.waitAndClick(
                Pictures.FIRESTONE_TAB_LIBRARY,
                Duration.ofMillis(10000L));
        ImageClicker.clickAll(
                Pictures.RESEARCH_CLAIM);
        ImageFinder.whileFind(
                Pictures.FREE_SLOT_LIBRARY, it -> {
                    ImageClicker
                            .clickAny(ImageTemplateGroup.of(Pictures.HEALTH_NODE_LIBRARY, Pictures.ARMOR_NODE_LIBRARY,
                                    Pictures.GUARDIAN_NODE_LIBRARY, Pictures.PROJECTILES_NODE_LIBRARY));
                    ImageWaiter.waitAndClick(
                            Pictures.RESEARCH_START_LIBRARY,
                            Duration.ofMillis(5000L));
                    ImageWaiter.waitUntilGone(
                            Pictures.RESEARCH_START_LIBRARY,
                            Duration.ofMillis(5000L));
                });
        return Activities.Research.NEXT;
    }
}
