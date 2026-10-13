package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.geometry.Spot;
import com.botmaker.sdk.api.geometry.Anchor;

/**
 * Values com.botmaker.sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SPOTS)
public final class Spots {
    public static final Spot SETTINGS = new Spot(1850, 58).anchored(Anchor.TOP_RIGHT);

    private Spots() {
    }
}
