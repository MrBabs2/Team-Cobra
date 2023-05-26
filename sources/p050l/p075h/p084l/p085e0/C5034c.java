package p050l.p075h.p084l.p085e0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p050l.p075h.C4947c;
import p050l.p075h.p084l.p085e0.C5042f;

/* renamed from: l.h.l.e0.c */
/* compiled from: AccessibilityNodeInfoCompat */
public class C5034c {

    /* renamed from: d */
    private static int f8896d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f8897a;

    /* renamed from: b */
    public int f8898b = -1;

    /* renamed from: c */
    private int f8899c = -1;

    /* renamed from: l.h.l.e0.c$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5035a {

        /* renamed from: e */
        public static final C5035a f8900e = new C5035a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C5035a f8901f = new C5035a(RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT, (CharSequence) null);

        /* renamed from: g */
        public static final C5035a f8902g = new C5035a(8192, (CharSequence) null);

        /* renamed from: h */
        public static final C5035a f8903h = new C5035a(262144, (CharSequence) null);

        /* renamed from: i */
        public static final C5035a f8904i = new C5035a(524288, (CharSequence) null);

        /* renamed from: j */
        public static final C5035a f8905j = new C5035a(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES, (CharSequence) null);

        /* renamed from: k */
        public static final C5035a f8906k = new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);

        /* renamed from: l */
        public static final C5035a f8907l = new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);

        /* renamed from: a */
        final Object f8908a;

        /* renamed from: b */
        private final int f8909b;

        /* renamed from: c */
        private final Class<? extends C5042f.C5043a> f8910c;

        /* renamed from: d */
        protected final C5042f f8911d;

        static {
            Class<C5042f.C5045c> cls = C5042f.C5045c.class;
            Class<C5042f.C5044b> cls2 = C5042f.C5044b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C5035a(1, (CharSequence) null);
            new C5035a(2, (CharSequence) null);
            new C5035a(4, (CharSequence) null);
            new C5035a(8, (CharSequence) null);
            new C5035a(32, (CharSequence) null);
            new C5035a(64, (CharSequence) null);
            new C5035a(128, (CharSequence) null);
            new C5035a(256, (CharSequence) null, cls2);
            new C5035a(AdRequest.MAX_CONTENT_URL_LENGTH, (CharSequence) null, cls2);
            new C5035a(1024, (CharSequence) null, cls);
            new C5035a(RecyclerView.C0638l.FLAG_MOVED, (CharSequence) null, cls);
            new C5035a(Http2.INITIAL_MAX_FRAME_SIZE, (CharSequence) null);
            new C5035a(32768, (CharSequence) null);
            new C5035a(65536, (CharSequence) null);
            new C5035a(131072, (CharSequence) null, C5042f.C5049g.class);
            new C5035a(2097152, (CharSequence) null, C5042f.C5050h.class);
            new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C5042f) null, C5042f.C5047e.class);
            new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            new C5035a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C5042f) null, C5042f.C5048f.class);
            new C5035a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C5042f) null, C5042f.C5046d.class);
            new C5035a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C5035a(accessibilityAction, 16908357, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
        }

        public C5035a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
        }

        /* renamed from: a */
        public int mo17568a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f8908a).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public CharSequence mo17571b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f8908a).getLabel();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C5035a)) {
                return false;
            }
            C5035a aVar = (C5035a) obj;
            Object obj2 = this.f8908a;
            if (obj2 == null) {
                if (aVar.f8908a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f8908a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f8908a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        C5035a(Object obj) {
            this(obj, 0, (CharSequence) null, (C5042f) null, (Class<? extends C5042f.C5043a>) null);
        }

        private C5035a(int i, CharSequence charSequence, Class<? extends C5042f.C5043a> cls) {
            this((Object) null, i, charSequence, (C5042f) null, cls);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo17570a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                l.h.l.e0.f r0 = r4.f8911d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends l.h.l.e0.f$a> r2 = r4.f8910c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                l.h.l.e0.f$a r1 = (p050l.p075h.p084l.p085e0.C5042f.C5043a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo17589a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends l.h.l.e0.f$a> r1 = r4.f8910c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                l.h.l.e0.f r6 = r4.f8911d
                boolean r5 = r6.mo17588a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p084l.p085e0.C5034c.C5035a.mo17570a(android.view.View, android.os.Bundle):boolean");
        }

        C5035a(Object obj, int i, CharSequence charSequence, C5042f fVar, Class<? extends C5042f.C5043a> cls) {
            this.f8909b = i;
            this.f8911d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f8908a = obj;
            } else {
                this.f8908a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f8910c = cls;
        }

        /* renamed from: a */
        public C5035a mo17569a(CharSequence charSequence, C5042f fVar) {
            return new C5035a((Object) null, this.f8909b, charSequence, fVar, this.f8910c);
        }
    }

    /* renamed from: l.h.l.e0.c$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5036b {

        /* renamed from: a */
        final Object f8912a;

        C5036b(Object obj) {
            this.f8912a = obj;
        }

        /* renamed from: a */
        public static C5036b m9068a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C5036b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C5036b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C5036b((Object) null);
        }
    }

    private C5034c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8897a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C5034c m8990a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C5034c(accessibilityNodeInfo);
    }

    /* renamed from: c */
    private static String m8996c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.C0638l.FLAG_MOVED:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /*16384*/:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: d */
    public static C5034c m8997d(View view) {
        return m8990a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: x */
    private void m9001x() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f8897a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f8897a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f8897a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f8897a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: y */
    private boolean m9002y() {
        return !m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    public static C5034c m9003z() {
        return m8990a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: b */
    public int mo17516b() {
        return this.f8897a.getActions();
    }

    /* renamed from: c */
    public void mo17526c(View view, int i) {
        this.f8899c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8897a.setSource(view, i);
        }
    }

    /* renamed from: e */
    public void mo17534e(CharSequence charSequence) {
        this.f8897a.setPackageName(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5034c)) {
            return false;
        }
        C5034c cVar = (C5034c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8897a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f8897a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f8897a)) {
            return false;
        }
        return this.f8899c == cVar.f8899c && this.f8898b == cVar.f8898b;
    }

    /* renamed from: f */
    public void mo17539f(boolean z) {
        this.f8897a.setEnabled(z);
    }

    /* renamed from: g */
    public void mo17542g(boolean z) {
        this.f8897a.setFocusable(z);
    }

    /* renamed from: h */
    public void mo17545h(boolean z) {
        this.f8897a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8897a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public CharSequence mo17547i() {
        if (!m9002y()) {
            return this.f8897a.getText();
        }
        List<Integer> a = m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a2 = m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a3 = m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a4 = m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f8897a.getText(), 0, this.f8897a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C5032a(a4.get(i).intValue(), this, mo17540g().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a.get(i).intValue(), a2.get(i).intValue(), a3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: j */
    public String mo17549j() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f8897a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: k */
    public boolean mo17552k() {
        return this.f8897a.isCheckable();
    }

    /* renamed from: l */
    public boolean mo17554l() {
        return this.f8897a.isChecked();
    }

    /* renamed from: m */
    public void mo17555m(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8897a.setVisibleToUser(z);
        }
    }

    /* renamed from: n */
    public boolean mo17557n() {
        return this.f8897a.isEnabled();
    }

    /* renamed from: o */
    public boolean mo17558o() {
        return this.f8897a.isFocusable();
    }

    /* renamed from: p */
    public boolean mo17559p() {
        return this.f8897a.isFocused();
    }

    /* renamed from: q */
    public boolean mo17560q() {
        return this.f8897a.isLongClickable();
    }

    /* renamed from: r */
    public boolean mo17561r() {
        return this.f8897a.isPassword();
    }

    /* renamed from: s */
    public boolean mo17562s() {
        return this.f8897a.isScrollable();
    }

    /* renamed from: t */
    public boolean mo17563t() {
        return this.f8897a.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo17507a(rect);
        sb.append("; boundsInParent: " + rect);
        mo17518b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo17543h());
        sb.append("; className: ");
        sb.append(mo17529d());
        sb.append("; text: ");
        sb.append(mo17547i());
        sb.append("; contentDescription: ");
        sb.append(mo17537f());
        sb.append("; viewId: ");
        sb.append(mo17549j());
        sb.append("; checkable: ");
        sb.append(mo17552k());
        sb.append("; checked: ");
        sb.append(mo17554l());
        sb.append("; focusable: ");
        sb.append(mo17558o());
        sb.append("; focused: ");
        sb.append(mo17559p());
        sb.append("; selected: ");
        sb.append(mo17563t());
        sb.append("; clickable: ");
        sb.append(mo17556m());
        sb.append("; longClickable: ");
        sb.append(mo17560q());
        sb.append("; enabled: ");
        sb.append(mo17557n());
        sb.append("; password: ");
        sb.append(mo17561r());
        sb.append("; scrollable: " + mo17562s());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C5035a> a = mo17505a();
            for (int i = 0; i < a.size(); i++) {
                C5035a aVar = a.get(i);
                String c = m8996c(aVar.mo17568a());
                if (c.equals("ACTION_UNKNOWN") && aVar.mo17571b() != null) {
                    c = aVar.mo17571b().toString();
                }
                sb.append(c);
                if (i != a.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int b = mo17516b();
            while (b != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
                b &= numberOfTrailingZeros ^ -1;
                sb.append(m8996c(numberOfTrailingZeros));
                if (b != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo17565u() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f8897a.isShowingHintText();
        }
        return m8998d(4);
    }

    /* renamed from: v */
    public void mo17566v() {
        this.f8897a.recycle();
    }

    /* renamed from: w */
    public AccessibilityNodeInfo mo17567w() {
        return this.f8897a;
    }

    /* renamed from: a */
    public static C5034c m8991a(C5034c cVar) {
        return m8990a(AccessibilityNodeInfo.obtain(cVar.f8897a));
    }

    /* renamed from: e */
    private void m8999e(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m8995c(view);
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c.size(); i++) {
                if (c.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: b */
    public boolean mo17523b(C5035a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f8897a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f8908a);
        }
        return false;
    }

    /* renamed from: d */
    public void mo17530d(Rect rect) {
        this.f8897a.setBoundsInScreen(rect);
    }

    /* renamed from: f */
    public CharSequence mo17537f() {
        return this.f8897a.getContentDescription();
    }

    /* renamed from: g */
    public Bundle mo17540g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f8897a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: h */
    public CharSequence mo17543h() {
        return this.f8897a.getPackageName();
    }

    /* renamed from: k */
    public void mo17551k(boolean z) {
        this.f8897a.setScrollable(z);
    }

    /* renamed from: l */
    public void mo17553l(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8897a.setShowingHintText(z);
        } else {
            m8992a(4, z);
        }
    }

    /* renamed from: a */
    public void mo17509a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8897a.addChild(view, i);
        }
    }

    /* renamed from: d */
    public void mo17532d(boolean z) {
        this.f8897a.setClickable(z);
    }

    /* renamed from: f */
    public void mo17538f(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f8897a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f8897a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: h */
    public void mo17544h(CharSequence charSequence) {
        this.f8897a.setText(charSequence);
    }

    /* renamed from: j */
    public void mo17550j(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8897a.setScreenReaderFocusable(z);
        } else {
            m8992a(1, z);
        }
    }

    /* renamed from: m */
    public boolean mo17556m() {
        return this.f8897a.isClickable();
    }

    /* renamed from: l.h.l.e0.c$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5037c {

        /* renamed from: a */
        final Object f8913a;

        C5037c(Object obj) {
            this.f8913a = obj;
        }

        /* renamed from: a */
        public static C5037c m9069a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C5037c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C5037c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C5037c((Object) null);
        }

        /* renamed from: b */
        public int mo17575b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8913a).getColumnSpan();
            }
            return 0;
        }

        /* renamed from: c */
        public int mo17576c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8913a).getRowIndex();
            }
            return 0;
        }

        /* renamed from: d */
        public int mo17577d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8913a).getRowSpan();
            }
            return 0;
        }

        /* renamed from: e */
        public boolean mo17578e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8913a).isSelected();
            }
            return false;
        }

        /* renamed from: a */
        public int mo17574a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f8913a).getColumnIndex();
            }
            return 0;
        }
    }

    /* renamed from: b */
    public void mo17519b(View view, int i) {
        this.f8898b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8897a.setParent(view, i);
        }
    }

    /* renamed from: c */
    public int mo17524c() {
        return this.f8897a.getChildCount();
    }

    /* renamed from: d */
    public CharSequence mo17529d() {
        return this.f8897a.getClassName();
    }

    /* renamed from: a */
    public void mo17506a(int i) {
        this.f8897a.addAction(i);
    }

    @Deprecated
    /* renamed from: c */
    public void mo17525c(Rect rect) {
        this.f8897a.setBoundsInParent(rect);
    }

    /* renamed from: d */
    public void mo17531d(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f8897a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f8897a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: g */
    public void mo17541g(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f8897a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: a */
    private List<Integer> m8989a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f8897a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f8897a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public void mo17528c(boolean z) {
        this.f8897a.setChecked(z);
    }

    /* renamed from: c */
    private SparseArray<WeakReference<ClickableSpan>> m8995c(View view) {
        return (SparseArray) view.getTag(C4947c.tag_accessibility_clickable_spans);
    }

    /* renamed from: b */
    public void mo17518b(Rect rect) {
        this.f8897a.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    private boolean m8998d(int i) {
        Bundle g = mo17540g();
        if (g != null && (g.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo17522b(boolean z) {
        this.f8897a.setCheckable(z);
    }

    /* renamed from: c */
    public void mo17527c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8897a.setError(charSequence);
        }
    }

    /* renamed from: b */
    private SparseArray<WeakReference<ClickableSpan>> m8994b(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m8995c(view);
        if (c != null) {
            return c;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C4947c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: e */
    public C5037c mo17533e() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f8897a.getCollectionItemInfo()) == null) {
            return null;
        }
        return new C5037c(collectionItemInfo);
    }

    /* renamed from: a */
    public void mo17513a(C5035a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8897a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f8908a);
        }
    }

    /* renamed from: b */
    public void mo17520b(CharSequence charSequence) {
        this.f8897a.setContentDescription(charSequence);
    }

    /* renamed from: e */
    public void mo17535e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f8897a.setDismissable(z);
        }
    }

    /* renamed from: b */
    public void mo17521b(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f8897a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C5037c) obj).f8913a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: a */
    public boolean mo17515a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f8897a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: i */
    public static ClickableSpan[] m9000i(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void mo17508a(View view) {
        this.f8898b = -1;
        this.f8897a.setParent(view);
    }

    /* renamed from: b */
    public void mo17517b(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8897a.setMaxTextLength(i);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo17507a(Rect rect) {
        this.f8897a.getBoundsInParent(rect);
    }

    /* renamed from: i */
    public void mo17548i(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8897a.setHeading(z);
        } else {
            m8992a(2, z);
        }
    }

    /* renamed from: a */
    public void mo17514a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8897a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public void mo17510a(CharSequence charSequence) {
        this.f8897a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo17511a(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m9001x();
            m8999e(view);
            ClickableSpan[] i2 = m9000i(charSequence);
            if (i2 != null && i2.length > 0) {
                mo17540g().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C4947c.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> b = m8994b(view);
                int i3 = 0;
                while (i2 != null && i3 < i2.length) {
                    int a = m8988a(i2[i3], b);
                    b.put(a, new WeakReference(i2[i3]));
                    m8993a(i2[i3], (Spanned) charSequence, a);
                    i3++;
                }
            }
        }
    }

    /* renamed from: a */
    private int m8988a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f8896d;
        f8896d = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    private void m8993a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m8989a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo17512a(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f8897a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C5036b) obj).f8912a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    /* renamed from: a */
    public List<C5035a> mo17505a() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f8897a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C5035a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m8992a(int i, boolean z) {
        Bundle g = mo17540g();
        if (g != null) {
            int i2 = g.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            g.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }
}
