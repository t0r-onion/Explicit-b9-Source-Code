// 
// Decompiled by Procyon v0.5.36
// 

package me.explicit.module;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum Category
{
    COMBAT, 
    BLATANT, 
    MOVEMENT, 
    RENDER, 
    PLAYER, 
    MISC, 
    VALUES, 
    CONFIGS;
}
