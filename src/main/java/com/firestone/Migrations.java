package com.firestone;

import com.botmaker.sdk.api.screens.GameScreen;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.plugin.api.meta.Migrate;
import com.botmaker.plugin.api.meta.Refactor;
import com.botmaker.sdk.api.flow.Run;

/**
 * How this bot moves off the API its plugins changed (Review ▸ Migrate…).
 * <p>Each @Migrate method names one old method, constructor, field or type by its own signature, and its
 * body is what each use becomes. BotMaker reads it and never runs it; the bot never calls it. Delete a
 * method, or this class, once nothing uses its old element.
 */
public final class Migrations {
    private Migrations() {
    }

    @Refactor("write the replacement")
    @Migrate(GameScreen.class)
    static GameScreen marker(@Migrate.Self GameScreen self, ImageTemplate imageTemplate) {
        return self;
    }

    @Refactor("write the replacement")
    @Migrate(Run.class)
    static Run popups(@Migrate.Self Run self, Runnable runnable) {
        return self;
    }
}
