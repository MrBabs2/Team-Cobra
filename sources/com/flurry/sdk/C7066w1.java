package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.w1 */
public final class C7066w1 implements C7048v1<String> {
    /* renamed from: a */
    public final /* synthetic */ void mo23605a(OutputStream outputStream, Object obj) throws IOException {
        String str = (String) obj;
        if (outputStream != null && str != null) {
            byte[] bytes = str.getBytes("utf-8");
            outputStream.write(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo23604a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6766c2.m14415a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
}
