package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p003c.C0413g;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p050l.p066e.C4881g;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: U */
    final C4881g<String, Long> f2288U;

    /* renamed from: V */
    private final Handler f2289V;

    /* renamed from: W */
    private List<Preference> f2290W;

    /* renamed from: X */
    private boolean f2291X;

    /* renamed from: Y */
    private int f2292Y;

    /* renamed from: Z */
    private boolean f2293Z;

    /* renamed from: a0 */
    private int f2294a0;

    /* renamed from: b0 */
    private C0569b f2295b0;

    /* renamed from: c0 */
    private final Runnable f2296c0;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class C0568a implements Runnable {
        C0568a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f2288U.clear();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface C0569b {
        /* renamed from: a */
        void mo3251a();
    }

    /* renamed from: androidx.preference.PreferenceGroup$c */
    public interface C0570c {
        /* renamed from: a */
        int mo3252a(String str);

        /* renamed from: c */
        int mo3253c(Preference preference);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2288U = new C4881g<>();
        this.f2289V = new Handler();
        this.f2291X = true;
        this.f2292Y = 0;
        this.f2293Z = false;
        this.f2294a0 = Integer.MAX_VALUE;
        this.f2295b0 = null;
        this.f2296c0 = new C0568a();
        this.f2290W = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.PreferenceGroup, i, i2);
        int i3 = C0615t.PreferenceGroup_orderingFromXml;
        this.f2291X = C0413g.m1986a(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(C0615t.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = C0615t.PreferenceGroup_initialExpandedChildrenCount;
            mo3246h(C0413g.m1978a(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: P */
    public void mo3170P() {
        super.mo3170P();
        this.f2293Z = true;
        int Z = mo3119Z();
        for (int i = 0; i < Z; i++) {
            mo3245g(i).mo3170P();
        }
    }

    /* renamed from: R */
    public void mo3171R() {
        super.mo3171R();
        this.f2293Z = false;
        int Z = mo3119Z();
        for (int i = 0; i < Z; i++) {
            mo3245g(i).mo3171R();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Parcelable mo3128T() {
        return new SavedState(super.mo3128T(), this.f2294a0);
    }

    /* renamed from: X */
    public int mo3117X() {
        return this.f2294a0;
    }

    /* renamed from: Y */
    public C0569b mo3118Y() {
        return this.f2295b0;
    }

    /* renamed from: Z */
    public int mo3119Z() {
        return this.f2290W.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3182a(Bundle bundle) {
        super.mo3182a(bundle);
        int Z = mo3119Z();
        for (int i = 0; i < Z; i++) {
            mo3245g(i).mo3182a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public boolean mo3237a0() {
        return true;
    }

    /* renamed from: b */
    public void mo3238b(Preference preference) {
        mo3241c(preference);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo3239b0() {
        synchronized (this) {
            Collections.sort(this.f2290W);
        }
    }

    /* renamed from: c */
    public boolean mo3241c(Preference preference) {
        long j;
        if (this.f2290W.contains(preference)) {
            return true;
        }
        if (preference.mo3218p() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.mo3221s() != null) {
                preferenceGroup = preferenceGroup.mo3221s();
            }
            String p = preference.mo3218p();
            if (preferenceGroup.mo3240c((CharSequence) p) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + p + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.mo3220r() == Integer.MAX_VALUE) {
            if (this.f2291X) {
                int i = this.f2292Y;
                this.f2292Y = i + 1;
                preference.mo3211e(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).mo3244f(this.f2291X);
            }
        }
        int binarySearch = Collections.binarySearch(this.f2290W, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * -1) - 1;
        }
        if (!mo3242d(preference)) {
            return false;
        }
        synchronized (this) {
            this.f2290W.add(binarySearch, preference);
        }
        C0600j v = mo3224v();
        String p2 = preference.mo3218p();
        if (p2 == null || !this.f2288U.containsKey(p2)) {
            j = v.mo3372b();
        } else {
            j = this.f2288U.get(p2).longValue();
            this.f2288U.remove(p2);
        }
        preference.mo3189a(v, j);
        preference.mo3187a(this);
        if (this.f2293Z) {
            preference.mo3170P();
        }
        mo3169O();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo3242d(Preference preference) {
        preference.mo3196b(this, mo3129V());
        return true;
    }

    /* renamed from: e */
    public boolean mo3243e(Preference preference) {
        boolean f = m2791f(preference);
        mo3169O();
        return f;
    }

    /* renamed from: f */
    public void mo3244f(boolean z) {
        this.f2291X = z;
    }

    /* renamed from: g */
    public Preference mo3245g(int i) {
        return this.f2290W.get(i);
    }

    /* renamed from: h */
    public void mo3246h(int i) {
        if (i != Integer.MAX_VALUE && !mo3163H()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f2294a0 = i;
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0567a();

        /* renamed from: f */
        int f2297f;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$a */
        static class C0567a implements Parcelable.Creator<SavedState> {
            C0567a() {
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
            this.f2297f = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2297f);
        }

        SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f2297f = i;
        }
    }

    /* renamed from: f */
    private boolean m2791f(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.mo3172S();
            if (preference.mo3221s() == this) {
                preference.mo3187a((PreferenceGroup) null);
            }
            remove = this.f2290W.remove(preference);
            if (remove) {
                String p = preference.mo3218p();
                if (p != null) {
                    this.f2288U.put(p, Long.valueOf(preference.mo3216m()));
                    this.f2289V.removeCallbacks(this.f2296c0);
                    this.f2289V.post(this.f2296c0);
                }
                if (this.f2293Z) {
                    preference.mo3171R();
                }
            }
        }
        return remove;
    }

    /* renamed from: b */
    public void mo3198b(boolean z) {
        super.mo3198b(z);
        int Z = mo3119Z();
        for (int i = 0; i < Z; i++) {
            mo3245g(i).mo3196b(this, z);
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
        this.f2294a0 = savedState.f2297f;
        super.mo3131a(savedState.getSuperState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3195b(Bundle bundle) {
        super.mo3195b(bundle);
        int Z = mo3119Z();
        for (int i = 0; i < Z; i++) {
            mo3245g(i).mo3195b(bundle);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public <T extends Preference> T mo3240c(CharSequence charSequence) {
        T c;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(mo3218p(), charSequence)) {
            return this;
        } else {
            int Z = mo3119Z();
            for (int i = 0; i < Z; i++) {
                T g = mo3245g(i);
                if (TextUtils.equals(g.mo3218p(), charSequence)) {
                    return g;
                }
                if ((g instanceof PreferenceGroup) && (c = ((PreferenceGroup) g).mo3240c(charSequence)) != null) {
                    return c;
                }
            }
            return null;
        }
    }
}
