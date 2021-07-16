// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.movement;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.MovementInput;
import net.minecraft.client.entity.EntityPlayerSP;
import me.explicit.utils.Game;
import net.minecraftforge.event.entity.living.LivingEvent;
import me.explicit.module.Category;
import me.explicit.module.Module;

public class NoSlow extends Module
{
}
