package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.m */
/* compiled from: UtcDates */
class C8514m {

    /* renamed from: a */
    static AtomicReference<C8513l> f24286a = new AtomicReference<>();

    /* renamed from: a */
    static C8513l m27692a() {
        C8513l lVar = f24286a.get();
        return lVar == null ? C8513l.m27686b() : lVar;
    }

    /* renamed from: b */
    private static TimeZone m27698b() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: c */
    static Calendar m27700c() {
        Calendar a = m27692a().mo31635a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        return m27694a(a);
    }

    @TargetApi(24)
    /* renamed from: d */
    private static android.icu.util.TimeZone m27701d() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: e */
    static Calendar m27703e() {
        return m27697b((Calendar) null);
    }

    /* renamed from: f */
    static SimpleDateFormat m27704f() {
        return m27702d(Locale.getDefault());
    }

    /* renamed from: b */
    static Calendar m27697b(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m27698b());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: d */
    private static SimpleDateFormat m27702d(Locale locale) {
        return m27696b("LLLL, yyyy", locale);
    }

    /* renamed from: a */
    static Calendar m27694a(Calendar calendar) {
        Calendar b = m27697b(calendar);
        Calendar e = m27703e();
        e.set(b.get(1), b.get(2), b.get(5));
        return e;
    }

    /* renamed from: b */
    private static SimpleDateFormat m27696b(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m27698b());
        return simpleDateFormat;
    }

    /* renamed from: b */
    static DateFormat m27695b(Locale locale) {
        return m27693a(0, locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    static android.icu.text.DateFormat m27699c(Locale locale) {
        return m27690a("yMMMEd", locale);
    }

    /* renamed from: a */
    static long m27689a(long j) {
        Calendar e = m27703e();
        e.setTimeInMillis(j);
        return m27694a(e).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: a */
    private static android.icu.text.DateFormat m27690a(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m27701d());
        return instanceForSkeleton;
    }

    /* renamed from: a */
    private static DateFormat m27693a(int i, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m27698b());
        return dateInstance;
    }

    @TargetApi(24)
    /* renamed from: a */
    static android.icu.text.DateFormat m27691a(Locale locale) {
        return m27690a("MMMEd", locale);
    }
}
