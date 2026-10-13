package com.firestone;

import com.botmaker.sdk.api.text.Text;
import com.botmaker.sdk.api.text.DigitSet;
import java.time.Duration;
import com.botmaker.sdk.api.time.Time;
import com.botmaker.sdk.api.time.Wait;
import com.botmaker.sdk.api.input.Mouse;
import com.botmaker.sdk.api.geometry.Point;
import com.botmaker.sdk.api.sound.Sound;
import com.botmaker.sdk.api.vision.Pixel;
import com.botmaker.sdk.api.vision.Precision;
import com.botmaker.sdk.api.geometry.Spot;

public class Scratch {

    public static void all() {
        Mouse.move(0, 0);
        Mouse.doubleClick(new Spot(0, 0));
        Mouse.middleClick(new Point());
        Mouse.rightClick(new Spot(0, 0));
        Pixel.findAll(new java.awt.Color(255, 255, 255), new Precision(0.0, 0, 0));
        Pixel.waitForGone(new java.awt.Color(255, 255, 255), new Precision(0.0, 0, 0), Duration.ofSeconds(1));
        Sound.miaou();
        Time.format("");
        Text.waitForGone("", null, Duration.ofSeconds(1));
        Text.findMatching("", null);
        Text.findExact("", null);
        Text.readAll(null);
        Mouse.drag(null, new Point(), new Point(), 0);
        Wait.between(Duration.ofSeconds(1), Duration.ofSeconds(1));
        Time.isMonth(java.time.Month.JANUARY);
        Time.isDay(java.time.DayOfWeek.MONDAY);
        Time.isBetween(java.time.LocalTime.of(12, 0), java.time.LocalTime.of(12, 0));
        Text.waitFor("", null, Duration.ofSeconds(1));
        Text.readDigits(new DigitSet(""));
        Text.read();
        Text.lastMatchList();
        Text.ifLastMatch(it -> {
        });
        Text.findFuzzy("", 0, null);
    }
}
