package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.material.datepicker.g */
/* compiled from: MonthAdapter */
class C8505g extends BaseAdapter {

    /* renamed from: j */
    static final int f24269j = C8514m.m27703e().getMaximum(4);

    /* renamed from: f */
    final Month f24270f;

    /* renamed from: g */
    final DateSelector<?> f24271g;

    /* renamed from: h */
    C8488b f24272h;

    /* renamed from: i */
    final CalendarConstraints f24273i;

    C8505g(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f24270f = month;
        this.f24271g = dateSelector;
        this.f24273i = calendarConstraints;
    }

    /* renamed from: a */
    private void m27672a(Context context) {
        if (this.f24272h == null) {
            this.f24272h = new C8488b(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo31619b() {
        return (this.f24270f.mo31583a() + this.f24270f.f24216k) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo31621c(int i) {
        return (i + 1) % this.f24270f.f24215j == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo31622d(int i) {
        return (i - this.f24270f.mo31583a()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo31623e(int i) {
        return i >= mo31617a() && i <= mo31619b();
    }

    public int getCount() {
        return this.f24270f.f24216k + mo31617a();
    }

    public long getItemId(int i) {
        return (long) (i / this.f24270f.f24215j);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo31620b(int i) {
        return i % this.f24270f.f24215j == 0;
    }

    public Long getItem(int i) {
        if (i < this.f24270f.mo31583a() || i > mo31619b()) {
            return null;
        }
        return Long.valueOf(this.f24270f.mo31585a(mo31622d(i)));
    }

    /* JADX WARNING: type inference failed for: r7v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m27672a((android.content.Context) r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p112n.p277e.p279b.p282b.C10580h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo31617a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x0061
            com.google.android.material.datepicker.Month r2 = r5.f24270f
            int r3 = r2.f24216k
            if (r7 < r3) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r5.f24270f
            long r2 = r2.mo31585a((int) r7)
            com.google.android.material.datepicker.Month r7 = r5.f24270f
            int r7 = r7.f24214i
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m27632o()
            int r4 = r4.f24214i
            if (r7 != r4) goto L_0x0053
            java.lang.String r7 = com.google.android.material.datepicker.C8489c.m27644a(r2)
            r0.setContentDescription(r7)
            goto L_0x005a
        L_0x0053:
            java.lang.String r7 = com.google.android.material.datepicker.C8489c.m27646b(r2)
            r0.setContentDescription(r7)
        L_0x005a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0069
        L_0x0061:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0069:
            java.lang.Long r6 = r5.getItem((int) r6)
            if (r6 != 0) goto L_0x0070
            return r0
        L_0x0070:
            com.google.android.material.datepicker.CalendarConstraints r7 = r5.f24273i
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r7 = r7.mo31557a()
            long r2 = r6.longValue()
            boolean r7 = r7.mo31568d(r2)
            if (r7 == 0) goto L_0x00d5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.DateSelector<?> r7 = r5.f24271g
            java.util.Collection r7 = r7.mo31573l()
            java.util.Iterator r7 = r7.iterator()
        L_0x008d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C8514m.m27689a((long) r3)
            long r1 = com.google.android.material.datepicker.C8514m.m27689a((long) r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            com.google.android.material.datepicker.b r6 = r5.f24272h
            com.google.android.material.datepicker.a r6 = r6.f24224b
            r6.mo31598a(r0)
            return r0
        L_0x00b5:
            java.util.Calendar r7 = com.google.android.material.datepicker.C8514m.m27700c()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.google.android.material.datepicker.b r6 = r5.f24272h
            com.google.android.material.datepicker.a r6 = r6.f24225c
            r6.mo31598a(r0)
            return r0
        L_0x00cd:
            com.google.android.material.datepicker.b r6 = r5.f24272h
            com.google.android.material.datepicker.a r6 = r6.f24223a
            r6.mo31598a(r0)
            return r0
        L_0x00d5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.b r6 = r5.f24272h
            com.google.android.material.datepicker.a r6 = r6.f24229g
            r6.mo31598a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C8505g.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31617a() {
        return this.f24270f.mo31583a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31618a(int i) {
        return mo31617a() + (i - 1);
    }
}
