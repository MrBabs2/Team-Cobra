package p050l.p075h.p084l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p050l.p075h.C4947c;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5042f;

/* renamed from: l.h.l.v */
/* compiled from: ViewCompat */
public class C5071v {

    /* renamed from: a */
    private static Field f8933a;

    /* renamed from: b */
    private static boolean f8934b;

    /* renamed from: c */
    private static Field f8935c;

    /* renamed from: d */
    private static boolean f8936d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f8937e;

    /* renamed from: f */
    private static WeakHashMap<View, C5086z> f8938f = null;

    /* renamed from: g */
    private static Field f8939g;

    /* renamed from: h */
    private static boolean f8940h = false;

    /* renamed from: i */
    private static ThreadLocal<Rect> f8941i;

    /* renamed from: l.h.l.v$a */
    /* compiled from: ViewCompat */
    class C5072a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C5067r f8942a;

        C5072a(C5067r rVar) {
            this.f8942a = rVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f8942a.mo342a(view, C5020d0.m8936a(windowInsets)).mo17486j();
        }
    }

    /* renamed from: l.h.l.v$f */
    /* compiled from: ViewCompat */
    static abstract class C5077f<T> {

        /* renamed from: a */
        private final int f8944a;

        /* renamed from: b */
        private final Class<T> f8945b;

        /* renamed from: c */
        private final int f8946c;

        C5077f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        private boolean m9235a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo17619a(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo17621a(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo17622a(T t, T t2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17633b(View view, T t) {
            if (m9236b()) {
                mo17621a(view, t);
            } else if (m9235a() && mo17622a(mo17632b(view), (Object) t)) {
                C5071v.m9207s(view);
                view.setTag(this.f8944a, t);
                C5071v.m9183c(view, 0);
            }
        }

        C5077f(int i, Class<T> cls, int i2, int i3) {
            this.f8944a = i;
            this.f8945b = cls;
            this.f8946c = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17631a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public T mo17632b(View view) {
            if (m9236b()) {
                return mo17619a(view);
            }
            if (!m9235a()) {
                return null;
            }
            T tag = view.getTag(this.f8944a);
            if (this.f8945b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: b */
        private boolean m9236b() {
            return Build.VERSION.SDK_INT >= this.f8946c;
        }
    }

    /* renamed from: l.h.l.v$g */
    /* compiled from: ViewCompat */
    private static class C5078g {
        /* renamed from: a */
        static C5020d0 m9243a(View view, C5020d0 d0Var, Rect rect) {
            WindowInsets j = d0Var.mo17486j();
            if (j != null) {
                return C5020d0.m8936a(view.computeSystemWindowInsets(j, rect));
            }
            rect.setEmpty();
            return d0Var;
        }
    }

    /* renamed from: l.h.l.v$h */
    /* compiled from: ViewCompat */
    private static class C5079h {
        /* renamed from: a */
        public static WindowInsets m9244a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* renamed from: l.h.l.v$i */
    /* compiled from: ViewCompat */
    private static class C5080i {
        /* renamed from: a */
        static void m9245a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: l.h.l.v$j */
    /* compiled from: ViewCompat */
    public interface C5081j {
        /* renamed from: a */
        boolean mo17634a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
        new C5076e();
    }

    /* renamed from: A */
    public static boolean m9136A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: B */
    public static boolean m9137B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m9138C(View view) {
        Boolean b = m9150a().mo17632b(view);
        if (b == null) {
            return false;
        }
        return b.booleanValue();
    }

    /* renamed from: D */
    public static boolean m9139D(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: E */
    public static boolean m9140E(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: F */
    public static boolean m9141F(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C5061l) {
            return ((C5061l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m9142G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m9143H(View view) {
        Boolean b = m9186d().mo17632b(view);
        if (b == null) {
            return false;
        }
        return b.booleanValue();
    }

    /* renamed from: I */
    public static void m9144I(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: J */
    public static void m9145J(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: K */
    public static void m9146K(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C5061l) {
            ((C5061l) view).stopNestedScroll();
        }
    }

    /* renamed from: L */
    private static void m9147L(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static void m9157a(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C5080i.m9245a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: b */
    private static Rect m9174b() {
        if (f8941i == null) {
            f8941i = new ThreadLocal<>();
        }
        Rect rect = f8941i.get();
        if (rect == null) {
            rect = new Rect();
            f8941i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: c */
    private static View.AccessibilityDelegate m9181c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m9185d(view);
    }

    /* renamed from: d */
    private static View.AccessibilityDelegate m9185d(View view) {
        if (f8940h) {
            return null;
        }
        if (f8939g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f8939g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f8940h = true;
                return null;
            }
        }
        try {
            Object obj = f8939g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f8940h = true;
            return null;
        }
    }

    /* renamed from: e */
    public static int m9188e(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: f */
    public static void m9191f(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m9152a(i, view);
            m9183c(view, 0);
        }
    }

    /* renamed from: g */
    private static List<C5034c.C5035a> m9192g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C4947c.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C4947c.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: h */
    public static void m9195h(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: i */
    public static void m9197i(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: j */
    public static Rect m9198j(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: k */
    public static Display m9199k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m9139D(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: l */
    public static float m9200l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: m */
    public static boolean m9201m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: n */
    public static int m9202n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: o */
    public static int m9203o(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: p */
    public static int m9204p(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: q */
    public static int m9205q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f8936d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f8935c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8936d = true;
        }
        Field field = f8935c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: r */
    public static int m9206r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f8934b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f8933a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8934b = true;
        }
        Field field = f8933a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: s */
    static C5010a m9207s(View view) {
        C5010a b = m9175b(view);
        if (b == null) {
            b = new C5010a();
        }
        m9165a(view, b);
        return b;
    }

    /* renamed from: t */
    public static int m9208t(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: u */
    public static int m9209u(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: v */
    public static C5020d0 m9210v(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C5020d0.m8936a(C5079h.m9244a(view));
        }
        return null;
    }

    /* renamed from: w */
    public static String m9211w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f8937e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: x */
    public static int m9212x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: y */
    public static float m9213y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: z */
    public static boolean m9214z(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: l.h.l.v$b */
    /* compiled from: ViewCompat */
    class C5073b extends C5077f<Boolean> {
        C5073b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo17622a(Boolean bool, Boolean bool2) {
            return !mo17631a(bool, bool2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Boolean m9216a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17621a(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }
    }

    /* renamed from: l.h.l.v$c */
    /* compiled from: ViewCompat */
    class C5074c extends C5077f<CharSequence> {
        C5074c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public CharSequence m9222a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17621a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17622a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: l.h.l.v$d */
    /* compiled from: ViewCompat */
    class C5075d extends C5077f<Boolean> {
        C5075d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo17622a(Boolean bool, Boolean bool2) {
            return !mo17631a(bool, bool2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Boolean m9228a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17621a(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }
    }

    /* renamed from: l.h.l.v$e */
    /* compiled from: ViewCompat */
    static class C5076e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f8943f = new WeakHashMap<>();

        C5076e() {
        }

        /* renamed from: a */
        private void m9234a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C5071v.m9183c(view, 16);
                }
                this.f8943f.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Map.Entry next : this.f8943f.entrySet()) {
                m9234a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m9233a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        /* renamed from: a */
        private void m9233a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: l.h.l.v$k */
    /* compiled from: ViewCompat */
    static class C5082k {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f8947d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f8948a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f8949b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f8950c = null;

        C5082k() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m9247a() {
            if (this.f8949b == null) {
                this.f8949b = new SparseArray<>();
            }
            return this.f8949b;
        }

        /* renamed from: b */
        private View m9249b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f8948a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m9249b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m9251c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: c */
        private boolean m9251c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C4947c.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C5081j) arrayList.get(size)).mo17634a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        static C5082k m9248a(View view) {
            C5082k kVar = (C5082k) view.getTag(C4947c.tag_unhandled_key_event_manager);
            if (kVar != null) {
                return kVar;
            }
            C5082k kVar2 = new C5082k();
            view.setTag(C4947c.tag_unhandled_key_event_manager, kVar2);
            return kVar2;
        }

        /* renamed from: b */
        private void m9250b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f8948a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f8947d.isEmpty()) {
                synchronized (f8947d) {
                    if (this.f8948a == null) {
                        this.f8948a = new WeakHashMap<>();
                    }
                    for (int size = f8947d.size() - 1; size >= 0; size--) {
                        View view = (View) f8947d.get(size).get();
                        if (view == null) {
                            f8947d.remove(size);
                        } else {
                            this.f8948a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f8948a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17636a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m9250b();
            }
            View b = m9249b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m9247a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17635a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f8950c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f8950c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> a = m9247a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a.valueAt(indexOfKey);
                a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C5071v.m9139D(view)) {
                m9251c(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m9168a(View view, C5034c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo17567w());
    }

    /* renamed from: e */
    public static void m9189e(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect b = m9174b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m9178b(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m9178b(view, i);
        }
    }

    /* renamed from: i */
    public static PorterDuff.Mode m9196i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C5070u) {
            return ((C5070u) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m9165a(View view, C5010a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m9181c(view) instanceof C5010a.C5011a)) {
            aVar = new C5010a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo17458a();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: c */
    public static void m9184c(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: f */
    public static CharSequence m9190f(View view) {
        return m9182c().mo17632b(view);
    }

    /* renamed from: h */
    public static ColorStateList m9194h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C5070u) {
            return ((C5070u) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: g */
    public static void m9193g(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: c */
    private static C5077f<CharSequence> m9182c() {
        return new C5074c(C4947c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: a */
    public static void m9162a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: b */
    public static C5010a m9175b(View view) {
        View.AccessibilityDelegate c = m9181c(view);
        if (c == null) {
            return null;
        }
        if (c instanceof C5010a.C5011a) {
            return ((C5010a.C5011a) c).f8872a;
        }
        return new C5010a(c);
    }

    /* renamed from: c */
    static void m9183c(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m9190f(view) != null;
            if (m9188e(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : RecyclerView.C0638l.FLAG_MOVED);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9163a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: b */
    public static void m9177b(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: d */
    public static void m9187d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect b = m9174b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m9154a(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m9154a(view, i);
        }
    }

    /* renamed from: a */
    public static boolean m9172a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static void m9179b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: b */
    public static C5020d0 m9176b(View view, C5020d0 d0Var) {
        WindowInsets j;
        if (Build.VERSION.SDK_INT >= 21 && (j = d0Var.mo17486j()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(j);
            if (!onApplyWindowInsets.equals(j)) {
                return C5020d0.m8936a(onApplyWindowInsets);
            }
        }
        return d0Var;
    }

    /* renamed from: a */
    public static void m9167a(View view, C5034c.C5035a aVar, CharSequence charSequence, C5042f fVar) {
        if (fVar == null && charSequence == null) {
            m9191f(view, aVar.mo17568a());
        } else {
            m9166a(view, aVar.mo17569a(charSequence, fVar));
        }
    }

    /* renamed from: a */
    private static void m9166a(View view, C5034c.C5035a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m9207s(view);
            m9152a(aVar.mo17568a(), view);
            m9192g(view).add(aVar);
            m9183c(view, 0);
        }
    }

    /* renamed from: b */
    private static void m9178b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m9147L(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m9147L((View) parent);
            }
        }
    }

    /* renamed from: a */
    private static void m9152a(int i, View view) {
        List<C5034c.C5035a> g = m9192g(view);
        for (int i2 = 0; i2 < g.size(); i2++) {
            if (g.get(i2).mo17568a() == i) {
                g.remove(i2);
                return;
            }
        }
    }

    /* renamed from: b */
    static boolean m9180b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C5082k.m9248a(view).mo17635a(keyEvent);
    }

    /* renamed from: a */
    public static void m9156a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: d */
    private static C5077f<Boolean> m9186d() {
        return new C5073b(C4947c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: a */
    public static C5086z m9151a(View view) {
        if (f8938f == null) {
            f8938f = new WeakHashMap<>();
        }
        C5086z zVar = f8938f.get(view);
        if (zVar != null) {
            return zVar;
        }
        C5086z zVar2 = new C5086z(view);
        f8938f.put(view, zVar2);
        return zVar2;
    }

    @Deprecated
    /* renamed from: a */
    public static void m9153a(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: a */
    public static void m9164a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f8937e == null) {
            f8937e = new WeakHashMap<>();
        }
        f8937e.put(view, str);
    }

    /* renamed from: a */
    public static void m9169a(View view, C5067r rVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new C5072a(rVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.mo17486j();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p050l.p075h.p084l.C5020d0 m9148a(android.view.View r2, p050l.p075h.p084l.C5020d0 r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x001b
            android.view.WindowInsets r0 = r3.mo17486j()
            if (r0 == 0) goto L_0x001b
            android.view.WindowInsets r2 = r2.dispatchApplyWindowInsets(r0)
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x001b
            l.h.l.d0 r2 = p050l.p075h.p084l.C5020d0.m8936a(r0)
            return r2
        L_0x001b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p084l.C5071v.m9148a(android.view.View, l.h.l.d0):l.h.l.d0");
    }

    /* renamed from: a */
    public static C5020d0 m9149a(View view, C5020d0 d0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C5078g.m9243a(view, d0Var, rect) : d0Var;
    }

    /* renamed from: a */
    public static void m9161a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m9158a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C5070u) {
            ((C5070u) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m9159a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C5070u) {
            ((C5070u) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    private static void m9154a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m9147L(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m9147L((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m9160a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m9155a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m9170a(View view, C5069t tVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (tVar != null ? tVar.mo17617a() : null));
        }
    }

    /* renamed from: a */
    static boolean m9173a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C5082k.m9248a(view).mo17636a(view, keyEvent);
    }

    /* renamed from: a */
    public static void m9171a(View view, boolean z) {
        m9150a().mo17633b(view, Boolean.valueOf(z));
    }

    /* renamed from: a */
    private static C5077f<Boolean> m9150a() {
        return new C5075d(C4947c.tag_accessibility_heading, Boolean.class, 28);
    }
}
