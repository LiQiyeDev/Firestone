package com.firestone;

import com.firestone.plugins.sdk.Activities;
import com.botmaker.sdk.api.screens.Navigate;
import com.firestone.plugins.sdk.Screens;

/**
 * Clicks the collect button while there is one, and says so when there is not.
 *
 * <p>The shape to copy for an activity of your own: do <em>one</em> unit of work, report what happened, and
 * let the flow decide what comes next. An activity that loops forever inside itself is one the canvas
 * cannot route around and the Stop button cannot interrupt cleanly.
 *
 * <p>{@link #body} is an ordinary {@code public static} method, named in the flow as {@code Collect::body}.
 * Nothing requires the name {@code body} and nothing requires one class per activity — what matters is that
 * the flow names a method javac resolves, so renaming this one is a compile error in {@code Sdk.java} rather
 * than an activity that quietly stops running. It is also, being a plain static method with no arguments, one
 * a JUnit test can call directly.
 *
 * <p>It returns {@link Activities.Collect}, this activity's own enum, so it can report only what the Collect card
 * has a port for.
 */
public final class Collect {

    private Collect() {
    }

    public static Activities.Collect body() {
        if (!Navigate.press(Screens.CAMPAIGN.campaignClaim).done()) {
            // Nothing to collect. Not a failure — the flow sends this on to Battle.
            return Activities.Collect.NOTHING_LEFT;
        }
        return Activities.Collect.NEXT;
    }
}
