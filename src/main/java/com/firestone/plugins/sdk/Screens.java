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
import com.botmaker.sdk.api.screens.ScreenList;

/**
 * Values com.botmaker.sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {
    public static final GameScreen OFFLINE_PROGRESS = GameScreen.named("Offline progress").markers(List.of(Pictures.OFFLINE_PROGRESS_TITLE))
            .back(Input.click(Pictures.CLAIM_OFFLINE)).popup().at(new Point(0, 2394));
    public static final GameScreen HOME = GameScreen.named("Home").markers(List.of(Pictures.TOWN_HOME))
            .inputs(List.of(Input.click(Pictures.TAVERN_HOME).sometimes(), Input.click(Pictures.ARENA_HOME).sometimes(),
                    Input.click(Pictures.ENGINEER_HOME).sometimes(), Input.click(Pictures.CAMPAIGN_HOME).sometimes(),
                    Input.click(Pictures.WAR_MACHINES_HOME).sometimes(),
                    Input.click(Pictures.MAIL_HOME).kind(Kind.CHORE), Input.click(Pictures.TOWN_HOME),
                    Input.click(Pictures.MAP), Input.click(Pictures.GUILD), Input.click(Pictures.MARKET),
                    Input.click(Pictures.BATTLE), Input.click(Pictures.BATTLE_PASS_HOME),
                    Input.click(Pictures.EVENTS_HOME), Input.click(Pictures.UPGRADES), Input.click(Pictures.BAG),
                    Input.click(Pictures.FELLOWSHIP), Input.click(Pictures.PARTY),
                    Input.click(Pictures.CARD_HOME).sometimes(), Input.click(Pictures.PARCHMENT_HOME).sometimes(),
                    Input.click(Pictures.POTION_HOME).sometimes(), Input.click(Pictures.SCROLL_BOOT_HOME).sometimes(),
                    Input.click(Pictures.LIBRARY_HOME).sometimes(), Input.click(Pictures.GUARDIANS_HOME).sometimes(),
                    Input.click(Pictures.AVATAR_HOME), Input.click(Pictures.PREV_STAGE_HOME).did(Did.IN_PLACE),
                    Input.click(Pictures.SETTINGS_HOME), Input.click(Pictures.CHAT_MAP_HOME),
                    Input.click(Pictures.AUTO_ABILITIES_HOME).did(Did.IN_PLACE).kind(Kind.SHORTCUT)))
            .lists(List.of(ScreenList.of(-5, List.of(Pictures.TAVERN_HOME, Pictures.ARENA_HOME, Pictures.ENGINEER_HOME,
                    Pictures.CAMPAIGN_HOME, Pictures.WAR_MACHINES_HOME, Pictures.CARD_HOME, Pictures.PARCHMENT_HOME,
                    Pictures.POTION_HOME, Pictures.SCROLL_BOOT_HOME, Pictures.LIBRARY_HOME, Pictures.GUARDIANS_HOME))))
            .at(new Point(0, 1326));
    public static final GameScreen TAVERN = GameScreen.named("Tavern").markers(List.of(Pictures.TAVERN_LUCK_TITLE)).from(Way.of(Screens.HOME,Input.click(Pictures.TAVERN_HOME))).back(Input.click(Pictures.CLOSE_TOWN)).inputs(List.of(Input.click(Pictures.INFO_LUCK_TAVERN),Input.click(Pictures.ARTIFACTS_TAVERN),Input.click(Pictures.SACRED_CARDS_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.SPEED_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.BAG_TAVERN),Input.click(Pictures.CHAT_TAVERN),Input.click(Pictures.WHEEL_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.DECK_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.PLAY_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.MANUAL_TAVERN).did(Did.IN_PLACE),Input.click(Pictures.MARKET_TAVERN),Input.click(Pictures.INFO_MAP),Input.click(Pictures.GEMS_PLUS_MAP).never("spends gems"),Input.click(Pictures.CARD_TAVERN).did(Did.IN_PLACE).sometimes())).notes("""
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
    public static final GameScreen INFO_LUCK = GameScreen.named("Info luck").markers(List.of(Pictures.TOTAL_BONUSES_INFO_LUCK))
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_LUCK_TAVERN)))
            .back(Input.click(Pictures.CLOSE_INFO_LUCK)).at(new Point(680, 0));
    public static final GameScreen INFO_MAP = GameScreen.named("Info map").markers(List.of(Pictures.HOW_TO_PLAY_TAVERN))
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.INFO_MAP))).back(Input.click(Pictures.CLOSE_HELP_TAVERN))
            .inputs(List.of(Input.scroll(Pictures.HELP_TEXT_TAVERN, -10).did(Did.IN_PLACE).kind(Kind.INFO)))
            .at(new Point(680, 103));
    public static final GameScreen ARTIFACTS = GameScreen.named("Artifacts").markers(List.of(Pictures.ARTIFACTS_TITLE))
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.ARTIFACTS_TAVERN))).back(Input.click(Pictures.CLOSE_TOWN))
            .inputs(List.of(Input.click(Pictures.UPGRADE_ARTIFACTS), Input.click(Pictures.RARITY_ARTIFACTS),
                    Input.click(Pictures.ARTIFACT_CELL).did(Did.IN_PLACE),
                    Input.scroll(Pictures.ARTIFACTS_GRID, -10).did(Did.IN_PLACE)))
            .at(new Point(680, 206));
    public static final GameScreen UPGRADE = GameScreen.named("Upgrade").markers(List.of(Pictures.ARTIFACT_UPGRADE_TITLE))
            .from(Way.of(Screens.ARTIFACTS, Input.click(Pictures.UPGRADE_ARTIFACTS)))
            .back(Input.click(Pictures.CLOSE_ARTIFACT_UPGRADE))
            .inputs(List.of(Input.click(Pictures.UPGRADE_ARTIFACT_CONFIRM).did(Did.IN_PLACE).kind(Kind.CHORE)))
            .at(new Point(1020, 155));
    public static final GameScreen RARITY = GameScreen.named("Rarity").markers(List.of(Pictures.RARITY_WORD_TITLE))
            .from(Way.of(Screens.ARTIFACTS, Input.click(Pictures.RARITY_ARTIFACTS)))
            .back(Input.click(Pictures.CLOSE_ARTIFACT_UPGRADE))
            .inputs(List.of(Input.click(Pictures.RARITY_ARTIFACT_CONFIRM).did(Did.IN_PLACE).kind(Kind.CHORE)))
            .at(new Point(1020, 258));
    public static final GameScreen MARKET = GameScreen.named("Market").markers(List.of(Pictures.MARKET_TITLE_TAVERN))
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.MARKET_TAVERN))).back(Input.click(Pictures.CLOSE_MARKET))
            .inputs(List.of(Input.click(Pictures.BEER_BUY_TAVERN).did(Did.IN_PLACE).kind(Kind.CHORE),
                    Input.click(Pictures.GEMS_1000_MARKET).never("spends gems"),
                    Input.click(Pictures.GEMS_300_MARKET).never("spends gems")))
            .at(new Point(680, 309));
    public static final GameScreen BAG = GameScreen.named("Bag").markers(List.of(Pictures.REWARDS_TITLE_TAVERN))
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.BAG_TAVERN)))
            .back(Input.click(Pictures.CLOSE_REWARDS_TAVERN)).at(new Point(680, 551));
    public static final GameScreen CHAT = GameScreen.named("Chat").markers(List.of(Pictures.TYPE_MESSAGE_CHAT))
            .from(Way.of(Screens.TAVERN, Input.click(Pictures.CHAT_TAVERN))).back(Input.click(Pictures.CLOSE_CHAT))
            .inputs(List.of(Input.click(Pictures.ROOMS_CHAT), Input.click(Pictures.WORLD_CHAT).did(Did.IN_PLACE),
                    Input.click(Pictures.SEND_CHAT).never("posts to other players")))
            .at(new Point(680, 793));
    public static final GameScreen ROOMS = GameScreen.named("Rooms").markers(List.of(Pictures.SELECT_ROOM_TITLE_CHAT))
            .from(Way.of(Screens.CHAT, Input.click(Pictures.ROOMS_CHAT))).back(Input.click(Pictures.CLOSE_ROOMS_CHAT))
            .inputs(List.of(Input.click(Pictures.ENGLISH_ROOM_CHAT).did(Did.IN_PLACE).kind(Kind.CHOICE),
                    Input.click(Pictures.CONFIRM_ROOM_CHAT).did(Did.LEAVES).kind(Kind.CHOICE)))
            .at(new Point(1020, 793));
    public static final GameScreen ARENA = GameScreen.named("Arena").markers(List.of(Pictures.ARENA_TITLE)).from(Way.of(Screens.HOME, Input.click(Pictures.ARENA_HOME)))
            .back(Input.click(Pictures.ARENA_CLOSE))
            .inputs(List.of(Input.click(Pictures.ARENA_REFRESH).did(Did.IN_PLACE),
                    Input.click(Pictures.ARENA_FIGHT).kind(Kind.CHORE), Input.click(Pictures.ARENA_BATTLE_LOG),
                    Input.click(Pictures.ARENA_EDIT_SQUAD), Input.click(Pictures.INFO_MAP).kind(Kind.INFO),
                    Input.click(Pictures.ARENA_LEADERBOARDS)))
            .at(new Point(340, 1459));
    public static final GameScreen ARENA_INFO = GameScreen.named("Arena info").markers(List.of(Pictures.ARENA_RULES_TITLE))
            .from(Way.of(Screens.ARENA, Input.click(Pictures.INFO_MAP).kind(Kind.INFO)))
            .back(Input.click(Pictures.CLOSE_ROOMS_CHAT)).at(new Point(680, 1035));
    public static final GameScreen ARENA_LEADERBOARDS = GameScreen.named("Arena leaderboards").markers(List.of(Pictures.ARENA_LEADERBOARDS_HEADER))
            .from(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_LEADERBOARDS)))
            .back(Input.click(Pictures.ARENA_LEADERBOARDS_CLOSE)).at(new Point(680, 1277));
    public static final GameScreen ARENA_BATTLE_LOG = GameScreen.named("Arena battle log").markers(List.of(Pictures.BATTLE_LOG_TITLE))
            .from(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_BATTLE_LOG)))
            .back(Input.click(Pictures.BATTLE_LOG_CLOSE))
            .inputs(List.of(Input.click(Pictures.BATTLE_LOG_INSPECT).kind(Kind.INFO),
                    Input.click(Pictures.BATTLE_LOG_REPLAY).kind(Kind.INFO)))
            .at(new Point(680, 1519));
    public static final GameScreen BATTLE_DETAILS = GameScreen.named("Battle details").markers(List.of(Pictures.BATTLE_DETAILS_VS))
            .from(Way.of(Screens.ARENA_BATTLE_LOG, Input.click(Pictures.BATTLE_LOG_INSPECT).kind(Kind.INFO)))
            .back(Input.click(Pictures.CLOSE_ROOMS_CHAT))
            .inputs(List.of(Input.click(Pictures.BATTLE_DETAILS_DEALT).did(Did.IN_PLACE),
                    Input.click(Pictures.BATTLE_DETAILS_TAKEN).did(Did.IN_PLACE),
                    Input.click(Pictures.BATTLE_DETAILS_HEALING).did(Did.IN_PLACE)))
            .at(new Point(1020, 1398));
    public static final GameScreen ARENA_REPLAY = GameScreen.named("Arena replay").markers(List.of(Pictures.ARENA_ROUND))
            .from(Way.of(Screens.ARENA_BATTLE_LOG, Input.click(Pictures.BATTLE_LOG_REPLAY).kind(Kind.INFO)))
            .alsoFrom(List.of(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_FIGHT).kind(Kind.CHORE))))
            .back(Input.click(Pictures.ARENA_FIGHT_CLOSE))
            .inputs(List.of(Input.click(Pictures.ARENA_SPEED).did(Did.LEAVES))).at(new Point(1020, 1640));
    public static final GameScreen GARAGE = GameScreen.named("Garage").markers(List.of(Pictures.GARAGE_TITLE)).from(Way.of(Screens.HOME,Input.click(Pictures.WAR_MACHINES_HOME))).back(Input.click(Pictures.CLOSE_TOWN)).inputs(List.of(Input.click(Pictures.INFO_GARAGE).kind(Kind.INFO),Input.click(Pictures.STATS_TAB_GARAGE).did(Did.NONE).kind(Kind.INFO),Input.click(Pictures.UPGRADE_TAB_GARAGE).kind(Kind.CHORE),Input.click(Pictures.BLUEPRINT_TAB_GARAGE).kind(Kind.CHORE),Input.click(Pictures.EMBLEM_TAB_GARAGE).kind(Kind.CHORE),Input.click(Pictures.ENGINEER_GARAGE),Input.click(Pictures.NEXT_MACHINE_GARAGE).did(Did.IN_PLACE).kind(Kind.INFO),Input.click(Pictures.MACHINE_CARD_GARAGE).did(Did.IN_PLACE).kind(Kind.INFO),Input.click(Pictures.UNKNOWN_CARD_GARAGE).kind(Kind.INFO),Input.click(Pictures.SHOW_ALL_GARAGE).kind(Kind.INFO),Input.click(Pictures.CHEST_GARAGE).did(Did.IN_PLACE).kind(Kind.CHORE),Input.click(Pictures.PREV_MACHINE_GARAGE).did(Did.NONE).kind(Kind.INFO).sometimes())).notes("""
                    Garage (Home's wrench, war_machines_home) shows one war machine at a time; arrows or the bottom cards pick another.
                    Each tab has its own title, mapped as its own screen with the book tab as its way back: Workshop (components, Upgrade needs screws, cogs and metal), Blueprints (titled Upgrades: damage/health/armor levels, Upgrade spends blueprints; x1/x5 multiplier), Machine rarity (titled Rarity: Increase rarity spends 10 000 tools, needs machine level 10).
                    Machine cards carry a red bell badge when an upgrade is affordable.
                    The ? card opens Locked machine: unlock new machines with arcane conduits from jewel chests. Show all lists every machine, owned or locked.
                    Components come from jewel chests.\
                    """).reached(Reached.SURVEYED);
    public static final GameScreen ENGINEER = GameScreen.named("Engineer").markers(List.of(Pictures.ENGINEER_NAME)).from(Way.of(Screens.HOME,Input.click(Pictures.ENGINEER_HOME))).alsoFrom(List.of(Way.of(Screens.GARAGE,Input.click(Pictures.ENGINEER_GARAGE)))).back(Input.click(Pictures.CLOSE_TOWN)).inputs(List.of(Input.click(Pictures.INFO_ENGINEER).kind(Kind.INFO),Input.click(Pictures.ENGINEER_TAB_ENGINEER).did(Did.IN_PLACE).kind(Kind.INFO),Input.click(Pictures.BATTLES_TAB_ENGINEER).kind(Kind.INFO),Input.click(Pictures.STAR_TAB_ENGINEER).kind(Kind.INFO),Input.click(Pictures.SWIRL_TAB_ENGINEER).did(Did.IN_PLACE).kind(Kind.INFO),Input.click(Pictures.CLAIM_ENGINEER).did(Did.IN_PLACE).kind(Kind.CHORE).sometimes(),Input.click(Pictures.GARAGE_ENGINEER).did(Did.LEAVES),Input.click(Pictures.GEMS_PLUS_MAP).kind(Kind.CHOICE).never("buys tools with gems"))).notes("""
                    Engineer produces tools every 6 hours; Claim (claim_engineer) collects them, then disappears until the next batch.
                    Home shows engineer_home (blue helmet, left column) only while tools wait to be claimed; Garage's Engineer button reaches it always.
                    Engineer level comes from war machine levels (100 XP per machine level); it raises all war machines' attributes and tool production.
                    Tabs: Engineer (bonus + Claim), Active squad (Change squad, Edit), Favored war machines (80% of jewel-chest components go to the 5 favored), Arcane conduits (collect Chaos turbine / Energy core / Mana reactor from jewel chests to unlock a new war machine).
                    Tools (top right, 7 166) buy war machine rarity in Garage; the + buys tools with gems: never.\
                    """).reached(Reached.SURVEYED).at(new Point(340,2124));
    public static final GameScreen ACTIVE_SQUAD = GameScreen.named("Active squad").markers(List.of(Pictures.ACTIVE_SQUAD_TITLE))
            .from(Way.of(Screens.ENGINEER, Input.click(Pictures.BATTLES_TAB_ENGINEER)))
            .back(Input.click(Pictures.ENGINEER_TAB_ENGINEER))
            .inputs(List.of(Input.click(Pictures.CHANGE_SQUAD_ENGINEER).kind(Kind.CHOICE),
                    Input.click(Pictures.EDIT_SQUAD_ENGINEER).kind(Kind.CHOICE),
                    Input.click(Pictures.MACHINE_CARD_ENGINEER).did(Did.IN_PLACE).kind(Kind.INFO)));
    public static final GameScreen ARENA_SQUAD = GameScreen.named("Arena squad").markers(List.of(Pictures.CHOOSE_WAR_MACHINES_TITLE))
            .from(Way.of(Screens.ARENA, Input.click(Pictures.ARENA_EDIT_SQUAD)))
            .alsoFrom(List.of(Way.of(Screens.ACTIVE_SQUAD, Input.click(Pictures.EDIT_SQUAD_ENGINEER))))
            .back(Input.click(Pictures.CLOSE_X))
            .inputs(List.of(Input.click(Pictures.SQUAD_SAVE_CHANGES).did(Did.IN_PLACE),
                    Input.click(Pictures.SQUAD_EDIT_HEROES)))
            .at(new Point(1352, 2044));
    public static final GameScreen SQUAD_HEROES = GameScreen.named("Squad heroes").markers(List.of(Pictures.SELECT_CREW_TITLE))
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
    public static final GameScreen CREW_INFO = GameScreen.named("Crew info").markers(List.of(Pictures.HERO_BONUSES_TITLE))
            .from(Way.of(Screens.SQUAD_HEROES, Input.click(Pictures.CREW_INFO).kind(Kind.INFO)))
            .back(Input.click(Pictures.CREW_INFO_CLOSE)).at(new Point(2032, 2044));
    public static final GameScreen ENGINEER_INFO = GameScreen.named("Engineer info").markers(List.of(Pictures.ENGINEER_INFO_TITLE))
            .from(Way.of(Screens.ENGINEER, Input.click(Pictures.INFO_ENGINEER)))
            .back(Input.click(Pictures.CLOSE_ENGINEER_INFO)).at(new Point(1352, 2286));
    public static final GameScreen CHANGE_SQUAD = GameScreen.named("Squads").markers(List.of(Pictures.SQUADS_TITLE))
            .from(Way.of(Screens.ACTIVE_SQUAD, Input.click(Pictures.CHANGE_SQUAD_ENGINEER)))
            .back(Input.click(Pictures.CLOSE_SQUADS))
            .inputs(List.of(Input.click(Pictures.EDIT_SQUADS).did(Did.LEAVES).kind(Kind.CHOICE),
                    Input.click(Pictures.SET_ACTIVE_SQUADS).kind(Kind.CHOICE)
                            .never("switches the player's active squad")
                            .variants(List.of(Variant.of(Pictures.SET_ACTIVE_OFF_SQUADS, State.DISABLED))),
                    Input.click(Pictures.EMPTY_SPOT_SQUADS).did(Did.IN_PLACE).kind(Kind.CHOICE)));
    public static final GameScreen FAVORED_WAR_MACHINES_2 = GameScreen.named("Favored war machines").markers(List.of(Pictures.FAVORED_TAB_TITLE))
            .from(Way.of(Screens.ENGINEER, Input.click(Pictures.STAR_TAB_ENGINEER)))
            .back(Input.click(Pictures.ENGINEER_TAB_ENGINEER))
            .inputs(List.of(Input.click(Pictures.EDIT_FAVORED).kind(Kind.CHOICE)));
    public static final GameScreen FAVORED_WAR_MACHINES = GameScreen.named("Select the favored war machines").markers(List.of(Pictures.FAVORED_TITLE))
            .from(Way.of(Screens.FAVORED_WAR_MACHINES_2, Input.click(Pictures.EDIT_FAVORED)))
            .back(Input.click(Pictures.CLOSE_FAVORED))
            .inputs(List.of(Input.click(Pictures.SAVE_CHANGES_OFF_FAVORED).did(Did.IN_PLACE).kind(Kind.CHOICE),
                    Input.click(Pictures.MACHINE_CARD_FAVORED).kind(Kind.CHOICE)
                            .never("changes which war machines the player favours")));
    public static final GameScreen GARAGE_INFO = GameScreen.named("Garage info").markers(List.of(Pictures.GARAGE_INFO_TITLE))
            .from(Way.of(Screens.GARAGE, Input.click(Pictures.INFO_GARAGE)))
            .back(Input.click(Pictures.CLOSE_GARAGE_INFO));
    public static final GameScreen UPGRADE_TAB = GameScreen.named("Workshop").markers(List.of(Pictures.WORKSHOP_TITLE))
            .from(Way.of(Screens.GARAGE, Input.click(Pictures.UPGRADE_TAB_GARAGE)))
            .back(Input.click(Pictures.STATS_TAB_GARAGE))
            .inputs(List.of(
                    Input.click(Pictures.X1_WORKSHOP).did(Did.IN_PLACE).kind(Kind.SHORTCUT)
                            .variants(List.of(Variant.of(Pictures.X5_WORKSHOP, State.SELECTED))),
                    Input.click(Pictures.UPGRADE_WORKSHOP).did(Did.IN_PLACE).kind(Kind.CHORE)));
    public static final GameScreen BLUEPRINTS = GameScreen.named("Blueprints").markers(List.of(Pictures.BLUEPRINTS_TITLE))
            .from(Way.of(Screens.GARAGE, Input.click(Pictures.BLUEPRINT_TAB_GARAGE)))
            .back(Input.click(Pictures.STATS_TAB_GARAGE))
            .inputs(List.of(Input.click(Pictures.X1_WORKSHOP).did(Did.IN_PLACE).kind(Kind.SHORTCUT),
                    Input.click(Pictures.UPGRADE_BLUEPRINTS).did(Did.IN_PLACE).kind(Kind.CHORE)));
    public static final GameScreen EMBLEMS = GameScreen.named("Machine rarity").markers(List.of(Pictures.MACHINE_RARITY_TITLE))
            .from(Way.of(Screens.GARAGE, Input.click(Pictures.EMBLEM_TAB_GARAGE)))
            .back(Input.click(Pictures.STATS_TAB_GARAGE))
            .inputs(List.of(Input.click(Pictures.GEMS_PLUS_MAP).kind(Kind.CHOICE).never("buys tools with gems"),
                    Input.click(Pictures.INCREASE_RARITY_OFF_GARAGE).did(Did.IN_PLACE).kind(Kind.CHORE)));
    public static final GameScreen LOCKED_MACHINE = GameScreen.named("Locked machine").markers(List.of(Pictures.LOCKED_MACHINE_TEXT))
            .from(Way.of(Screens.GARAGE, Input.click(Pictures.UNKNOWN_CARD_GARAGE)))
            .back(Input.click(Pictures.CLOSE_LOCKED_MACHINE));
    public static final GameScreen ALL_WAR_MACHINES = GameScreen.named("All war machines").markers(List.of(Pictures.ALL_MACHINES_FRAME))
            .from(Way.of(Screens.GARAGE, Input.click(Pictures.SHOW_ALL_GARAGE))).back(Input.click(Pictures.CLOSE_X))
            .inputs(List.of(Input.click(Pictures.OWNED_CARD_ALL_MACHINES).did(Did.IN_PLACE).kind(Kind.INFO),
                    Input.click(Pictures.LOCKED_CARD_ALL_MACHINES).did(Did.IN_PLACE).kind(Kind.INFO),
                    Input.scroll(Pictures.OWNED_CARD_ALL_MACHINES, -10).did(Did.IN_PLACE)));
    public static final GameScreen MAILBOX = GameScreen.named("Mailbox").markers(List.of(Pictures.MAILBOX_TITLE)).from(Way.of(Screens.HOME,Input.click(Pictures.MAIL_HOME))).back(Input.click(Pictures.CLOSE_MAILBOX)).inputs(List.of(Input.click(Pictures.DELETE_MAILBOX).kind(Kind.CHOICE).never("deletes the player's mail"),Input.click(Pictures.MAIL_ITEM_MAILBOX).did(Did.IN_PLACE).kind(Kind.INFO),Input.click(Pictures.MAIL_CLAIM).kind(Kind.CHORE).sometimes(),Input.scroll(Pictures.MAIL_ITEM_MAILBOX,-10).did(Did.IN_PLACE))).notes("""
                    Mailbox (Home's envelope, red count badge = unread mail): a list of mails on the left (rewards from daily quests, Arena of Kings ranking, events, battle pass, arcane crystals), the open mail on the right.
                    Claim (mail_claim) shows while the open mail holds rewards; claiming opens the Reward popup (Goddess Aurelia, OK closes it).
                    The list scrolls (10 notches showed mails back to mid-September).
                    The trash deletes read mail: never.\
                    """).reached(Reached.SURVEYED);
    public static final GameScreen MAIL_CLAIM = GameScreen.named("Reward").markers(List.of(Pictures.REWARD_GODDESS_TITLE))
            .from(Way.of(Screens.MAILBOX, Input.click(Pictures.MAIL_CLAIM))).back(Input.click(Pictures.OK_REWARD))
            .popup();
    public static final GameScreen LIBRARY = GameScreen.named("Library").markers(List.of(Pictures.METEORITE_TAB_LIBRARY))
            .from(Way.of(Screens.HOME, Input.click(Pictures.LIBRARY_HOME)));
    private Screens() {
    }
}
