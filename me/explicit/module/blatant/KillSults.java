// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.blatant;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.File;
import java.io.IOException;
import me.explicit.utils.ChatUtils;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import me.explicit.config.ConfigManager;
import io.netty.util.internal.ThreadLocalRandom;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraft.entity.Entity;
import me.explicit.utils.CombatUtils;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import me.explicit.utils.Game;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import java.util.ArrayList;
import me.explicit.module.Category;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;
import me.explicit.module.Module;

public class KillSults extends Module
{
    private static final /* synthetic */ String[] lIIllllI;
    private static final /* synthetic */ int[] lIlIIIII;
}
