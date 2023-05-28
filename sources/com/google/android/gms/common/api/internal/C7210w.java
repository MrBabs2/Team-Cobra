package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.w */
abstract class C7210w {

    /* renamed from: a */
    private final zabd f13851a;

    protected C7210w(zabd zabd) {
        this.f13851a = zabd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25100a();

    /* renamed from: a */
    public final void mo25138a(zabe zabe) {
        zabe.f13916f.lock();
        try {
            if (zabe.f13926p == this.f13851a) {
                mo25100a();
                zabe.f13916f.unlock();
            }
        } finally {
            zabe.f13916f.unlock();
        }
    }
}
