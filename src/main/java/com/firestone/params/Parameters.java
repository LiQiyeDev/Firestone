package com.firestone.params;

import com.botmaker.plugin.api.params.Param;

import java.time.Duration;

/**
 * Everything about this bot you might want to change without changing what it does.
 *
 * <p>Each field is one row of <b>Project ▸ Parameters</b>, and the bot reads it by name —
 * {@code Parameters.maxAttempts}. That is the point of declaring them here rather than in a settings file:
 * a misspelling is a compile error, the type is the type, and the declaration is where you can see it.
 *
 * <p>The window writes back into this file, which is why it sits in its own package and Studio keeps it:
 * Project Files lists it under <i>Managed by Studio</i>, and it is neither renamed nor deleted there. Changing
 * a value in the window rewrites the initialiser below and nothing else; renaming a parameter repoints every
 * use of it in your bot; adding one appends a field.
 *
 * <p>{@code visibility = Param.PUBLIC} is what puts a row in the Runner window as well, for whoever runs the
 * bot rather than writes it. Leave it off and the parameter is yours alone.
 */
public final class Parameters {

    /** How long {@link com.firestone.Rest} waits before the loop starts again. */
    @Param(category = "Timing", visibility = Param.PUBLIC,
            description = "How long the bot rests before going round again")
    public static Duration restBetween = java.time.Duration.ofMillis(60000L);

    /** How many times an activity polls for a picture before it gives up. */
    @Param(category = "Limits", visibility = Param.PUBLIC, min = 1,
            description = "How many times an activity looks for a picture before giving up")
    public static int maxAttempts = 20;

    private Parameters() {}
}
