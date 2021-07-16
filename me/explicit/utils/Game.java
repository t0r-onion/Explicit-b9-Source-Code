// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.entity.EntityPlayerSP;

public class Game
{
    public static EntityPlayerSP Player() {
        return Minecraft().field_71439_g;
    }
    
    public static WorldClient World() {
        return Minecraft().field_71441_e;
    }
    
    public static Minecraft Minecraft() {
        return Minecraft.func_71410_x();
    }
}
