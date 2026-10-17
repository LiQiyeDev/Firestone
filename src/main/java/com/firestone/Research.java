package com.firestone;

import com.botmaker.sdk.api.screens.Button;
import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Pick;
import com.firestone.plugins.sdk.Activities;
import com.firestone.plugins.sdk.Screens;

import java.util.List;

public class Research {

    public static Activities.Research body() {
        Navigate.press(Screens.LIBRARY.firestoneTabLibrary);
        Navigate.press(Screens.LIBRARY.researchClaim, Pick.untilNone());
        // A free slot takes one research: open a node, start it, and look again.
        for (int slot = 0; slot < 4 && Navigate.to(Screens.LIBRARY)
                && Navigate.state(Screens.LIBRARY.freeSlotLibrary).isPresent(); slot++) {
            if (!openNode()) break;
            Navigate.press(Screens.RESEARCH_NODE.researchStartLibrary);
        }
        return Activities.Research.NEXT;
    }

    /**
     * Opens the first node of Tree I, read column by column and top to bottom, that is not locked, maxed or being
     * researched: the press walks the tree's view to it and skips those looks. False when none opened.
     */
    private static boolean openNode() {
        List<Button> nodes = List.of(Screens.LIBRARY.damageNodeLibrary, Screens.LIBRARY.healthNodeLibrary,
                Screens.LIBRARY.armorNodeLibrary, Screens.LIBRARY.fistNodeLibrary,
                Screens.LIBRARY.guardianNodeLibrary, Screens.LIBRARY.projectilesNodeLibrary,
                Screens.LIBRARY.rainingGoldNodeLibrary, Screens.LIBRARY.critBonusNodeLibrary,
                Screens.LIBRARY.critChanceNodeLibrary, Screens.LIBRARY.weaklingsNodeLibrary,
                Screens.LIBRARY.exposeNodeLibrary, Screens.LIBRARY.medalNodeLibrary,
                Screens.LIBRARY.finderNodeLibrary, Screens.LIBRARY.trainerNodeLibrary,
                Screens.LIBRARY.skipWaveNodeLibrary, Screens.LIBRARY.expeditionerNodeLibrary);
        for (Button node : nodes) {
            if (Navigate.press(node).landed() == Screens.RESEARCH_NODE) return true;
        }
        return false;
    }
}
