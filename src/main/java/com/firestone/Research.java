package com.firestone;

import com.botmaker.sdk.api.screens.Button;
import com.botmaker.sdk.api.screens.Navigate;
import com.botmaker.sdk.api.screens.Pick;
import com.firestone.plugins.sdk.Activities;
import com.firestone.plugins.sdk.Screens;

import java.util.List;

public class Research {

    public static Activities.Research body() {
        Navigate.press(Screens.LIBRARY.researchClaim, Pick.untilNone());
        // A free slot takes one research: open a node, start it, and look again.
        for (int slot = 0; slot < 4 && Navigate.to(Screens.LIBRARY)
                && Navigate.state(Screens.LIBRARY.freeSlotLibrary).isPresent(); slot++) {
            if (!openNode()) break;
            Navigate.press(Screens.RESEARCH_NODE.researchStartLibrary);
        }
        return Activities.Research.NEXT;
    }

    /** Opens the first research node the Library shows; false when none opened. */
    private static boolean openNode() {
        List<Button> nodes = List.of(Screens.LIBRARY.healthNodeLibrary, Screens.LIBRARY.armorNodeLibrary,
                Screens.LIBRARY.guardianNodeLibrary, Screens.LIBRARY.projectilesNodeLibrary);
        for (Button node : nodes) {
            if (Navigate.press(node).landed() == Screens.RESEARCH_NODE) return true;
        }
        return false;
    }
}
