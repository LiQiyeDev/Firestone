package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;

/**
 * The pictures this bot looks for, one constant each.
 *
 * <p>Managed by <i>🖼 Manage Pictures</i>, which adds, renames and removes these together with the image
 * files they point at and every use of them in your code. That is why the whole class is
 * {@code @SdkValue(PICTURES)} and the code canvas will not edit it: the canvas can rename the constant it
 * is looking at, and nothing else, which leaves the bot calling a name that is gone.
 *
 * <p>Everywhere else this is an ordinary class. Your code reads {@code Pictures.COLLECT} like any other
 * constant, a misspelling is a compile error, and a developer with no BotMaker installed can read the whole
 * of what this bot watches for by opening one file.
 *
 * <p>An {@link ImageTemplate} names a file under {@code src/main/resources/images}. The ones this template
 * ships are blank placeholders: replace those files with ✂ <b>Capture Templates</b>, keeping the names, and
 * the same code starts working against your game.
 *
 * <p>They are built once and held, rather than constructed at each use: a template opens its file, and a bot
 * that polls for a picture once a second would otherwise open the same file once a second.
 */
@SdkValue(SdkValue.Id.PICTURES)
public final class Pictures {

    public static final ImageTemplate COLLECT = new ImageTemplate("src/main/resources/images/collect.png");
    public static final ImageTemplate BATTLE = new ImageTemplate("src/main/resources/images/battle.png").at(new Rect(1650, 536, 95, 36));
    public static final ImageTemplate VICTORY = new ImageTemplate("src/main/resources/images/victory.png");
    public static final ImageTemplate DEFEAT = new ImageTemplate("src/main/resources/images/defeat.png");
    public static final ImageTemplate CLOSE_X = new ImageTemplate("src/main/resources/images/close_x.png").at(new Rect(1808, 28, 64, 64));
    public static final ImageTemplate CLAIM_BUTTON = new ImageTemplate("src/main/resources/images/claim_button.png")
            .at(new Rect(880, 900, 170, 75));
    public static final ImageTemplate HOME = new ImageTemplate("src/main/resources/images/home.png").at(new Rect(1846, 196, 30, 34));
    public static final ImageTemplate RESEARCH_CLAIM = new ImageTemplate("src/main/resources/images/research_claim.png")
            .at(new Rect(535, 963, 105, 36));
    public static final ImageTemplate CLAIM_OFFLINE = new ImageTemplate("src/main/resources/images/claim_offline.png")
            .at(new Rect(895, 905, 130, 50));
    public static final ImageTemplate EXIT_HOME = new ImageTemplate("src/main/resources/images/exit_home.png")
            .at(new Rect(1035, 290, 310, 50));
    public static final ImageTemplate MAP = new ImageTemplate("src/main/resources/images/map.png").at(new Rect(1820, 325, 40, 35));
    public static final ImageTemplate GUILD = new ImageTemplate("src/main/resources/images/guild.png").at(new Rect(1830, 432, 58, 60));
    public static final ImageTemplate MARKET = new ImageTemplate("src/main/resources/images/market.png").at(new Rect(1815, 582, 64, 46));
    public static final ImageTemplate UPGRADES = new ImageTemplate("src/main/resources/images/upgrades.png").at(new Rect(1395, 965, 55, 45));
    public static final ImageTemplate BAG = new ImageTemplate("src/main/resources/images/bag.png").at(new Rect(1537, 952, 56, 56));
    public static final ImageTemplate FELLOWSHIP = new ImageTemplate("src/main/resources/images/fellowship.png").at(new Rect(1680, 962, 45, 46));
    public static final ImageTemplate PARTY = new ImageTemplate("src/main/resources/images/party.png").at(new Rect(1815, 948, 48, 60));
    public static final ImageTemplate CLOSE_TOWN = new ImageTemplate("src/main/resources/images/close_town.png")
            .at(new Rect(1805, 25, 70, 70));
    public static final ImageTemplate LIBRARY_TOWN = new ImageTemplate("src/main/resources/images/library_town.png").at(new Rect(225, 575, 100, 115));
    public static final ImageTemplate ALCHEMIST_TOWN = new ImageTemplate("src/main/resources/images/alchemist_town.png").at(new Rect(400, 750, 100, 130));
    public static final ImageTemplate TAVERN_TOWN = new ImageTemplate("src/main/resources/images/tavern_town.png").at(new Rect(642, 875, 115, 115));
    public static final ImageTemplate ENGINEER_TOWN = new ImageTemplate("src/main/resources/images/engineer_town.png").at(new Rect(1200, 735, 180, 160));
    public static final ImageTemplate GUILD_TOWN = new ImageTemplate("src/main/resources/images/guild_town.png").at(new Rect(1433, 50, 142, 158));
    public static final ImageTemplate MAGIC_QUARTER_TOWN = new ImageTemplate("src/main/resources/images/magic_quarter_town.png").at(new Rect(525, 108, 175, 200));
    public static final ImageTemplate TEMPLE_TOWN = new ImageTemplate("src/main/resources/images/temple_town.png").at(new Rect(850, 110, 190, 185));
    public static final ImageTemplate BATTLES_TOWN = new ImageTemplate("src/main/resources/images/battles_town.png").at(new Rect(167, 92, 235, 160));
    public static final ImageTemplate HALL_OF_HEROES_TOWN = new ImageTemplate("src/main/resources/images/hall_of_heroes_town.png").at(new Rect(842, 350, 183, 180));
    public static final ImageTemplate EXOTIC_MERCHANT_TOWN = new ImageTemplate("src/main/resources/images/exotic_merchant_town.png").at(new Rect(1417, 558, 167, 150));
    public static final ImageTemplate PIRATE_SHIP_TOWN = new ImageTemplate("src/main/resources/images/pirate_ship_town.png").at(new Rect(1645, 667, 250, 225));
    public static final ImageTemplate MARKET_TOWN = new ImageTemplate("src/main/resources/images/market_town.png")
            .at(new Rect(1225, 275, 175, 175));
    public static final ImageTemplate LEADERBOARDS_TOWN = new ImageTemplate(
            "src/main/resources/images/leaderboards_town.png").at(new Rect(1675, 117, 175, 250));
    public static final ImageTemplate BACK_TOWN = new ImageTemplate("src/main/resources/images/back_town.png")
            .at(new Rect(100, 400, 97, 97));
    public static final ImageTemplate METEORITE_TAB_LIBRARY = new ImageTemplate(
            "src/main/resources/images/meteorite_tab_library.png").at(new Rect(1775, 410, 75, 75));
    public static final ImageTemplate FIRESTONE_TAB_LIBRARY = new ImageTemplate(
            "src/main/resources/images/firestone_tab_library.png").at(new Rect(1768, 610, 68, 62));
    public static final ImageTemplate RESEARCH_START_LIBRARY = new ImageTemplate(
            "src/main/resources/images/research_start_library.png").at(new Rect(640, 674, 300, 92));
    public static final ImageTemplate HEALTH_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/health_node_library.png").at(new Rect(672, 350, 90, 90));
    public static final ImageTemplate ARMOR_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/armor_node_library.png").at(new Rect(672, 608, 90, 90));
    public static final ImageTemplate GUARDIAN_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/guardian_node_library.png").at(new Rect(1164, 478, 84, 84));
    public static final ImageTemplate PROJECTILES_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/projectiles_node_library.png").at(new Rect(1164, 744, 84, 84));
    public static final ImageTemplate FREE_SLOT_LIBRARY = new ImageTemplate(
            "src/main/resources/images/free_slot_library.png").at(new Rect(780, 950, 520, 70));
    public static final ImageTemplate TRAIN_GUARDIAN = new ImageTemplate("src/main/resources/images/train_guardian.png")
            .at(new Rect(1022, 750, 256, 92));
    public static final ImageTemplate QUEST_CLAIM = new ImageTemplate("src/main/resources/images/quest_claim.png")
            .at(new Rect(1352, 268, 240, 50));
    public static final ImageTemplate QUEST_CLAIM_OFF = new ImageTemplate(
            "src/main/resources/images/quest_claim_off.png").at(new Rect(1352, 268, 240, 50));
    public static final ImageTemplate QUESTS_TAB = new ImageTemplate("src/main/resources/images/quests_tab.png")
            .at(new Rect(1420, 14, 170, 54));
    public static final ImageTemplate WEEKLY_TAB_OFF = new ImageTemplate("src/main/resources/images/weekly_tab_off.png")
            .at(new Rect(980, 100, 240, 58));
    public static final ImageTemplate WEEKLY_TAB_ON = new ImageTemplate("src/main/resources/images/weekly_tab_on.png")
            .at(new Rect(980, 100, 240, 58));
    public static final ImageTemplate DAILY_TAB_OFF = new ImageTemplate("src/main/resources/images/daily_tab_off.png")
            .at(new Rect(560, 100, 220, 58));
    public static final ImageTemplate DAILY_TAB_ON = new ImageTemplate("src/main/resources/images/daily_tab_on.png")
            .at(new Rect(560, 100, 220, 58));
    public static final ImageTemplate GEMS_LIBRARY = new ImageTemplate("src/main/resources/images/gems_library.png")
            .at(new Rect(1532, 12, 46, 44));
    public static final ImageTemplate RANK_LIST_MAP = new ImageTemplate("src/main/resources/images/rank_list_map.png")
            .at(new Rect(1660, 995, 240, 70));
    public static final ImageTemplate CLAIM_MAP = new ImageTemplate("src/main/resources/images/claim_map.png")
            .at(new Rect(95, 300, 165, 45));
    public static final ImageTemplate OKAY_MAP = new ImageTemplate("src/main/resources/images/okay_map.png")
            .at(new Rect(800, 612, 320, 70));
    public static final ImageTemplate START_MISSION_MAP = new ImageTemplate(
            "src/main/resources/images/start_mission_map.png").at(new Rect(960, 862, 270, 70));
    public static final ImageTemplate NO_SQUADS_MAP = new ImageTemplate("src/main/resources/images/no_squads_map.png")
            .at(new Rect(1000, 872, 515, 42));
    public static final ImageTemplate DRAGON_PIN_MAP = new ImageTemplate("src/main/resources/images/dragon_pin_map.png")
            .at(new Rect(564, 538, 40, 70));
    public static final ImageTemplate SCROLL_PIN_MAP = new ImageTemplate("src/main/resources/images/scroll_pin_map.png")
            .at(new Rect(1490, 212, 40, 62));
    public static final ImageTemplate SWORD_PIN_MAP = new ImageTemplate("src/main/resources/images/sword_pin_map.png")
            .at(new Rect(1129, 598, 44, 70));
    public static final ImageTemplate TELESCOPE_PIN_MAP = new ImageTemplate(
            "src/main/resources/images/telescope_pin_map.png").at(new Rect(1457, 547, 48, 72));
    public static final ImageTemplate BADGE_TOWN = new ImageTemplate("src/main/resources/images/badge_town.png")
            .at(new Rect(361, 685, 26, 26));
    public static final ImageTemplate BEER_BUY_TAVERN = new ImageTemplate(
            "src/main/resources/images/beer_buy_tavern.png").at(new Rect(428, 610, 60, 68));
    public static final ImageTemplate BEER_BUY_OFF_TAVERN = new ImageTemplate(
            "src/main/resources/images/beer_buy_off_tavern.png").at(new Rect(428, 610, 60, 68));
    public static final ImageTemplate PLAY_TAVERN = new ImageTemplate("src/main/resources/images/play_tavern.png")
            .at(new Rect(880, 953, 160, 48));
    public static final ImageTemplate CARD_TAVERN = new ImageTemplate("src/main/resources/images/card_tavern.png")
            .at(new Rect(548, 278, 236, 90));
    public static final ImageTemplate MARKET_TAVERN = new ImageTemplate("src/main/resources/images/market_tavern.png")
            .at(new Rect(1750, 700, 112, 92));
    public static final ImageTemplate MARKET_TITLE_TAVERN = new ImageTemplate(
            "src/main/resources/images/market_title_tavern.png").at(new Rect(696, 238, 530, 76));
    public static final ImageTemplate TAVERN_CHOICE_TOWN = new ImageTemplate(
            "src/main/resources/images/tavern_choice_town.png").at(new Rect(640, 440, 220, 200));
    public static final ImageTemplate PLAY_OFF_TAVERN = new ImageTemplate(
            "src/main/resources/images/play_off_tavern.png").at(new Rect(880, 953, 160, 48));
    public static final ImageTemplate MANUAL_TAVERN = new ImageTemplate("src/main/resources/images/manual_tavern.png")
            .at(new Rect(1688, 1006, 160, 54));
    public static final ImageTemplate CAMPAIGN_HOME = new ImageTemplate("src/main/resources/images/campaign_home.png")
            .at(new Rect(30, 308, 62, 62));
    public static final ImageTemplate WAR_MACHINES_HOME = new ImageTemplate(
            "src/main/resources/images/war_machines_home.png").at(new Rect(28, 400, 66, 62));
    public static final ImageTemplate GUARDIANS_HOME = new ImageTemplate("src/main/resources/images/guardians_home.png")
            .at(new Rect(30, 502, 62, 64));
    public static final ImageTemplate LIBRARY_HOME = new ImageTemplate("src/main/resources/images/library_home.png")
            .at(new Rect(28, 602, 66, 72));
    public static final ImageTemplate MAIL_HOME = new ImageTemplate("src/main/resources/images/mail_home.png")
            .at(new Rect(22, 790, 66, 52));
    public static final ImageTemplate ENGINEER_HOME = new ImageTemplate("src/main/resources/images/engineer_home.png")
            .at(new Rect(32, 290, 60, 50));
    public static final ImageTemplate LEAVE_BOSS = new ImageTemplate("src/main/resources/images/leave_boss.png")
            .at(new Rect(160, 430, 95, 85));
    public static final ImageTemplate BATTLE_PASS_HOME = new ImageTemplate(
            "src/main/resources/images/battle_pass_home.png").at(new Rect(370, 940, 75, 70));
    public static final ImageTemplate EVENTS_HOME = new ImageTemplate("src/main/resources/images/events_home.png")
            .at(new Rect(518, 955, 60, 55));
    public static final ImageTemplate HEROES_DAMAGE_UPGRADES = new ImageTemplate(
            "src/main/resources/images/heroes_damage_upgrades.png").at(new Rect(1345, 155, 85, 75));
    public static final ImageTemplate UPGRADE_UPGRADES = new ImageTemplate(
            "src/main/resources/images/upgrade_upgrades.png").at(new Rect(1632, 152, 256, 92));
    public static final ImageTemplate UPGRADE_X1_UPGRADES = new ImageTemplate(
            "src/main/resources/images/upgrade_x1_upgrades.png").at(new Rect(1448, 982, 262, 74));
    public static final ImageTemplate GEAR_TAB_BAG = new ImageTemplate("src/main/resources/images/gear_tab_bag.png")
            .at(new Rect(1432, 335, 55, 70));
    public static final ImageTemplate ITEMS_TAB_BAG = new ImageTemplate("src/main/resources/images/items_tab_bag.png")
            .at(new Rect(1432, 240, 55, 75));
    public static final ImageTemplate CHESTS_TAB_BAG = new ImageTemplate("src/main/resources/images/chests_tab_bag.png")
            .at(new Rect(1432, 435, 55, 75));
    public static final ImageTemplate GEMS_TAB_BAG = new ImageTemplate("src/main/resources/images/gems_tab_bag.png")
            .at(new Rect(1432, 535, 55, 70));
    public static final ImageTemplate HEART_TAB_MARKET = new ImageTemplate(
            "src/main/resources/images/heart_tab_market.png").at(new Rect(1062, 52, 115, 82));
    public static final ImageTemplate BUNDLES_TAB_MARKET = new ImageTemplate(
            "src/main/resources/images/bundles_tab_market.png").at(new Rect(458, 70, 112, 68));
    public static final ImageTemplate GEMS_TAB_MARKET = new ImageTemplate(
            "src/main/resources/images/gems_tab_market.png").at(new Rect(612, 58, 132, 72));
    private Pictures() {}
}
