package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.vision.Screen;
import com.botmaker.sdk.api.input.Mouse;
import com.botmaker.sdk.api.vision.ImageWaiter;
import com.botmaker.sdk.api.input.Keyboard;
import com.firestone.plugins.sdk.Pictures;
import java.time.Duration;
import com.firestone.plugins.sdk.Spots;
import com.botmaker.sdk.api.input.Key;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;

public class Quests {

    public static Activities.Quests body() {
        Keyboard.tap(Key.Q);
        ImageWaiter.waitFor(
                Pictures.CLOSE_X,
                Duration.ofMillis(5000L));
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM),
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM_OFF),
                it -> {
                    ImageClicker.clickLast();
                    Screen.waitStable(Duration.ofMillis(500L), Duration.ofMillis(3000L));
                });
        Mouse.click(Spots.QUESTS_WEEKLY_TAB);
        Screen.waitStable(Duration.ofMillis(500L), Duration.ofMillis(3000L));
        ImageFinder.whileFindCompare(
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM),
                ImageTemplateGroup.of(Pictures.QUEST_CLAIM_OFF),
                it -> {
                    ImageClicker.clickLast();
                    Screen.waitStable(Duration.ofMillis(500L), Duration.ofMillis(3000L));
                });
        return Activities.Quests.NEXT;
    }
}
