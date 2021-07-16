// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.blatant;

import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import me.explicit.utils.CombatUtils;
import net.minecraft.entity.item.EntityArmorStand;
import me.explicit.utils.RotationUtils;
import net.minecraft.item.ItemAxe;
import io.netty.util.internal.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemSword;
import me.explicit.utils.Game;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import java.util.ArrayList;
import me.explicit.module.Category;
import java.util.List;
import net.minecraft.entity.EntityLivingBase;
import me.explicit.utils.TimerUtils;
import me.explicit.module.Module;

public class Killaura extends Module
{
}
