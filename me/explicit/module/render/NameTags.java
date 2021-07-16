// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.render;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemBow;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import me.explicit.utils.RenderUtils;
import java.awt.Color;
import java.text.DecimalFormat;
import me.explicit.utils.PrivateUtils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import me.explicit.utils.Game;
import me.explicit.utils.CombatUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import net.minecraft.entity.Entity;
import java.util.ArrayList;
import me.explicit.module.Module;

public class NameTags extends Module
{
    private static final /* synthetic */ int[] llIIll;
}
