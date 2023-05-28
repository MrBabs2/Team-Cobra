package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.p003c.C0413g;
import androidx.preference.C0600j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.p085e0.C5034c;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private Object f2245A;

    /* renamed from: B */
    private boolean f2246B;

    /* renamed from: C */
    private boolean f2247C;

    /* renamed from: D */
    private boolean f2248D;

    /* renamed from: E */
    private boolean f2249E;

    /* renamed from: F */
    private boolean f2250F;

    /* renamed from: G */
    private boolean f2251G;

    /* renamed from: H */
    private boolean f2252H;

    /* renamed from: I */
    private boolean f2253I;

    /* renamed from: J */
    private boolean f2254J;

    /* renamed from: K */
    private boolean f2255K;

    /* renamed from: L */
    private int f2256L;

    /* renamed from: M */
    private int f2257M;

    /* renamed from: N */
    private C0562b f2258N;

    /* renamed from: O */
    private List<Preference> f2259O;

    /* renamed from: P */
    private PreferenceGroup f2260P;

    /* renamed from: Q */
    private boolean f2261Q;

    /* renamed from: R */
    private C0565e f2262R;

    /* renamed from: S */
    private C0566f f2263S;

    /* renamed from: T */
    private final View.OnClickListener f2264T;

    /* renamed from: f */
    private Context f2265f;

    /* renamed from: g */
    private C0600j f2266g;

    /* renamed from: h */
    private C0583e f2267h;

    /* renamed from: i */
    private long f2268i;

    /* renamed from: j */
    private boolean f2269j;

    /* renamed from: k */
    private C0563c f2270k;

    /* renamed from: l */
    private C0564d f2271l;

    /* renamed from: m */
    private int f2272m;

    /* renamed from: n */
    private int f2273n;

    /* renamed from: o */
    private CharSequence f2274o;

    /* renamed from: p */
    private CharSequence f2275p;

    /* renamed from: q */
    private int f2276q;

    /* renamed from: r */
    private Drawable f2277r;

    /* renamed from: s */
    private String f2278s;

    /* renamed from: t */
    private Intent f2279t;

    /* renamed from: u */
    private String f2280u;

    /* renamed from: v */
    private Bundle f2281v;

    /* renamed from: w */
    private boolean f2282w;

    /* renamed from: x */
    private boolean f2283x;

    /* renamed from: y */
    private boolean f2284y;

    /* renamed from: z */
    private String f2285z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C0560a();

        /* renamed from: androidx.preference.Preference$BaseSavedState$a */
        static class C0560a implements Parcelable.Creator<BaseSavedState> {
            C0560a() {
            }

            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$a */
    class C0561a implements View.OnClickListener {
        C0561a() {
        }

        public void onClick(View view) {
            Preference.this.mo3113a(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    interface C0562b {
        /* renamed from: a */
        void mo3230a(Preference preference);

        /* renamed from: b */
        void mo3231b(Preference preference);

        /* renamed from: d */
        void mo3232d(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C0563c {
        /* renamed from: a */
        boolean mo3233a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C0564d {
        boolean onPreferenceClick(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    private static class C0565e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private final Preference f2287f;

        C0565e(Preference preference) {
            this.f2287f = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence x = this.f2287f.mo3149x();
            if (this.f2287f.mo3164I() && !TextUtils.isEmpty(x)) {
                contextMenu.setHeaderTitle(x);
                contextMenu.add(0, 0, 0, C0613r.copy).setOnMenuItemClickListener(this);
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence x = this.f2287f.mo3149x();
            ((ClipboardManager) this.f2287f.mo3206d().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", x));
            Toast.makeText(this.f2287f.mo3206d(), this.f2287f.mo3206d().getString(C0613r.preference_copied, new Object[]{x}), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$f */
    public interface C0566f<T extends Preference> {
        /* renamed from: a */
        CharSequence mo3141a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2272m = Integer.MAX_VALUE;
        this.f2273n = 0;
        this.f2282w = true;
        this.f2283x = true;
        this.f2284y = true;
        this.f2246B = true;
        this.f2247C = true;
        this.f2248D = true;
        this.f2249E = true;
        this.f2250F = true;
        this.f2252H = true;
        this.f2255K = true;
        this.f2256L = C0612q.preference;
        this.f2264T = new C0561a();
        this.f2265f = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.Preference, i, i2);
        this.f2276q = C0413g.m1989b(obtainStyledAttributes, C0615t.Preference_icon, C0615t.Preference_android_icon, 0);
        this.f2278s = C0413g.m1992b(obtainStyledAttributes, C0615t.Preference_key, C0615t.Preference_android_key);
        this.f2274o = C0413g.m1994c(obtainStyledAttributes, C0615t.Preference_title, C0615t.Preference_android_title);
        this.f2275p = C0413g.m1994c(obtainStyledAttributes, C0615t.Preference_summary, C0615t.Preference_android_summary);
        this.f2272m = C0413g.m1978a(obtainStyledAttributes, C0615t.Preference_order, C0615t.Preference_android_order, Integer.MAX_VALUE);
        this.f2280u = C0413g.m1992b(obtainStyledAttributes, C0615t.Preference_fragment, C0615t.Preference_android_fragment);
        this.f2256L = C0413g.m1989b(obtainStyledAttributes, C0615t.Preference_layout, C0615t.Preference_android_layout, C0612q.preference);
        this.f2257M = C0413g.m1989b(obtainStyledAttributes, C0615t.Preference_widgetLayout, C0615t.Preference_android_widgetLayout, 0);
        this.f2282w = C0413g.m1986a(obtainStyledAttributes, C0615t.Preference_enabled, C0615t.Preference_android_enabled, true);
        this.f2283x = C0413g.m1986a(obtainStyledAttributes, C0615t.Preference_selectable, C0615t.Preference_android_selectable, true);
        this.f2284y = C0413g.m1986a(obtainStyledAttributes, C0615t.Preference_persistent, C0615t.Preference_android_persistent, true);
        this.f2285z = C0413g.m1992b(obtainStyledAttributes, C0615t.Preference_dependency, C0615t.Preference_android_dependency);
        int i3 = C0615t.Preference_allowDividerAbove;
        this.f2249E = C0413g.m1986a(obtainStyledAttributes, i3, i3, this.f2283x);
        int i4 = C0615t.Preference_allowDividerBelow;
        this.f2250F = C0413g.m1986a(obtainStyledAttributes, i4, i4, this.f2283x);
        if (obtainStyledAttributes.hasValue(C0615t.Preference_defaultValue)) {
            this.f2245A = mo3130a(obtainStyledAttributes, C0615t.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(C0615t.Preference_android_defaultValue)) {
            this.f2245A = mo3130a(obtainStyledAttributes, C0615t.Preference_android_defaultValue);
        }
        this.f2255K = C0413g.m1986a(obtainStyledAttributes, C0615t.Preference_shouldDisableView, C0615t.Preference_android_shouldDisableView, true);
        boolean hasValue = obtainStyledAttributes.hasValue(C0615t.Preference_singleLineTitle);
        this.f2251G = hasValue;
        if (hasValue) {
            this.f2252H = C0413g.m1986a(obtainStyledAttributes, C0615t.Preference_singleLineTitle, C0615t.Preference_android_singleLineTitle, true);
        }
        this.f2253I = C0413g.m1986a(obtainStyledAttributes, C0615t.Preference_iconSpaceReserved, C0615t.Preference_android_iconSpaceReserved, false);
        int i5 = C0615t.Preference_isPreferenceVisible;
        this.f2248D = C0413g.m1986a(obtainStyledAttributes, i5, i5, true);
        int i6 = C0615t.Preference_enableCopying;
        this.f2254J = C0413g.m1986a(obtainStyledAttributes, i6, i6, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: X */
    private void mo3117X() {
        if (mo3222t() != null) {
            mo3191a(true, this.f2245A);
        } else if (!mo3174W() || !mo3225w().contains(this.f2278s)) {
            Object obj = this.f2245A;
            if (obj != null) {
                mo3191a(false, obj);
            }
        } else {
            mo3191a(true, (Object) null);
        }
    }

    /* renamed from: Y */
    private void mo3118Y() {
        if (!TextUtils.isEmpty(this.f2285z)) {
            Preference a = mo3177a(this.f2285z);
            if (a != null) {
                a.mo3238b(this);
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f2285z + "\" not found for preference \"" + this.f2278s + "\" (title: \"" + this.f2274o + "\"");
        }
    }

    /* renamed from: Z */
    private void mo3119Z() {
        Preference a;
        String str = this.f2285z;
        if (str != null && (a = mo3177a(str)) != null) {
            a.mo3241c(this);
        }
    }

    /* renamed from: B */
    public CharSequence mo3161B() {
        return this.f2274o;
    }

    /* renamed from: D */
    public final int mo3162D() {
        return this.f2257M;
    }

    /* renamed from: H */
    public boolean mo3163H() {
        return !TextUtils.isEmpty(this.f2278s);
    }

    /* renamed from: I */
    public boolean mo3164I() {
        return this.f2254J;
    }

    /* renamed from: J */
    public boolean mo3165J() {
        return this.f2282w && this.f2246B && this.f2247C;
    }

    /* renamed from: K */
    public boolean mo3166K() {
        return this.f2284y;
    }

    /* renamed from: L */
    public boolean mo3167L() {
        return this.f2283x;
    }

    /* renamed from: M */
    public final boolean mo3168M() {
        return this.f2248D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo3124N() {
        C0562b bVar = this.f2258N;
        if (bVar != null) {
            bVar.mo3232d(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo3169O() {
        C0562b bVar = this.f2258N;
        if (bVar != null) {
            bVar.mo3230a(this);
        }
    }

    /* renamed from: P */
    public void mo3170P() {
        mo3118Y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3116Q() {
    }

    /* renamed from: R */
    public void mo3171R() {
        mo3119Z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo3172S() {
        mo3119Z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Parcelable mo3128T() {
        this.f2261Q = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* renamed from: U */
    public void mo3173U() {
        C0600j.C0603c d;
        if (mo3165J() && mo3167L()) {
            mo3116Q();
            C0564d dVar = this.f2271l;
            if (dVar == null || !dVar.onPreferenceClick(this)) {
                C0600j v = mo3224v();
                if ((v == null || (d = v.mo3374d()) == null || !d.onPreferenceTreeClick(this)) && this.f2279t != null) {
                    mo3206d().startActivity(this.f2279t);
                }
            }
        }
    }

    /* renamed from: V */
    public boolean mo3129V() {
        return !mo3165J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo3174W() {
        return this.f2266g != null && mo3166K() && mo3163H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo3130a(TypedArray typedArray, int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3179a() {
    }

    /* renamed from: a */
    public void mo3180a(Intent intent) {
        this.f2279t = intent;
    }

    @Deprecated
    /* renamed from: a */
    public void mo3190a(C5034c cVar) {
    }

    /* renamed from: b */
    public void mo3197b(CharSequence charSequence) {
        if ((charSequence == null && this.f2274o != null) || (charSequence != null && !charSequence.equals(this.f2274o))) {
            this.f2274o = charSequence;
            mo3124N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3132b(Object obj) {
    }

    /* renamed from: c */
    public void mo3201c(int i) {
        mo3181a(C4800a.m7936c(this.f2265f, i));
        this.f2276q = i;
    }

    /* renamed from: d */
    public void mo3207d(int i) {
        this.f2256L = i;
    }

    /* renamed from: e */
    public Bundle mo3210e() {
        if (this.f2281v == null) {
            this.f2281v = new Bundle();
        }
        return this.f2281v;
    }

    /* renamed from: f */
    public void mo3213f(int i) {
        mo3197b((CharSequence) this.f2265f.getString(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public StringBuilder mo3214i() {
        StringBuilder sb = new StringBuilder();
        CharSequence B = mo3161B();
        if (!TextUtils.isEmpty(B)) {
            sb.append(B);
            sb.append(' ');
        }
        CharSequence x = mo3149x();
        if (!TextUtils.isEmpty(x)) {
            sb.append(x);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: l */
    public String mo3215l() {
        return this.f2280u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo3216m() {
        return this.f2268i;
    }

    /* renamed from: o */
    public Intent mo3217o() {
        return this.f2279t;
    }

    /* renamed from: p */
    public String mo3218p() {
        return this.f2278s;
    }

    /* renamed from: q */
    public final int mo3219q() {
        return this.f2256L;
    }

    /* renamed from: r */
    public int mo3220r() {
        return this.f2272m;
    }

    /* renamed from: s */
    public PreferenceGroup mo3221s() {
        return this.f2260P;
    }

    /* renamed from: t */
    public C0583e mo3222t() {
        C0583e eVar = this.f2267h;
        if (eVar != null) {
            return eVar;
        }
        C0600j jVar = this.f2266g;
        if (jVar != null) {
            return jVar.mo3376f();
        }
        return null;
    }

    public String toString() {
        return mo3214i().toString();
    }

    /* renamed from: v */
    public C0600j mo3224v() {
        return this.f2266g;
    }

    /* renamed from: w */
    public SharedPreferences mo3225w() {
        if (this.f2266g == null || mo3222t() != null) {
            return null;
        }
        return this.f2266g.mo3378h();
    }

    /* renamed from: x */
    public CharSequence mo3149x() {
        if (mo3226y() != null) {
            return mo3226y().mo3141a(this);
        }
        return this.f2275p;
    }

    /* renamed from: y */
    public final C0566f mo3226y() {
        return this.f2263S;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3114a(androidx.preference.C0607l r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.itemView
            android.view.View$OnClickListener r1 = r8.f2264T
            r0.setOnClickListener(r1)
            int r1 = r8.f2273n
            r0.setId(r1)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r1 = r9.mo3383a((int) r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r5 = r8.mo3149x()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0034
            r1.setText(r5)
            r1.setVisibility(r3)
            int r1 = r1.getCurrentTextColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0038
        L_0x0034:
            r1.setVisibility(r4)
        L_0x0037:
            r1 = r2
        L_0x0038:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.mo3383a((int) r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0075
            java.lang.CharSequence r6 = r8.mo3161B()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0072
            r5.setText(r6)
            r5.setVisibility(r3)
            boolean r6 = r8.f2251G
            if (r6 == 0) goto L_0x005c
            boolean r6 = r8.f2252H
            r5.setSingleLine(r6)
        L_0x005c:
            boolean r6 = r8.mo3167L()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.mo3165J()
            if (r6 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            int r1 = r1.intValue()
            r5.setTextColor(r1)
            goto L_0x0075
        L_0x0072:
            r5.setVisibility(r4)
        L_0x0075:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r9.mo3383a((int) r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5 = 4
            if (r1 == 0) goto L_0x00b1
            int r6 = r8.f2276q
            if (r6 != 0) goto L_0x0089
            android.graphics.drawable.Drawable r6 = r8.f2277r
            if (r6 == 0) goto L_0x009e
        L_0x0089:
            android.graphics.drawable.Drawable r6 = r8.f2277r
            if (r6 != 0) goto L_0x0097
            android.content.Context r6 = r8.f2265f
            int r7 = r8.f2276q
            android.graphics.drawable.Drawable r6 = p050l.p051a.p052k.p053a.C4800a.m7936c(r6, r7)
            r8.f2277r = r6
        L_0x0097:
            android.graphics.drawable.Drawable r6 = r8.f2277r
            if (r6 == 0) goto L_0x009e
            r1.setImageDrawable(r6)
        L_0x009e:
            android.graphics.drawable.Drawable r6 = r8.f2277r
            if (r6 == 0) goto L_0x00a6
            r1.setVisibility(r3)
            goto L_0x00b1
        L_0x00a6:
            boolean r6 = r8.f2253I
            if (r6 == 0) goto L_0x00ac
            r6 = 4
            goto L_0x00ae
        L_0x00ac:
            r6 = 8
        L_0x00ae:
            r1.setVisibility(r6)
        L_0x00b1:
            int r1 = androidx.preference.C0611p.icon_frame
            android.view.View r1 = r9.mo3383a((int) r1)
            if (r1 != 0) goto L_0x00c0
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.mo3383a((int) r1)
        L_0x00c0:
            if (r1 == 0) goto L_0x00d2
            android.graphics.drawable.Drawable r6 = r8.f2277r
            if (r6 == 0) goto L_0x00ca
            r1.setVisibility(r3)
            goto L_0x00d2
        L_0x00ca:
            boolean r3 = r8.f2253I
            if (r3 == 0) goto L_0x00cf
            r4 = 4
        L_0x00cf:
            r1.setVisibility(r4)
        L_0x00d2:
            boolean r1 = r8.f2255K
            if (r1 == 0) goto L_0x00de
            boolean r1 = r8.mo3165J()
            r8.m2704a((android.view.View) r0, (boolean) r1)
            goto L_0x00e2
        L_0x00de:
            r1 = 1
            r8.m2704a((android.view.View) r0, (boolean) r1)
        L_0x00e2:
            boolean r1 = r8.mo3167L()
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r3 = r8.f2249E
            r9.mo3384a((boolean) r3)
            boolean r3 = r8.f2250F
            r9.mo3386b(r3)
            boolean r9 = r8.mo3164I()
            if (r9 == 0) goto L_0x0107
            androidx.preference.Preference$e r3 = r8.f2262R
            if (r3 != 0) goto L_0x0107
            androidx.preference.Preference$e r3 = new androidx.preference.Preference$e
            r3.<init>(r8)
            r8.f2262R = r3
        L_0x0107:
            if (r9 == 0) goto L_0x010c
            androidx.preference.Preference$e r3 = r8.f2262R
            goto L_0x010d
        L_0x010c:
            r3 = r2
        L_0x010d:
            r0.setOnCreateContextMenuListener(r3)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x011a
            if (r1 != 0) goto L_0x011a
            p050l.p075h.p084l.C5071v.m9161a((android.view.View) r0, (android.graphics.drawable.Drawable) r2)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo3114a(androidx.preference.l):void");
    }

    /* renamed from: d */
    public void mo3209d(boolean z) {
        if (this.f2282w != z) {
            this.f2282w = z;
            mo3198b(mo3129V());
            mo3124N();
        }
    }

    /* renamed from: c */
    private void mo3241c(Preference preference) {
        List<Preference> list = this.f2259O;
        if (list != null) {
            list.remove(preference);
        }
    }

    /* renamed from: b */
    private void mo3238b(Preference preference) {
        if (this.f2259O == null) {
            this.f2259O = new ArrayList();
        }
        this.f2259O.add(preference);
        preference.mo3186a(this, mo3129V());
    }

    /* renamed from: e */
    public void mo3211e(int i) {
        if (i != this.f2272m) {
            this.f2272m = i;
            mo3169O();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3203c(String str) {
        if (!mo3174W()) {
            return false;
        }
        if (TextUtils.equals(str, mo3194b((String) null))) {
            return true;
        }
        C0583e t = mo3222t();
        if (t != null) {
            t.mo3294b(this.f2278s, str);
        } else {
            SharedPreferences.Editor a = this.f2266g.mo3363a();
            a.putString(this.f2278s, str);
            m2703a(a);
        }
        return true;
    }

    /* renamed from: d */
    public Context mo3206d() {
        return this.f2265f;
    }

    /* renamed from: d */
    public void mo3208d(Bundle bundle) {
        mo3195b(bundle);
    }

    /* renamed from: e */
    public final void mo3212e(boolean z) {
        if (this.f2248D != z) {
            this.f2248D = z;
            C0562b bVar = this.f2258N;
            if (bVar != null) {
                bVar.mo3231b(this);
            }
        }
    }

    /* renamed from: b */
    public void mo3198b(boolean z) {
        List<Preference> list = this.f2259O;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo3186a(this, z);
            }
        }
    }

    /* renamed from: b */
    public void mo3196b(Preference preference, boolean z) {
        if (this.f2247C == z) {
            this.f2247C = !z;
            mo3198b(mo3129V());
            mo3124N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3204c(boolean z) {
        if (!mo3174W()) {
            return false;
        }
        if (z == mo3193a(!z)) {
            return true;
        }
        C0583e t = mo3222t();
        if (t != null) {
            t.mo3296b(this.f2278s, z);
        } else {
            SharedPreferences.Editor a = this.f2266g.mo3363a();
            a.putBoolean(this.f2278s, z);
            m2703a(a);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo3194b(String str) {
        if (!mo3174W()) {
            return str;
        }
        C0583e t = mo3222t();
        if (t != null) {
            return t.mo3290a(this.f2278s, str);
        }
        return this.f2266g.mo3378h().getString(this.f2278s, str);
    }

    /* renamed from: b */
    public boolean mo3200b(Set<String> set) {
        if (!mo3174W()) {
            return false;
        }
        if (set.equals(mo3178a((Set<String>) null))) {
            return true;
        }
        C0583e t = mo3222t();
        if (t != null) {
            t.mo3295b(this.f2278s, set);
        } else {
            SharedPreferences.Editor a = this.f2266g.mo3363a();
            a.putStringSet(this.f2278s, set);
            m2703a(a);
        }
        return true;
    }

    /* renamed from: c */
    public void mo3202c(Bundle bundle) {
        mo3182a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo3199b(int i) {
        if (!mo3174W()) {
            return false;
        }
        if (i == mo3175a(i ^ -1)) {
            return true;
        }
        C0583e t = mo3222t();
        if (t != null) {
            t.mo3293b(this.f2278s, i);
        } else {
            SharedPreferences.Editor a = this.f2266g.mo3363a();
            a.putInt(this.f2278s, i);
            m2703a(a);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3195b(Bundle bundle) {
        if (mo3163H()) {
            this.f2261Q = false;
            Parcelable T = mo3128T();
            if (!this.f2261Q) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (T != null) {
                bundle.putParcelable(this.f2278s, T);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.preferenceStyle, 16842894));
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m2704a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m2704a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: a */
    public void mo3181a(Drawable drawable) {
        if (this.f2277r != drawable) {
            this.f2277r = drawable;
            this.f2276q = 0;
            mo3124N();
        }
    }

    /* renamed from: a */
    public void mo3142a(CharSequence charSequence) {
        if (mo3226y() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f2275p, charSequence)) {
            this.f2275p = charSequence;
            mo3124N();
        }
    }

    /* renamed from: a */
    public final void mo3185a(C0566f fVar) {
        this.f2263S = fVar;
        mo3124N();
    }

    /* renamed from: a */
    public boolean mo3192a(Object obj) {
        C0563c cVar = this.f2270k;
        return cVar == null || cVar.mo3233a(this, obj);
    }

    /* renamed from: a */
    public void mo3184a(C0564d dVar) {
        this.f2271l = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3113a(View view) {
        mo3173U();
    }

    /* renamed from: a */
    public int compareTo(Preference preference) {
        int i = this.f2272m;
        int i2 = preference.f2272m;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f2274o;
        CharSequence charSequence2 = preference.f2274o;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f2274o.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3183a(C0562b bVar) {
        this.f2258N = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3188a(C0600j jVar) {
        this.f2266g = jVar;
        if (!this.f2269j) {
            this.f2268i = jVar.mo3372b();
        }
        mo3117X();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3189a(C0600j jVar, long j) {
        this.f2268i = j;
        this.f2269j = true;
        try {
            mo3188a(jVar);
        } finally {
            this.f2269j = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3187a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f2260P == null) {
            this.f2260P = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends Preference> T mo3177a(String str) {
        C0600j jVar = this.f2266g;
        if (jVar == null) {
            return null;
        }
        return jVar.mo3364a((CharSequence) str);
    }

    /* renamed from: a */
    public void mo3186a(Preference preference, boolean z) {
        if (this.f2246B == z) {
            this.f2246B = !z;
            mo3198b(mo3129V());
            mo3124N();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo3191a(boolean z, Object obj) {
        mo3132b(obj);
    }

    /* renamed from: a */
    private void m2703a(SharedPreferences.Editor editor) {
        if (this.f2266g.mo3379i()) {
            editor.apply();
        }
    }

    /* renamed from: a */
    public Set<String> mo3178a(Set<String> set) {
        if (!mo3174W()) {
            return set;
        }
        C0583e t = mo3222t();
        if (t != null) {
            return t.mo3291a(this.f2278s, set);
        }
        return this.f2266g.mo3378h().getStringSet(this.f2278s, set);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3175a(int i) {
        if (!mo3174W()) {
            return i;
        }
        C0583e t = mo3222t();
        if (t != null) {
            return t.mo3289a(this.f2278s, i);
        }
        return this.f2266g.mo3378h().getInt(this.f2278s, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3193a(boolean z) {
        if (!mo3174W()) {
            return z;
        }
        C0583e t = mo3222t();
        if (t != null) {
            return t.mo3292a(this.f2278s, z);
        }
        return this.f2266g.mo3378h().getBoolean(this.f2278s, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3182a(Bundle bundle) {
        Parcelable parcelable;
        if (mo3163H() && (parcelable = bundle.getParcelable(this.f2278s)) != null) {
            this.f2261Q = false;
            mo3131a(parcelable);
            if (!this.f2261Q) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3131a(Parcelable parcelable) {
        this.f2261Q = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
