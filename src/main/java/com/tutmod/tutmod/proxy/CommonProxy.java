package com.tutmod.tutmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.tutmod.tutmod.items.ItemReg;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        BlockReg.register();
    	ItemReg.register();
    }
    public void init(FMLInitializationEvent event) {
    RegisterCrafts.recipesRegister();
    }
    public void postInit(FMLPostInitializationEvent event) {}
}
