package com.firestone.plugins.sdk;

import com.firestone.Battle;
import com.firestone.Collect;
import com.firestone.Rest;
import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.flow.Flow;

import java.util.List;
import com.firestone.Research;
import com.botmaker.sdk.api.flow.ActivityBody;
import com.firestone.Quests;
import com.firestone.Missions;

/**
 * This bot's activity flows: what runs, in what order, and what stops it — one constant per way of playing.
 *
 * <p>Drawn in <i>Project ▸ Activity Flow</i>. An activity's work is a method reference, so renaming or deleting
 * the method is a compile error here rather than a flow that quietly does nothing. Which one runs is
 * {@link Sdk#flow}, a parameter the person running the bot picks in the Runner.
 */
@SdkValue(SdkValue.Id.FLOWS)
public final class Flows {

    /**
     * Collect until there is nothing left, then fight; a win goes back to collecting and a loss rests first.
     * Every arrow is a line below, every activity is a class in this project and an enum of {@link Activities},
     * and every outcome is a constant of its activity's enum. The person running the bot may switch Rest off.
     */
    public static final Flow MAIN = Flow.of(List.of(Flow.activity(Activities.Collect.class,Collect::body).described("Click the collect button while there is one."),Flow.activity(Activities.Battle.class,Battle::body).described("Start a fight and wait for it to end.").goesHome(),Flow.activity(Activities.Rest.class,Rest::body).described("Wait for Parameters.restBetween, then go round again.").switchable().whenOff(Activities.Collect.class),Flow.activity(Activities.Research.class,Research::body).described("Claim finished research, then start one in each free slot.").goesHome(),Flow.activity(Activities.Quests.class,Quests::body).described("Claim every finished daily, then weekly, quest.").goesHome(),Flow.activity(Activities.Missions.class,Missions::body).described("Claim finished map missions, then start new ones while squads are free.").goesHome()),List.of(Flow.edge(Activities.Collect.NEXT,Activities.Collect.class),Flow.edge(Activities.Collect.NOTHING_LEFT,Activities.Battle.class),Flow.edge(Activities.Battle.WON,Activities.Collect.class),Flow.edge(Activities.Battle.LOST,Activities.Rest.class),Flow.edge(Activities.Rest.NEXT,Activities.Collect.class),Flow.edge(Activities.Quests.NEXT,Activities.Research.class),Flow.edge(Activities.Research.NEXT,Activities.Missions.class),Flow.edge(Activities.Missions.NEXT,Activities.Rest.class)),Activities.Collect.class,Flow.limits(1000,1000));

    private Flows() {}
}
