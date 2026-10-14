package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.GameScreen;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;
import com.botmaker.sdk.api.screens.Input;
import java.util.List;
import com.botmaker.sdk.api.screens.Did;
import com.botmaker.sdk.api.screens.Way;

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
    public static final GameScreen HOME = GameScreen.named("Home").marker(Pictures.HOME).inputs(List.of(Input.click(Pictures.TAVERN_HOME),
            Input.click(Pictures.ARENA_HOME), Input.click(Pictures.ENGINEER_HOME), Input.click(Pictures.CAMPAIGN_HOME),
            Input.click(Pictures.WAR_MACHINES_HOME), Input.click(Pictures.MAIL_HOME), Input.click(Pictures.CHAT_MAP),
            Input.click(Pictures.HOME), Input.click(Pictures.MAP), Input.click(Pictures.GUILD),
            Input.click(Pictures.MARKET), Input.click(Pictures.BATTLE), Input.click(Pictures.BATTLE_PASS_HOME),
            Input.click(Pictures.EVENTS_HOME), Input.click(Pictures.UPGRADES), Input.click(Pictures.BAG),
            Input.click(Pictures.FELLOWSHIP), Input.click(Pictures.PARTY), Input.click(Pictures.CARD_HOME).sometimes(),
            Input.click(Pictures.PARCHMENT_HOME).sometimes(), Input.click(Pictures.POTION_HOME).sometimes(),
            Input.click(Pictures.SCROLL_BOOT_HOME).sometimes(), Input.click(Pictures.LIBRARY_HOME).sometimes(),
            Input.click(Pictures.GUARDIANS_HOME).sometimes(),
            Input.click(Pictures.AUTO_ABILITIES_HOME).did(Did.IN_PLACE), Input.click(Pictures.AVATAR_HOME),
            Input.click(Pictures.PREV_STAGE_HOME).did(Did.IN_PLACE), Input.click(Pictures.SETTINGS_HOME)));
    public static final GameScreen TAVERN = GameScreen.named("Tavern")
            .marker(new ImageTemplate("src/main/resources/images/tavern_luck_title.png").at(new Rect(125, 35, 150, 36))
                    .activities(List.of(Activities.Tavern.class)))
            .from(Way.of(Screens.HOME, Input.click(Pictures.TAVERN_HOME))).back(Input.click(Pictures.CLOSE_TOWN))
            .inputs(List.of(Input.click(Pictures.INFO_LUCK_TAVERN), Input.click(Pictures.ARTIFACTS_TAVERN),
                    Input.click(Pictures.SACRED_CARDS_TAVERN), Input.click(Pictures.SPEED_TAVERN).did(Did.IN_PLACE),
                    Input.click(Pictures.BAG_TAVERN), Input.click(Pictures.CHAT_TAVERN),
                    Input.click(Pictures.WHEEL_TAVERN), Input.click(Pictures.DECK_TAVERN),
                    Input.click(new ImageTemplate("src/main/resources/images/play_tavern.png")
                            .at(new Rect(880, 953, 160, 48)).activities(List.of(Activities.Tavern.class))),
                    Input.click(new ImageTemplate("src/main/resources/images/manual_tavern.png")
                            .at(new Rect(1688, 1006, 160, 54)).activities(List.of(Activities.Tavern.class))),
                    Input.click(new ImageTemplate("src/main/resources/images/market_tavern.png")
                            .at(new Rect(1750, 700, 112, 92)).activities(List.of(Activities.Tavern.class))),
                    Input.click(Pictures.INFO_MAP), Input.click(Pictures.GEMS_PLUS_MAP).never("spends gems")));
    public static final GameScreen INFO_LUCK = GameScreen.named("Info luck")
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_LUCK_TAVERN)));
    private Screens() {
    }
}
