// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.player;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import java.util.concurrent.ThreadLocalRandom;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import me.explicit.utils.TimerUtils;
import me.explicit.module.Module;

public class AutoArmor extends Module
{
}
