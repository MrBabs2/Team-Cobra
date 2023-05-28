package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
final class C8293h2 extends C8288g2<FieldDescriptorType, Object> {
    C8293h2(int i) {
        super(i, (C8293h2) null);
    }

    /* renamed from: b */
    public final void mo30117b() {
        if (!mo30116a()) {
            for (int i = 0; i < mo30118c(); i++) {
                Map.Entry a = mo30115a(i);
                if (((zzuh) a.getKey()).mo30416C()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Map.Entry entry : mo30121d()) {
                if (((zzuh) entry.getKey()).mo30416C()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo30117b();
    }
}
