// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.combat;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import me.explicit.utils.CombatUtils;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import io.netty.util.internal.ThreadLocalRandom;
import me.explicit.utils.RotationUtils;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import me.explicit.utils.Game;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import me.explicit.module.Module;

public class AimAssist extends Module
{
}
