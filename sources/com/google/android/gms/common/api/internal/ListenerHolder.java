package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;

@KeepForSdk
public final class ListenerHolder<L> {

    /* renamed from: a */
    private final C7165a f13762a;

    /* renamed from: b */
    private final ListenerKey<L> f13763b;

    @KeepForSdk
    public static final class ListenerKey<L> {

        /* renamed from: a */
        private final L f13764a;

        /* renamed from: b */
        private final String f13765b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f13764a == listenerKey.f13764a && this.f13765b.equals(listenerKey.f13765b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f13764a) * 31) + this.f13765b.hashCode();
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
    }

    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$a */
    private final class C7165a extends zap {
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo25078a() {
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo25079a(Notifier<? super L> notifier) {
        Preconditions.m16038a(notifier, (Object) "Notifier must not be null");
        this.f13762a.sendMessage(this.f13762a.obtainMessage(1, notifier));
    }

    @KeepForSdk
    /* renamed from: b */
    public final ListenerKey<L> mo25080b() {
        return this.f13763b;
    }
}
