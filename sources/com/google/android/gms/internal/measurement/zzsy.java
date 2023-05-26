package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzsx;
import com.google.android.gms.internal.measurement.zzsy;

public abstract class zzsy<MessageType extends zzsx<MessageType, BuilderType>, BuilderType extends zzsy<MessageType, BuilderType>> implements zzvw {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo30370a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ zzvw mo30371a(zzvv zzvv) {
        if (mo30428f().getClass().isInstance(zzvv)) {
            return mo30370a((zzsx) zzvv);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: g */
    public abstract BuilderType clone();
}
