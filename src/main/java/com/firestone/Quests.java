package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.firestone.plugins.sdk.Pictures;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;
import com.botmaker.sdk.api.vision.ImageWaiter;
import com.botmaker.sdk.api.input.Keyboard;
import com.botmaker.sdk.api.input.Key;
import java.time.Duration;

public class Quests {

    public static Activities.Quests body() {
        ImageFinder.untilFind(
                Pictures.QUESTS_TAB, () -> {
                    Keyboard.tap(Key.Q);
                    ImageWaiter.waitFor(
                            Pictures.QUESTS_TAB,
                            Duration.ofMillis(2500L));
                });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.DAILY_TAB_OFF),
                ImageTemplateGroup.of(Pictures.DAILY_TAB_ON),
                it -> {
                    ImageClicker.clickLast();
                });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM),
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM_OFF),
                it -> {
                    ImageClicker.clickLast();
                });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.WEEKLY_TAB_OFF),
                ImageTemplateGroup.of(Pictures.WEEKLY_TAB_ON),
                it -> {
                    ImageClicker.clickLast();
                });
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM),
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM_OFF),
                it -> {
                    ImageClicker.clickLast();
                });
        return Activities.Quests.NEXT;
    }
}
