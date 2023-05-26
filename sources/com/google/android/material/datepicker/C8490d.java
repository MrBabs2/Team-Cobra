package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: DaysOfWeekAdapter */
class C8490d extends BaseAdapter {

    /* renamed from: i */
    private static final int f24231i = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: f */
    private final Calendar f24232f;

    /* renamed from: g */
    private final int f24233g;

    /* renamed from: h */
    private final int f24234h = this.f24232f.getFirstDayOfWeek();

    public C8490d() {
        Calendar e = C8514m.m27703e();
        this.f24232f = e;
        this.f24233g = e.getMaximum(7);
    }

    /* renamed from: a */
    private int m27648a(int i) {
        int i2 = i + this.f24234h;
        int i3 = this.f24233g;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public int getCount() {
        return this.f24233g;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p112n.p277e.p279b.p282b.C10580h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f24232f
            int r6 = r5.m27648a(r6)
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.f24232f
            int r7 = f24231i
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p112n.p277e.p279b.p282b.C10582j.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f24232f
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C8490d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Integer getItem(int i) {
        if (i >= this.f24233g) {
            return null;
        }
        return Integer.valueOf(m27648a(i));
    }
}
