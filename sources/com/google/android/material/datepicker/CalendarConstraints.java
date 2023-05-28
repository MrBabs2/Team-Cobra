package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C8484a();

    /* renamed from: f */
    private final Month f24203f;

    /* renamed from: g */
    private final Month f24204g;

    /* renamed from: h */
    private final Month f24205h;

    /* renamed from: i */
    private final DateValidator f24206i;

    /* renamed from: j */
    private final int f24207j;

    /* renamed from: k */
    private final int f24208k;

    public interface DateValidator extends Parcelable {
        /* renamed from: d */
        boolean mo31568d(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    static class C8484a implements Parcelable.Creator<CalendarConstraints> {
        C8484a() {
        }

        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (C8484a) null);
        }

        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, C8484a aVar) {
        this(month, month2, month3, dateValidator);
    }

    /* renamed from: a */
    public DateValidator mo31557a() {
        return this.f24206i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Month mo31559b() {
        return this.f24204g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo31560c() {
        return this.f24208k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Month mo31561d() {
        return this.f24205h;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Month mo31563e() {
        return this.f24203f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f24203f.equals(calendarConstraints.f24203f) || !this.f24204g.equals(calendarConstraints.f24204g) || !this.f24205h.equals(calendarConstraints.f24205h) || !this.f24206i.equals(calendarConstraints.f24206i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo31565f() {
        return this.f24207j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24203f, this.f24204g, this.f24205h, this.f24206i});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f24203f, 0);
        parcel.writeParcelable(this.f24204g, 0);
        parcel.writeParcelable(this.f24205h, 0);
        parcel.writeParcelable(this.f24206i, 0);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f24203f = month;
        this.f24204g = month2;
        this.f24205h = month3;
        this.f24206i = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3.compareTo(month2) <= 0) {
            this.f24208k = month.mo31586b(month2) + 1;
            this.f24207j = (month2.f24214i - month.f24214i) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Month mo31558a(Month month) {
        if (month.compareTo(this.f24203f) < 0) {
            return this.f24203f;
        }
        return month.compareTo(this.f24204g) > 0 ? this.f24204g : month;
    }
}
