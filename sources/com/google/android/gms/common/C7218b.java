package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.b */
abstract class C7218b extends zzj {

    /* renamed from: f */
    private int f14020f;

    protected C7218b(byte[] bArr) {
        Preconditions.m16043a(bArr.length == 25);
        this.f14020f = Arrays.hashCode(bArr);
    }

    /* renamed from: b */
    protected static byte[] m15908b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: D */
    public final IObjectWrapper mo25213D() {
        return ObjectWrapper.m16391a(mo25214Z());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public abstract byte[] mo25214Z();

    public boolean equals(Object obj) {
        IObjectWrapper D;
        if (obj != null && (obj instanceof zzi)) {
            try {
                zzi zzi = (zzi) obj;
                if (zzi.mo25216g() != hashCode() || (D = zzi.mo25213D()) == null) {
                    return false;
                }
                return Arrays.equals(mo25214Z(), (byte[]) ObjectWrapper.m16390H(D));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final int mo25216g() {
        return hashCode();
    }

    public int hashCode() {
        return this.f14020f;
    }
}
