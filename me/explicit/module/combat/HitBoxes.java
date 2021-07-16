// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module.combat;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.util.Vec3;
import net.minecraft.entity.item.EntityItemFrame;
import me.explicit.utils.RotationUtils;
import me.explicit.utils.CombatUtils;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import me.explicit.utils.Game;
import net.minecraftforge.client.event.MouseEvent;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import me.explicit.module.Category;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import me.explicit.module.Module;

public class HitBoxes extends Module
{
}
