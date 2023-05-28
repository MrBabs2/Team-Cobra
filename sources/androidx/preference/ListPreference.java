package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p003c.C0413g;
import androidx.preference.Preference;

public class ListPreference extends DialogPreference {

    /* renamed from: a0 */
    private CharSequence[] f2234a0;

    /* renamed from: b0 */
    private CharSequence[] f2235b0;

    /* renamed from: c0 */
    private String f2236c0;

    /* renamed from: d0 */
    private String f2237d0;

    /* renamed from: e0 */
    private boolean f2238e0;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C0558a implements Preference.C0566f<ListPreference> {

        /* renamed from: a */
        private static C0558a f2240a;

        private C0558a() {
        }

        /* renamed from: a */
        public static C0558a m2689a() {
            if (f2240a == null) {
                f2240a = new C0558a();
            }
            return f2240a;
        }

        /* renamed from: a */
        public CharSequence mo3141a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.mo3146e0())) {
                return listPreference.mo3206d().getString(C0613r.not_set);
            }
            return listPreference.mo3146e0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.ListPreference, i, i2);
        this.f2234a0 = C0413g.m1995d(obtainStyledAttributes, C0615t.ListPreference_entries, C0615t.ListPreference_android_entries);
        this.f2235b0 = C0413g.m1995d(obtainStyledAttributes, C0615t.ListPreference_entryValues, C0615t.ListPreference_android_entryValues);
        int i3 = C0615t.ListPreference_useSimpleSummaryProvider;
        if (C0413g.m1986a(obtainStyledAttributes, i3, i3, false)) {
            mo3185a((Preference.C0566f) C0558a.m2689a());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0615t.Preference, i, i2);
        this.f2237d0 = C0413g.m1992b(obtainStyledAttributes2, C0615t.Preference_summary, C0615t.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: h0 */
    private int mo3125h0() {
        return mo3143d(this.f2236c0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Parcelable mo3128T() {
        Parcelable T = super.mo3128T();
        if (mo3166K()) {
            return T;
        }
        SavedState savedState = new SavedState(T);
        savedState.f2239f = mo3148g0();
        return savedState;
    }

    /* renamed from: a */
    public void mo3142a(CharSequence charSequence) {
        super.mo3142a(charSequence);
        if (charSequence == null && this.f2237d0 != null) {
            this.f2237d0 = null;
        } else if (charSequence != null && !charSequence.equals(this.f2237d0)) {
            this.f2237d0 = charSequence.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3132b(Object obj) {
        mo3145e(mo3194b((String) obj));
    }

    /* renamed from: d */
    public int mo3143d(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f2235b0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f2235b0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: d0 */
    public CharSequence[] mo3144d0() {
        return this.f2234a0;
    }

    /* renamed from: e */
    public void mo3145e(String str) {
        boolean z = !TextUtils.equals(this.f2236c0, str);
        if (z || !this.f2238e0) {
            this.f2236c0 = str;
            this.f2238e0 = true;
            mo3203c(str);
            if (z) {
                mo3124N();
            }
        }
    }

    /* renamed from: e0 */
    public CharSequence mo3146e0() {
        CharSequence[] charSequenceArr;
        int h0 = mo3125h0();
        if (h0 < 0 || (charSequenceArr = this.f2234a0) == null) {
            return null;
        }
        return charSequenceArr[h0];
    }

    /* renamed from: f0 */
    public CharSequence[] mo3147f0() {
        return this.f2235b0;
    }

    /* renamed from: g0 */
    public String mo3148g0() {
        return this.f2236c0;
    }

    /* renamed from: x */
    public CharSequence mo3149x() {
        if (mo3226y() != null) {
            return mo3226y().mo3141a(this);
        }
        Object e0 = mo3146e0();
        CharSequence x = super.mo3149x();
        String str = this.f2237d0;
        if (str == null) {
            return x;
        }
        Object[] objArr = new Object[1];
        if (e0 == null) {
            e0 = "";
        }
        objArr[0] = e0;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, x)) {
            return x;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0557a();

        /* renamed from: f */
        String f2239f;

        /* renamed from: androidx.preference.ListPreference$SavedState$a */
        static class C0557a implements Parcelable.Creator<SavedState> {
            C0557a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2239f = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2239f);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo3130a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3131a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo3131a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3131a(savedState.getSuperState());
        mo3145e(savedState.f2239f);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.dialogPreferenceStyle, 16842897));
    }
}
