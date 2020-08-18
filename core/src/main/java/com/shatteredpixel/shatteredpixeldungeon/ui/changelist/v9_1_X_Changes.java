/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2020 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.DwarfKing;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.NewDM300;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.Snake;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TalismanOfForesight;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfEnergy;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfWealth;
import com.shatteredpixel.shatteredpixeldungeon.items.stones.StoneOfAugmentation;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfBlastWave;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfCorruption;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfFireblast;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfFrost;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfMagicMissile;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfRegrowth;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfWarding;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.SpiritBow;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Flail;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Quarterstaff;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM100Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM300Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ElementalSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.GuardSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.KingSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MobSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.NecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ShamanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SnakeSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.SpawnerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.StatueSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.YogSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;
import com.watabou.utils.DeviceCompat;

import java.util.ArrayList;

public class v9_1_X_Changes {

	public static void addAllChanges( ArrayList<ChangeInfo> changeInfos ){
		add_v9_1_0_Changes(changeInfos);
	}

	public static void add_v9_1_0_Changes( ArrayList<ChangeInfo> changeInfos ) {
		ChangeInfo changes = new ChangeInfo("v0.1.0", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton( new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"_-_ First version!"));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.POUCH), "Bag Changes",
				"_-_ All heroes now start with the Velvet Pouch\n" +
						"_-_ The Magical Holster is now always sold on floor 16"));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_TRANSFUSION), "Wand of Transfusion",
				"_-_ The Wand of Transfusion now has 2 base charges, up from 1"));

		changes.addButton(new ChangeButton(new Image (Icons.get(Icons.CHALLENGE_OFF)), "New Player Experience",
				"Removed several features that are part of Evan's New Player Experience\n\n"+
				"_-_ Challenges are unlocked by default\n" +
				"_-_ Heroes are unlocked by default\n" +
				"_-_ Various tutorial elements removed\n" +
				"_-_ Adventurers' Guide and Alchemy Guide are filled by default"));
		changes.addButton(new ChangeButton(new Image (Icons.get(Icons.CHALLENGE_ON)), "Challenge Changes",
                "_-_ Swarm Intelligence will no longer wake magically sleeping enemies"));
		changes.addButton(new ChangeButton(new Image (Icons.get(Icons.PREFS)), "Miscellaneous Changes",
				"_-_ Level transitions are faster"));
		changes.addButton(new ChangeButton(new Image (new SnakeSprite()), "Sewer Snake",
				"_-_ The sewer snake now has 6HP, up from 4"));
		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SPIRIT_BOW), "Spirit Bow",
				"_-_ Sharpshooting bonus nerfed: scaling down to +0/+1 from +1/+2\n"+
				"_-_ The Bow no longer pierces armor as the Sniper"));
		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.PICKAXE), "Pickaxe",
				"_-_ The Pickaxe is now upgradable with +1/+3 scaling"));
	}

}
