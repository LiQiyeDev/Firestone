package com.firestone.plugins.sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.text.DigitSet;

/**
 * Values com.botmaker.sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.DIGITS)
public final class Digits {
    public static final DigitSet STAGE = new DigitSet("src/main/resources/digits/stage");

    private Digits() {
    }
}
