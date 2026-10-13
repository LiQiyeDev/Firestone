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

- Q from home. Tabs: Daily (Spots.QUESTS_DAILY_TAB) and Weekly (Spots.QUESTS_WEEKLY_TAB).
- Each row: a Claim button, grey until the quest is done, and an orange arrow that jumps to the task.
- A claim shows no popup; the rows reorder at once (done ones first), so find again after each claim.
- Trap: the grey Claim scores 0.81 against the green one (matching ignores colour). Quests::body uses whileFindCompare(QUEST_CLAIM, QUEST_CLAIM_OFF).
- Dailies: Conqueror (6 map missions), Collector (open 4 chests), Trainer (train guardians 2×), Gamer (10 tavern card plays), Expeditioner (5 guild expeditions), Merchant…
- Trainer's arrow opens the guardian screen: a green Train button (train_guardian) when free, then a cooldown.
- Weeklies count the dailies: e.g. Trainer weekly = finish Trainer 5 times. Loyalty weekly = claim 5 daily rewards.
- Daily quests renew at the same time each day (the screen says in how long).
- Quests::body claims Daily then Weekly; tried live 2026-10-13 (8 s).

## Research

- Town › Library › Firestone tab. Claim each finished research, then a free slot starts one (pick a node, Start).
- Research::body does this and goes home first; tried live 2026-10-13.
