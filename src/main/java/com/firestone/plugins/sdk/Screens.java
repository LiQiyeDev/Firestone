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
import com.botmaker.sdk.api.screens.Variant;
import com.botmaker.sdk.api.screens.State;
import com.botmaker.sdk.api.geometry.Point;

/**
 * Values com.botmaker.sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {
    public static final GameScreen OFFLINE_PROGRESS = GameScreen.named("Offline progress").marker(Pictures.OFFLINE_PROGRESS_TITLE)
            .back(Input.click(Pictures.CLAIM_OFFLINE)).popup().at(new Point(0, 2394));
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
            Input.click(Pictures.PREV_STAGE_HOME).did(Did.IN_PLACE), Input.click(Pictures.SETTINGS_HOME)))
            .at(new Point(0, 1326));
    public static final GameScreen TAVERN = GameScreen.named("Tavern").marker(Pictures.TAVERN_LUCK_TITLE).from(Way.of(Screens.HOME,Input.click(Pictures.TAVERN_HOME))).back(Input.click(Pictures.CLOSE_TOWN)).inputs(List.of(Input.click(Pictures.INFO_LUCK_TAVERN),Input.click(Pictures.ARTIFACTS_TAVERN),Input.click(Pictures.SACRED_CARDS_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.SPEED_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.BAG_TAVERN),Input.click(Pictures.CHAT_TAVERN),Input.click(Pictures.WHEEL_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.DECK_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.PLAY_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.MANUAL_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.MARKET_TAVERN),Input.click(Pictures.INFO_MAP),Input.click(Pictures.GEMS_PLUS_MAP).never("spends gems"),Input.click(Pictures.CARD_TAVERN).did(Did.IN_PLACE).sometimes())).notes("""
                    Town › Tavern opens a chooser: Tavern or Scarab's game (tavern_choice_town = the Tavern card).
                    Town's buildings carry a red bell badge (badge_town) when something is ready; badges nest (Tavern → Market).
                    Beer comes from a dragon that visits during battle (click it to collect at once); it keeps coming while offline.
                    Play 1 (play_tavern; grey twin play_off_tavern at 0 tokens): 1 game token deals 6 face-down cards (card_tavern); pick one, all six turn over.
                    x1 / x10 / x50 (speed_tavern, bottom right, cycles on each press): tokens spent per play.
                    Manual / Auto (under it, only while tokens remain): Auto plays on by itself after the first pick until the tokens run out.
                    Sacred cards tab: progress of the cards won; nothing to press.
                    Element wheel (bottom left): the 5 primordial elements won; all 5 craft an ancient artifact.
                    Bag: reward table per luck level. i buttons: help. Luck bar: luck level from plays.
                    Escape from the Tavern goes straight back to Town.
                    Gamer daily quest = 10 tavern plays.\
                    """).reached(Reached.SURVEYED).at(new Point(340,389));
    public static final GameScreen INFO_LUCK = GameScreen.named("Info luck").marker(Pictures.TOTAL_BONUSES_INFO_LUCK)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_LUCK_TAVERN)))
            .back(Input.click(Pictures.CLOSE_INFO_LUCK)).at(new Point(680, 0));
    public static final GameScreen INFO_MAP = GameScreen.named("Info map").marker(Pictures.HOW_TO_PLAY_TAVERN)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_MAP))).back(Input.click(Pictures.CLOSE_HELP_TAVERN))
            .inputs(List.of(Input.scroll(Pictures.HELP_TEXT_TAVERN, -10).did(Did.IN_PLACE).kind(Kind.INFO)))
            .at(new Point(680, 103));
    public static final GameScreen ARTIFACTS = GameScreen.named("Artifacts").marker(Pictures.ARTIFACTS_TITLE)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.ARTIFACTS_TAVERN))).back(Input.click(Pictures.CLOSE_TOWN))
            .inputs(List.of(Input.click(Pictures.UPGRADE_ARTIFACTS), Input.click(Pictures.RARITY_ARTIFACTS),
                    Input.click(Pictures.ARTIFACT_CELL).did(Did.IN_PLACE),
                    Input.scroll(Pictures.ARTIFACTS_GRID, -10).did(Did.IN_PLACE)))
            .at(new Point(680, 206));
    public static final GameScreen UPGRADE = GameScreen.named("Upgrade").marker(Pictures.ARTIFACT_UPGRADE_TITLE)
            .from(Way.of(Screens.ARTIFACTS, Input.click(Pictures.UPGRADE_ARTIFACTS)))
            .back(Input.click(Pictures.CLOSE_ARTIFACT_UPGRADE))
            .inputs(List.of(Input.click(Pictures.UPGRADE_ARTIFACT_CONFIRM).did(Did.IN_PLACE).kind(Kind.CHORE)))
            .at(new Point(1020, 155));
    public static final GameScreen RARITY = GameScreen.named("Rarity").marker(Pictures.ARTIFACT_RARITY_TITLE)
            .from(Way.of(Screens.ARTIFACTS, Input.click(Pictures.RARITY_ARTIFACTS)))
            .back(Input.click(Pictures.CLOSE_ARTIFACT_UPGRADE))
            .inputs(List.of(Input.click(Pictures.RARITY_ARTIFACT_CONFIRM).did(Did.IN_PLACE).kind(Kind.CHORE)))
            .at(new Point(1020, 258));
    public static final GameScreen MARKET = GameScreen.named("Market").marker(Pictures.MARKET_TITLE_TAVERN)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.MARKET_TAVERN))).back(Input.click(Pictures.CLOSE_MARKET))
            .inputs(List.of(Input.click(Pictures.BEER_BUY_TAVERN).did(Did.IN_PLACE).kind(Kind.CHORE),
                    Input.click(Pictures.GEMS_1000_MARKET).never("spends gems"),
                    Input.click(Pictures.GEMS_300_MARKET).never("spends gems")))
            .at(new Point(680, 309));
    public static final GameScreen BAG = GameScreen.named("Bag").marker(Pictures.REWARDS_TITLE_TAVERN)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.BAG_TAVERN)))
            .back(Input.click(Pictures.CLOSE_REWARDS_TAVERN)).at(new Point(680, 551));
    public static final GameScreen CHAT = GameScreen.named("Chat").marker(Pictures.TYPE_MESSAGE_CHAT)
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.CHAT_TAVERN))).back(Input.click(Pictures.CLOSE_CHAT))
            .inputs(List.of(Input.click(Pictures.ROOMS_CHAT), Input.click(Pictures.WORLD_CHAT).did(Did.IN_PLACE),
                    Input.click(Pictures.SEND_CHAT).never("posts to other players")))
            .at(new Point(680, 793));
    public static final GameScreen ROOMS = GameScreen.named("Rooms").marker(Pictures.SELECT_ROOM_TITLE_CHAT)
            .from(Way.of(Screens.CHAT, Input.click(Pictures.ROOMS_CHAT))).back(Input.click(Pictures.CLOSE_ROOMS_CHAT))
            .inputs(List.of(Input.click(Pictures.ENGLISH_ROOM_CHAT).did(Did.IN_PLACE).kind(Kind.CHOICE),
                    Input.click(Pictures.CONFIRM_ROOM_CHAT).did(Did.LEAVES).kind(Kind.CHOICE)))
            .at(new Point(1020, 793));
    public static final GameScreen ARENA = GameScreen.named("Arena").marker(Pictures.ARENA_TITLE).from(Way.of(Screens.HOME, Input.click(Pictures.ARENA_HOME)))
            .back(Input.click(Pictures.ARENA_CLOSE))
            .inputs(List.of(Input.click(Pictures.ARENA_REFRESH).did(Did.IN_PLACE),
                    Input.click(Pictures.ARENA_FIGHT).kind(Kind.CHORE), Input.click(Pictures.ARENA_BATTLE_LOG),
                    Input.click(Pictures.ARENA_EDIT_SQUAD), Input.click(Pictures.INFO_MAP).kind(Kind.INFO),
                    Input.click(Pictures.ARENA_LEADERBOARDS)))
            .at(new Point(340, 1459));
    public static final GameScreen ARENA_INFO = GameScreen.named("Arena info").marker(Pictures.ARENA_RULES_TITLE)
            .from(Way.of(Screens.ARENA, Input.click(Pictures.INFO_MAP).kind(Kind.INFO)))
            .back(Input.click(Pictures.CLOSE_ROOMS_CHAT)).at(new Point(680, 1035));
    public static final GameScreen ARENA_LEADERBOARDS = GameScreen.named("Arena leaderboards").marker(Pictures.ARENA_LEADERBOARDS_HEADER)
            .from(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_LEADERBOARDS)))
            .back(Input.click(Pictures.ARENA_LEADERBOARDS_CLOSE)).at(new Point(680, 1277));
    public static final GameScreen ARENA_BATTLE_LOG = GameScreen.named("Arena battle log").marker(Pictures.BATTLE_LOG_TITLE)
            .from(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_BATTLE_LOG)))
            .back(Input.click(Pictures.BATTLE_LOG_CLOSE))
            .inputs(List.of(Input.click(Pictures.BATTLE_LOG_INSPECT).kind(Kind.INFO),
                    Input.click(Pictures.BATTLE_LOG_REPLAY).kind(Kind.INFO)))
            .at(new Point(680, 1519));
    public static final GameScreen BATTLE_DETAILS = GameScreen.named("Battle details").marker(Pictures.BATTLE_DETAILS_VS)
            .from(Way.of(Screens.ARENA_BATTLE_LOG, Input.click(Pictures.BATTLE_LOG_INSPECT).kind(Kind.INFO)))
            .back(Input.click(Pictures.CLOSE_ROOMS_CHAT))
            .inputs(List.of(Input.click(Pictures.BATTLE_DETAILS_DEALT).did(Did.IN_PLACE),
                    Input.click(Pictures.BATTLE_DETAILS_TAKEN).did(Did.IN_PLACE),
                    Input.click(Pictures.BATTLE_DETAILS_HEALING).did(Did.IN_PLACE)))
            .at(new Point(1020, 1398));
    public static final GameScreen ARENA_REPLAY = GameScreen.named("Arena replay").marker(Pictures.ARENA_ROUND)
            .from(Way.of(Screens.ARENA_BATTLE_LOG, Input.click(Pictures.BATTLE_LOG_REPLAY).kind(Kind.INFO)))
            .alsoFrom(List.of(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_FIGHT).kind(Kind.CHORE))))
            .back(Input.click(Pictures.ARENA_FIGHT_CLOSE))
            .inputs(List.of(Input.click(Pictures.ARENA_SPEED).did(Did.LEAVES))).at(new Point(1020, 1640));
    public static final GameScreen ARENA_SQUAD = GameScreen.named("Arena squad").marker(Pictures.CHOOSE_WAR_MACHINES_TITLE)
            .from(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_EDIT_SQUAD))).back(Input.click(Pictures.CLOSE_X))
            .inputs(List.of(Input.click(Pictures.SQUAD_SAVE_CHANGES).did(Did.IN_PLACE),
                    Input.click(Pictures.SQUAD_EDIT_HEROES)))
            .at(new Point(1352, 2044));
    public static final GameScreen SQUAD_HEROES = GameScreen.named("Squad heroes").marker(Pictures.SELECT_CREW_TITLE)
            .from(Way.of(Screens.ARENA_SQUAD, Input.click(Pictures.SQUAD_EDIT_HEROES)))
            .back(Input.click(Pictures.CLOSE_X))
            .inputs(List.of(
                    Input.click(Pictures.CREW_ARENA_ATTRIBUTES).did(Did.IN_PLACE)
                            .variants(List.of(Variant.of(Pictures.CREW_BATTLE_ATTRIBUTES, State.SELECTED))),
                    Input.click(Pictures.CREW_ORDER_DAMAGE).did(Did.IN_PLACE),
                    Input.click(Pictures.CREW_ORDER_HEALTH).did(Did.IN_PLACE),
                    Input.click(Pictures.CREW_ORDER_ARMOR).did(Did.IN_PLACE),
                    Input.click(Pictures.CREW_INFO).kind(Kind.INFO)))
            .at(new Point(1692, 2044));
    public static final GameScreen CREW_INFO = GameScreen.named("Crew info").marker(Pictures.HERO_BONUSES_TITLE)
            .from(Way.of(Screens.SQUAD_HEROES, Input.click(Pictures.CREW_INFO).kind(Kind.INFO)))
            .back(Input.click(Pictures.CREW_INFO_CLOSE)).at(new Point(2032, 2044));
    public static final GameScreen ENGINEER = GameScreen.named("Engineer").marker(Pictures.ENGINEER_NAME)
            .from(Way.of(Screens.HOME, Input.click(Pictures.ENGINEER_HOME)))
            .inputs(List.of(Input.click(Pictures.INFO_ENGINEER).kind(Kind.INFO),
                    Input.click(Pictures.ENGINEER_TAB_ENGINEER),
                    Input.click(Pictures.BATTLES_TAB_ENGINEER).did(Did.IN_PLACE).kind(Kind.INFO),
                    Input.click(Pictures.STAR_TAB_ENGINEER), Input.click(Pictures.SWIRL_TAB_ENGINEER),
                    Input.click(Pictures.CLAIM_ENGINEER).did(Did.IN_PLACE).kind(Kind.CHORE).sometimes(),
                    Input.click(Pictures.GARAGE_ENGINEER),
                    Input.click(Pictures.CHANGE_SQUAD_ENGINEER).kind(Kind.CHOICE),
                    Input.click(Pictures.EDIT_SQUAD_ENGINEER), Input.click(Pictures.MACHINE_CARD_ENGINEER)))
            .at(new Point(340, 2124));
    public static final GameScreen ENGINEER_INFO = GameScreen.named("Engineer info").marker(Pictures.ENGINEER_INFO_TITLE)
            .from(Way.of(Screens.ENGINEER, Input.click(Pictures.INFO_ENGINEER)))
            .back(Input.click(Pictures.CLOSE_ENGINEER_INFO)).at(new Point(1352, 2286));
    public static final GameScreen CHANGE_SQUAD = GameScreen.named("Change squad")
            .from(Way.of(Screens.ENGINEER, Input.click(Pictures.CHANGE_SQUAD_ENGINEER)));
    private Screens() {
    }
}
