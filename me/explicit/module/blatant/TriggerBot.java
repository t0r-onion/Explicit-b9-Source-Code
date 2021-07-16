// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.blatant;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Mouse;
import me.explicit.utils.CombatUtils;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemBow;
import me.explicit.utils.Game;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import java.util.Random;
import java.lang.reflect.Field;
import me.explicit.module.Module;

public class TriggerBot extends Module
{
}
