package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.core.content.p003c.C0413g;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {

    /* renamed from: a0 */
    private String f2230a0;

    /* renamed from: b0 */
    private C0555a f2231b0;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public interface C0555a {
        /* renamed from: a */
        void mo3139a(EditText editText);
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    public static final class C0556b implements Preference.C0566f<EditTextPreference> {

        /* renamed from: a */
        private static C0556b f2233a;

        private C0556b() {
        }

        /* renamed from: a */
        public static C0556b m2673a() {
            if (f2233a == null) {
                f2233a = new C0556b();
            }
            return f2233a;
        }

        /* renamed from: a */
        public CharSequence mo3141a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.mo3135e0())) {
                return editTextPreference.mo3206d().getString(C0613r.not_set);
            }
            return editTextPreference.mo3135e0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.EditTextPreference, i, i2);
        int i3 = C0615t.EditTextPreference_useSimpleSummaryProvider;
        if (C0413g.m1986a(obtainStyledAttributes, i3, i3, false)) {
            mo3185a((Preference.C0566f) C0556b.m2673a());
        }
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
        savedState.f2232f = mo3135e0();
        return savedState;
    }

    /* renamed from: V */
    public boolean mo3129V() {
        return TextUtils.isEmpty(this.f2230a0) || super.mo3129V();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo3130a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3132b(Object obj) {
        mo3133d(mo3194b((String) obj));
    }

    /* renamed from: d */
    public void mo3133d(String str) {
        boolean V = mo3129V();
        this.f2230a0 = str;
        mo3203c(str);
        boolean V2 = mo3129V();
        if (V2 != V) {
            mo3198b(V2);
        }
        mo3124N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public C0555a mo3134d0() {
        return this.f2231b0;
    }

    /* renamed from: e0 */
    public String mo3135e0() {
        return this.f2230a0;
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0554a();

        /* renamed from: f */
        String f2232f;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$a */
        static class C0554a implements Parcelable.Creator<SavedState> {
            C0554a() {
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
            this.f2232f = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2232f);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
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
        mo3133d(savedState.f2232f);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.editTextPreferenceStyle, 16842898));
    }
}
