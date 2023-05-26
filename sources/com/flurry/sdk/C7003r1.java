package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.r1 */
public final class C7003r1 implements C7048v1<byte[]> {
    /* renamed from: a */
    public final /* synthetic */ void mo23605a(OutputStream outputStream, Object obj) throws IOException {
        byte[] bArr = (byte[]) obj;
        if (outputStream != null && bArr != null) {
            outputStream.write(bArr, 0, bArr.length);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo23604a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6766c2.m14415a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
