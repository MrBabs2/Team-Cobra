package com.google.android.gms.internal.ads;

import java.util.Map;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

public final class zzbmb implements zzbls {

    /* renamed from: a */
    private final zzaxb f19154a;

    public zzbmb(zzaxb zzaxb) {
        this.f19154a = zzaxb;
    }

    /* renamed from: a */
    public final void mo28258a(Map<String, String> map) {
        String str = map.get(DonationsAnalytics.VALUE);
        if ("auto_collect_location".equals(map.get(RoomNotification.KEY))) {
            this.f19154a.mo27776b(Boolean.parseBoolean(str));
        }
    }
}
