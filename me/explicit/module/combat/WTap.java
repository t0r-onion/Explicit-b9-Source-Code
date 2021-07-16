// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.combat;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import me.explicit.utils.CombatUtils;
import me.explicit.utils.Game;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import io.netty.util.internal.ThreadLocalRandom;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import me.explicit.utils.TimerUtils;
import me.explicit.module.Module;

public class WTap extends Module
{
    private static final /* synthetic */ int[] lIIIlIlII;
}
