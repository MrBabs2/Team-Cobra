package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzsx;
import com.google.android.gms.internal.measurement.zzsy;
import java.io.IOException;

public abstract class zzsx<MessageType extends zzsx<MessageType, BuilderType>, BuilderType extends zzsy<MessageType, BuilderType>> implements zzvv {
    private static boolean zzbtl = false;
    protected int zzbtk = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo30367a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final zzte mo30369e() {
        try {
            C8311l0 j = zzte.m26523j(mo30425b());
            mo30424a(j.mo30190b());
            return j.mo30189a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30368a(int i) {
        throw new UnsupportedOperationException();
    }
}
