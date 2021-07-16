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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import me.explicit.utils.Game;
import net.minecraft.client.gui.inventory.GuiInventory;
import io.netty.util.internal.ThreadLocalRandom;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import me.explicit.utils.TimerUtils;
import me.explicit.module.Module;

public class AutoHotbar extends Module
{
}
