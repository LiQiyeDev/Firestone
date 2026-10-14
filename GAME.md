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

## Map missions

- M opens the map from the fight screen (~1–2 s); its marker is the Rank List button (rank_list_map).
- Finished missions show a green Claim in the left column (claim_map); each opens a reward popup closed by Okay (okay_map). The list reflows after each claim.
- A pin with a white timer bubble is open to start; the timer is the mission's length. A running pin has a red banner and no timer, and no pin picture matches it.
- Pin types: sword (war), telescope (scout), dragon, scroll. One picture each, timer digits left out of matching.
- A pin opens a dialog: Start mission (start_mission_map), or "You do not have enough squads." (no_squads_map) when all squads are out. The dialog covers the pins.
- Squads counter top centre (4/4 = all idle). New missions every few hours ("New missions in").
- Escape closes the pin dialog.

## Tavern

- Town › Tavern opens a chooser: Tavern or Scarab's game (tavern_choice_town = the Tavern card).
- Town's buildings carry a red bell badge (badge_town) when something is ready; badges nest (Tavern → Market). The fight screen shows the same badge on its side buttons.
- Beer comes from a dragon that visits during battle (click it to collect at once, or it drops the beer itself); it keeps coming while offline.
- Every input on the Tavern screen:
  - Play 1 (play_tavern; grey twin play_off_tavern at 0 tokens): 1 game token deals 6 face-down cards (card_tavern); pick one, all six turn over.
  - x1 / x10 / x50 (bottom right, cycles on each press): tokens spent per play.
  - Manual / Auto (under it, shown only while tokens remain): Auto plays on by itself after the first pick until the tokens run out; during Auto, Play stays grey.
  - Market (market_tavern) › "Tavern's market" (market_title_tavern): 5 tokens for 1500 beer (green, beer_buy_tavern; grey twin beer_buy_off_tavern); the other two cost gems, never click them. Its badge comes back whenever beer reaches 1500 again, which battle does while you play.
  - Ancient artifacts: Upgrade / Rarity spend keys and other resources: a spending choice, not a chore.
  - Sacred cards: progress of the cards won (heroes, guardians, war machines, attributes); nothing to press.
  - Element wheel (bottom left): the 5 primordial elements won; all 5 craft an ancient artifact.
  - ? bag: reward table per luck level. i buttons: help. Luck bar: luck level from plays.
  - Tokens counter top right; its + offers more tokens.
- Escape closes the market; Escape from the Tavern goes straight back to Town.
- Gamer daily quest = 10 tavern plays.

## Map

Home is the fight screen. Each line: a screen, then how to get there from home. (picture) = the entrance's picture; none yet = still to cut.

Not screens: the chest top right is a paid offer (Sale): never. The pink dragon carrying a mug walks the fight screen: click it for beer (Tavern). The left column scrolls (wheel over it) and its icons come and go with their badges: find them by picture, never by place; scroll it up first.

- Quests: Q (hotkey).
- Map missions: M (hotkey) or the Map button (map).
- Town: T (hotkey) or the Town button (home); its buildings are entrances below.
- Research: Town › Library (library_town); or the left column's book icon (library_home), which opens the Meteorite tab.
- Tavern: Town › Tavern (tavern_town) › Tavern card (tavern_choice_town).
- Engineer: left column, miner helmet (engineer_home). Tools production Claim.
- War machines: left column, gear and hammer (war_machines_home).
- Guardians: left column, the guardian portrait (guardians_home). Train button (train_guardian).
- Campaign: left column, banner (campaign_home). Loot Claim.
- Arena of Kings: left column, crossed swords with a count badge, only while it has fights (none yet); also Town › Battles (battles_town), to check.
- Mail: left column, envelope (mail_home). Chat under it: never.
- Guild: Guild button (guild). Its buildings are entrances; most are locked on this account.
- Market: home › click market. Market button (market). A free mystery box every day.
- Boss: the Boss button (battle).
- Upgrades: home › click upgrades. bottom bar (upgrades).
- Bag: home › click bag. bottom bar (bag).
- Fellowship: bottom bar (fellowship); the click opened nothing.
- Party: bottom bar (party).
- Battle pass: bottom left (battle_pass_home).
- Events: bottom left (events_home).
- Hero profile: avatar top left (none yet).
- Settings: gear top right, S (hotkey).

## Upgrades

Entrance: home › click upgrades
Marker: heroes_damage_upgrades
Untried: upgrade_upgrades, upgrade_x1_upgrades
A right-hand panel over the fight; Escape closes it. Gold buys each row: Heroes' damage +50%, then one row per hero; each row's green button reads Upgrade: x1 and its price.
Owed: Detailed view button picture

## Bag

Entrance: home › click bag
Marker: gear_tab_bag
Untried: items_tab_bag, gear_tab_bag, chests_tab_bag, gems_tab_bag
A right-hand panel, four tabs down its left edge: items (bag), gear (sword scroll), chests, gems. It reopens on the last tab used. Chests come from world map missions; each shows its count.
Owed: each chest's picture, to try how one opens

## Home

The fight screen; the Map lists where each input leads. Hotkeys: Q quests, M map, T town, S settings.
Marker: home
Untried: home, guild, map, battle, fellowship, party, battle_pass_home, events_home, engineer_home, war_machines_home, guardians_home, campaign_home, library_home, mail_home
- tried upgrades: opens Upgrades
- tried bag: opens Bag
- tried market: opens Market

## Market

Entrance: home › click market
Marker: heart_tab_market
Untried: bundles_tab_market, gems_tab_market, chests_tab_market
