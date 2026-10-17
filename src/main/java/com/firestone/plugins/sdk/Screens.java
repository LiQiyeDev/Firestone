package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.geometry.Point;
import com.botmaker.sdk.api.input.Key;
import com.botmaker.sdk.api.screens.Button;
import com.botmaker.sdk.api.screens.Hotkey;
import com.botmaker.sdk.api.screens.Look;
import com.botmaker.sdk.api.screens.Reached;
import com.botmaker.sdk.api.screens.Screen;
import com.botmaker.sdk.api.screens.Scroll;
import com.botmaker.sdk.api.screens.Setup;
import com.botmaker.sdk.api.screens.State;
import com.botmaker.sdk.api.screens.Strip;
import com.botmaker.sdk.api.screens.Way;

import java.util.List;
import java.time.Duration;

/**
 * Values com.botmaker.sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {

    public static final class OfflineProgress extends Screen {
        public final Button claimOffline = Button.of(Pictures.CLAIM_OFFLINE);

        @Override
        public Setup setup() {
            return Setup.named("Offline progress").markers(List.of(Pictures.OFFLINE_PROGRESS_TITLE))
                    .back(OFFLINE_PROGRESS.claimOffline).popup().at(new Point(0, 2394));
        }
    }

    public static final OfflineProgress OFFLINE_PROGRESS = new OfflineProgress();

    public static final class Home extends Screen {
        public final Button tavernHome = Button.of(Pictures.TAVERN_HOME).sometimes();
        public final Button arenaHome = Button.of(Pictures.ARENA_HOME).sometimes();
        public final Button engineerHome = Button.of(Pictures.ENGINEER_HOME).sometimes();
        public final Button campaignHome = Button.of(Pictures.CAMPAIGN_HOME).sometimes();
        public final Button warMachinesHome = Button.of(Pictures.WAR_MACHINES_HOME).sometimes();
        public final Button mailHome = Button.of(Pictures.MAIL_HOME);
        public final Button townHome = Button.of(Pictures.TOWN_HOME);
        public final Button map = Button.of(Pictures.MAP);
        public final Button guild = Button.of(Pictures.GUILD);
        public final Button market = Button.of(Pictures.MARKET);
        public final Button battle = Button.of(Pictures.BATTLE);
        public final Button battlePassHome = Button.of(Pictures.BATTLE_PASS_HOME);
        public final Button eventsHome = Button.of(Pictures.EVENTS_HOME);
        public final Button upgrades = Button.of(Pictures.UPGRADES);
        public final Button bag = Button.of(Pictures.BAG);
        public final Button fellowship = Button.of(Pictures.FELLOWSHIP);
        public final Button party = Button.of(Pictures.PARTY);
        public final Button cardHome = Button.of(Pictures.CARD_HOME).sometimes();
        public final Button parchmentHome = Button.of(Pictures.PARCHMENT_HOME).sometimes();
        public final Button potionHome = Button.of(Pictures.POTION_HOME).sometimes();
        public final Button scrollBootHome = Button.of(Pictures.SCROLL_BOOT_HOME).sometimes();
        public final Button libraryHome = Button.of(Pictures.LIBRARY_HOME).sometimes();
        public final Button guardiansHome = Button.of(Pictures.GUARDIANS_HOME).sometimes();
        public final Button avatarHome = Button.of(Pictures.AVATAR_HOME);
        public final Button prevStageHome = Button.of(Pictures.PREV_STAGE_HOME).tried();
        public final Button settingsHome = Button.of(Pictures.SETTINGS_HOME);
        public final Button chatMapHome = Button.of(Pictures.CHAT_MAP_HOME);
        public final Button autoAbilitiesHome = Button.of(Pictures.AUTO_ABILITIES_HOME).tried();
        public final Hotkey keyQ = Hotkey.of(Key.Q);
        public final Strip column = Strip.of(Scroll.wheel(-5).step(125).settle(Duration.ofMillis(1600L)),
                List.of(Pictures.TAVERN_HOME, Pictures.ARENA_HOME, Pictures.ENGINEER_HOME, Pictures.CAMPAIGN_HOME,
                        Pictures.WAR_MACHINES_HOME, Pictures.CARD_HOME, Pictures.PARCHMENT_HOME, Pictures.POTION_HOME,
                        Pictures.SCROLL_BOOT_HOME, Pictures.LIBRARY_HOME, Pictures.GUARDIANS_HOME))
                .tried();
        @Override
        public Setup setup() {
            return Setup.named("Home").markers(List.of(Pictures.TOWN_HOME)).at(new Point(0, 1326));
        }
    }

    public static final Home HOME = new Home();

    public static final class Town extends Screen {
        public final Button tavernTown = Button.of(Pictures.TAVERN_TOWN);
        public final Button libraryTown = Button.of(Pictures.LIBRARY_TOWN);
        public final Button battlesTown = Button.of(Pictures.BATTLES_TOWN);
        public final Button alchemistTown = Button.of(Pictures.ALCHEMIST_TOWN);
        public final Button templeTown = Button.of(Pictures.TEMPLE_TOWN);
        public final Button magicQuarterTown = Button.of(Pictures.MAGIC_QUARTER_TOWN);
        public final Button engineerTown = Button.of(Pictures.ENGINEER_TOWN);
        public final Button marketTown = Button.of(Pictures.MARKET_TOWN);
        public final Button hallOfHeroesTown = Button.of(Pictures.HALL_OF_HEROES_TOWN);
        public final Button guildTown = Button.of(Pictures.GUILD_TOWN);
        public final Button leaderboardsTown = Button.of(Pictures.LEADERBOARDS_TOWN);
        public final Button pirateShipTown = Button.of(Pictures.PIRATE_SHIP_TOWN);
        public final Button exoticMerchantTown = Button.of(Pictures.EXOTIC_MERCHANT_TOWN);
        public final Button backTown = Button.of(Pictures.BACK_TOWN);
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Town").markers(List.of(Pictures.TITLE_TOWN)).from(HOME.townHome)
                    .back(TOWN.closeTown);
        }
    }

    public static final Town TOWN = new Town();

    public static final class TavernChoice extends Screen {
        public final Button tavernChoiceTown = Button.of(Pictures.TAVERN_CHOICE_TOWN);
        public final Button closeGarageInfo = Button.of(Pictures.CLOSE_GARAGE_INFO);

        @Override
        public Setup setup() {
            return Setup.named("Tavern choice").markers(List.of(Pictures.SCARAB_CHOICE_TOWN)).from(TOWN.tavernTown)
                    .back(TAVERN_CHOICE.closeGarageInfo);
        }
    }

    public static final TavernChoice TAVERN_CHOICE = new TavernChoice();

    public static final class Tavern extends Screen {
        public final Button infoLuckTavern = Button.of(Pictures.INFO_LUCK_TAVERN);
        public final Button artifactsTavern = Button.of(Pictures.ARTIFACTS_TAVERN);
        public final Button sacredCardsTavern = Button.of(Pictures.SACRED_CARDS_TAVERN).tried();
        public final Button speedTavern = Button.cycling(List.of(Pictures.SPEED_TAVERN, Pictures.SPEED_X10_TAVERN,
                Pictures.SPEED_X50_TAVERN)).tried();
        public final Button bagTavern = Button.of(Pictures.BAG_TAVERN);
        public final Button chatTavern = Button.of(Pictures.CHAT_TAVERN);
        public final Button wheelTavern = Button.of(Pictures.WHEEL_TAVERN).tried();
        public final Button deckTavern = Button.of(Pictures.DECK_TAVERN).tried();
        public final Button playTavern = Button.of(Pictures.PLAY_TAVERN).tried()
                .looks(List.of(Look.of(Pictures.PLAY_OFF_TAVERN, State.DISABLED)));
        public final Button manualTavern = Button.of(Pictures.MANUAL_TAVERN).tried();
        public final Button marketTavern = Button.of(Pictures.MARKET_TAVERN);
        public final Button infoMap = Button.of(Pictures.INFO_MAP);
        public final Button gemsPlusMap = Button.of(Pictures.GEMS_PLUS_MAP).never("spends gems");
        public final Button cardTavern = Button.of(Pictures.CARD_TAVERN).tried().sometimes().repeated();
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Tavern").markers(List.of(Pictures.TAVERN_LUCK_TITLE)).from(HOME.tavernHome)
                    .alsoFrom(List.of(Way.of(TAVERN_CHOICE.tavernChoiceTown))).back(TAVERN.closeTown).notes("""
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
                            """).reached(Reached.SURVEYED).at(new Point(340, 389));
        }
    }

    public static final Tavern TAVERN = new Tavern();

    public static final class InfoLuck extends Screen {
        public final Button closeInfoLuck = Button.of(Pictures.CLOSE_INFO_LUCK);

        @Override
        public Setup setup() {
            return Setup.named("Info luck").markers(List.of(Pictures.TOTAL_BONUSES_INFO_LUCK))
                    .from(TAVERN.infoLuckTavern).back(INFO_LUCK.closeInfoLuck).at(new Point(680, 0));
        }
    }

    public static final InfoLuck INFO_LUCK = new InfoLuck();

    public static final class InfoMap extends Screen {
        public final Strip helpTextTavernStrip = Strip.of(Scroll.wheel(-10), List.of(Pictures.HELP_TEXT_TAVERN))
                .tried().info();
        public final Button closeHelpTavern = Button.of(Pictures.CLOSE_HELP_TAVERN);

        @Override
        public Setup setup() {
            return Setup.named("Info map").markers(List.of(Pictures.HOW_TO_PLAY_TAVERN)).from(TAVERN.infoMap)
                    .back(INFO_MAP.closeHelpTavern).at(new Point(680, 103));
        }
    }

    public static final InfoMap INFO_MAP = new InfoMap();

    public static final class Artifacts extends Screen {
        public final Button upgradeArtifacts = Button.of(Pictures.UPGRADE_ARTIFACTS);
        public final Button rarityArtifacts = Button.of(Pictures.RARITY_ARTIFACTS);
        public final Button artifactCell = Button.of(Pictures.ARTIFACT_CELL).tried();
        public final Strip artifactsGridStrip = Strip.of(Scroll.wheel(-10), List.of(Pictures.ARTIFACTS_GRID))
                .tried();
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Artifacts").markers(List.of(Pictures.ARTIFACTS_TITLE)).from(TAVERN.artifactsTavern)
                    .back(ARTIFACTS.closeTown).at(new Point(680, 206));
        }
    }

    public static final Artifacts ARTIFACTS = new Artifacts();

    public static final class Upgrade extends Screen {
        public final Button upgradeArtifactConfirm = Button.of(Pictures.UPGRADE_ARTIFACT_CONFIRM).tried();
        public final Button closeArtifactUpgrade = Button.of(Pictures.CLOSE_ARTIFACT_UPGRADE);

        @Override
        public Setup setup() {
            return Setup.named("Upgrade").markers(List.of(Pictures.ARTIFACT_UPGRADE_TITLE))
                    .from(ARTIFACTS.upgradeArtifacts).back(UPGRADE.closeArtifactUpgrade).at(new Point(1020, 155));
        }
    }

    public static final Upgrade UPGRADE = new Upgrade();

    public static final class Rarity extends Screen {
        public final Button rarityArtifactConfirm = Button.of(Pictures.RARITY_ARTIFACT_CONFIRM).tried();
        public final Button closeArtifactUpgrade = Button.of(Pictures.CLOSE_ARTIFACT_UPGRADE);

        @Override
        public Setup setup() {
            return Setup.named("Rarity").markers(List.of(Pictures.RARITY_WORD_TITLE)).from(ARTIFACTS.rarityArtifacts)
                    .back(RARITY.closeArtifactUpgrade).at(new Point(1020, 258));
        }
    }

    public static final Rarity RARITY = new Rarity();

    public static final class Market extends Screen {
        public final Button beerBuyTavern = Button.of(Pictures.BEER_BUY_TAVERN).tried()                .looks(List.of(Look.of(Pictures.BEER_BUY_OFF_TAVERN, State.DISABLED)));
        public final Button gems1000Market = Button.of(Pictures.GEMS_1000_MARKET).never("spends gems");
        public final Button gems300Market = Button.of(Pictures.GEMS_300_MARKET).never("spends gems");
        public final Button closeMarket = Button.of(Pictures.CLOSE_MARKET);

        @Override
        public Setup setup() {
            return Setup.named("Market").markers(List.of(Pictures.MARKET_TITLE_TAVERN)).from(TAVERN.marketTavern)
                    .back(MARKET.closeMarket).at(new Point(680, 309));
        }
    }

    public static final Market MARKET = new Market();

    public static final class Bag extends Screen {
        public final Button closeRewardsTavern = Button.of(Pictures.CLOSE_REWARDS_TAVERN);

        @Override
        public Setup setup() {
            return Setup.named("Bag").markers(List.of(Pictures.REWARDS_TITLE_TAVERN)).from(TAVERN.bagTavern)
                    .back(BAG.closeRewardsTavern).at(new Point(680, 551));
        }
    }

    public static final Bag BAG = new Bag();

    public static final class Chat extends Screen {
        public final Button roomsChat = Button.of(Pictures.ROOMS_CHAT);
        public final Button worldChat = Button.of(Pictures.WORLD_CHAT).tried();
        public final Button sendChat = Button.of(Pictures.SEND_CHAT).never("posts to other players");
        public final Button closeChat = Button.of(Pictures.CLOSE_CHAT);

        @Override
        public Setup setup() {
            return Setup.named("Chat").markers(List.of(Pictures.TYPE_MESSAGE_CHAT)).from(TAVERN.chatTavern)
                    .back(CHAT.closeChat).at(new Point(680, 793));
        }
    }

    public static final Chat CHAT = new Chat();

    public static final class Rooms extends Screen {
        public final Button englishRoomChat = Button.of(Pictures.ENGLISH_ROOM_CHAT).tried();
        public final Button confirmRoomChat = Button.of(Pictures.CONFIRM_ROOM_CHAT).leaves();
        public final Button closeRoomsChat = Button.of(Pictures.CLOSE_ROOMS_CHAT);

        @Override
        public Setup setup() {
            return Setup.named("Rooms").markers(List.of(Pictures.SELECT_ROOM_TITLE_CHAT)).from(CHAT.roomsChat)
                    .back(ROOMS.closeRoomsChat).at(new Point(1020, 793));
        }
    }

    public static final Rooms ROOMS = new Rooms();

    public static final class Arena extends Screen {
        public final Button arenaRefresh = Button.of(Pictures.ARENA_REFRESH).tried();
        public final Button arenaFight = Button.of(Pictures.ARENA_FIGHT);
        public final Button arenaBattleLog = Button.of(Pictures.ARENA_BATTLE_LOG);
        public final Button arenaEditSquad = Button.of(Pictures.ARENA_EDIT_SQUAD);
        public final Button infoMap = Button.of(Pictures.INFO_MAP).info();
        public final Button arenaLeaderboards = Button.of(Pictures.ARENA_LEADERBOARDS);
        public final Button arenaClose = Button.of(Pictures.ARENA_CLOSE);

        @Override
        public Setup setup() {
            return Setup.named("Arena").markers(List.of(Pictures.ARENA_TITLE)).from(HOME.arenaHome)
                    .back(ARENA.arenaClose).at(new Point(340, 1459));
        }
    }

    public static final Arena ARENA = new Arena();

    public static final class ArenaInfo extends Screen {
        public final Button closeRoomsChat = Button.of(Pictures.CLOSE_ROOMS_CHAT);

        @Override
        public Setup setup() {
            return Setup.named("Arena info").markers(List.of(Pictures.ARENA_RULES_TITLE)).from(ARENA.infoMap)
                    .back(ARENA_INFO.closeRoomsChat).at(new Point(680, 1035));
        }
    }

    public static final ArenaInfo ARENA_INFO = new ArenaInfo();

    public static final class ArenaLeaderboards extends Screen {
        public final Button arenaLeaderboardsClose = Button.of(Pictures.ARENA_LEADERBOARDS_CLOSE);

        @Override
        public Setup setup() {
            return Setup.named("Arena leaderboards").markers(List.of(Pictures.ARENA_LEADERBOARDS_HEADER))
                    .from(ARENA.arenaLeaderboards).back(ARENA_LEADERBOARDS.arenaLeaderboardsClose)
                    .at(new Point(680, 1277));
        }
    }

    public static final ArenaLeaderboards ARENA_LEADERBOARDS = new ArenaLeaderboards();

    public static final class ArenaBattleLog extends Screen {
        public final Button battleLogInspect = Button.of(Pictures.BATTLE_LOG_INSPECT).info();
        public final Button battleLogReplay = Button.of(Pictures.BATTLE_LOG_REPLAY).info();
        public final Button battleLogClose = Button.of(Pictures.BATTLE_LOG_CLOSE);

        @Override
        public Setup setup() {
            return Setup.named("Arena battle log").markers(List.of(Pictures.BATTLE_LOG_TITLE))
                    .from(ARENA.arenaBattleLog).back(ARENA_BATTLE_LOG.battleLogClose).at(new Point(680, 1519));
        }
    }

    public static final ArenaBattleLog ARENA_BATTLE_LOG = new ArenaBattleLog();

    public static final class BattleDetails extends Screen {
        public final Button battleDetailsDealt = Button.of(Pictures.BATTLE_DETAILS_DEALT).tried();
        public final Button battleDetailsTaken = Button.of(Pictures.BATTLE_DETAILS_TAKEN).tried();
        public final Button battleDetailsHealing = Button.of(Pictures.BATTLE_DETAILS_HEALING).tried();
        public final Button closeRoomsChat = Button.of(Pictures.CLOSE_ROOMS_CHAT);

        @Override
        public Setup setup() {
            return Setup.named("Battle details").markers(List.of(Pictures.BATTLE_DETAILS_VS))
                    .from(ARENA_BATTLE_LOG.battleLogInspect).back(BATTLE_DETAILS.closeRoomsChat)
                    .at(new Point(1020, 1398));
        }
    }

    public static final BattleDetails BATTLE_DETAILS = new BattleDetails();

    public static final class ArenaReplay extends Screen {
        public final Button arenaSpeed = Button.of(Pictures.ARENA_SPEED).leaves();
        public final Button arenaFightClose = Button.of(Pictures.ARENA_FIGHT_CLOSE);

        @Override
        public Setup setup() {
            return Setup.named("Arena replay").markers(List.of(Pictures.ARENA_ROUND))
                    .from(ARENA_BATTLE_LOG.battleLogReplay).alsoFrom(List.of(Way.of(ARENA.arenaFight)))
                    .back(ARENA_REPLAY.arenaFightClose).at(new Point(1020, 1640));
        }
    }

    public static final ArenaReplay ARENA_REPLAY = new ArenaReplay();

    public static final class Garage extends Screen {
        public final Button infoGarage = Button.of(Pictures.INFO_GARAGE).info();
        public final Button statsTabGarage = Button.of(Pictures.STATS_TAB_GARAGE).tried().info();
        public final Button upgradeTabGarage = Button.of(Pictures.UPGRADE_TAB_GARAGE);
        public final Button blueprintTabGarage = Button.of(Pictures.BLUEPRINT_TAB_GARAGE);
        public final Button emblemTabGarage = Button.of(Pictures.EMBLEM_TAB_GARAGE);
        public final Button engineerGarage = Button.of(Pictures.ENGINEER_GARAGE);
        public final Button nextMachineGarage = Button.of(Pictures.NEXT_MACHINE_GARAGE).tried()
                .info();
        public final Button machineCardGarage = Button.of(Pictures.MACHINE_CARD_GARAGE).tried()
                .info();
        public final Button unknownCardGarage = Button.of(Pictures.UNKNOWN_CARD_GARAGE).info();
        public final Button showAllGarage = Button.of(Pictures.SHOW_ALL_GARAGE).info();
        public final Button chestGarage = Button.of(Pictures.CHEST_GARAGE).tried();
        public final Button prevMachineGarage = Button.of(Pictures.PREV_MACHINE_GARAGE).tried()
                .info().sometimes();
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Garage").markers(List.of(Pictures.GARAGE_TITLE)).from(HOME.warMachinesHome)
                    .back(GARAGE.closeTown).notes("""
                            Garage (Home's wrench, war_machines_home) shows one war machine at a time; arrows or the bottom cards pick another.
                            Each tab has its own title, mapped as its own screen with the book tab as its way back: Workshop (components, Upgrade needs screws, cogs and metal), Blueprints (titled Upgrades: damage/health/armor levels, Upgrade spends blueprints; x1/x5 multiplier), Machine rarity (titled Rarity: Increase rarity spends 10 000 tools, needs machine level 10).
                            Machine cards carry a red bell badge when an upgrade is affordable.
                            The ? card opens Locked machine: unlock new machines with arcane conduits from jewel chests. Show all lists every machine, owned or locked.
                            Components come from jewel chests.\
                            """).reached(Reached.SURVEYED);
        }
    }

    public static final Garage GARAGE = new Garage();

    public static final class Engineer extends Screen {
        public final Button infoEngineer = Button.of(Pictures.INFO_ENGINEER).info();
        public final Button engineerTabEngineer = Button.of(Pictures.ENGINEER_TAB_ENGINEER).tried()
                .info();
        public final Button battlesTabEngineer = Button.of(Pictures.BATTLES_TAB_ENGINEER).info();
        public final Button starTabEngineer = Button.of(Pictures.STAR_TAB_ENGINEER).info();
        public final Button swirlTabEngineer = Button.of(Pictures.SWIRL_TAB_ENGINEER).tried()
                .info();
        public final Button claimEngineer = Button.of(Pictures.CLAIM_ENGINEER).tried()                .sometimes();
        public final Button garageEngineer = Button.of(Pictures.GARAGE_ENGINEER).leaves();
        public final Button gemsPlusMap = Button.of(Pictures.GEMS_PLUS_MAP)                .never("buys tools with gems");
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Engineer").markers(List.of(Pictures.ENGINEER_NAME)).from(HOME.engineerHome)
                    .alsoFrom(List.of(Way.of(GARAGE.engineerGarage))).back(ENGINEER.closeTown).notes("""
                            Engineer produces tools every 6 hours; Claim (claim_engineer) collects them, then disappears until the next batch.
                            Home shows engineer_home (blue helmet, left column) only while tools wait to be claimed; Garage's Engineer button reaches it always.
                            Engineer level comes from war machine levels (100 XP per machine level); it raises all war machines' attributes and tool production.
                            Tabs: Engineer (bonus + Claim), Active squad (Change squad, Edit), Favored war machines (80% of jewel-chest components go to the 5 favored), Arcane conduits (collect Chaos turbine / Energy core / Mana reactor from jewel chests to unlock a new war machine).
                            Tools (top right, 7 166) buy war machine rarity in Garage; the + buys tools with gems: never.\
                            """).reached(Reached.SURVEYED).at(new Point(340, 2124));
        }
    }

    public static final Engineer ENGINEER = new Engineer();

    public static final class ActiveSquad extends Screen {
        public final Button changeSquadEngineer = Button.of(Pictures.CHANGE_SQUAD_ENGINEER);
        public final Button editSquadEngineer = Button.of(Pictures.EDIT_SQUAD_ENGINEER);
        public final Button machineCardEngineer = Button.of(Pictures.MACHINE_CARD_ENGINEER).tried()
                .info();
        public final Button engineerTabEngineer = Button.of(Pictures.ENGINEER_TAB_ENGINEER);

        @Override
        public Setup setup() {
            return Setup.named("Active squad").markers(List.of(Pictures.ACTIVE_SQUAD_TITLE))
                    .from(ENGINEER.battlesTabEngineer).back(ACTIVE_SQUAD.engineerTabEngineer);
        }
    }

    public static final ActiveSquad ACTIVE_SQUAD = new ActiveSquad();

    public static final class ArenaSquad extends Screen {
        public final Button squadSaveChanges = Button.of(Pictures.SQUAD_SAVE_CHANGES).tried();
        public final Button squadEditHeroes = Button.of(Pictures.SQUAD_EDIT_HEROES);
        public final Button closeX = Button.of(Pictures.CLOSE_X);

        @Override
        public Setup setup() {
            return Setup.named("Arena squad").markers(List.of(Pictures.CHOOSE_WAR_MACHINES_TITLE))
                    .from(ARENA.arenaEditSquad).alsoFrom(List.of(Way.of(ACTIVE_SQUAD.editSquadEngineer)))
                    .back(ARENA_SQUAD.closeX).at(new Point(1352, 2044));
        }
    }

    public static final ArenaSquad ARENA_SQUAD = new ArenaSquad();

    public static final class SquadHeroes extends Screen {
        public final Button crewArenaAttributes = Button.of(Pictures.CREW_ARENA_ATTRIBUTES).tried()
                .looks(List.of(Look.of(Pictures.CREW_BATTLE_ATTRIBUTES, State.SELECTED)));
        public final Button crewOrderDamage = Button.of(Pictures.CREW_ORDER_DAMAGE).tried();
        public final Button crewOrderHealth = Button.of(Pictures.CREW_ORDER_HEALTH).tried();
        public final Button crewOrderArmor = Button.of(Pictures.CREW_ORDER_ARMOR).tried();
        public final Button crewInfo = Button.of(Pictures.CREW_INFO).info();
        public final Button closeX = Button.of(Pictures.CLOSE_X);

        @Override
        public Setup setup() {
            return Setup.named("Squad heroes").markers(List.of(Pictures.SELECT_CREW_TITLE))
                    .from(ARENA_SQUAD.squadEditHeroes).back(SQUAD_HEROES.closeX).at(new Point(1692, 2044));
        }
    }

    public static final SquadHeroes SQUAD_HEROES = new SquadHeroes();

    public static final class CrewInfo extends Screen {
        public final Button crewInfoClose = Button.of(Pictures.CREW_INFO_CLOSE);

        @Override
        public Setup setup() {
            return Setup.named("Crew info").markers(List.of(Pictures.HERO_BONUSES_TITLE)).from(SQUAD_HEROES.crewInfo)
                    .back(CREW_INFO.crewInfoClose).at(new Point(2032, 2044));
        }
    }

    public static final CrewInfo CREW_INFO = new CrewInfo();

    public static final class EngineerInfo extends Screen {
        public final Button closeEngineerInfo = Button.of(Pictures.CLOSE_ENGINEER_INFO);

        @Override
        public Setup setup() {
            return Setup.named("Engineer info").markers(List.of(Pictures.ENGINEER_INFO_TITLE))
                    .from(ENGINEER.infoEngineer).back(ENGINEER_INFO.closeEngineerInfo).at(new Point(1352, 2286));
        }
    }

    public static final EngineerInfo ENGINEER_INFO = new EngineerInfo();

    public static final class ChangeSquad extends Screen {
        public final Button editSquads = Button.of(Pictures.EDIT_SQUADS).leaves();
        public final Button setActiveSquads = Button.of(Pictures.SET_ACTIVE_SQUADS)                .never("switches the player's active squad")
                .looks(List.of(Look.of(Pictures.SET_ACTIVE_OFF_SQUADS, State.DISABLED)));
        public final Button emptySpotSquads = Button.of(Pictures.EMPTY_SPOT_SQUADS).tried();
        public final Button closeSquads = Button.of(Pictures.CLOSE_SQUADS);

        @Override
        public Setup setup() {
            return Setup.named("Squads").markers(List.of(Pictures.SQUADS_TITLE)).from(ACTIVE_SQUAD.changeSquadEngineer)
                    .back(CHANGE_SQUAD.closeSquads);
        }
    }

    public static final ChangeSquad CHANGE_SQUAD = new ChangeSquad();

    public static final class FavoredWarMachines2 extends Screen {
        public final Button editFavored = Button.of(Pictures.EDIT_FAVORED);
        public final Button engineerTabEngineer = Button.of(Pictures.ENGINEER_TAB_ENGINEER);

        @Override
        public Setup setup() {
            return Setup.named("Favored war machines").markers(List.of(Pictures.FAVORED_TAB_TITLE))
                    .from(ENGINEER.starTabEngineer).back(FAVORED_WAR_MACHINES_2.engineerTabEngineer);
        }
    }

    public static final FavoredWarMachines2 FAVORED_WAR_MACHINES_2 = new FavoredWarMachines2();

    public static final class FavoredWarMachines extends Screen {
        public final Button saveChangesOffFavored = Button.of(Pictures.SAVE_CHANGES_OFF_FAVORED).tried();
        public final Button machineCardFavored = Button.of(Pictures.MACHINE_CARD_FAVORED)                .never("changes which war machines the player favours");
        public final Button closeFavored = Button.of(Pictures.CLOSE_FAVORED);

        @Override
        public Setup setup() {
            return Setup.named("Select the favored war machines").markers(List.of(Pictures.FAVORED_TITLE))
                    .from(FAVORED_WAR_MACHINES_2.editFavored).back(FAVORED_WAR_MACHINES.closeFavored);
        }
    }

    public static final FavoredWarMachines FAVORED_WAR_MACHINES = new FavoredWarMachines();

    public static final class GarageInfo extends Screen {
        public final Button closeGarageInfo = Button.of(Pictures.CLOSE_GARAGE_INFO);

        @Override
        public Setup setup() {
            return Setup.named("Garage info").markers(List.of(Pictures.GARAGE_INFO_TITLE)).from(GARAGE.infoGarage)
                    .back(GARAGE_INFO.closeGarageInfo);
        }
    }

    public static final GarageInfo GARAGE_INFO = new GarageInfo();

    public static final class UpgradeTab extends Screen {
        public final Button x1Workshop = Button.of(Pictures.X1_WORKSHOP).tried()                .looks(List.of(Look.of(Pictures.X5_WORKSHOP, State.SELECTED)));
        public final Button upgradeWorkshop = Button.of(Pictures.UPGRADE_WORKSHOP).tried();
        public final Button statsTabGarage = Button.of(Pictures.STATS_TAB_GARAGE);

        @Override
        public Setup setup() {
            return Setup.named("Workshop").markers(List.of(Pictures.WORKSHOP_TITLE)).from(GARAGE.upgradeTabGarage)
                    .back(UPGRADE_TAB.statsTabGarage);
        }
    }

    public static final UpgradeTab UPGRADE_TAB = new UpgradeTab();

    public static final class Blueprints extends Screen {
        public final Button x1Workshop = Button.of(Pictures.X1_WORKSHOP).tried();
        public final Button upgradeBlueprints = Button.of(Pictures.UPGRADE_BLUEPRINTS).tried();
        public final Button statsTabGarage = Button.of(Pictures.STATS_TAB_GARAGE);

        @Override
        public Setup setup() {
            return Setup.named("Blueprints").markers(List.of(Pictures.BLUEPRINTS_TITLE))
                    .from(GARAGE.blueprintTabGarage).back(BLUEPRINTS.statsTabGarage);
        }
    }

    public static final Blueprints BLUEPRINTS = new Blueprints();

    public static final class Emblems extends Screen {
        public final Button gemsPlusMap = Button.of(Pictures.GEMS_PLUS_MAP)                .never("buys tools with gems");
        public final Button increaseRarityOffGarage = Button.of(Pictures.INCREASE_RARITY_OFF_GARAGE)
                .tried();
        public final Button statsTabGarage = Button.of(Pictures.STATS_TAB_GARAGE);

        @Override
        public Setup setup() {
            return Setup.named("Machine rarity").markers(List.of(Pictures.MACHINE_RARITY_TITLE))
                    .from(GARAGE.emblemTabGarage).back(EMBLEMS.statsTabGarage);
        }
    }

    public static final Emblems EMBLEMS = new Emblems();

    public static final class LockedMachine extends Screen {
        public final Button closeLockedMachine = Button.of(Pictures.CLOSE_LOCKED_MACHINE);

        @Override
        public Setup setup() {
            return Setup.named("Locked machine").markers(List.of(Pictures.LOCKED_MACHINE_TEXT))
                    .from(GARAGE.unknownCardGarage).back(LOCKED_MACHINE.closeLockedMachine);
        }
    }

    public static final LockedMachine LOCKED_MACHINE = new LockedMachine();

    public static final class AllWarMachines extends Screen {
        public final Button ownedCardAllMachines = Button.of(Pictures.OWNED_CARD_ALL_MACHINES).tried()
                .info();
        public final Button lockedCardAllMachines = Button.of(Pictures.LOCKED_CARD_ALL_MACHINES).tried()
                .info();
        public final Strip ownedCardAllMachinesStrip = Strip.of(Scroll.wheel(-10),
                List.of(Pictures.OWNED_CARD_ALL_MACHINES)).tried();
        public final Button closeX = Button.of(Pictures.CLOSE_X);

        @Override
        public Setup setup() {
            return Setup.named("All war machines").markers(List.of(Pictures.ALL_MACHINES_FRAME))
                    .from(GARAGE.showAllGarage).back(ALL_WAR_MACHINES.closeX);
        }
    }

    public static final AllWarMachines ALL_WAR_MACHINES = new AllWarMachines();

    public static final class Mailbox extends Screen {
        public final Button deleteMailbox = Button.of(Pictures.DELETE_MAILBOX)                .never("deletes the player's mail");
        public final Button mailItemMailbox = Button.of(Pictures.MAIL_ITEM_MAILBOX).tried()
                .info();
        public final Button mailClaim = Button.of(Pictures.MAIL_CLAIM).sometimes();
        public final Strip mailItemMailboxStrip = Strip.of(Scroll.wheel(-10), List.of(Pictures.MAIL_ITEM_MAILBOX))
                .tried();
        public final Button closeMailbox = Button.of(Pictures.CLOSE_MAILBOX);

        @Override
        public Setup setup() {
            return Setup.named("Mailbox").markers(List.of(Pictures.MAILBOX_TITLE)).from(HOME.mailHome)
                    .back(MAILBOX.closeMailbox).notes("""
                            Mailbox (Home's envelope, red count badge = unread mail): a list of mails on the left (rewards from daily quests, Arena of Kings ranking, events, battle pass, arcane crystals), the open mail on the right.
                            Claim (mail_claim) shows while the open mail holds rewards; claiming opens the Reward popup (Goddess Aurelia, OK closes it).
                            The list scrolls (10 notches showed mails back to mid-September).
                            The trash deletes read mail: never.\
                            """).reached(Reached.SURVEYED);
        }
    }

    public static final Mailbox MAILBOX = new Mailbox();

    public static final class MailClaim extends Screen {
        public final Button okReward = Button.of(Pictures.OK_REWARD);

        @Override
        public Setup setup() {
            return Setup.named("Reward").markers(List.of(Pictures.REWARD_GODDESS_TITLE)).from(MAILBOX.mailClaim)
                    .back(MAIL_CLAIM.okReward).popup();
        }
    }

    public static final MailClaim MAIL_CLAIM = new MailClaim();

    public static final class Library extends Screen {
        public final Button firestoneTabLibrary = Button.of(Pictures.FIRESTONE_TAB_LIBRARY).tried();
        public final Button guardianNodeLibrary = Button.of(Pictures.GUARDIAN_NODE_LIBRARY);
        public final Button armorNodeLibrary = Button.of(Pictures.ARMOR_NODE_LIBRARY);
        public final Button healthNodeLibrary = Button.of(Pictures.HEALTH_NODE_LIBRARY);
        public final Button projectilesNodeLibrary = Button.of(Pictures.PROJECTILES_NODE_LIBRARY);
        public final Button freeSlotLibrary = Button.of(Pictures.FREE_SLOT_LIBRARY).tried().info()
                .sometimes();
        public final Button gemsPlusMap = Button.of(Pictures.GEMS_PLUS_MAP).never("spends gems");
        public final Button researchClaim = Button.of(Pictures.RESEARCH_CLAIM).tried()                .sometimes();
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Library").markers(List.of(Pictures.METEORITE_TAB_LIBRARY)).from(HOME.libraryHome)
                    .alsoFrom(List.of(Way.of(TOWN.libraryTown))).back(LIBRARY.closeTown);
        }
    }

    public static final Library LIBRARY = new Library();

    public static final class Campaign extends Screen {
        public final Button campaignLeaderboards = Button.of(Pictures.CAMPAIGN_LEADERBOARDS);
        public final Button campaignDailyMissions = Button.of(Pictures.CAMPAIGN_DAILY_MISSIONS);
        public final Button warMachineMap = Button.of(Pictures.WAR_MACHINE_MAP);
        public final Button campaignMap = Button.of(Pictures.CAMPAIGN_MAP);
        public final Button chatMap = Button.of(Pictures.CHAT_MAP);
        public final Button campaignClaim = Button.of(Pictures.CAMPAIGN_CLAIM).tried()                .sometimes().looks(List.of(Look.of(Pictures.CAMPAIGN_CLAIM_OFF, State.DISABLED)));
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Campaign").markers(List.of(Pictures.CAMPAIGN_TITLE)).from(HOME.campaignHome)
                    .back(CAMPAIGN.closeTown);
        }
    }

    public static final Campaign CAMPAIGN = new Campaign();

    public static final class ResearchNode extends Screen {
        public final Button researchStartLibrary = Button.of(Pictures.RESEARCH_START_LIBRARY).leaves();
        public final Button completeInstantlyResearchNode = Button.of(Pictures.COMPLETE_INSTANTLY_RESEARCH_NODE)
                .never("spends gems");
        public final Button closeResearchNode = Button.of(Pictures.CLOSE_RESEARCH_NODE);

        @Override
        public Setup setup() {
            return Setup.named("Research node").markers(List.of(Pictures.ORIGINAL_TIME_RESEARCH_NODE))
                    .from(LIBRARY.guardianNodeLibrary)
                    .alsoFrom(List.of(Way.of(LIBRARY.armorNodeLibrary), Way.of(LIBRARY.healthNodeLibrary),
                            Way.of(LIBRARY.projectilesNodeLibrary)))
                    .back(RESEARCH_NODE.closeResearchNode);
        }
    }

    public static final ResearchNode RESEARCH_NODE = new ResearchNode();

    public static final class Map extends Screen {
        public final Button campaignMap = Button.of(Pictures.CAMPAIGN_MAP);
        public final Button warMachineMap = Button.of(Pictures.WAR_MACHINE_MAP);
        public final Button infoMap = Button.of(Pictures.INFO_MAP);
        public final Button gemsPlusMap = Button.of(Pictures.GEMS_PLUS_MAP).never("spends gems");
        public final Button goldPlusMap = Button.of(Pictures.GOLD_PLUS_MAP).never("spends gems");
        public final Button avatarMap = Button.of(Pictures.AVATAR_MAP);
        public final Button chatMap = Button.of(Pictures.CHAT_MAP);
        public final Button claimMap = Button.of(Pictures.CLAIM_MAP).tried()                .sometimes();
        public final Button scrollPinMap = Button.of(Pictures.SCROLL_PIN_MAP).sometimes().repeated();
        public final Button swordPinMap = Button.of(Pictures.SWORD_PIN_MAP).sometimes().repeated();
        public final Button telescopePinMap = Button.of(Pictures.TELESCOPE_PIN_MAP).sometimes().repeated();
        public final Button dragonPinMap = Button.of(Pictures.DRAGON_PIN_MAP).sometimes().repeated();
        public final Button closeTown = Button.of(Pictures.CLOSE_TOWN);

        @Override
        public Setup setup() {
            return Setup.named("Map").markers(List.of(Pictures.RANK_LIST_MAP)).from(HOME.map).back(MAP.closeTown);
        }
    }

    public static final Map MAP = new Map();

    public static final class Claim extends Screen {
        public final Button okayMap = Button.of(Pictures.OKAY_MAP);

        @Override
        public Setup setup() {
            return Setup.named("Mission rewards").markers(List.of(Pictures.MISSION_REWARDS_TITLE)).from(MAP.claimMap)
                    .back(CLAIM.okayMap).popup();
        }
    }

    public static final Claim CLAIM = new Claim();

    public static final class Quests extends Screen {
        public final Button weeklyTabOff = Button.of(Pictures.WEEKLY_TAB_OFF).tried()
                .looks(List.of(Look.of(Pictures.WEEKLY_TAB_ON, State.SELECTED)));
        public final Button dailyTabOff = Button.of(Pictures.DAILY_TAB_OFF).tried()
                .looks(List.of(Look.of(Pictures.DAILY_TAB_ON, State.SELECTED)));
        public final Button questClaim = Button.of(Pictures.QUEST_CLAIM).sometimes().looks(List.of(Look.of(Pictures.QUEST_CLAIM_OFF, State.DISABLED)))
                .repeated();
        public final Button arenaClose = Button.of(Pictures.ARENA_CLOSE);

        @Override
        public Setup setup() {
            return Setup.named("Quests").markers(List.of(Pictures.QUESTS_TAB)).from(HOME.keyQ)
                    .back(QUESTS.arenaClose);
        }
    }

    public static final Quests QUESTS = new Quests();

    private Screens() {
    }
}
