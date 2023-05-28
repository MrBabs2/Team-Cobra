package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p294w.C10619b;
import p112n.p277e.p279b.p282b.p294w.C10620c;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: CalendarStyle */
final class C8488b {

    /* renamed from: a */
    final C8487a f24223a;

    /* renamed from: b */
    final C8487a f24224b;

    /* renamed from: c */
    final C8487a f24225c;

    /* renamed from: d */
    final C8487a f24226d;

    /* renamed from: e */
    final C8487a f24227e;

    /* renamed from: f */
    final C8487a f24228f;

    /* renamed from: g */
    final C8487a f24229g;

    /* renamed from: h */
    final Paint f24230h;

    C8488b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C10619b.m35951a(context, C10574b.materialCalendarStyle, C8491e.class.getCanonicalName()), C10584l.MaterialCalendar);
        this.f24223a = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_dayStyle, 0));
        this.f24229g = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_dayInvalidStyle, 0));
        this.f24224b = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_daySelectedStyle, 0));
        this.f24225c = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C10620c.m35957a(context, obtainStyledAttributes, C10584l.MaterialCalendar_rangeFillColor);
        this.f24226d = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_yearStyle, 0));
        this.f24227e = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_yearSelectedStyle, 0));
        this.f24228f = C8487a.m27640a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f24230h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
