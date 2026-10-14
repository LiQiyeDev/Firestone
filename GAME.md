# The game

What the assistant learnt exploring the game, one section per subject. Edit freely: the assistant
reads this at connect.

## Getting around

- Home is the fight screen (Battle on the right). Escape closes one layer; Escape on home opens "Save and Exit" (close_x or Escape again closes it).
- Hotkeys work from the fight screen only, not from Town: Q Quests, M Map, T Town, L Library, S Settings.
- Town (the `home` picture, top right): Library, Tavern, Engineer, Guild, Temple, Magic quarter, Alchemist, Pirate ship, Exotic merchant, Market, Leaderboards.
- Left column on home (top down, it shifts with badges): Tavern, Engineer, Campaign (banner, has a loot Claim), Arena of Kings, hero profile, mail.
- A screen draws 1–2 s after the click or key; the home screen sways on its own.

## Quests

- Q from home. Marker: quests_tab (the lit Quests tab at the top, only on this window). Q reopens the tab last used (Daily or Weekly).
- Tabs Daily / Weekly: lit (cream) and unlit (blue) look the same to matching. Pictures daily_tab_on/off, weekly_tab_on/off; pick one with whileFindCompare(off, on, found -> clickLast()).
- Each row: a Claim button, grey until the quest is done, and an orange arrow that jumps to the task.
- A claim shows no popup; the rows reorder at once (done ones first), so the loop finds again after each claim.
- Trap: the grey Claim scores 0.81 against the green one (matching ignores colour): whileFindCompare(QUEST_CLAIM, QUEST_CLAIM_OFF).
- Dailies: Conqueror (6 map missions), Collector (open 4 chests), Trainer (train guardians 2×), Gamer (10 tavern card plays), Expeditioner (5 guild expeditions), Merchant…
- Trainer's arrow opens the guardian screen: a green Train button (train_guardian) when free, then a cooldown.
- Weeklies count the dailies: e.g. Trainer weekly = finish Trainer 5 times. Loyalty weekly = claim 5 daily rewards.
- Daily quests renew at the same time each day (the screen says in how long).
- Quests::body: untilFind(quests_tab, Q), Daily tab, claims, Weekly tab, claims; no Spot clicks, no waitStable. Tried live 2026-10-14 (9 s).

## Research

- Town (home picture) › Library › Firestone tab. Each screen's marker: library_town (Town), meteorite_tab_library (Library, either tab), gems_library (the gem counter top right: Firestone tab only; Meteorite shows a meteorite counter there).
- The Library reopens the tab last used.
- Claim each finished research (research_claim, no popup); a free slot (free_slot_library) starts one: click a node, its popup's Start (research_start_library).
- Research::body: untilFind per screen, whileFindAny claims, whileFindAny(free slot) { ifFindAny(nodes) click + waitFor Start; whileFindAny(Start) click }. Tried live 2026-10-14 (16 s).
- Gap: a node that cannot start (maxed) would loop the free-slot loop; the watchdog covers it.
