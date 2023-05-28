package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdmj;

public abstract class zzdmj<MessageType extends zzdmi<MessageType, BuilderType>, BuilderType extends zzdmj<MessageType, BuilderType>> implements zzdpl {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo29066a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ zzdpl mo29067a(zzdpk zzdpk) {
        if (mo29132f().getClass().isInstance(zzdpk)) {
            mo29066a((zzdmi) zzdpk);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: i */
    public abstract BuilderType clone();
}
