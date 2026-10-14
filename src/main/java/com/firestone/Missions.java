package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;
import com.firestone.plugins.sdk.Pictures;
import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.input.Keyboard;
import com.botmaker.sdk.api.input.Key;

public class Missions {

    public static Activities.Missions body() {
        ImageFinder.untilFind(
                Pictures.RANK_LIST_MAP, () -> {
                    Keyboard.tap(Key.M);
                });
        ImageFinder.whileFindAny(ImageTemplateGroup.of(Pictures.OKAY_MAP, Pictures.CLAIM_MAP),
                it -> {
                    ImageClicker.clickLast();
                });
        return Activities.Missions.NEXT;
    }
}
