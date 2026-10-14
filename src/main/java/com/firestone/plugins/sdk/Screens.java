package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.GameScreen;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;
import com.botmaker.sdk.api.screens.Input;
import java.util.List;

/**
 * Values com.botmaker.sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {
    public static final GameScreen OFFLINE_PROGRESS = GameScreen.named("Offline progress").marker(Pictures.OFFLINE_PROGRESS_TITLE)
            .back(Input.click(new ImageTemplate("src/main/resources/images/claim_offline.png")
                    .at(new Rect(895, 905, 130, 50)).tags(List.of(Tags.POPUPS))))
            .popup();
    public static final GameScreen HOME = GameScreen.named("Home").marker(Pictures.HOME)
            .inputs(List.of(Input.click(Pictures.TAVERN_HOME), Input.click(Pictures.ARENA_HOME)));

    private Screens() {
    }
}
