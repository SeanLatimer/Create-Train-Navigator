package de.mrjulsen.crn.registry;

import com.tterrag.registrate.util.entry.ItemEntry;

import de.mrjulsen.crn.CreateRailwaysNavigator;
import de.mrjulsen.crn.item.NavigatorItem;

public class ModItems {

    static {
		//CreateRailwaysNavigator.REGISTRATE.setCreativeTab(ModCreativeModeTab.MAIN_TAB.getKey());
	}

    public static final ItemEntry<NavigatorItem> NAVIGATOR = CreateRailwaysNavigator.REGISTRATE.item("navigator", NavigatorItem::new)
			.properties(p -> p.stacksTo(1))
            .tab(ModCreativeModeTab.MAIN_TAB.getKey())
			.register();
    
    public static void register() {
    }
}
