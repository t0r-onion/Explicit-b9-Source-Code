// 
// Decompiled by Procyon v0.5.36
// 

package me.dewgs.sidebarmod;

import net.minecraft.client.gui.GuiIngame;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import me.dewgs.sidebarmod.gui.GuiScreenSidebarMod;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import me.explicit.Explicit;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraft.command.ICommand;
import me.dewgs.sidebarmod.commands.SidebarCommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import me.dewgs.sidebarmod.gui.GuiIngameSidebarMod;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "sidebarmod", name = "SidebarMod", version = "1.01", acceptedMinecraftVersions = "[1.8.9]")
public class SidebarMod
{
}
