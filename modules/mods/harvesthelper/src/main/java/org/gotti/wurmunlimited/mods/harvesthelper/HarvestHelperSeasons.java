package org.gotti.wurmunlimited.mods.harvesthelper;

import java.util.Locale;

import com.wurmonline.server.WurmCalendar;
import com.wurmonline.server.WurmHarvestables;

public enum HarvestHelperSeasons {

	OLIVE(WurmHarvestables.OLIVE_ID),
	GRAPE(WurmHarvestables.GRAPE_ID),
	CHERRY(WurmHarvestables.CHERRY_ID),
	APPLE(WurmHarvestables.APPLE_ID),
	LEMON(WurmHarvestables.LEMON_ID),
	OLEANDER(WurmHarvestables.OLEANDER_ID),
	CAMELLIA(WurmHarvestables.CAMELLIA_ID),
	LAVENDER(WurmHarvestables.LAVENDER_ID),
	MAPLE(WurmHarvestables.MAPLE_ID),
	ROSE(WurmHarvestables.ROSE_ID),
	CHESTNUT(WurmHarvestables.CHESTNUT_ID),
	WALNUT(WurmHarvestables.WALNUT_ID),
	PINE(WurmHarvestables.PINE_ID),
	HAZEL(WurmHarvestables.HAZEL_ID),
	HOPS(WurmHarvestables.HOPS_ID),
	OAK(WurmHarvestables.OAK_ID),
	ORANGE(WurmHarvestables.ORANGE_ID);

	HarvestHelperSeasons(int id) {
		this.id = id;
	}

	private int id;

	public long getStartGrowth() {
		return WurmHarvestables.getHarvestable(id).getSeasonStart();
	}

	public String getName() {
		return this.name().toLowerCase(Locale.ROOT);
	}

}
