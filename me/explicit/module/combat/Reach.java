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
import me.explicit.utils.CombatUtils;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import me.explicit.utils.Game;
import net.minecraftforge.client.event.MouseEvent;
import me.explicit.settings.Setting;
import me.explicit.Explicit;
import java.util.ArrayList;
import me.explicit.module.Category;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import java.util.Random;
import me.explicit.module.Module;

public class Reach extends Module
{
}
