package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdj {

    /* renamed from: a */
    private static Cipher f21428a;

    /* renamed from: b */
    private static final Object f21429b = new Object();

    /* renamed from: c */
    private static final Object f21430c = new Object();

    public zzdj(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    public final byte[] mo29052a(String str) throws zzdk {
        try {
            byte[] a = zzcg.m22510a(str, false);
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzdk(this);
        } catch (IllegalArgumentException e) {
            throw new zzdk(this, e);
        }
    }

    /* renamed from: a */
    public final String mo29051a(byte[] bArr, byte[] bArr2) throws zzdk {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f21429b) {
                    m23686a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = m23686a().doFinal(bArr2);
                    iv = m23686a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return zzcg.m22509a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new zzdk(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzdk(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzdk(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzdk(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzdk(this, e5);
            }
        } else {
            throw new zzdk(this);
        }
    }

    /* renamed from: a */
    public final byte[] mo29053a(byte[] bArr, String str) throws zzdk {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = zzcg.m22510a(str, false);
                if (a.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a.length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f21429b) {
                        m23686a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m23686a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzdk(this);
            } catch (NoSuchAlgorithmException e) {
                throw new zzdk(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzdk(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzdk(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzdk(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzdk(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new zzdk(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new zzdk(this, e7);
            }
        } else {
            throw new zzdk(this);
        }
    }

    /* renamed from: a */
    private static Cipher m23686a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f21430c) {
            if (f21428a == null) {
                f21428a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f21428a;
        }
        return cipher;
    }
}
