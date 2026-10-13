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
    public static final ImageTemplate MAP = new ImageTemplate("src/main/resources/images/map.png")
            .at(new Rect(1810, 368, 80, 44));
    public static final ImageTemplate GUILD = new ImageTemplate("src/main/resources/images/guild.png").at(new Rect(1806, 490, 88, 40));
    public static final ImageTemplate MARKET = new ImageTemplate("src/main/resources/images/market.png")
            .at(new Rect(1796, 630, 110, 40));
    public static final ImageTemplate UPGRADES = new ImageTemplate("src/main/resources/images/upgrades.png")
            .at(new Rect(1356, 1012, 140, 38));
    public static final ImageTemplate BAG = new ImageTemplate("src/main/resources/images/bag.png")
            .at(new Rect(1534, 1012, 62, 38));
    public static final ImageTemplate FELLOWSHIP = new ImageTemplate("src/main/resources/images/fellowship.png")
            .at(new Rect(1630, 1012, 150, 38));
    public static final ImageTemplate PARTY = new ImageTemplate("src/main/resources/images/party.png")
            .at(new Rect(1800, 1012, 86, 38));
    public static final ImageTemplate TOWN_TITLE = new ImageTemplate("src/main/resources/images/town_title.png")
            .at(new Rect(783, 3, 350, 46));
    private Pictures() {}
}
