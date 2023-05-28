package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.l */
/* compiled from: TimeSource */
class C8513l {

    /* renamed from: c */
    private static final C8513l f24283c = new C8513l((Long) null, (TimeZone) null);

    /* renamed from: a */
    private final Long f24284a;

    /* renamed from: b */
    private final TimeZone f24285b;

    private C8513l(Long l, TimeZone timeZone) {
        this.f24284a = l;
        this.f24285b = timeZone;
    }

    /* renamed from: b */
    static C8513l m27686b() {
        return f24283c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo31635a() {
        return mo31636a(this.f24285b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo31636a(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f24284a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
