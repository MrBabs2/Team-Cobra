package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.l */
final class C7188l extends C7196p {

    /* renamed from: g */
    private final ArrayList<Api.Client> f13809g;

    /* renamed from: h */
    private final /* synthetic */ zaak f13810h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7188l(zaak zaak, ArrayList<Api.Client> arrayList) {
        super(zaak, (C7178g) null);
        this.f13810h = zaak;
        this.f13809g = arrayList;
    }

    /* renamed from: a */
    public final void mo25106a() {
        this.f13810h.f13869a.f13929s.f13906q = this.f13810h.m15669h();
        ArrayList<Api.Client> arrayList = this.f13809g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Api.Client client = arrayList.get(i);
            i++;
            client.getRemoteService(this.f13810h.f13883o, this.f13810h.f13869a.f13929s.f13906q);
        }
    }
}
