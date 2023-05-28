package com.flurry.sdk;

import android.annotation.SuppressLint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.flurry.sdk.b7 */
public final class C6756b7<ObjectType> {

    /* renamed from: a */
    private C7048v1<ObjectType> f12578a;

    /* renamed from: com.flurry.sdk.b7$a */
    public enum C6757a {
        NONE(""),
        CRYPTO_ALGO_PADDING_7("AES/CBC/PKCS7Padding"),
        CRYPTO_ALGO_PADDING_5("AES/CBC/PKCS5Padding");
        

        /* renamed from: f */
        String f12583f;

        private C6757a(String str) {
            this.f12583f = str;
        }

        /* renamed from: a */
        public static C6757a m14405a(int i) {
            for (C6757a aVar : values()) {
                if (aVar.ordinal() == i) {
                    return aVar;
                }
            }
            return NONE;
        }
    }

    public C6756b7(C7048v1<ObjectType> v1Var) {
        this.f12578a = v1Var;
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: a */
    public final byte[] mo23545a(ObjectType objecttype, Key key, IvParameterSpec ivParameterSpec, C6757a aVar) throws IOException {
        if (objecttype == null || key == null || aVar == null) {
            C6792d1.m14476a(5, "FlurryCrypto", "Cannot encrypt, invalid params.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f12578a.mo23605a(byteArrayOutputStream, objecttype);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            Cipher instance = Cipher.getInstance(aVar.f12583f);
            instance.init(1, key, ivParameterSpec);
            return instance.doFinal(byteArray);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C6792d1.m14476a(5, "FlurryCrypto", "Error in encrypt " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final ObjectType mo23544a(byte[] bArr, Key key, IvParameterSpec ivParameterSpec, C6757a aVar) throws IOException {
        if (bArr == null || key == null || aVar == null) {
            C6792d1.m14476a(5, "FlurryCrypto", "Cannot decrypt, invalid params.");
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance(aVar.f12583f);
            instance.init(2, key, ivParameterSpec);
            return this.f12578a.mo23604a(new ByteArrayInputStream(instance.doFinal(bArr)));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            C6792d1.m14476a(5, "FlurryCrypto", "Error in decrypt " + e.getMessage());
            return null;
        }
    }
}
