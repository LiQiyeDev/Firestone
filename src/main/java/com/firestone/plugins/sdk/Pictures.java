package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;

import java.util.List;

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
    public static final ImageTemplate CLOSE_X = new ImageTemplate("src/main/resources/images/close_x.png").at(new Rect(1808, 28, 64, 64))
            .tags(List.of(Tags.POPUPS));
    public static final ImageTemplate CLAIM_BUTTON = new ImageTemplate("src/main/resources/images/claim_button.png")
            .at(new Rect(880, 900, 170, 75));
    public static final ImageTemplate TOWN_HOME = new ImageTemplate("src/main/resources/images/town_home.png").at(new Rect(1846, 196, 30, 34));
    public static final ImageTemplate RESEARCH_CLAIM = new ImageTemplate("src/main/resources/images/research_claim.png")
            .at(new Rect(535, 963, 105, 36)).activities(List.of(Activities.Research.class));
    public static final ImageTemplate CLAIM_OFFLINE = new ImageTemplate("src/main/resources/images/claim_offline.png")
            .at(new Rect(895, 905, 130, 50)).tags(List.of(Tags.POPUPS));
    public static final ImageTemplate EXIT_HOME = new ImageTemplate("src/main/resources/images/exit_home.png")
            .at(new Rect(1035, 290, 310, 50)).tags(List.of(Tags.POPUPS));
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
            "src/main/resources/images/meteorite_tab_library.png").at(new Rect(1775, 410, 75, 75))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate FIRESTONE_TAB_LIBRARY = new ImageTemplate(
            "src/main/resources/images/firestone_tab_library.png").at(new Rect(1768, 610, 68, 62))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate RESEARCH_START_LIBRARY = new ImageTemplate(
            "src/main/resources/images/research_start_library.png").at(new Rect(640, 674, 300, 92))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate HEALTH_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/health_node_library.png").at(new Rect(672, 350, 90, 90))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate ARMOR_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/armor_node_library.png").at(new Rect(672, 608, 90, 90))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate GUARDIAN_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/guardian_node_library.png").at(new Rect(1164, 478, 84, 84))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate PROJECTILES_NODE_LIBRARY = new ImageTemplate(
            "src/main/resources/images/projectiles_node_library.png").at(new Rect(1164, 744, 84, 84))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate FREE_SLOT_LIBRARY = new ImageTemplate(
            "src/main/resources/images/free_slot_library.png").at(new Rect(780, 950, 520, 70))
            .activities(List.of(Activities.Research.class));
    public static final ImageTemplate TRAIN_GUARDIAN = new ImageTemplate("src/main/resources/images/train_guardian.png")
            .at(new Rect(1022, 750, 256, 92));
    public static final ImageTemplate QUEST_CLAIM = new ImageTemplate("src/main/resources/images/quest_claim.png")
            .at(new Rect(1352, 268, 240, 50)).activities(List.of(Activities.Quests.class));
    public static final ImageTemplate QUEST_CLAIM_OFF = new ImageTemplate(
            "src/main/resources/images/quest_claim_off.png").at(new Rect(1352, 268, 240, 50))
            .activities(List.of(Activities.Quests.class));
    public static final ImageTemplate QUESTS_TAB = new ImageTemplate("src/main/resources/images/quests_tab.png")
            .at(new Rect(1420, 14, 170, 54)).activities(List.of(Activities.Quests.class));
    public static final ImageTemplate WEEKLY_TAB_OFF = new ImageTemplate("src/main/resources/images/weekly_tab_off.png")
            .at(new Rect(980, 100, 240, 58)).activities(List.of(Activities.Quests.class));
    public static final ImageTemplate WEEKLY_TAB_ON = new ImageTemplate("src/main/resources/images/weekly_tab_on.png")
            .at(new Rect(980, 100, 240, 58)).activities(List.of(Activities.Quests.class));
    public static final ImageTemplate DAILY_TAB_OFF = new ImageTemplate("src/main/resources/images/daily_tab_off.png")
            .at(new Rect(560, 100, 220, 58)).activities(List.of(Activities.Quests.class));
    public static final ImageTemplate DAILY_TAB_ON = new ImageTemplate("src/main/resources/images/daily_tab_on.png")
            .at(new Rect(560, 100, 220, 58)).activities(List.of(Activities.Quests.class));
    public static final ImageTemplate GEMS_LIBRARY = new ImageTemplate("src/main/resources/images/gems_library.png")
            .at(new Rect(1532, 12, 46, 44)).activities(List.of(Activities.Research.class));
    public static final ImageTemplate RANK_LIST_MAP = new ImageTemplate("src/main/resources/images/rank_list_map.png")
            .at(new Rect(1660, 995, 240, 70)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate CLAIM_MAP = new ImageTemplate("src/main/resources/images/claim_map.png")
            .at(new Rect(95, 300, 165, 45)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate OKAY_MAP = new ImageTemplate("src/main/resources/images/okay_map.png")
            .at(new Rect(800, 612, 320, 70)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate START_MISSION_MAP = new ImageTemplate(
            "src/main/resources/images/start_mission_map.png").at(new Rect(960, 862, 270, 70))
            .activities(List.of(Activities.Missions.class));
    public static final ImageTemplate NO_SQUADS_MAP = new ImageTemplate("src/main/resources/images/no_squads_map.png")
            .at(new Rect(1000, 872, 515, 42)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate DRAGON_PIN_MAP = new ImageTemplate("src/main/resources/images/dragon_pin_map.png")
            .at(new Rect(564, 538, 40, 70)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate SCROLL_PIN_MAP = new ImageTemplate("src/main/resources/images/scroll_pin_map.png")
            .at(new Rect(1490, 212, 40, 62)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate SWORD_PIN_MAP = new ImageTemplate("src/main/resources/images/sword_pin_map.png")
            .at(new Rect(1129, 598, 44, 70)).activities(List.of(Activities.Missions.class));
    public static final ImageTemplate TELESCOPE_PIN_MAP = new ImageTemplate(
            "src/main/resources/images/telescope_pin_map.png").at(new Rect(1457, 547, 48, 72))
            .activities(List.of(Activities.Missions.class));
    public static final ImageTemplate BADGE_TOWN = new ImageTemplate("src/main/resources/images/badge_town.png")
            .at(new Rect(361, 685, 26, 26));
    public static final ImageTemplate BEER_BUY_TAVERN = new ImageTemplate(
            "src/main/resources/images/beer_buy_tavern.png").at(new Rect(428, 610, 60, 68))
            .activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate BEER_BUY_OFF_TAVERN = new ImageTemplate(
            "src/main/resources/images/beer_buy_off_tavern.png").at(new Rect(428, 610, 60, 68))
            .activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate PLAY_TAVERN = new ImageTemplate("src/main/resources/images/play_tavern.png")
            .at(new Rect(880, 953, 160, 48)).activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate CARD_TAVERN = new ImageTemplate("src/main/resources/images/card_tavern.png")
            .at(new Rect(548, 278, 236, 90)).activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate MARKET_TAVERN = new ImageTemplate("src/main/resources/images/market_tavern.png")
            .at(new Rect(1750, 700, 112, 92)).activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate MARKET_TITLE_TAVERN = new ImageTemplate(
            "src/main/resources/images/market_title_tavern.png").at(new Rect(696, 238, 530, 76))
            .activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate TAVERN_CHOICE_TOWN = new ImageTemplate(
            "src/main/resources/images/tavern_choice_town.png").at(new Rect(640, 440, 220, 200));
    public static final ImageTemplate PLAY_OFF_TAVERN = new ImageTemplate(
            "src/main/resources/images/play_off_tavern.png").at(new Rect(880, 953, 160, 48))
            .activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate MANUAL_TAVERN = new ImageTemplate("src/main/resources/images/manual_tavern.png")
            .at(new Rect(1688, 1006, 160, 54)).activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate CAMPAIGN_HOME = new ImageTemplate("src/main/resources/images/campaign_home.png")
            .at(new Rect(30, 308, 62, 62));
    public static final ImageTemplate WAR_MACHINES_HOME = new ImageTemplate("src/main/resources/images/war_machines_home.png").at(new Rect(30, 670, 64, 50));
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
    public static final ImageTemplate CHESTS_TAB_MARKET = new ImageTemplate(
            "src/main/resources/images/chests_tab_market.png").at(new Rect(765, 55, 122, 78));
    public static final ImageTemplate BAG_TAB_MARKET = new ImageTemplate("src/main/resources/images/bag_tab_market.png")
            .at(new Rect(918, 52, 108, 84));
    public static final ImageTemplate HERO_TAB_MARKET = new ImageTemplate(
            "src/main/resources/images/hero_tab_market.png").at(new Rect(1212, 48, 112, 90));
    public static final ImageTemplate CALENDAR_TAB_MARKET = new ImageTemplate(
            "src/main/resources/images/calendar_tab_market.png").at(new Rect(1355, 68, 100, 70));
    public static final ImageTemplate FREE_MARKET = new ImageTemplate("src/main/resources/images/free_market.png")
            .at(new Rect(520, 875, 270, 60));
    public static final ImageTemplate PRICE_MARKET = new ImageTemplate("src/main/resources/images/price_market.png")
            .at(new Rect(1245, 872, 270, 62));
    public static final ImageTemplate TITLE_GUILD = new ImageTemplate("src/main/resources/images/title_guild.png")
            .at(new Rect(850, 2, 230, 56));
    public static final ImageTemplate LOCK_GUILD = new ImageTemplate("src/main/resources/images/lock_guild.png")
            .at(new Rect(568, 264, 72, 76));
    public static final ImageTemplate MARKET_GUILD = new ImageTemplate("src/main/resources/images/market_guild.png")
            .at(new Rect(510, 82, 210, 170));
    public static final ImageTemplate EXPEDITIONS_GUILD = new ImageTemplate(
            "src/main/resources/images/expeditions_guild.png").at(new Rect(165, 240, 190, 150));
    public static final ImageTemplate HALL_GUILD = new ImageTemplate("src/main/resources/images/hall_guild.png")
            .at(new Rect(890, 315, 300, 190));
    public static final ImageTemplate BANK_GUILD = new ImageTemplate("src/main/resources/images/bank_guild.png")
            .at(new Rect(165, 565, 230, 230));
    public static final ImageTemplate TREE_OF_LIFE_GUILD = new ImageTemplate(
            "src/main/resources/images/tree_of_life_guild.png").at(new Rect(1480, 180, 260, 150));
    public static final ImageTemplate CHAOS_RIFT_GUILD = new ImageTemplate(
            "src/main/resources/images/chaos_rift_guild.png").at(new Rect(1300, 420, 230, 280));
    public static final ImageTemplate FORBIDDEN_KNOWLEDGE_GUILD = new ImageTemplate(
            "src/main/resources/images/forbidden_knowledge_guild.png").at(new Rect(465, 695, 210, 160));
    public static final ImageTemplate AWAKENING_GUILD = new ImageTemplate(
            "src/main/resources/images/awakening_guild.png").at(new Rect(1085, 690, 230, 230));
    public static final ImageTemplate LEVEL_50_GUILD = new ImageTemplate("src/main/resources/images/level_50_guild.png")
            .at(new Rect(1585, 725, 170, 170));
    public static final ImageTemplate FIND_GUILD = new ImageTemplate("src/main/resources/images/find_guild.png")
            .at(new Rect(836, 990, 254, 72));
    public static final ImageTemplate CAMPAIGN_MAP = new ImageTemplate("src/main/resources/images/campaign_map.png")
            .at(new Rect(1790, 415, 100, 100));
    public static final ImageTemplate WAR_MACHINE_MAP = new ImageTemplate(
            "src/main/resources/images/war_machine_map.png").at(new Rect(1790, 555, 100, 100));
    public static final ImageTemplate INFO_MAP = new ImageTemplate("src/main/resources/images/info_map.png")
            .at(new Rect(605, 15, 52, 52));
    public static final ImageTemplate CHAT_MAP = new ImageTemplate("src/main/resources/images/chat_map.png")
            .at(new Rect(1808, 862, 64, 64));
    public static final ImageTemplate GOLD_PLUS_MAP = new ImageTemplate("src/main/resources/images/gold_plus_map.png")
            .at(new Rect(1476, 16, 40, 40));
    public static final ImageTemplate GEMS_PLUS_MAP = new ImageTemplate("src/main/resources/images/gems_plus_map.png")
            .at(new Rect(1700, 16, 40, 40));
    public static final ImageTemplate ZOOM_IN_MAP = new ImageTemplate("src/main/resources/images/zoom_in_map.png")
            .at(new Rect(1594, 1022, 32, 32));
    public static final ImageTemplate AVATAR_MAP = new ImageTemplate("src/main/resources/images/avatar_map.png")
            .at(new Rect(30, 20, 120, 120));
    public static final ImageTemplate TITLE_TOWN = new ImageTemplate("src/main/resources/images/title_town.png")
            .at(new Rect(785, 8, 110, 45));
    public static final ImageTemplate LOCK_TOWN = new ImageTemplate("src/main/resources/images/lock_town.png")
            .at(new Rect(998, 978, 64, 64));
    public static final ImageTemplate PREV_STAGE_BOSS = new ImageTemplate(
            "src/main/resources/images/prev_stage_boss.png").at(new Rect(682, 20, 28, 46));
    public static final ImageTemplate SALE_CHEST_BOSS = new ImageTemplate(
            "src/main/resources/images/sale_chest_boss.png").at(new Rect(1600, 160, 130, 90));
    public static final ImageTemplate TITLE_FELLOWSHIP = new ImageTemplate(
            "src/main/resources/images/title_fellowship.png").at(new Rect(815, 28, 290, 46));
    public static final ImageTemplate RECOMMENDED_FELLOWSHIP = new ImageTemplate(
            "src/main/resources/images/recommended_fellowship.png").at(new Rect(1345, 165, 285, 85));
    public static final ImageTemplate SEARCH_FELLOWSHIP = new ImageTemplate(
            "src/main/resources/images/search_fellowship.png").at(new Rect(1360, 495, 255, 92));
    public static final ImageTemplate CREATE_FELLOWSHIP = new ImageTemplate(
            "src/main/resources/images/create_fellowship.png").at(new Rect(1380, 865, 210, 90));
    public static final ImageTemplate DEPLOYED_PARTY = new ImageTemplate("src/main/resources/images/deployed_party.png")
            .at(new Rect(843, 42, 165, 48));
    public static final ImageTemplate CLOSE_PARTY = new ImageTemplate("src/main/resources/images/close_party.png")
            .at(new Rect(1812, 17, 56, 54));
    public static final ImageTemplate CHOOSE_LEADER_PARTY = new ImageTemplate(
            "src/main/resources/images/choose_leader_party.png").at(new Rect(1618, 372, 232, 62));
    public static final ImageTemplate AUTO_ABILITIES_PARTY = new ImageTemplate(
            "src/main/resources/images/auto_abilities_party.png").at(new Rect(1788, 895, 104, 42));
    public static final ImageTemplate ABILITY_PARTY = new ImageTemplate("src/main/resources/images/ability_party.png")
            .at(new Rect(1572, 780, 84, 82));
    public static final ImageTemplate HEROES_TAB_PARTY = new ImageTemplate(
            "src/main/resources/images/heroes_tab_party.png").at(new Rect(33, 105, 125, 65));
    public static final ImageTemplate GUARDIANS_TAB_PARTY = new ImageTemplate(
            "src/main/resources/images/guardians_tab_party.png").at(new Rect(200, 113, 163, 65));
    public static final ImageTemplate ORDER_BY_PARTY = new ImageTemplate("src/main/resources/images/order_by_party.png")
            .at(new Rect(72, 982, 233, 66));
    public static final ImageTemplate HERO_CARD_PARTY = new ImageTemplate(
            "src/main/resources/images/hero_card_party.png").at(new Rect(40, 230, 132, 132));
    public static final ImageTemplate MILESTONE_BATTLE_PASS = new ImageTemplate(
            "src/main/resources/images/milestone_battle_pass.png").at(new Rect(838, 98, 172, 46));
    public static final ImageTemplate CHALLENGES_TAB_BATTLE_PASS = new ImageTemplate(
            "src/main/resources/images/challenges_tab_battle_pass.png").at(new Rect(705, 22, 243, 56));
    public static final ImageTemplate REWARDS_TAB_BATTLE_PASS = new ImageTemplate(
            "src/main/resources/images/rewards_tab_battle_pass.png").at(new Rect(972, 22, 243, 56));
    public static final ImageTemplate GOLDEN_PASS_BATTLE_PASS = new ImageTemplate(
            "src/main/resources/images/golden_pass_battle_pass.png").at(new Rect(222, 98, 355, 92));
    public static final ImageTemplate TITLE_EVENTS = new ImageTemplate("src/main/resources/images/title_events.png")
            .at(new Rect(868, 98, 186, 54));
    public static final ImageTemplate ETHEREAL_MINERS_EVENTS = new ImageTemplate(
            "src/main/resources/images/ethereal_miners_events.png").at(new Rect(730, 318, 530, 70));
    public static final ImageTemplate LOCK_EVENTS = new ImageTemplate("src/main/resources/images/lock_events.png")
            .at(new Rect(934, 636, 44, 44));
    public static final ImageTemplate ENGINEER_TITLE = new ImageTemplate("src/main/resources/images/engineer_title.png")
            .at(new Rect(94, 32, 156, 40));
    public static final ImageTemplate GARAGE_TITLE = new ImageTemplate("src/main/resources/images/garage_title.png")
            .at(new Rect(890, 4, 140, 46));
    public static final ImageTemplate CAMPAIGN_TITLE = new ImageTemplate("src/main/resources/images/campaign_title.png").at(new Rect(128, 48, 255, 40));
    public static final ImageTemplate CAMPAIGN_LEADERBOARDS = new ImageTemplate(
            "src/main/resources/images/campaign_leaderboards.png").at(new Rect(790, 985, 340, 62));
    public static final ImageTemplate CAMPAIGN_CLAIM = new ImageTemplate("src/main/resources/images/campaign_claim.png")
            .at(new Rect(98, 985, 110, 45));
    public static final ImageTemplate CAMPAIGN_DAILY_MISSIONS = new ImageTemplate(
            "src/main/resources/images/campaign_daily_missions.png").at(new Rect(1665, 995, 230, 45));
    public static final ImageTemplate MAILBOX_TITLE = new ImageTemplate("src/main/resources/images/mailbox_title.png")
            .at(new Rect(885, 30, 165, 42));
    public static final ImageTemplate MAIL_CLAIM = new ImageTemplate("src/main/resources/images/mail_claim.png")
            .at(new Rect(1165, 818, 120, 45));
    public static final ImageTemplate TAVERN_HOME = new ImageTemplate("src/main/resources/images/tavern_home.png")
            .at(new Rect(35, 288, 55, 58));
    public static final ImageTemplate ARENA_HOME = new ImageTemplate("src/main/resources/images/arena_home.png")
            .at(new Rect(35, 385, 55, 50));
    public static final ImageTemplate TAVERN_LUCK_TITLE = new ImageTemplate(
            "src/main/resources/images/tavern_luck_title.png").at(new Rect(125, 35, 150, 36))
            .activities(List.of(Activities.Tavern.class));
    public static final ImageTemplate ARENA_TITLE = new ImageTemplate("src/main/resources/images/arena_title.png")
            .at(new Rect(822, 74, 275, 44));
    public static final ImageTemplate ARENA_FIGHT = new ImageTemplate("src/main/resources/images/arena_fight.png")
            .at(new Rect(640, 640, 85, 34));
    public static final ImageTemplate ARENA_REFRESH = new ImageTemplate("src/main/resources/images/arena_refresh.png")
            .at(new Rect(835, 158, 50, 50));
    public static final ImageTemplate ARENA_BATTLE_LOG = new ImageTemplate(
            "src/main/resources/images/arena_battle_log.png").at(new Rect(1560, 895, 165, 40));
    public static final ImageTemplate ARENA_EDIT_SQUAD = new ImageTemplate(
            "src/main/resources/images/arena_edit_squad.png").at(new Rect(1250, 870, 100, 95));
    public static final ImageTemplate SETTINGS_LOGGED_IN = new ImageTemplate(
            "src/main/resources/images/settings_logged_in.png").at(new Rect(655, 228, 312, 38));
    public static final ImageTemplate GUARDIANS_STRENGTHEN = new ImageTemplate(
            "src/main/resources/images/guardians_strengthen.png").at(new Rect(1137, 645, 470, 36));
    public static final ImageTemplate GUARDIAN_ENLIGHTENMENT = new ImageTemplate(
            "src/main/resources/images/guardian_enlightenment.png").at(new Rect(1452, 748, 185, 34));
    public static final ImageTemplate GUARDIAN_MULTIPLIER = new ImageTemplate(
            "src/main/resources/images/guardian_multiplier.png").at(new Rect(1762, 208, 100, 44));
    public static final ImageTemplate PARCHMENT_HOME = new ImageTemplate("src/main/resources/images/parchment_home.png")
            .at(new Rect(36, 612, 52, 52));
    public static final ImageTemplate POTION_HOME = new ImageTemplate("src/main/resources/images/potion_home.png")
            .at(new Rect(37, 542, 50, 50));
    public static final ImageTemplate SCROLL_BOOT_HOME = new ImageTemplate(
            "src/main/resources/images/scroll_boot_home.png").at(new Rect(37, 650, 50, 50));
    public static final ImageTemplate CARD_HOME = new ImageTemplate("src/main/resources/images/card_home.png")
            .at(new Rect(40, 462, 40, 26));
    public static final ImageTemplate ALCHEMIST_TITLE = new ImageTemplate(
            "src/main/resources/images/alchemist_title.png").at(new Rect(1165, 188, 290, 42));
    public static final ImageTemplate ALCHEMIST_CLAIM = new ImageTemplate(
            "src/main/resources/images/alchemist_claim.png").at(new Rect(885, 765, 95, 38));
    public static final ImageTemplate ALCHEMIST_DUST_START = new ImageTemplate(
            "src/main/resources/images/alchemist_dust_start.png").at(new Rect(1195, 755, 160, 55));
    public static final ImageTemplate ALCHEMIST_CAULDRON_TAB = new ImageTemplate(
            "src/main/resources/images/alchemist_cauldron_tab.png").at(new Rect(1340, 90, 120, 70));
    public static final ImageTemplate OFFLINE_PROGRESS_TITLE = new ImageTemplate(
            "src/main/resources/images/offline_progress_title.png").at(new Rect(770, 60, 380, 100));
    public static final ImageTemplate AVATAR_HOME = new ImageTemplate("src/main/resources/images/avatar_home.png")
            .at(new Rect(25, 18, 115, 90));
    public static final ImageTemplate PREV_STAGE_HOME = new ImageTemplate(
            "src/main/resources/images/prev_stage_home.png").at(new Rect(690, 18, 32, 46));
    public static final ImageTemplate SETTINGS_HOME = new ImageTemplate("src/main/resources/images/settings_home.png")
            .at(new Rect(1832, 30, 76, 66));
    public static final ImageTemplate INFO_LUCK_TAVERN = new ImageTemplate(
            "src/main/resources/images/info_luck_tavern.png").at(new Rect(358, 8, 52, 52));
    public static final ImageTemplate ARTIFACTS_TAVERN = new ImageTemplate(
            "src/main/resources/images/artifacts_tavern.png").at(new Rect(1752, 272, 116, 116));
    public static final ImageTemplate SACRED_CARDS_TAVERN = new ImageTemplate(
            "src/main/resources/images/sacred_cards_tavern.png").at(new Rect(1752, 460, 116, 108));
    public static final ImageTemplate SPEED_TAVERN = new ImageTemplate("src/main/resources/images/speed_tavern.png")
            .at(new Rect(1632, 910, 276, 62));
    public static final ImageTemplate BAG_TAVERN = new ImageTemplate("src/main/resources/images/bag_tavern.png")
            .at(new Rect(628, 950, 104, 106));
    public static final ImageTemplate CHAT_TAVERN = new ImageTemplate("src/main/resources/images/chat_tavern.png")
            .at(new Rect(462, 988, 76, 64));
    public static final ImageTemplate WHEEL_TAVERN = new ImageTemplate("src/main/resources/images/wheel_tavern.png")
            .at(new Rect(190, 610, 100, 90));
    public static final ImageTemplate DECK_TAVERN = new ImageTemplate("src/main/resources/images/deck_tavern.png")
            .at(new Rect(800, 300, 284, 404));
    public static final ImageTemplate TOTAL_BONUSES_INFO_LUCK = new ImageTemplate(
            "src/main/resources/images/total_bonuses_info_luck.png").at(new Rect(825, 220, 275, 42));
    public static final ImageTemplate CLOSE_INFO_LUCK = new ImageTemplate(
            "src/main/resources/images/close_info_luck.png").at(new Rect(1205, 112, 58, 58));
    public static final ImageTemplate HOW_TO_PLAY_TAVERN = new ImageTemplate(
            "src/main/resources/images/how_to_play_tavern.png").at(new Rect(565, 120, 260, 55));
    public static final ImageTemplate CLOSE_HELP_TAVERN = new ImageTemplate(
            "src/main/resources/images/close_help_tavern.png").at(new Rect(1400, 60, 76, 76));
    public static final ImageTemplate HELP_TEXT_TAVERN = new ImageTemplate(
            "src/main/resources/images/help_text_tavern.png").at(new Rect(560, 180, 200, 80));
    public static final ImageTemplate ARTIFACTS_TITLE = new ImageTemplate(
            "src/main/resources/images/artifacts_title.png").at(new Rect(250, 95, 490, 60));
    public static final ImageTemplate UPGRADE_ARTIFACTS = new ImageTemplate(
            "src/main/resources/images/upgrade_artifacts.png").at(new Rect(1015, 965, 300, 95));
    public static final ImageTemplate RARITY_ARTIFACTS = new ImageTemplate(
            "src/main/resources/images/rarity_artifacts.png").at(new Rect(1360, 965, 300, 95));
    public static final ImageTemplate ARTIFACT_CELL = new ImageTemplate("src/main/resources/images/artifact_cell.png")
            .at(new Rect(195, 190, 130, 130));
    public static final ImageTemplate ARTIFACTS_GRID = new ImageTemplate("src/main/resources/images/artifacts_grid.png")
            .at(new Rect(165, 600, 120, 120));
    public static final ImageTemplate ARTIFACT_UPGRADE_TITLE = new ImageTemplate(
            "src/main/resources/images/artifact_upgrade_title.png").at(new Rect(715, 155, 490, 48));
    public static final ImageTemplate CLOSE_ARTIFACT_UPGRADE = new ImageTemplate(
            "src/main/resources/images/close_artifact_upgrade.png").at(new Rect(1640, 150, 75, 75));
    public static final ImageTemplate UPGRADE_ARTIFACT_CONFIRM = new ImageTemplate(
            "src/main/resources/images/upgrade_artifact_confirm.png").at(new Rect(835, 365, 260, 120));
    public static final ImageTemplate ARTIFACT_RARITY_TITLE = new ImageTemplate(
            "src/main/resources/images/artifact_rarity_title.png").at(new Rect(740, 155, 440, 48));
    public static final ImageTemplate RARITY_ARTIFACT_CONFIRM = new ImageTemplate(
            "src/main/resources/images/rarity_artifact_confirm.png").at(new Rect(835, 360, 260, 125));
    public static final ImageTemplate GEMS_1000_MARKET = new ImageTemplate(
            "src/main/resources/images/gems_1000_market.png").at(new Rect(962, 617, 205, 58));
    public static final ImageTemplate GEMS_300_MARKET = new ImageTemplate(
            "src/main/resources/images/gems_300_market.png").at(new Rect(1287, 617, 268, 58));
    public static final ImageTemplate CLOSE_MARKET = new ImageTemplate("src/main/resources/images/close_market.png")
            .at(new Rect(1637, 237, 74, 74));
    public static final ImageTemplate REWARDS_TITLE_TAVERN = new ImageTemplate(
            "src/main/resources/images/rewards_title_tavern.png").at(new Rect(700, 52, 210, 58));
    public static final ImageTemplate CLOSE_REWARDS_TAVERN = new ImageTemplate(
            "src/main/resources/images/close_rewards_tavern.png").at(new Rect(1578, 38, 70, 70));
    public static final ImageTemplate TYPE_MESSAGE_CHAT = new ImageTemplate(
            "src/main/resources/images/type_message_chat.png").at(new Rect(44, 948, 286, 52));
    public static final ImageTemplate CLOSE_CHAT = new ImageTemplate("src/main/resources/images/close_chat.png")
            .at(new Rect(596, 24, 72, 72));
    public static final ImageTemplate ROOMS_CHAT = new ImageTemplate("src/main/resources/images/rooms_chat.png")
            .at(new Rect(276, 72, 144, 36));
    public static final ImageTemplate WORLD_CHAT = new ImageTemplate("src/main/resources/images/world_chat.png")
            .at(new Rect(676, 276, 68, 68));
    public static final ImageTemplate SEND_CHAT = new ImageTemplate("src/main/resources/images/send_chat.png")
            .at(new Rect(556, 936, 104, 94));
    public static final ImageTemplate SELECT_ROOM_TITLE_CHAT = new ImageTemplate(
            "src/main/resources/images/select_room_title_chat.png").at(new Rect(787, 72, 350, 50));
    public static final ImageTemplate CLOSE_ROOMS_CHAT = new ImageTemplate(
            "src/main/resources/images/close_rooms_chat.png").at(new Rect(1560, 67, 75, 75));
    public static final ImageTemplate ENGLISH_ROOM_CHAT = new ImageTemplate(
            "src/main/resources/images/english_room_chat.png").at(new Rect(335, 195, 290, 75));
    public static final ImageTemplate CONFIRM_ROOM_CHAT = new ImageTemplate(
            "src/main/resources/images/confirm_room_chat.png").at(new Rect(815, 915, 292, 72));
    public static final ImageTemplate ARENA_LEADERBOARDS = new ImageTemplate(
            "src/main/resources/images/arena_leaderboards.png").at(new Rect(108, 892, 345, 75));
    public static final ImageTemplate ARENA_CLOSE = new ImageTemplate("src/main/resources/images/arena_close.png")
            .at(new Rect(1825, 88, 70, 70));
    public static final ImageTemplate ARENA_RULES_TITLE = new ImageTemplate(
            "src/main/resources/images/arena_rules_title.png").at(new Rect(880, 170, 160, 50));
    public static final ImageTemplate ARENA_LEADERBOARDS_HEADER = new ImageTemplate(
            "src/main/resources/images/arena_leaderboards_header.png").at(new Rect(612, 112, 700, 45));
    public static final ImageTemplate ARENA_LEADERBOARDS_CLOSE = new ImageTemplate(
            "src/main/resources/images/arena_leaderboards_close.png").at(new Rect(1243, 13, 64, 64));
    public static final ImageTemplate BATTLE_LOG_TITLE = new ImageTemplate(
            "src/main/resources/images/battle_log_title.png").at(new Rect(860, 28, 200, 45));
    public static final ImageTemplate BATTLE_LOG_CLOSE = new ImageTemplate(
            "src/main/resources/images/battle_log_close.png").at(new Rect(1505, 18, 64, 64));
    public static final ImageTemplate BATTLE_LOG_INSPECT = new ImageTemplate(
            "src/main/resources/images/battle_log_inspect.png").at(new Rect(1325, 145, 85, 85));
    public static final ImageTemplate BATTLE_LOG_REPLAY = new ImageTemplate(
            "src/main/resources/images/battle_log_replay.png").at(new Rect(1445, 145, 85, 85));
    public static final ImageTemplate BATTLE_DETAILS_VS = new ImageTemplate(
            "src/main/resources/images/battle_details_vs.png").at(new Rect(912, 128, 96, 58));
    public static final ImageTemplate BATTLE_DETAILS_DEALT = new ImageTemplate(
            "src/main/resources/images/battle_details_dealt.png").at(new Rect(225, 420, 85, 85));
    public static final ImageTemplate BATTLE_DETAILS_TAKEN = new ImageTemplate(
            "src/main/resources/images/battle_details_taken.png").at(new Rect(225, 535, 85, 85));
    public static final ImageTemplate BATTLE_DETAILS_HEALING = new ImageTemplate(
            "src/main/resources/images/battle_details_healing.png").at(new Rect(225, 640, 85, 85));
    public static final ImageTemplate ARENA_SPEED = new ImageTemplate("src/main/resources/images/arena_speed.png")
            .at(new Rect(1722, 968, 156, 66));
    public static final ImageTemplate ARENA_FIGHT_CLOSE = new ImageTemplate(
            "src/main/resources/images/arena_fight_close.png").at(new Rect(1840, 15, 62, 62));
    public static final ImageTemplate ARENA_ROUND = new ImageTemplate("src/main/resources/images/arena_round.png")
            .at(new Rect(908, 10, 104, 30));
    public static final ImageTemplate CHOOSE_WAR_MACHINES_TITLE = new ImageTemplate(
            "src/main/resources/images/choose_war_machines_title.png").at(new Rect(1420, 40, 300, 75));
    public static final ImageTemplate SQUAD_SAVE_CHANGES = new ImageTemplate(
            "src/main/resources/images/squad_save_changes.png").at(new Rect(1025, 50, 255, 70));
    public static final ImageTemplate SQUAD_EDIT_HEROES = new ImageTemplate(
            "src/main/resources/images/squad_edit_heroes.png").at(new Rect(1218, 550, 70, 70));
    public static final ImageTemplate SELECT_CREW_TITLE = new ImageTemplate(
            "src/main/resources/images/select_crew_title.png").at(new Rect(830, 25, 260, 45));
    public static final ImageTemplate CREW_ARENA_ATTRIBUTES = new ImageTemplate(
            "src/main/resources/images/crew_arena_attributes.png").at(new Rect(65, 655, 300, 95));
    public static final ImageTemplate CREW_ORDER_DAMAGE = new ImageTemplate(
            "src/main/resources/images/crew_order_damage.png").at(new Rect(1512, 375, 90, 90));
    public static final ImageTemplate CREW_ORDER_HEALTH = new ImageTemplate(
            "src/main/resources/images/crew_order_health.png").at(new Rect(1637, 375, 90, 90));
    public static final ImageTemplate CREW_ORDER_ARMOR = new ImageTemplate(
            "src/main/resources/images/crew_order_armor.png").at(new Rect(1762, 375, 90, 90));
    public static final ImageTemplate CREW_INFO = new ImageTemplate("src/main/resources/images/crew_info.png")
            .at(new Rect(345, 82, 72, 72));
    public static final ImageTemplate CREW_BATTLE_ATTRIBUTES = new ImageTemplate(
            "src/main/resources/images/crew_battle_attributes.png").at(new Rect(65, 655, 300, 95));
    public static final ImageTemplate HERO_BONUSES_TITLE = new ImageTemplate(
            "src/main/resources/images/hero_bonuses_title.png").at(new Rect(470, 305, 290, 45));
    public static final ImageTemplate CREW_INFO_CLOSE = new ImageTemplate(
            "src/main/resources/images/crew_info_close.png").at(new Rect(1435, 263, 72, 72));
    public static final ImageTemplate ENGINEER_NAME = new ImageTemplate("src/main/resources/images/engineer_name.png")
            .at(new Rect(95, 32, 140, 38));
    public static final ImageTemplate INFO_ENGINEER = new ImageTemplate("src/main/resources/images/info_engineer.png")
            .at(new Rect(465, 20, 60, 55));
    public static final ImageTemplate ENGINEER_TAB_ENGINEER = new ImageTemplate(
            "src/main/resources/images/engineer_tab_engineer.png").at(new Rect(1085, 245, 80, 50));
    public static final ImageTemplate BATTLES_TAB_ENGINEER = new ImageTemplate(
            "src/main/resources/images/battles_tab_engineer.png").at(new Rect(1250, 225, 85, 70));
    public static final ImageTemplate STAR_TAB_ENGINEER = new ImageTemplate(
            "src/main/resources/images/star_tab_engineer.png").at(new Rect(1420, 225, 80, 70));
    public static final ImageTemplate SWIRL_TAB_ENGINEER = new ImageTemplate(
            "src/main/resources/images/swirl_tab_engineer.png").at(new Rect(1585, 225, 85, 70));
    public static final ImageTemplate CLAIM_ENGINEER = new ImageTemplate("src/main/resources/images/claim_engineer.png")
            .at(new Rect(1520, 690, 200, 60));
    public static final ImageTemplate GARAGE_ENGINEER = new ImageTemplate(
            "src/main/resources/images/garage_engineer.png").at(new Rect(100, 402, 85, 85));
    public static final ImageTemplate ENGINEER_INFO_TITLE = new ImageTemplate(
            "src/main/resources/images/engineer_info_title.png").at(new Rect(792, 196, 300, 48));
    public static final ImageTemplate CLOSE_ENGINEER_INFO = new ImageTemplate(
            "src/main/resources/images/close_engineer_info.png").at(new Rect(1768, 168, 64, 64));
    public static final ImageTemplate CHANGE_SQUAD_ENGINEER = new ImageTemplate(
            "src/main/resources/images/change_squad_engineer.png").at(new Rect(1240, 512, 260, 56));
    public static final ImageTemplate EDIT_SQUAD_ENGINEER = new ImageTemplate(
            "src/main/resources/images/edit_squad_engineer.png").at(new Rect(1660, 635, 95, 95));
    public static final ImageTemplate MACHINE_CARD_ENGINEER = new ImageTemplate(
            "src/main/resources/images/machine_card_engineer.png").at(new Rect(985, 630, 105, 75));
    public static final ImageTemplate SQUADS_TITLE = new ImageTemplate("src/main/resources/images/squads_title.png")
            .at(new Rect(893, 88, 134, 40));
    public static final ImageTemplate CLOSE_SQUADS = new ImageTemplate("src/main/resources/images/close_squads.png")
            .at(new Rect(1640, 80, 60, 60));
    public static final ImageTemplate EDIT_SQUADS = new ImageTemplate("src/main/resources/images/edit_squads.png")
            .at(new Rect(1110, 312, 240, 60));
    public static final ImageTemplate SET_ACTIVE_SQUADS = new ImageTemplate(
            "src/main/resources/images/set_active_squads.png").at(new Rect(1415, 607, 230, 58));
    public static final ImageTemplate EMPTY_SPOT_SQUADS = new ImageTemplate(
            "src/main/resources/images/empty_spot_squads.png").at(new Rect(340, 605, 112, 115));
    public static final ImageTemplate SET_ACTIVE_OFF_SQUADS = new ImageTemplate(
            "src/main/resources/images/set_active_off_squads.png").at(new Rect(1415, 835, 230, 58));
    public static final ImageTemplate FAVORED_TITLE = new ImageTemplate("src/main/resources/images/favored_title.png")
            .at(new Rect(660, 78, 600, 40));
    public static final ImageTemplate CLOSE_FAVORED = new ImageTemplate("src/main/resources/images/close_favored.png")
            .at(new Rect(1510, 62, 64, 64));
    public static final ImageTemplate SAVE_CHANGES_OFF_FAVORED = new ImageTemplate(
            "src/main/resources/images/save_changes_off_favored.png").at(new Rect(1232, 266, 206, 62));
    public static final ImageTemplate MACHINE_CARD_FAVORED = new ImageTemplate(
            "src/main/resources/images/machine_card_favored.png").at(new Rect(668, 545, 125, 118));
    public static final ImageTemplate INFO_GARAGE = new ImageTemplate("src/main/resources/images/info_garage.png")
            .at(new Rect(22, 22, 56, 56));
    public static final ImageTemplate STATS_TAB_GARAGE = new ImageTemplate(
            "src/main/resources/images/stats_tab_garage.png").at(new Rect(1080, 118, 80, 68));
    public static final ImageTemplate UPGRADE_TAB_GARAGE = new ImageTemplate(
            "src/main/resources/images/upgrade_tab_garage.png").at(new Rect(1238, 118, 105, 68));
    public static final ImageTemplate BLUEPRINT_TAB_GARAGE = new ImageTemplate(
            "src/main/resources/images/blueprint_tab_garage.png").at(new Rect(1408, 118, 100, 68));
    public static final ImageTemplate EMBLEM_TAB_GARAGE = new ImageTemplate(
            "src/main/resources/images/emblem_tab_garage.png").at(new Rect(1572, 116, 108, 70));
    public static final ImageTemplate ENGINEER_GARAGE = new ImageTemplate(
            "src/main/resources/images/engineer_garage.png").at(new Rect(100, 410, 95, 90));
    public static final ImageTemplate NEXT_MACHINE_GARAGE = new ImageTemplate(
            "src/main/resources/images/next_machine_garage.png").at(new Rect(765, 595, 55, 85));
    public static final ImageTemplate MACHINE_CARD_GARAGE = new ImageTemplate(
            "src/main/resources/images/machine_card_garage.png").at(new Rect(445, 965, 100, 70));
    public static final ImageTemplate UNKNOWN_CARD_GARAGE = new ImageTemplate(
            "src/main/resources/images/unknown_card_garage.png").at(new Rect(1356, 940, 124, 120));
    public static final ImageTemplate SHOW_ALL_GARAGE = new ImageTemplate(
            "src/main/resources/images/show_all_garage.png").at(new Rect(1505, 940, 126, 120));
    public static final ImageTemplate CHEST_GARAGE = new ImageTemplate("src/main/resources/images/chest_garage.png")
            .at(new Rect(20, 900, 200, 160));
    public static final ImageTemplate GARAGE_INFO_TITLE = new ImageTemplate(
            "src/main/resources/images/garage_info_title.png").at(new Rect(572, 248, 530, 40));
    public static final ImageTemplate CLOSE_GARAGE_INFO = new ImageTemplate(
            "src/main/resources/images/close_garage_info.png").at(new Rect(1335, 200, 62, 62));
    public static final ImageTemplate WORKSHOP_TITLE = new ImageTemplate("src/main/resources/images/workshop_title.png")
            .at(new Rect(850, 10, 220, 42));
    public static final ImageTemplate X1_WORKSHOP = new ImageTemplate("src/main/resources/images/x1_workshop.png")
            .at(new Rect(1772, 205, 105, 52));
    public static final ImageTemplate UPGRADE_WORKSHOP = new ImageTemplate(
            "src/main/resources/images/upgrade_workshop.png").at(new Rect(1240, 545, 270, 100));
    public static final ImageTemplate X5_WORKSHOP = new ImageTemplate("src/main/resources/images/x5_workshop.png")
            .at(new Rect(1772, 205, 105, 52));
    public static final ImageTemplate BLUEPRINTS_TITLE = new ImageTemplate(
            "src/main/resources/images/blueprints_title.png").at(new Rect(855, 10, 210, 42));
    public static final ImageTemplate UPGRADE_BLUEPRINTS = new ImageTemplate(
            "src/main/resources/images/upgrade_blueprints.png").at(new Rect(910, 562, 284, 100));
    public static final ImageTemplate MACHINE_RARITY_TITLE = new ImageTemplate(
            "src/main/resources/images/machine_rarity_title.png").at(new Rect(880, 10, 160, 42));
    public static final ImageTemplate INCREASE_RARITY_OFF_GARAGE = new ImageTemplate(
            "src/main/resources/images/increase_rarity_off_garage.png").at(new Rect(1240, 535, 272, 100));
    public static final ImageTemplate PREV_MACHINE_GARAGE = new ImageTemplate(
            "src/main/resources/images/prev_machine_garage.png").at(new Rect(152, 598, 52, 84));
    public static final ImageTemplate LOCKED_MACHINE_TEXT = new ImageTemplate(
            "src/main/resources/images/locked_machine_text.png").at(new Rect(565, 740, 790, 46));
    public static final ImageTemplate CLOSE_LOCKED_MACHINE = new ImageTemplate(
            "src/main/resources/images/close_locked_machine.png").at(new Rect(1545, 122, 62, 62));
    public static final ImageTemplate OWNED_CARD_ALL_MACHINES = new ImageTemplate(
            "src/main/resources/images/owned_card_all_machines.png").at(new Rect(152, 915, 130, 130));
    public static final ImageTemplate LOCKED_CARD_ALL_MACHINES = new ImageTemplate(
            "src/main/resources/images/locked_card_all_machines.png").at(new Rect(1212, 915, 130, 130));
    public static final ImageTemplate ALL_MACHINES_FRAME = new ImageTemplate(
            "src/main/resources/images/all_machines_frame.png").at(new Rect(70, 15, 130, 60));
    public static final ImageTemplate CLOSE_MAILBOX = new ImageTemplate("src/main/resources/images/close_mailbox.png")
            .at(new Rect(1622, 15, 62, 62));
    public static final ImageTemplate DELETE_MAILBOX = new ImageTemplate("src/main/resources/images/delete_mailbox.png")
            .at(new Rect(1572, 940, 76, 76));
    public static final ImageTemplate MAIL_ITEM_MAILBOX = new ImageTemplate(
            "src/main/resources/images/mail_item_mailbox.png").at(new Rect(275, 140, 85, 85));
    public static final ImageTemplate REWARD_GODDESS_TITLE = new ImageTemplate(
            "src/main/resources/images/reward_goddess_title.png").at(new Rect(925, 342, 240, 38));
    public static final ImageTemplate OK_REWARD = new ImageTemplate("src/main/resources/images/ok_reward.png")
            .at(new Rect(1052, 682, 266, 70));
    public static final ImageTemplate RARITY_WORD_TITLE = new ImageTemplate(
            "src/main/resources/images/rarity_word_title.png").at(new Rect(1045, 158, 130, 50));
    public static final ImageTemplate ACTIVE_SQUAD_TITLE = new ImageTemplate(
            "src/main/resources/images/active_squad_title.png").at(new Rect(1250, 318, 248, 52));
    public static final ImageTemplate FAVORED_TAB_TITLE = new ImageTemplate(
            "src/main/resources/images/favored_tab_title.png").at(new Rect(1168, 320, 412, 50));
    public static final ImageTemplate EDIT_FAVORED = new ImageTemplate("src/main/resources/images/edit_favored.png")
            .at(new Rect(1632, 498, 116, 114));
    public static final ImageTemplate CHAT_MAP_HOME = new ImageTemplate("src/main/resources/images/chat_map_home.png")
            .at(new Rect(6, 864, 64, 64));
    public static final ImageTemplate AUTO_ABILITIES_HOME = new ImageTemplate(
            "src/main/resources/images/auto_abilities_home.png").at(new Rect(772, 988, 52, 52));
    public static final ImageTemplate ORIGINAL_TIME_RESEARCH_NODE = new ImageTemplate(
            "src/main/resources/images/original_time_research_node.png").at(new Rect(712, 567, 196, 36));
    public static final ImageTemplate CLOSE_RESEARCH_NODE = new ImageTemplate(
            "src/main/resources/images/close_research_node.png").at(new Rect(1224, 169, 68, 68));
    public static final ImageTemplate COMPLETE_INSTANTLY_RESEARCH_NODE = new ImageTemplate(
            "src/main/resources/images/complete_instantly_research_node.png").at(new Rect(975, 668, 315, 118));
    public static final ImageTemplate SCARAB_CHOICE_TOWN = new ImageTemplate(
            "src/main/resources/images/scarab_choice_town.png").at(new Rect(995, 420, 330, 300));
    public static final ImageTemplate MISSION_REWARDS_TITLE = new ImageTemplate(
            "src/main/resources/images/mission_rewards_title.png").at(new Rect(755, 330, 410, 48));
    public static final ImageTemplate SPEED_X10_TAVERN = new ImageTemplate(
            "src/main/resources/images/speed_x10_tavern.png").at(new Rect(1728, 920, 80, 44));
    public static final ImageTemplate SPEED_X50_TAVERN = new ImageTemplate(
            "src/main/resources/images/speed_x50_tavern.png").at(new Rect(1728, 920, 80, 44));
    private Pictures() {}
}
