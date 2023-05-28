package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ShowFirstParty
@KeepForSdk
@Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m16280a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static long m16277a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m16278a(inputStream, outputStream, false);
    }

    @Deprecated
    /* renamed from: a */
    private static long m16278a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return m16279a(inputStream, outputStream, z, 1024);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static long m16279a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m16280a(inputStream);
                    m16280a(outputStream);
                }
            }
        }
        return j;
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static byte[] m16281a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m16278a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
