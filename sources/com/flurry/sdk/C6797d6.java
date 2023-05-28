package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* renamed from: com.flurry.sdk.d6 */
public final class C6797d6 extends MessageDigest {

    /* renamed from: a */
    private CRC32 f12666a = new CRC32();

    public C6797d6() {
        super("CRC");
    }

    /* renamed from: a */
    public final int mo23577a() {
        return ByteBuffer.wrap(engineDigest()).getInt();
    }

    /* access modifiers changed from: protected */
    public final byte[] engineDigest() {
        long value = this.f12666a.getValue();
        return new byte[]{(byte) ((int) ((-16777216 & value) >> 24)), (byte) ((int) ((16711680 & value) >> 16)), (byte) ((int) ((65280 & value) >> 8)), (byte) ((int) ((value & 255) >> 0))};
    }

    /* access modifiers changed from: protected */
    public final void engineReset() {
        this.f12666a.reset();
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte b) {
        this.f12666a.update(b);
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f12666a.update(bArr, i, i2);
    }
}
