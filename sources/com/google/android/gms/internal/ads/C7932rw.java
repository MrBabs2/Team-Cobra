package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rw */
final class C7932rw extends C7895qw<FieldDescriptorType, Object> {
    C7932rw(int i) {
        super(i, (C7932rw) null);
    }

    /* renamed from: b */
    public final void mo26482b() {
        if (!mo26481a()) {
            for (int i = 0; i < mo26483c(); i++) {
                Map.Entry a = mo26480a(i);
                if (((zzdnu) a.getKey()).mo29125n()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Map.Entry entry : mo26486d()) {
                if (((zzdnu) entry.getKey()).mo29125n()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo26482b();
    }
}
