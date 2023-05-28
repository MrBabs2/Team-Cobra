package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.security.DigestOutputStream;

/* renamed from: com.flurry.sdk.o3 */
public final class C6955o3 {
    /* renamed from: a */
    public final synchronized byte[] mo23677a(C7044u6 u6Var) {
        byte[] bArr;
        DataOutputStream dataOutputStream;
        bArr = null;
        try {
            C6797d6 d6Var = new C6797d6();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(640);
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, d6Var);
            dataOutputStream = new DataOutputStream(digestOutputStream);
            try {
                C6792d1.m14476a(3, "FrameSerializer", "Adding frame " + u6Var.mo23538a() + " payload " + u6Var.mo23712d());
                dataOutputStream.writeByte(u6Var.mo23713e());
                int i = u6Var.mo23538a().f13210f;
                byte[] bArr2 = new byte[4];
                bArr2[0] = (byte) (i >> 16);
                bArr2[1] = (byte) (i >> 8);
                bArr2[2] = (byte) (i >> 0);
                for (int i2 = 0; i2 < 3; i2++) {
                    dataOutputStream.write(bArr2[i2]);
                }
                dataOutputStream.writeLong(u6Var.mo23711c());
                dataOutputStream.writeLong(u6Var.mo23710b());
                byte[] bytes = u6Var.mo23712d().getBytes("UTF-8");
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                if (u6Var.mo23715g()) {
                    digestOutputStream.on(false);
                    dataOutputStream.writeInt(d6Var.mo23577a());
                }
                dataOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                try {
                    C6792d1.m14477a(3, "FrameSerializer", "Error when generating report", th);
                    C6766c2.m14420a((Closeable) dataOutputStream);
                    return bArr;
                } catch (Throwable th2) {
                    C6766c2.m14420a((Closeable) dataOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            C6792d1.m14477a(3, "FrameSerializer", "Error when generating report", th);
            C6766c2.m14420a((Closeable) dataOutputStream);
            return bArr;
        }
        C6766c2.m14420a((Closeable) dataOutputStream);
        return bArr;
    }
}
