package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@zzard
public final class zzvf extends zzva {

    /* renamed from: c */
    private MessageDigest f22837c;

    /* renamed from: a */
    public final byte[] mo29833a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a = zzve.m25423a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else {
            if (split.length < 5) {
                bArr2 = new byte[(split.length << 1)];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a2 = zzve.m25423a(split[i2]);
                    int i3 = (a2 >> 16) ^ (65535 & a2);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr2[i4] = bArr3[0];
                    bArr2[i4 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int a3 = zzve.m25423a(split[i5]);
                    bArr2[i5] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f22837c = mo29832a();
        synchronized (this.f22833a) {
            if (this.f22837c == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            this.f22837c.reset();
            this.f22837c.update(bArr);
            byte[] digest = this.f22837c.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr5 = new byte[i];
            System.arraycopy(digest, 0, bArr5, 0, i);
            return bArr5;
        }
    }
}
