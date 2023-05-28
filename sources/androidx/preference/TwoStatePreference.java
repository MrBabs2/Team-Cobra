package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: U */
    protected boolean f2325U;

    /* renamed from: V */
    private CharSequence f2326V;

    /* renamed from: W */
    private CharSequence f2327W;

    /* renamed from: X */
    private boolean f2328X;

    /* renamed from: Y */
    private boolean f2329Y;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3116Q() {
        super.mo3116Q();
        boolean z = !mo3117X();
        if (mo3192a((Object) Boolean.valueOf(z))) {
            mo3277f(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Parcelable mo3128T() {
        Parcelable T = super.mo3128T();
        if (mo3166K()) {
            return T;
        }
        SavedState savedState = new SavedState(T);
        savedState.f2330f = mo3117X();
        return savedState;
    }

    /* renamed from: V */
    public boolean mo3129V() {
        if ((this.f2329Y ? this.f2325U : !this.f2325U) || super.mo3129V()) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public boolean mo3117X() {
        return this.f2325U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo3130a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3132b(Object obj) {
        if (obj == null) {
            obj = false;
        }
        mo3277f(mo3193a(((Boolean) obj).booleanValue()));
    }

    /* renamed from: c */
    public void mo3275c(CharSequence charSequence) {
        this.f2327W = charSequence;
        if (!mo3117X()) {
            mo3124N();
        }
    }

    /* renamed from: d */
    public void mo3276d(CharSequence charSequence) {
        this.f2326V = charSequence;
        if (mo3117X()) {
            mo3124N();
        }
    }

    /* renamed from: f */
    public void mo3277f(boolean z) {
        boolean z2 = this.f2325U != z;
        if (z2 || !this.f2328X) {
            this.f2325U = z;
            this.f2328X = true;
            mo3204c(z);
            if (z2) {
                mo3198b(mo3129V());
                mo3124N();
            }
        }
    }

    /* renamed from: g */
    public void mo3278g(boolean z) {
        this.f2329Y = z;
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0576a();

        /* renamed from: f */
        boolean f2330f;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$a */
        static class C0576a implements Parcelable.Creator<SavedState> {
            C0576a() {
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
            this.f2330f = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2330f ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
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
        mo3277f(savedState.f2330f);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3274b(C0607l lVar) {
        mo3273b(lVar.mo3383a(16908304));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3273b(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f2325U
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f2326V
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f2326V
            r5.setText(r0)
        L_0x001a:
            r0 = 0
            goto L_0x002e
        L_0x001c:
            boolean r1 = r4.f2325U
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r1 = r4.f2327W
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r0 = r4.f2327W
            r5.setText(r0)
            goto L_0x001a
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r4.mo3149x()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003e
            r5.setText(r1)
            r0 = 0
        L_0x003e:
            r1 = 8
            if (r0 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = 8
        L_0x0045:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004e
            r5.setVisibility(r2)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo3273b(android.view.View):void");
    }
}
