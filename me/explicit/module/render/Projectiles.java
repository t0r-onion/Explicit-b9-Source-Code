// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.render;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.client.entity.EntityPlayerSP;
import me.explicit.utils.RenderUtils;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.item.ItemFishingRod;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import me.explicit.utils.PrivateUtils;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemBow;
import me.explicit.utils.ItemUtils;
import me.explicit.utils.Game;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import me.explicit.module.Module;

public class Projectiles extends Module
{
}
