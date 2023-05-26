package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.core.content.p003c.C0413g;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: a0 */
    private CharSequence[] f2241a0;

    /* renamed from: b0 */
    private CharSequence[] f2242b0;

    /* renamed from: c0 */
    private Set<String> f2243c0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2243c0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.MultiSelectListPreference, i, i2);
        this.f2241a0 = C0413g.m1995d(obtainStyledAttributes, C0615t.MultiSelectListPreference_entries, C0615t.MultiSelectListPreference_android_entries);
        this.f2242b0 = C0413g.m1995d(obtainStyledAttributes, C0615t.MultiSelectListPreference_entryValues, C0615t.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Parcelable mo3128T() {
        Parcelable T = super.mo3128T();
        if (mo3166K()) {
            return T;
        }
        SavedState savedState = new SavedState(T);
        savedState.f2244f = mo3157f0();
        return savedState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo3130a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3132b(Object obj) {
        mo3154c(mo3178a((Set<String>) (Set) obj));
    }

    /* renamed from: c */
    public void mo3154c(Set<String> set) {
        this.f2243c0.clear();
        this.f2243c0.addAll(set);
        mo3200b(set);
        mo3124N();
    }

    /* renamed from: d0 */
    public CharSequence[] mo3155d0() {
        return this.f2241a0;
    }

    /* renamed from: e0 */
    public CharSequence[] mo3156e0() {
        return this.f2242b0;
    }

    /* renamed from: f0 */
    public Set<String> mo3157f0() {
        return this.f2243c0;
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
        mo3154c(savedState.f2244f);
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0559a();

        /* renamed from: f */
        Set<String> f2244f;

        /* renamed from: androidx.preference.MultiSelectListPreference$SavedState$a */
        static class C0559a implements Parcelable.Creator<SavedState> {
            C0559a() {
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
            int readInt = parcel.readInt();
            this.f2244f = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f2244f, strArr);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2244f.size());
            Set<String> set = this.f2244f;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.dialogPreferenceStyle, 16842897));
    }
}
