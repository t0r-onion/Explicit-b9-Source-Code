// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.player;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemBlock;
import me.explicit.utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import me.explicit.utils.Game;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.client.gui.inventory.GuiChest;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import me.explicit.utils.TimerUtils;
import me.explicit.module.Module;

public class ChestStealer extends Module
{
}
