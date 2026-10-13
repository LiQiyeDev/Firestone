package com.firestone;

import com.botmaker.sdk.api.vision.ImageClicker;
import com.botmaker.sdk.api.vision.MatchResult;
import com.botmaker.sdk.api.capture.CaptureSource;
import com.botmaker.sdk.api.vision.ImageTemplateGroup;
import com.botmaker.sdk.api.vision.ImageFinder;
import com.botmaker.sdk.api.input.Keyboard;
import com.botmaker.sdk.api.input.Combo;
import com.botmaker.sdk.api.input.KeySequence;
import com.botmaker.sdk.api.text.Text;
import com.botmaker.sdk.api.text.OcrOptions;

public class Scratch {

    public static void all() {
        Text.read((CaptureSource) null, (OcrOptions) null);
        Text.find("", (CaptureSource) null, (OcrOptions) null);
        Keyboard.sequence((KeySequence) null);
        Keyboard.combo((Combo) null);
        ImageFinder.findBest((ImageTemplateGroup) null);
        ImageFinder.untilFindAny((ImageTemplateGroup) null, () -> {
        });
        ImageFinder.whileFindAny((ImageTemplateGroup) null, it -> {
        });
        ImageClicker.clickAllCompare((ImageTemplateGroup) null, (ImageTemplateGroup) null);
        ImageClicker.clickAny((ImageTemplateGroup) null);
        ImageClicker.clickAll((ImageTemplateGroup) null);
        ImageClicker.click((MatchResult) null, (CaptureSource) null);
        ImageClicker.click((MatchResult) null);
    }
}
