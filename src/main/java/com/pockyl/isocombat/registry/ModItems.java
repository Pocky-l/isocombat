package com.pockyl.isocombat.registry;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.pockyl.isocombat.Isocombat;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Isocombat.MOD_ID);

    private ModItems() {
    }

    public static void register(IEventBus modBus) {
        ITEMS.register(modBus);
    }
}
