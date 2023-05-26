package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C8486a();

    /* renamed from: f */
    private final Calendar f24211f;

    /* renamed from: g */
    private final String f24212g = C8514m.m27704f().format(this.f24211f.getTime());

    /* renamed from: h */
    final int f24213h;

    /* renamed from: i */
    final int f24214i = this.f24211f.get(1);

    /* renamed from: j */
    final int f24215j = this.f24211f.getMaximum(7);

    /* renamed from: k */
    final int f24216k = this.f24211f.getActualMaximum(5);

    /* renamed from: com.google.android.material.datepicker.Month$a */
    static class C8486a implements Parcelable.Creator<Month> {
        C8486a() {
        }

        public Month createFromParcel(Parcel parcel) {
            return Month.m27631a(parcel.readInt(), parcel.readInt());
        }

        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = C8514m.m27694a(calendar);
        this.f24211f = a;
        this.f24213h = a.get(2);
        this.f24211f.getTimeInMillis();
    }

    /* renamed from: a */
    static Month m27631a(int i, int i2) {
        Calendar e = C8514m.m27703e();
        e.set(1, i);
        e.set(2, i2);
        return new Month(e);
    }

    /* renamed from: o */
    static Month m27632o() {
        return new Month(C8514m.m27700c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo31586b(Month month) {
        if (this.f24211f instanceof GregorianCalendar) {
            return ((month.f24214i - this.f24214i) * 12) + (month.f24213h - this.f24213h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo31589d() {
        return this.f24212g;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo31591e() {
        return this.f24211f.getTimeInMillis();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f24213h == month.f24213h && this.f24214i == month.f24214i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24213h), Integer.valueOf(this.f24214i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24214i);
        parcel.writeInt(this.f24213h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Month mo31587b(int i) {
        Calendar a = C8514m.m27694a(this.f24211f);
        a.add(2, i);
        return new Month(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31583a() {
        int firstDayOfWeek = this.f24211f.get(7) - this.f24211f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f24215j : firstDayOfWeek;
    }

    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f24211f.compareTo(month.f24211f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo31585a(int i) {
        Calendar a = C8514m.m27694a(this.f24211f);
        a.set(5, i);
        return a.getTimeInMillis();
    }
}
