package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.firestone.plugins.sdk.Pictures;
import com.botmaker.sdk.api.vision.ImageWaiter;
import java.time.Duration;
import com.botmaker.sdk.api.screens.Navigate;
import com.firestone.plugins.sdk.Screens;

/**
 * Starts a fight and waits for it to end, reporting which way it went.
 *
 * <p>The shape to copy for anything that takes time: press the button, then poll for the two pictures that
 * mean it is over, with a bounded number of attempts so a game that shows neither ends the activity instead
 * of hanging it.
 *
 * <p>The two outcomes this reports — {@code Activities.Battle.WON} and {@code Activities.Battle.LOST} — are the
 * constants of this activity's enum, and each has an arrow leaving its card. The method returns that enum, so
 * a typo or another activity's outcome is a compile error, and renaming one in the Activity Flow renames it here
 * too.
 */
public final class Battle {

    private Battle() {
    }

    public static Activities.Battle body() {
        if (!Navigate.press(Screens.HOME.battle).done()) {
            // No fight available. Treated as a loss so the flow rests and comes back, rather than
            // needing a third outcome for "could not even start".
            return Activities.Battle.LOST;
        }
        ImageWaiter.waitUntilGone(Pictures.BATTLE, Duration.ofMillis(15000L));

        // Neither picture ever appeared. Something is on screen that this bot does not know about, so
        // report the outcome that leads somewhere safe and let goHome sort it out.
        return ImageWaiter.waitFor(Pictures.BATTLE,
                Duration.ofMillis(90000L)) ? Activities.Battle.LOST : Activities.Battle.WON;
    }
}
