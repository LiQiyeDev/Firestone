package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.GameScreen;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;
import com.botmaker.sdk.api.screens.Input;
import java.util.List;
import com.botmaker.sdk.api.screens.Did;
import com.botmaker.sdk.api.screens.Way;
import com.botmaker.sdk.api.screens.Kind;
import com.botmaker.sdk.api.screens.Reached;

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
    public static final GameScreen HOME = GameScreen.named("Home").marker(Pictures.TOWN_HOME).inputs(List.of(Input.click(Pictures.TAVERN_HOME),
            Input.click(Pictures.ARENA_HOME), Input.click(Pictures.ENGINEER_HOME), Input.click(Pictures.CAMPAIGN_HOME),
            Input.click(Pictures.WAR_MACHINES_HOME), Input.click(Pictures.MAIL_HOME), Input.click(Pictures.CHAT_MAP),
            Input.click(Pictures.TOWN_HOME), Input.click(Pictures.MAP), Input.click(Pictures.GUILD),
            Input.click(Pictures.MARKET), Input.click(Pictures.BATTLE), Input.click(Pictures.BATTLE_PASS_HOME),
            Input.click(Pictures.EVENTS_HOME), Input.click(Pictures.UPGRADES), Input.click(Pictures.BAG),
            Input.click(Pictures.FELLOWSHIP), Input.click(Pictures.PARTY), Input.click(Pictures.CARD_HOME).sometimes(),
            Input.click(Pictures.PARCHMENT_HOME).sometimes(), Input.click(Pictures.POTION_HOME).sometimes(),
            Input.click(Pictures.SCROLL_BOOT_HOME).sometimes(), Input.click(Pictures.LIBRARY_HOME).sometimes(),
            Input.click(Pictures.GUARDIANS_HOME).sometimes(),
            Input.click(Pictures.AUTO_ABILITIES_HOME).did(Did.IN_PLACE), Input.click(Pictures.AVATAR_HOME),
            Input.click(Pictures.PREV_STAGE_HOME).did(Did.IN_PLACE), Input.click(Pictures.SETTINGS_HOME)));
    public static final GameScreen TAVERN = GameScreen.named("Tavern").marker(Pictures.TAVERN_LUCK_TITLE)
            .from(Way.of(Screens.HOME, Input.click(Pictures.TAVERN_HOME))).back(Input.click(Pictures.CLOSE_TOWN))
            .inputs(List.of(Input.click(Pictures.INFO_LUCK_TAVERN), Input.click(Pictures.ARTIFACTS_TAVERN),
                    Input.click(Pictures.SACRED_CARDS_TAVERN).did(Did.IN_PLACE),
                    Input.click(Pictures.SPEED_TAVERN).did(Did.IN_PLACE), Input.click(Pictures.BAG_TAVERN),
                    Input.click(Pictures.CHAT_TAVERN), Input.click(Pictures.WHEEL_TAVERN).did(Did.IN_PLACE),
                    Input.click(Pictures.DECK_TAVERN).did(Did.IN_PLACE),
                    Input.click(Pictures.PLAY_TAVERN).did(Did.IN_PLACE),
                    Input.click(Pictures.MANUAL_TAVERN).did(Did.IN_PLACE), Input.click(Pictures.MARKET_TAVERN),
                    Input.click(Pictures.INFO_MAP), Input.click(Pictures.GEMS_PLUS_MAP).never("spends gems"),
                    Input.click(Pictures.CARD_TAVERN).did(Did.IN_PLACE).sometimes()))
            .notes("Town › Tavern opens a chooser: Tavern or Scarab's game (tavern_choice_town = the Tavern card).\nTown's buildings carry a red bell badge (badge_town) when something is ready; badges nest (Tavern → Market).\nBeer comes from a dragon that visits during battle (click it to collect at once); it keeps coming while offline.\nPlay 1 (play_tavern; grey twin play_off_tavern at 0 tokens): 1 game token deals 6 face-down cards (card_tavern); pick one, all six turn over.\nx1 / x10 / x50 (bottom right, cycles on each press): tokens spent per play.\nManual / Auto (under it, only while tokens remain): Auto plays on by itself after the first pick until the tokens run out.\nSacred cards tab: progress of the cards won; nothing to press.\nElement wheel (bottom left): the 5 primordial elements won; all 5 craft an ancient artifact.\nBag: reward table per luck level. i buttons: help. Luck bar: luck level from plays.\nEscape from the Tavern goes straight back to Town.\nGamer daily quest = 10 tavern plays.")
            .reached(Reached.SURVEYED);
    public static final GameScreen INFO_LUCK = GameScreen.named("Info luck").marker(Pictures.TOTAL_BONUSES_INFO_LUCK)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_LUCK_TAVERN)))
            .back(Input.click(Pictures.CLOSE_INFO_LUCK));
    public static final GameScreen INFO_MAP = GameScreen.named("Info map").marker(Pictures.HOW_TO_PLAY_TAVERN)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_MAP))).back(Input.click(Pictures.CLOSE_HELP_TAVERN))
            .inputs(List.of(Input.scroll(Pictures.HELP_TEXT_TAVERN, -10).did(Did.IN_PLACE).kind(Kind.INFO)));
    public static final GameScreen ARTIFACTS = GameScreen.named("Artifacts").marker(Pictures.ARTIFACTS_TITLE)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.ARTIFACTS_TAVERN))).back(Input.click(Pictures.CLOSE_TOWN))
            .inputs(List.of(Input.click(Pictures.UPGRADE_ARTIFACTS), Input.click(Pictures.RARITY_ARTIFACTS),
                    Input.click(Pictures.ARTIFACT_CELL).did(Did.IN_PLACE),
                    Input.scroll(Pictures.ARTIFACTS_GRID, -10).did(Did.IN_PLACE)));
    public static final GameScreen UPGRADE = GameScreen.named("Upgrade").marker(Pictures.ARTIFACT_UPGRADE_TITLE)
            .from(Way.of(Screens.ARTIFACTS, Input.click(Pictures.UPGRADE_ARTIFACTS)))
            .back(Input.click(Pictures.CLOSE_ARTIFACT_UPGRADE))
            .inputs(List.of(Input.click(Pictures.UPGRADE_ARTIFACT_CONFIRM).did(Did.IN_PLACE).kind(Kind.CHORE)));
    public static final GameScreen RARITY = GameScreen.named("Rarity").marker(Pictures.ARTIFACT_RARITY_TITLE)
            .from(Way.of(Screens.ARTIFACTS, Input.click(Pictures.RARITY_ARTIFACTS)))
            .back(Input.click(Pictures.CLOSE_ARTIFACT_UPGRADE))
            .inputs(List.of(Input.click(Pictures.RARITY_ARTIFACT_CONFIRM).did(Did.IN_PLACE).kind(Kind.CHORE)));
    public static final GameScreen MARKET = GameScreen.named("Market").marker(Pictures.MARKET_TITLE_TAVERN)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.MARKET_TAVERN))).back(Input.click(Pictures.CLOSE_MARKET))
            .inputs(List.of(Input.click(Pictures.BEER_BUY_TAVERN).did(Did.IN_PLACE).kind(Kind.CHORE),
                    Input.click(Pictures.GEMS_1000_MARKET).never("spends gems"),
                    Input.click(Pictures.GEMS_300_MARKET).never("spends gems")));
    public static final GameScreen BAG = GameScreen.named("Bag").marker(Pictures.REWARDS_TITLE_TAVERN)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.BAG_TAVERN)))
            .back(Input.click(Pictures.CLOSE_REWARDS_TAVERN));
    public static final GameScreen CHAT = GameScreen.named("Chat").marker(Pictures.TYPE_MESSAGE_CHAT)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.CHAT_TAVERN))).back(Input.click(Pictures.CLOSE_CHAT))
            .inputs(List.of(Input.click(Pictures.ROOMS_CHAT), Input.click(Pictures.WORLD_CHAT).did(Did.IN_PLACE),
                    Input.click(Pictures.SEND_CHAT).never("posts to other players")));
    public static final GameScreen ROOMS = GameScreen.named("Rooms").marker(Pictures.SELECT_ROOM_TITLE_CHAT)
            .from(Way.of(Screens.CHAT, Input.click(Pictures.ROOMS_CHAT))).back(Input.click(Pictures.CLOSE_ROOMS_CHAT))
            .inputs(List.of(Input.click(Pictures.ENGLISH_ROOM_CHAT).did(Did.IN_PLACE).kind(Kind.CHOICE),
                    Input.click(Pictures.CONFIRM_ROOM_CHAT).did(Did.LEAVES).kind(Kind.CHOICE)));
    private Screens() {
    }
}
