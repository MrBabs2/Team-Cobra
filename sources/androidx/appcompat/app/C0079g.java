package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0135e;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0222a0;
import androidx.appcompat.widget.C0253h;
import androidx.appcompat.widget.C0278q0;
import androidx.appcompat.widget.C0296v0;
import androidx.appcompat.widget.C0297w;
import androidx.appcompat.widget.C0298w0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0371g;
import androidx.core.content.C0394a;
import androidx.core.content.p003c.C0406f;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0521j;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p050l.p051a.C4790a;
import p050l.p051a.C4792c;
import p050l.p051a.C4795f;
import p050l.p051a.C4796g;
import p050l.p051a.C4798i;
import p050l.p051a.C4799j;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p051a.p058o.C4821b;
import p050l.p051a.p058o.C4824d;
import p050l.p051a.p058o.C4826f;
import p050l.p051a.p058o.C4828g;
import p050l.p051a.p058o.C4833i;
import p050l.p066e.C4881g;
import p050l.p075h.p083k.C5003c;
import p050l.p075h.p084l.C5012a0;
import p050l.p075h.p084l.C5016b0;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5030e;
import p050l.p075h.p084l.C5051f;
import p050l.p075h.p084l.C5067r;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5086z;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: AppCompatDelegateImpl */
class C0079g extends C0078f implements C0138g.C0139a, LayoutInflater.Factory2 {

    /* renamed from: f0 */
    private static final C4881g<String, Integer> f222f0 = new C4881g<>();

    /* renamed from: g0 */
    private static final boolean f223g0 = (Build.VERSION.SDK_INT < 21);

    /* renamed from: h0 */
    private static final int[] f224h0 = {16842836};

    /* renamed from: i0 */
    private static final boolean f225i0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: j0 */
    private static final boolean f226j0;

    /* renamed from: k0 */
    private static boolean f227k0 = true;

    /* renamed from: A */
    ViewGroup f228A;

    /* renamed from: B */
    private TextView f229B;

    /* renamed from: C */
    private View f230C;

    /* renamed from: D */
    private boolean f231D;

    /* renamed from: E */
    private boolean f232E;

    /* renamed from: F */
    boolean f233F;

    /* renamed from: G */
    boolean f234G;

    /* renamed from: H */
    boolean f235H;

    /* renamed from: I */
    boolean f236I;

    /* renamed from: J */
    boolean f237J;

    /* renamed from: K */
    private boolean f238K;

    /* renamed from: L */
    private C0102t[] f239L;

    /* renamed from: M */
    private C0102t f240M;

    /* renamed from: N */
    private boolean f241N;

    /* renamed from: O */
    private boolean f242O;

    /* renamed from: P */
    private boolean f243P;

    /* renamed from: Q */
    private boolean f244Q;

    /* renamed from: R */
    boolean f245R;

    /* renamed from: S */
    private int f246S;

    /* renamed from: T */
    private int f247T;

    /* renamed from: U */
    private boolean f248U;

    /* renamed from: V */
    private boolean f249V;

    /* renamed from: W */
    private C0094m f250W;

    /* renamed from: X */
    private C0094m f251X;

    /* renamed from: Y */
    boolean f252Y;

    /* renamed from: Z */
    int f253Z;

    /* renamed from: a0 */
    private final Runnable f254a0;

    /* renamed from: b0 */
    private boolean f255b0;

    /* renamed from: c0 */
    private Rect f256c0;

    /* renamed from: d0 */
    private Rect f257d0;

    /* renamed from: e0 */
    private C0107j f258e0;

    /* renamed from: i */
    final Object f259i;

    /* renamed from: j */
    final Context f260j;

    /* renamed from: k */
    Window f261k;

    /* renamed from: l */
    private C0092k f262l;

    /* renamed from: m */
    final C0077e f263m;

    /* renamed from: n */
    C0069a f264n;

    /* renamed from: o */
    MenuInflater f265o;

    /* renamed from: p */
    private CharSequence f266p;

    /* renamed from: q */
    private C0297w f267q;

    /* renamed from: r */
    private C0089i f268r;

    /* renamed from: s */
    private C0103u f269s;

    /* renamed from: t */
    C4821b f270t;

    /* renamed from: u */
    ActionBarContextView f271u;

    /* renamed from: v */
    PopupWindow f272v;

    /* renamed from: w */
    Runnable f273w;

    /* renamed from: x */
    C5086z f274x;

    /* renamed from: y */
    private boolean f275y;

    /* renamed from: z */
    private boolean f276z;

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: AppCompatDelegateImpl */
    class C0080a implements Thread.UncaughtExceptionHandler {

        /* renamed from: f */
        final /* synthetic */ Thread.UncaughtExceptionHandler f277f;

        C0080a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f277f = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m362a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m362a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f277f.uncaughtException(thread, notFoundException);
                return;
            }
            this.f277f.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    /* compiled from: AppCompatDelegateImpl */
    class C0081b implements Runnable {
        C0081b() {
        }

        public void run() {
            C0079g gVar = C0079g.this;
            if ((gVar.f253Z & 1) != 0) {
                gVar.mo326g(0);
            }
            C0079g gVar2 = C0079g.this;
            if ((gVar2.f253Z & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                gVar2.mo326g(108);
            }
            C0079g gVar3 = C0079g.this;
            gVar3.f252Y = false;
            gVar3.f253Z = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    /* compiled from: AppCompatDelegateImpl */
    class C0082c implements C5067r {
        C0082c() {
        }

        /* renamed from: a */
        public C5020d0 mo342a(View view, C5020d0 d0Var) {
            int g = d0Var.mo17482g();
            int a = C0079g.this.mo310a(d0Var, (Rect) null);
            if (g != a) {
                d0Var = d0Var.mo17476b(d0Var.mo17479e(), a, d0Var.mo17481f(), d0Var.mo17478d());
            }
            return C5071v.m9176b(view, d0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    /* compiled from: AppCompatDelegateImpl */
    class C0083d implements C0222a0.C0223a {
        C0083d() {
        }

        /* renamed from: a */
        public void mo343a(Rect rect) {
            rect.top = C0079g.this.mo310a((C5020d0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    /* compiled from: AppCompatDelegateImpl */
    class C0084e implements ContentFrameLayout.C0193a {
        C0084e() {
        }

        /* renamed from: a */
        public void mo344a() {
        }

        public void onDetachedFromWindow() {
            C0079g.this.mo329l();
        }
    }

    /* renamed from: androidx.appcompat.app.g$f */
    /* compiled from: AppCompatDelegateImpl */
    class C0085f implements Runnable {

        /* renamed from: androidx.appcompat.app.g$f$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0086a extends C5016b0 {
            C0086a() {
            }

            public void onAnimationEnd(View view) {
                C0079g.this.f271u.setAlpha(1.0f);
                C0079g.this.f274x.mo17640a((C5012a0) null);
                C0079g.this.f274x = null;
            }

            public void onAnimationStart(View view) {
                C0079g.this.f271u.setVisibility(0);
            }
        }

        C0085f() {
        }

        public void run() {
            C0079g gVar = C0079g.this;
            gVar.f272v.showAtLocation(gVar.f271u, 55, 0, 0);
            C0079g.this.mo330n();
            if (C0079g.this.mo339u()) {
                C0079g.this.f271u.setAlpha(0.0f);
                C0079g gVar2 = C0079g.this;
                C5086z a = C5071v.m9151a(gVar2.f271u);
                a.mo17637a(1.0f);
                gVar2.f274x = a;
                C0079g.this.f274x.mo17640a((C5012a0) new C0086a());
                return;
            }
            C0079g.this.f271u.setAlpha(1.0f);
            C0079g.this.f271u.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.g$g */
    /* compiled from: AppCompatDelegateImpl */
    class C0087g extends C5016b0 {
        C0087g() {
        }

        public void onAnimationEnd(View view) {
            C0079g.this.f271u.setAlpha(1.0f);
            C0079g.this.f274x.mo17640a((C5012a0) null);
            C0079g.this.f274x = null;
        }

        public void onAnimationStart(View view) {
            C0079g.this.f271u.setVisibility(0);
            C0079g.this.f271u.sendAccessibilityEvent(32);
            if (C0079g.this.f271u.getParent() instanceof View) {
                C5071v.m9145J((View) C0079g.this.f271u.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$h */
    /* compiled from: AppCompatDelegateImpl */
    private class C0088h implements C0073b {
        C0088h(C0079g gVar) {
        }
    }

    /* renamed from: androidx.appcompat.app.g$j */
    /* compiled from: AppCompatDelegateImpl */
    class C0090j implements C4821b.C4822a {

        /* renamed from: a */
        private C4821b.C4822a f286a;

        /* renamed from: androidx.appcompat.app.g$j$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0091a extends C5016b0 {
            C0091a() {
            }

            public void onAnimationEnd(View view) {
                C0079g.this.f271u.setVisibility(8);
                C0079g gVar = C0079g.this;
                PopupWindow popupWindow = gVar.f272v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f271u.getParent() instanceof View) {
                    C5071v.m9145J((View) C0079g.this.f271u.getParent());
                }
                C0079g.this.f271u.removeAllViews();
                C0079g.this.f274x.mo17640a((C5012a0) null);
                C0079g gVar2 = C0079g.this;
                gVar2.f274x = null;
                C5071v.m9145J(gVar2.f228A);
            }
        }

        public C0090j(C4821b.C4822a aVar) {
            this.f286a = aVar;
        }

        /* renamed from: a */
        public boolean mo352a(C4821b bVar, Menu menu) {
            return this.f286a.mo352a(bVar, menu);
        }

        /* renamed from: b */
        public boolean mo354b(C4821b bVar, Menu menu) {
            C5071v.m9145J(C0079g.this.f228A);
            return this.f286a.mo354b(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo353a(C4821b bVar, MenuItem menuItem) {
            return this.f286a.mo353a(bVar, menuItem);
        }

        /* renamed from: a */
        public void mo351a(C4821b bVar) {
            this.f286a.mo351a(bVar);
            C0079g gVar = C0079g.this;
            if (gVar.f272v != null) {
                gVar.f261k.getDecorView().removeCallbacks(C0079g.this.f273w);
            }
            C0079g gVar2 = C0079g.this;
            if (gVar2.f271u != null) {
                gVar2.mo330n();
                C0079g gVar3 = C0079g.this;
                C5086z a = C5071v.m9151a(gVar3.f271u);
                a.mo17637a(0.0f);
                gVar3.f274x = a;
                C0079g.this.f274x.mo17640a((C5012a0) new C0091a());
            }
            C0079g gVar4 = C0079g.this;
            C0077e eVar = gVar4.f263m;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(gVar4.f270t);
            }
            C0079g gVar5 = C0079g.this;
            gVar5.f270t = null;
            C5071v.m9145J(gVar5.f228A);
        }
    }

    /* renamed from: androidx.appcompat.app.g$l */
    /* compiled from: AppCompatDelegateImpl */
    private class C0093l extends C0094m {

        /* renamed from: c */
        private final PowerManager f290c;

        C0093l(Context context) {
            super();
            this.f290c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo366b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo367c() {
            if (Build.VERSION.SDK_INT < 21 || !this.f290c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo368d() {
            C0079g.this.mo291a();
        }
    }

    /* renamed from: androidx.appcompat.app.g$m */
    /* compiled from: AppCompatDelegateImpl */
    abstract class C0094m {

        /* renamed from: a */
        private BroadcastReceiver f292a;

        /* renamed from: androidx.appcompat.app.g$m$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0095a extends BroadcastReceiver {
            C0095a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0094m.this.mo368d();
            }
        }

        C0094m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo369a() {
            BroadcastReceiver broadcastReceiver = this.f292a;
            if (broadcastReceiver != null) {
                try {
                    C0079g.this.f260j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f292a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo366b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo367c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo368d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo370e() {
            mo369a();
            IntentFilter b = mo366b();
            if (b != null && b.countActions() != 0) {
                if (this.f292a == null) {
                    this.f292a = new C0095a();
                }
                C0079g.this.f260j.registerReceiver(this.f292a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$n */
    /* compiled from: AppCompatDelegateImpl */
    private class C0096n extends C0094m {

        /* renamed from: c */
        private final C0117n f295c;

        C0096n(C0117n nVar) {
            super();
            this.f295c = nVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo366b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo367c() {
            return this.f295c.mo419a() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo368d() {
            C0079g.this.mo291a();
        }
    }

    /* renamed from: androidx.appcompat.app.g$o */
    /* compiled from: AppCompatDelegateImpl */
    static class C0097o {
        /* renamed from: a */
        static void m384a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$p */
    /* compiled from: AppCompatDelegateImpl */
    static class C0098p {
        /* renamed from: a */
        static void m385a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$q */
    /* compiled from: AppCompatDelegateImpl */
    static class C0099q {
        /* renamed from: a */
        static void m386a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$r */
    /* compiled from: AppCompatDelegateImpl */
    private static class C0100r {
        /* renamed from: a */
        static void m387a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.g$s */
    /* compiled from: AppCompatDelegateImpl */
    private class C0101s extends ContentFrameLayout {
        public C0101s(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m388a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0079g.this.mo319a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m388a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0079g.this.mo325f(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C4800a.m7936c(getContext(), i));
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        f226j0 = z;
        if (f223g0 && !f227k0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0080a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0079g(Activity activity, C0077e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    /* renamed from: A */
    private void m276A() {
        if (this.f261k == null) {
            Object obj = this.f259i;
            if (obj instanceof Activity) {
                m284a(((Activity) obj).getWindow());
            }
        }
        if (this.f261k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: B */
    private void m277B() {
        m306z();
        if (this.f233F && this.f264n == null) {
            Object obj = this.f259i;
            if (obj instanceof Activity) {
                this.f264n = new C0119o((Activity) this.f259i, this.f234G);
            } else if (obj instanceof Dialog) {
                this.f264n = new C0119o((Dialog) this.f259i);
            }
            C0069a aVar = this.f264n;
            if (aVar != null) {
                aVar.mo187c(this.f255b0);
            }
        }
    }

    /* renamed from: C */
    private boolean m278C() {
        int i;
        if (!this.f249V && (this.f259i instanceof Activity)) {
            PackageManager packageManager = this.f260j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else {
                    i = Build.VERSION.SDK_INT >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f260j, this.f259i.getClass()), i);
                this.f248U = (activityInfo == null || (activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f248U = false;
            }
        }
        this.f249V = true;
        return this.f248U;
    }

    /* renamed from: D */
    private void m279D() {
        if (this.f276z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: E */
    private C0076d m280E() {
        Context context = this.f260j;
        while (context != null) {
            if (!(context instanceof C0076d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0076d) context;
            }
        }
        return null;
    }

    /* renamed from: v */
    private void m302v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f228A.findViewById(16908290);
        View decorView = this.f261k.getDecorView();
        contentFrameLayout.mo1144a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f260j.obtainStyledAttributes(C4799j.AppCompatTheme);
        obtainStyledAttributes.getValue(C4799j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C4799j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C4799j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C4799j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C4799j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C4799j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private int m303w() {
        int i = this.f246S;
        return i != -100 ? i : C0078f.m248m();
    }

    /* renamed from: x */
    private void m304x() {
        C0094m mVar = this.f250W;
        if (mVar != null) {
            mVar.mo369a();
        }
        C0094m mVar2 = this.f251X;
        if (mVar2 != null) {
            mVar2.mo369a();
        }
    }

    /* renamed from: y */
    private ViewGroup m305y() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f260j.obtainStyledAttributes(C4799j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C4799j.AppCompatTheme_windowNoTitle, false)) {
                mo296b(1);
            } else if (obtainStyledAttributes.getBoolean(C4799j.AppCompatTheme_windowActionBar, false)) {
                mo296b(108);
            }
            if (obtainStyledAttributes.getBoolean(C4799j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo296b(109);
            }
            if (obtainStyledAttributes.getBoolean(C4799j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo296b(10);
            }
            this.f236I = obtainStyledAttributes.getBoolean(C4799j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m276A();
            this.f261k.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f260j);
            if (this.f237J) {
                viewGroup = this.f235H ? (ViewGroup) from.inflate(C4796g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C4796g.abc_screen_simple, (ViewGroup) null);
            } else if (this.f236I) {
                viewGroup = (ViewGroup) from.inflate(C4796g.abc_dialog_title_material, (ViewGroup) null);
                this.f234G = false;
                this.f233F = false;
            } else if (this.f233F) {
                TypedValue typedValue = new TypedValue();
                this.f260j.getTheme().resolveAttribute(C4790a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C4824d(this.f260j, typedValue.resourceId);
                } else {
                    context = this.f260j;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C4796g.abc_screen_toolbar, (ViewGroup) null);
                C0297w wVar = (C0297w) viewGroup.findViewById(C4795f.decor_content_parent);
                this.f267q = wVar;
                wVar.setWindowCallback(mo335q());
                if (this.f234G) {
                    this.f267q.mo920a(109);
                }
                if (this.f231D) {
                    this.f267q.mo920a(2);
                }
                if (this.f232E) {
                    this.f267q.mo920a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C5071v.m9169a((View) viewGroup, (C5067r) new C0082c());
                } else if (viewGroup instanceof C0222a0) {
                    ((C0222a0) viewGroup).setOnFitSystemWindowsListener(new C0083d());
                }
                if (this.f267q == null) {
                    this.f229B = (TextView) viewGroup.findViewById(C4795f.title);
                }
                C0298w0.m1424b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C4795f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f261k.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f261k.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0084e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f233F + ", windowActionBarOverlay: " + this.f234G + ", android:windowIsFloating: " + this.f236I + ", windowActionModeOverlay: " + this.f235H + ", windowNoTitle: " + this.f237J + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m306z() {
        if (!this.f276z) {
            this.f228A = m305y();
            CharSequence p = mo334p();
            if (!TextUtils.isEmpty(p)) {
                C0297w wVar = this.f267q;
                if (wVar != null) {
                    wVar.setWindowTitle(p);
                } else if (mo338t() != null) {
                    mo338t().mo185b(p);
                } else {
                    TextView textView = this.f229B;
                    if (textView != null) {
                        textView.setText(p);
                    }
                }
            }
            m302v();
            mo315a(this.f228A);
            this.f276z = true;
            C0102t a = mo312a(0, false);
            if (this.f245R) {
                return;
            }
            if (a == null || a.f307j == null) {
                m300j(108);
            }
        }
    }

    /* renamed from: a */
    public void mo286a(Bundle bundle) {
        this.f242O = true;
        m289a(false);
        m276A();
        Object obj = this.f259i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0371g.m1803b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0069a t = mo338t();
                if (t == null) {
                    this.f255b0 = true;
                } else {
                    t.mo187c(true);
                }
            }
            C0078f.m243a((C0078f) this);
        }
        this.f243P = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo315a(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public Context mo292b(Context context) {
        boolean z = true;
        this.f242O = true;
        int a = mo309a(context, m303w());
        Configuration configuration = null;
        if (f226j0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0100r.m387a((ContextThemeWrapper) context, m281a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C4824d) {
            try {
                ((C4824d) context).mo16781a(m281a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f225i0) {
            super.mo292b(context);
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m282a(configuration2, configuration3);
            }
            Configuration a2 = m281a(context, a, configuration);
            C4824d dVar = new C4824d(context, C4798i.Theme_AppCompat_Empty);
            dVar.mo16781a(a2);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C0406f.C0410b.m1973a(dVar.getTheme());
            }
            super.mo292b((Context) dVar);
            return dVar;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    /* renamed from: c */
    public void mo298c(int i) {
        m306z();
        ViewGroup viewGroup = (ViewGroup) this.f228A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f260j).inflate(i, viewGroup);
        this.f262l.mo16825a().onContentChanged();
    }

    /* renamed from: c */
    public void mo299c(Bundle bundle) {
    }

    /* renamed from: d */
    public MenuInflater mo300d() {
        if (this.f265o == null) {
            m277B();
            C0069a aVar = this.f264n;
            this.f265o = new C4828g(aVar != null ? aVar.mo195h() : this.f260j);
        }
        return this.f265o;
    }

    /* renamed from: e */
    public C0069a mo302e() {
        m277B();
        return this.f264n;
    }

    /* renamed from: f */
    public void mo303f() {
        LayoutInflater from = LayoutInflater.from(this.f260j);
        if (from.getFactory() == null) {
            C5051f.m9086b(from, this);
        } else if (!(from.getFactory2() instanceof C0079g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: g */
    public void mo304g() {
        C0069a e = mo302e();
        if (e == null || !e.mo196i()) {
            m300j(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo305h() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f259i
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0078f.m244b((androidx.appcompat.app.C0078f) r3)
        L_0x0009:
            boolean r0 = r3.f252Y
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f261k
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f254a0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f244Q = r0
            r0 = 1
            r3.f245R = r0
            int r0 = r3.f246S
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f259i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            l.e.g<java.lang.String, java.lang.Integer> r0 = f222f0
            java.lang.Object r1 = r3.f259i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f246S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            l.e.g<java.lang.String, java.lang.Integer> r0 = f222f0
            java.lang.Object r1 = r3.f259i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f264n
            if (r0 == 0) goto L_0x005e
            r0.mo197j()
        L_0x005e:
            r3.m304x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0079g.mo305h():void");
    }

    /* renamed from: i */
    public void mo306i() {
        C0069a e = mo302e();
        if (e != null) {
            e.mo194g(true);
        }
    }

    /* renamed from: j */
    public void mo307j() {
        this.f244Q = true;
        mo291a();
    }

    /* renamed from: k */
    public void mo308k() {
        this.f244Q = false;
        C0069a e = mo302e();
        if (e != null) {
            e.mo194g(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo329l() {
        C0138g gVar;
        C0297w wVar = this.f267q;
        if (wVar != null) {
            wVar.mo937g();
        }
        if (this.f272v != null) {
            this.f261k.getDecorView().removeCallbacks(this.f273w);
            if (this.f272v.isShowing()) {
                try {
                    this.f272v.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f272v = null;
        }
        mo330n();
        C0102t a = mo312a(0, false);
        if (a != null && (gVar = a.f307j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo330n() {
        C5086z zVar = this.f274x;
        if (zVar != null) {
            zVar.mo17642a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Context mo331o() {
        C0069a e = mo302e();
        Context h = e != null ? e.mo195h() : null;
        return h == null ? this.f260j : h;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo311a(view, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final CharSequence mo334p() {
        Object obj = this.f259i;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f266p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Window.Callback mo335q() {
        return this.f261k.getCallback();
    }

    /* renamed from: r */
    public boolean mo336r() {
        return this.f275y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo337s() {
        C4821b bVar = this.f270t;
        if (bVar != null) {
            bVar.mo435a();
            return true;
        }
        C0069a e = mo302e();
        if (e == null || !e.mo192f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C0069a mo338t() {
        return this.f264n;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f228A;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo339u() {
        /*
            r1 = this;
            boolean r0 = r1.f276z
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f228A
            if (r0 == 0) goto L_0x0010
            boolean r0 = p050l.p075h.p084l.C5071v.m9140E(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0079g.mo339u():boolean");
    }

    /* renamed from: androidx.appcompat.app.g$i */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0089i implements C0153m.C0154a {
        C0089i() {
        }

        /* renamed from: a */
        public boolean mo350a(C0138g gVar) {
            Window.Callback q = C0079g.this.mo335q();
            if (q == null) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }

        /* renamed from: a */
        public void mo349a(C0138g gVar, boolean z) {
            C0079g.this.mo322b(gVar);
        }
    }

    C0079g(Dialog dialog, C0077e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: androidx.appcompat.app.g$t */
    /* compiled from: AppCompatDelegateImpl */
    protected static final class C0102t {

        /* renamed from: a */
        int f298a;

        /* renamed from: b */
        int f299b;

        /* renamed from: c */
        int f300c;

        /* renamed from: d */
        int f301d;

        /* renamed from: e */
        int f302e;

        /* renamed from: f */
        int f303f;

        /* renamed from: g */
        ViewGroup f304g;

        /* renamed from: h */
        View f305h;

        /* renamed from: i */
        View f306i;

        /* renamed from: j */
        C0138g f307j;

        /* renamed from: k */
        C0135e f308k;

        /* renamed from: l */
        Context f309l;

        /* renamed from: m */
        boolean f310m;

        /* renamed from: n */
        boolean f311n;

        /* renamed from: o */
        boolean f312o;

        /* renamed from: p */
        public boolean f313p;

        /* renamed from: q */
        boolean f314q = false;

        /* renamed from: r */
        boolean f315r;

        /* renamed from: s */
        Bundle f316s;

        C0102t(int i) {
            this.f298a = i;
        }

        /* renamed from: a */
        public boolean mo378a() {
            if (this.f305h == null) {
                return false;
            }
            if (this.f306i == null && this.f308k.mo590a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo376a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C4790a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C4790a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C4798i.Theme_AppCompat_CompactMenu, true);
            }
            C4824d dVar = new C4824d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f309l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C4799j.AppCompatTheme);
            this.f299b = obtainStyledAttributes.getResourceId(C4799j.AppCompatTheme_panelBackground, 0);
            this.f303f = obtainStyledAttributes.getResourceId(C4799j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo377a(C0138g gVar) {
            C0135e eVar;
            C0138g gVar2 = this.f307j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo640b((C0153m) this.f308k);
                }
                this.f307j = gVar;
                if (gVar != null && (eVar = this.f308k) != null) {
                    gVar.mo620a((C0153m) eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0155n mo375a(C0153m.C0154a aVar) {
            if (this.f307j == null) {
                return null;
            }
            if (this.f308k == null) {
                C0135e eVar = new C0135e(this.f309l, C4796g.abc_list_menu_item_layout);
                this.f308k = eVar;
                eVar.mo551a(aVar);
                this.f307j.mo620a((C0153m) this.f308k);
            }
            return this.f308k.mo591a(this.f304g);
        }
    }

    private C0079g(Context context, Window window, C0077e eVar, Object obj) {
        Integer num;
        C0076d E;
        this.f274x = null;
        this.f275y = true;
        this.f246S = -100;
        this.f254a0 = new C0081b();
        this.f260j = context;
        this.f263m = eVar;
        this.f259i = obj;
        if (this.f246S == -100 && (obj instanceof Dialog) && (E = m280E()) != null) {
            this.f246S = E.getDelegate().mo297c();
        }
        if (this.f246S == -100 && (num = f222f0.get(this.f259i.getClass().getName())) != null) {
            this.f246S = num.intValue();
            f222f0.remove(this.f259i.getClass().getName());
        }
        if (window != null) {
            m284a(window);
        }
        C0253h.m1185c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m299e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            l.a.o.b r0 = r3.f270t
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.g$t r2 = r3.mo312a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.w r4 = r3.f267q
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo930c()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f260j
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.w r4 = r3.f267q
            boolean r4 = r4.mo926a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f245R
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.m294b((androidx.appcompat.app.C0079g.C0102t) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0062
            androidx.appcompat.widget.w r4 = r3.f267q
            boolean r0 = r4.mo935f()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.w r4 = r3.f267q
            boolean r0 = r4.mo934e()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f312o
            if (r4 != 0) goto L_0x0064
            boolean r4 = r2.f311n
            if (r4 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r4 = r2.f310m
            if (r4 == 0) goto L_0x0062
            boolean r4 = r2.f315r
            if (r4 == 0) goto L_0x005b
            r2.f310m = r1
            boolean r4 = r3.m294b((androidx.appcompat.app.C0079g.C0102t) r2, (android.view.KeyEvent) r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0062
            r3.m285a((androidx.appcompat.app.C0079g.C0102t) r2, (android.view.KeyEvent) r5)
            goto L_0x006a
        L_0x0062:
            r0 = 0
            goto L_0x006a
        L_0x0064:
            boolean r4 = r2.f312o
            r3.mo316a((androidx.appcompat.app.C0079g.C0102t) r2, (boolean) r0)
            r0 = r4
        L_0x006a:
            if (r0 == 0) goto L_0x0087
            android.content.Context r4 = r3.f260j
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L_0x0080
            r4.playSoundEffect(r1)
            goto L_0x0087
        L_0x0080:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0079g.m299e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: j */
    private void m300j(int i) {
        this.f253Z = (1 << i) | this.f253Z;
        if (!this.f252Y) {
            C5071v.m9162a(this.f261k.getDecorView(), this.f254a0);
            this.f252Y = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo328i(int i) {
        if (i == 108) {
            C0069a e = mo302e();
            if (e != null) {
                e.mo186b(false);
            }
        } else if (i == 0) {
            C0102t a = mo312a(i, true);
            if (a.f312o) {
                mo316a(a, false);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$k */
    /* compiled from: AppCompatDelegateImpl */
    class C0092k extends C4833i {
        C0092k(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo355a(ActionMode.Callback callback) {
            C4826f.C4827a aVar = new C4826f.C4827a(C0079g.this.f260j, callback);
            C4821b a = C0079g.this.mo283a((C4821b.C4822a) aVar);
            if (a != null) {
                return aVar.mo16806b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0079g.this.mo319a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0079g.this.mo323b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0138g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0079g.this.mo327h(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0079g.this.mo328i(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0138g gVar = menu instanceof C0138g ? (C0138g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo647c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo647c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0138g gVar;
            C0102t a = C0079g.this.mo312a(0, true);
            if (a == null || (gVar = a.f307j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (C0079g.this.mo336r()) {
                return mo355a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C0079g.this.mo336r() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo355a(callback);
        }
    }

    /* renamed from: k */
    private int m301k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo326g(int i) {
        C0102t a;
        C0102t a2 = mo312a(i, true);
        if (a2.f307j != null) {
            Bundle bundle = new Bundle();
            a2.f307j.mo645c(bundle);
            if (bundle.size() > 0) {
                a2.f316s = bundle;
            }
            a2.f307j.mo678s();
            a2.f307j.clear();
        }
        a2.f315r = true;
        a2.f314q = true;
        if ((i == 108 || i == 0) && this.f267q != null && (a = mo312a(0, false)) != null) {
            a.f310m = false;
            m294b(a, (KeyEvent) null);
        }
    }

    /* renamed from: androidx.appcompat.app.g$u */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0103u implements C0153m.C0154a {
        C0103u() {
        }

        /* renamed from: a */
        public void mo349a(C0138g gVar, boolean z) {
            C0138g m = gVar.mo668m();
            boolean z2 = m != gVar;
            C0079g gVar2 = C0079g.this;
            if (z2) {
                gVar = m;
            }
            C0102t a = gVar2.mo313a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0079g.this.mo314a(a.f298a, a, (Menu) m);
                C0079g.this.mo316a(a, true);
                return;
            }
            C0079g.this.mo316a(a, z);
        }

        /* renamed from: a */
        public boolean mo350a(C0138g gVar) {
            Window.Callback q;
            if (gVar != gVar.mo668m()) {
                return true;
            }
            C0079g gVar2 = C0079g.this;
            if (!gVar2.f233F || (q = gVar2.mo335q()) == null || C0079g.this.f245R) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo324c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f241N;
            this.f241N = false;
            C0102t a = mo312a(0, false);
            if (a != null && a.f312o) {
                if (!z) {
                    mo316a(a, true);
                }
                return true;
            } else if (mo337s()) {
                return true;
            }
        } else if (i == 82) {
            m299e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo301d(int i) {
        this.f247T = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo325f(int i) {
        mo316a(mo312a(i, true), true);
    }

    /* renamed from: d */
    private boolean m298d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0102t a = mo312a(i, true);
        if (!a.f312o) {
            return m294b(a, keyEvent);
        }
        return false;
    }

    /* renamed from: d */
    private C0094m m297d(Context context) {
        if (this.f250W == null) {
            this.f250W = new C0096n(C0117n.m455a(context));
        }
        return this.f250W;
    }

    /* renamed from: a */
    public void mo289a(Toolbar toolbar) {
        if (this.f259i instanceof Activity) {
            C0069a e = mo302e();
            if (!(e instanceof C0119o)) {
                this.f265o = null;
                if (e != null) {
                    e.mo197j();
                }
                if (toolbar != null) {
                    C0110l lVar = new C0110l(toolbar, mo334p(), this.f262l);
                    this.f264n = lVar;
                    this.f261k.setCallback(lVar.mo413l());
                } else {
                    this.f264n = null;
                    this.f261k.setCallback(this.f262l);
                }
                mo304g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: c */
    private boolean m296c(C0102t tVar) {
        Context context = this.f260j;
        int i = tVar.f298a;
        if ((i == 0 || i == 108) && this.f267q != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C4790a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C4790a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C4790a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C4824d dVar = new C4824d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0138g gVar = new C0138g(context);
        gVar.mo619a((C0138g.C0139a) this);
        tVar.mo377a(gVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo327h(int i) {
        C0069a e;
        if (i == 108 && (e = mo302e()) != null) {
            e.mo186b(true);
        }
    }

    /* renamed from: a */
    public <T extends View> T mo282a(int i) {
        m306z();
        return this.f261k.findViewById(i);
    }

    /* renamed from: a */
    public void mo285a(Configuration configuration) {
        C0069a e;
        if (this.f233F && this.f276z && (e = mo302e()) != null) {
            e.mo181a(configuration);
        }
        C0253h.m1184b().mo1570a(this.f260j);
        m289a(false);
    }

    /* renamed from: b */
    public void mo294b(Bundle bundle) {
        m306z();
    }

    /* renamed from: b */
    public void mo295b(View view, ViewGroup.LayoutParams layoutParams) {
        m306z();
        ViewGroup viewGroup = (ViewGroup) this.f228A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f262l.mo16825a().onContentChanged();
    }

    /* renamed from: a */
    public void mo287a(View view) {
        m306z();
        ViewGroup viewGroup = (ViewGroup) this.f228A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f262l.mo16825a().onContentChanged();
    }

    /* renamed from: b */
    public boolean mo296b(int i) {
        int k = m301k(i);
        if (this.f237J && k == 108) {
            return false;
        }
        if (this.f233F && k == 1) {
            this.f233F = false;
        }
        if (k == 1) {
            m279D();
            this.f237J = true;
            return true;
        } else if (k == 2) {
            m279D();
            this.f231D = true;
            return true;
        } else if (k == 5) {
            m279D();
            this.f232E = true;
            return true;
        } else if (k == 10) {
            m279D();
            this.f235H = true;
            return true;
        } else if (k == 108) {
            m279D();
            this.f233F = true;
            return true;
        } else if (k != 109) {
            return this.f261k.requestFeature(k);
        } else {
            m279D();
            this.f234G = true;
            return true;
        }
    }

    /* renamed from: c */
    public int mo297c() {
        return this.f246S;
    }

    /* renamed from: c */
    private C0094m m295c(Context context) {
        if (this.f251X == null) {
            this.f251X = new C0093l(context);
        }
        return this.f251X;
    }

    /* renamed from: a */
    public void mo288a(View view, ViewGroup.LayoutParams layoutParams) {
        m306z();
        ((ViewGroup) this.f228A.findViewById(16908290)).addView(view, layoutParams);
        this.f262l.mo16825a().onContentChanged();
    }

    /* renamed from: a */
    private void m284a(Window window) {
        if (this.f261k == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0092k)) {
                C0092k kVar = new C0092k(callback);
                this.f262l = kVar;
                window.setCallback(kVar);
                C0278q0 a = C0278q0.m1270a(this.f260j, (AttributeSet) null, f224h0);
                Drawable c = a.mo1722c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo1720b();
                this.f261k = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p050l.p051a.p058o.C4821b mo321b(p050l.p051a.p058o.C4821b.C4822a r8) {
        /*
            r7 = this;
            r7.mo330n()
            l.a.o.b r0 = r7.f270t
            if (r0 == 0) goto L_0x000a
            r0.mo435a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0079g.C0090j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.g$j r0 = new androidx.appcompat.app.g$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f263m
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f245R
            if (r2 != 0) goto L_0x0022
            l.a.o.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f270t = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f271u
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f236I
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f260j
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p050l.p051a.C4790a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f260j
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            l.a.o.d r4 = new l.a.o.d
            android.content.Context r6 = r7.f260j
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f260j
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f271u = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p050l.p051a.C4790a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f272v = r5
            r6 = 2
            androidx.core.widget.C0435h.m2141a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.f272v
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f271u
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f272v
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p050l.p051a.C4790a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f271u
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f272v
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.g$f r0 = new androidx.appcompat.app.g$f
            r0.<init>()
            r7.f273w = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f228A
            int r4 = p050l.p051a.C4795f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo331o()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1398a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f271u = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f271u
            if (r0 == 0) goto L_0x0161
            r7.mo330n()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f271u
            r0.mo900c()
            l.a.o.e r0 = new l.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f271u
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f271u
            android.widget.PopupWindow r6 = r7.f272v
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo443c()
            boolean r8 = r8.mo352a((p050l.p051a.p058o.C4821b) r0, (android.view.Menu) r3)
            if (r8 == 0) goto L_0x015f
            r0.mo447i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            r8.mo898a(r0)
            r7.f270t = r0
            boolean r8 = r7.mo339u()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            l.h.l.z r8 = p050l.p075h.p084l.C5071v.m9151a(r8)
            r8.mo17637a((float) r0)
            r7.f274x = r8
            androidx.appcompat.app.g$g r0 = new androidx.appcompat.app.g$g
            r0.<init>()
            r8.mo17640a((p050l.p075h.p084l.C5012a0) r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f271u
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p050l.p075h.p084l.C5071v.m9145J(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.f272v
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f261k
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f273w
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.f270t = r1
        L_0x0161:
            l.a.o.b r8 = r7.f270t
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.e r0 = r7.f263m
            if (r0 == 0) goto L_0x016c
            r0.onSupportActionModeStarted(r8)
        L_0x016c:
            l.a.o.b r8 = r7.f270t
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0079g.mo321b(l.a.o.b$a):l.a.o.b");
    }

    /* renamed from: a */
    public final void mo290a(CharSequence charSequence) {
        this.f266p = charSequence;
        C0297w wVar = this.f267q;
        if (wVar != null) {
            wVar.setWindowTitle(charSequence);
        } else if (mo338t() != null) {
            mo338t().mo185b(charSequence);
        } else {
            TextView textView = this.f229B;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public boolean mo320a(C0138g gVar, MenuItem menuItem) {
        C0102t a;
        Window.Callback q = mo335q();
        if (q == null || this.f245R || (a = mo313a((Menu) gVar.mo668m())) == null) {
            return false;
        }
        return q.onMenuItemSelected(a.f298a, menuItem);
    }

    /* renamed from: a */
    public void mo317a(C0138g gVar) {
        m291b(true);
    }

    /* renamed from: a */
    public C4821b mo283a(C4821b.C4822a aVar) {
        C0077e eVar;
        if (aVar != null) {
            C4821b bVar = this.f270t;
            if (bVar != null) {
                bVar.mo435a();
            }
            C0090j jVar = new C0090j(aVar);
            C0069a e = mo302e();
            if (e != null) {
                C4821b a = e.mo180a((C4821b.C4822a) jVar);
                this.f270t = a;
                if (!(a == null || (eVar = this.f263m) == null)) {
                    eVar.onSupportActionModeStarted(a);
                }
            }
            if (this.f270t == null) {
                this.f270t = mo321b((C4821b.C4822a) jVar);
            }
            return this.f270t;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo319a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f259i;
        boolean z = true;
        if (((obj instanceof C5030e.C5031a) || (obj instanceof C0104h)) && (decorView = this.f261k.getDecorView()) != null && C5030e.m8984a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f262l.mo16825a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo318a(keyCode, keyEvent) : mo324c(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo318a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f241N = z;
        } else if (i == 82) {
            m298d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo311a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f258e0 == null) {
            String string = this.f260j.obtainStyledAttributes(C4799j.AppCompatTheme).getString(C4799j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f258e0 = new C0107j();
            } else {
                try {
                    this.f258e0 = (C0107j) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f258e0 = new C0107j();
                }
            }
        }
        if (f223g0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m286a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f258e0.mo396a(view, str, context, attributeSet, z, f223g0, true, C0296v0.m1411b());
    }

    /* renamed from: a */
    private boolean m286a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f261k.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C5071v.m9139D((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private void m285a(C0102t tVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!tVar.f312o && !this.f245R) {
            if (tVar.f298a == 0) {
                if ((this.f260j.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback q = mo335q();
            if (q == null || q.onMenuOpened(tVar.f298a, tVar.f307j)) {
                WindowManager windowManager = (WindowManager) this.f260j.getSystemService("window");
                if (windowManager != null && m294b(tVar, keyEvent)) {
                    if (tVar.f304g == null || tVar.f314q) {
                        ViewGroup viewGroup = tVar.f304g;
                        if (viewGroup == null) {
                            if (!m293b(tVar) || tVar.f304g == null) {
                                return;
                            }
                        } else if (tVar.f314q && viewGroup.getChildCount() > 0) {
                            tVar.f304g.removeAllViews();
                        }
                        if (!m287a(tVar) || !tVar.mo378a()) {
                            tVar.f314q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = tVar.f305h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        tVar.f304g.setBackgroundResource(tVar.f299b);
                        ViewParent parent = tVar.f305h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(tVar.f305h);
                        }
                        tVar.f304g.addView(tVar.f305h, layoutParams2);
                        if (!tVar.f305h.hasFocus()) {
                            tVar.f305h.requestFocus();
                        }
                    } else {
                        View view = tVar.f306i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            tVar.f311n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, tVar.f301d, tVar.f302e, 1002, 8519680, -3);
                            layoutParams3.gravity = tVar.f300c;
                            layoutParams3.windowAnimations = tVar.f303f;
                            windowManager.addView(tVar.f304g, layoutParams3);
                            tVar.f312o = true;
                            return;
                        }
                    }
                    i = -2;
                    tVar.f311n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, tVar.f301d, tVar.f302e, 1002, 8519680, -3);
                    layoutParams32.gravity = tVar.f300c;
                    layoutParams32.windowAnimations = tVar.f303f;
                    windowManager.addView(tVar.f304g, layoutParams32);
                    tVar.f312o = true;
                    return;
                }
                return;
            }
            mo316a(tVar, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo323b(int i, KeyEvent keyEvent) {
        C0069a e = mo302e();
        if (e != null && e.mo183a(i, keyEvent)) {
            return true;
        }
        C0102t tVar = this.f240M;
        if (tVar == null || !m288a(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f240M == null) {
                C0102t a = mo312a(0, true);
                m294b(a, keyEvent);
                boolean a2 = m288a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f310m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0102t tVar2 = this.f240M;
        if (tVar2 != null) {
            tVar2.f311n = true;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m293b(C0102t tVar) {
        tVar.mo376a(mo331o());
        tVar.f304g = new C0101s(tVar.f309l);
        tVar.f300c = 81;
        return true;
    }

    /* renamed from: b */
    private void m291b(boolean z) {
        C0297w wVar = this.f267q;
        if (wVar == null || !wVar.mo930c() || (ViewConfiguration.get(this.f260j).hasPermanentMenuKey() && !this.f267q.mo932d())) {
            C0102t a = mo312a(0, true);
            a.f314q = true;
            mo316a(a, false);
            m285a(a, (KeyEvent) null);
            return;
        }
        Window.Callback q = mo335q();
        if (this.f267q.mo926a() && z) {
            this.f267q.mo934e();
            if (!this.f245R) {
                q.onPanelClosed(108, mo312a(0, true).f307j);
            }
        } else if (q != null && !this.f245R) {
            if (this.f252Y && (this.f253Z & 1) != 0) {
                this.f261k.getDecorView().removeCallbacks(this.f254a0);
                this.f254a0.run();
            }
            C0102t a2 = mo312a(0, true);
            C0138g gVar = a2.f307j;
            if (gVar != null && !a2.f315r && q.onPreparePanel(0, a2.f306i, gVar)) {
                q.onMenuOpened(108, a2.f307j);
                this.f267q.mo935f();
            }
        }
    }

    /* renamed from: a */
    private boolean m287a(C0102t tVar) {
        View view = tVar.f306i;
        if (view != null) {
            tVar.f305h = view;
            return true;
        } else if (tVar.f307j == null) {
            return false;
        } else {
            if (this.f269s == null) {
                this.f269s = new C0103u();
            }
            View view2 = (View) tVar.mo375a((C0153m.C0154a) this.f269s);
            tVar.f305h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    private boolean m294b(C0102t tVar, KeyEvent keyEvent) {
        C0297w wVar;
        C0297w wVar2;
        C0297w wVar3;
        if (this.f245R) {
            return false;
        }
        if (tVar.f310m) {
            return true;
        }
        C0102t tVar2 = this.f240M;
        if (!(tVar2 == null || tVar2 == tVar)) {
            mo316a(tVar2, false);
        }
        Window.Callback q = mo335q();
        if (q != null) {
            tVar.f306i = q.onCreatePanelView(tVar.f298a);
        }
        int i = tVar.f298a;
        boolean z = i == 0 || i == 108;
        if (z && (wVar3 = this.f267q) != null) {
            wVar3.mo928b();
        }
        if (tVar.f306i == null && (!z || !(mo338t() instanceof C0110l))) {
            if (tVar.f307j == null || tVar.f315r) {
                if (tVar.f307j == null && (!m296c(tVar) || tVar.f307j == null)) {
                    return false;
                }
                if (z && this.f267q != null) {
                    if (this.f268r == null) {
                        this.f268r = new C0089i();
                    }
                    this.f267q.mo921a(tVar.f307j, this.f268r);
                }
                tVar.f307j.mo678s();
                if (!q.onCreatePanelMenu(tVar.f298a, tVar.f307j)) {
                    tVar.mo377a((C0138g) null);
                    if (z && (wVar2 = this.f267q) != null) {
                        wVar2.mo921a((Menu) null, this.f268r);
                    }
                    return false;
                }
                tVar.f315r = false;
            }
            tVar.f307j.mo678s();
            Bundle bundle = tVar.f316s;
            if (bundle != null) {
                tVar.f307j.mo617a(bundle);
                tVar.f316s = null;
            }
            if (!q.onPreparePanel(0, tVar.f306i, tVar.f307j)) {
                if (z && (wVar = this.f267q) != null) {
                    wVar.mo921a((Menu) null, this.f268r);
                }
                tVar.f307j.mo675r();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f313p = z2;
            tVar.f307j.setQwertyMode(z2);
            tVar.f307j.mo675r();
        }
        tVar.f310m = true;
        tVar.f311n = false;
        this.f240M = tVar;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo316a(C0102t tVar, boolean z) {
        ViewGroup viewGroup;
        C0297w wVar;
        if (!z || tVar.f298a != 0 || (wVar = this.f267q) == null || !wVar.mo926a()) {
            WindowManager windowManager = (WindowManager) this.f260j.getSystemService("window");
            if (!(windowManager == null || !tVar.f312o || (viewGroup = tVar.f304g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo314a(tVar.f298a, tVar, (Menu) null);
                }
            }
            tVar.f310m = false;
            tVar.f311n = false;
            tVar.f312o = false;
            tVar.f305h = null;
            tVar.f314q = true;
            if (this.f240M == tVar) {
                this.f240M = null;
                return;
            }
            return;
        }
        mo322b(tVar.f307j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo314a(int i, C0102t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i >= 0) {
                C0102t[] tVarArr = this.f239L;
                if (i < tVarArr.length) {
                    tVar = tVarArr[i];
                }
            }
            if (tVar != null) {
                menu = tVar.f307j;
            }
        }
        if ((tVar == null || tVar.f312o) && !this.f245R) {
            this.f262l.mo16825a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0102t mo313a(Menu menu) {
        C0102t[] tVarArr = this.f239L;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0102t tVar = tVarArr[i];
            if (tVar != null && tVar.f307j == menu) {
                return tVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0102t mo312a(int i, boolean z) {
        C0102t[] tVarArr = this.f239L;
        if (tVarArr == null || tVarArr.length <= i) {
            C0102t[] tVarArr2 = new C0102t[(i + 1)];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f239L = tVarArr2;
            tVarArr = tVarArr2;
        }
        C0102t tVar = tVarArr[i];
        if (tVar != null) {
            return tVar;
        }
        C0102t tVar2 = new C0102t(i);
        tVarArr[i] = tVar2;
        return tVar2;
    }

    /* renamed from: a */
    private boolean m288a(C0102t tVar, int i, KeyEvent keyEvent, int i2) {
        C0138g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f310m || m294b(tVar, keyEvent)) && (gVar = tVar.f307j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f267q == null) {
            mo316a(tVar, true);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo310a(C5020d0 d0Var, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4 = 0;
        if (d0Var != null) {
            i = d0Var.mo17482g();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f271u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f271u.getLayoutParams();
            boolean z3 = true;
            if (this.f271u.isShown()) {
                if (this.f256c0 == null) {
                    this.f256c0 = new Rect();
                    this.f257d0 = new Rect();
                }
                Rect rect2 = this.f256c0;
                Rect rect3 = this.f257d0;
                if (d0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(d0Var.mo17479e(), d0Var.mo17482g(), d0Var.mo17481f(), d0Var.mo17478d());
                }
                C0298w0.m1422a(this.f228A, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                C5020d0 v = C5071v.m9210v(this.f228A);
                if (v == null) {
                    i2 = 0;
                } else {
                    i2 = v.mo17479e();
                }
                if (v == null) {
                    i3 = 0;
                } else {
                    i3 = v.mo17481f();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.f230C != null) {
                    View view = this.f230C;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i2 && marginLayoutParams2.rightMargin == i3)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i2;
                            marginLayoutParams2.rightMargin = i3;
                            this.f230C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f260j);
                    this.f230C = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f228A.addView(this.f230C, -1, layoutParams);
                }
                if (this.f230C == null) {
                    z3 = false;
                }
                if (z3 && this.f230C.getVisibility() != 0) {
                    m290b(this.f230C);
                }
                if (!this.f235H && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f271u.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f230C;
        if (view3 != null) {
            if (!z) {
                i4 = 8;
            }
            view3.setVisibility(i4);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo322b(C0138g gVar) {
        if (!this.f238K) {
            this.f238K = true;
            this.f267q.mo937g();
            Window.Callback q = mo335q();
            if (q != null && !this.f245R) {
                q.onPanelClosed(108, gVar);
            }
            this.f238K = false;
        }
    }

    /* renamed from: b */
    private void m290b(View view) {
        int i;
        if ((C5071v.m9212x(view) & 8192) != 0) {
            i = C0394a.m1909a(this.f260j, C4792c.abc_decor_view_status_guard_light);
        } else {
            i = C0394a.m1909a(this.f260j, C4792c.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m292b(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f260j
            r1 = 0
            android.content.res.Configuration r0 = r6.m281a((android.content.Context) r0, (int) r7, (android.content.res.Configuration) r1)
            boolean r2 = r6.m278C()
            android.content.Context r3 = r6.f260j
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f242O
            if (r8 == 0) goto L_0x0047
            boolean r8 = f225i0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f243P
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f259i
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f259i
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0352a.m1778d(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m283a((int) r0, (boolean) r2, (android.content.res.Configuration) r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f259i
            boolean r0 = r8 instanceof androidx.appcompat.app.C0076d
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.d r8 = (androidx.appcompat.app.C0076d) r8
            r8.onNightModeChanged(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0079g.m292b(int, boolean):boolean");
    }

    /* renamed from: b */
    public final C0073b mo293b() {
        return new C0088h(this);
    }

    /* renamed from: a */
    public boolean mo291a() {
        return m289a(true);
    }

    /* renamed from: a */
    private boolean m289a(boolean z) {
        if (this.f245R) {
            return false;
        }
        int w = m303w();
        boolean b = m292b(mo309a(this.f260j, w), z);
        if (w == 0) {
            m297d(this.f260j).mo370e();
        } else {
            C0094m mVar = this.f250W;
            if (mVar != null) {
                mVar.mo369a();
            }
        }
        if (w == 3) {
            m295c(this.f260j).mo370e();
        } else {
            C0094m mVar2 = this.f251X;
            if (mVar2 != null) {
                mVar2.mo369a();
            }
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo309a(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m295c(context).mo367c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return m297d(context).mo367c();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* renamed from: a */
    private Configuration m281a(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: a */
    private void m283a(int i, boolean z, Configuration configuration) {
        Resources resources = this.f260j.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0109k.m421a(resources);
        }
        int i2 = this.f247T;
        if (i2 != 0) {
            this.f260j.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f260j.getTheme().applyStyle(this.f247T, true);
            }
        }
        if (z) {
            Object obj = this.f259i;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0521j) {
                    if (((C0521j) activity).getLifecycle().mo3038a().mo3041a(C0514f.C0516b.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f244Q) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: a */
    private static Configuration m282a(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                C0098p.m385a(configuration, configuration2, configuration3);
            } else if (!C5003c.m8889a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i5 = configuration.touchscreen;
            int i6 = configuration2.touchscreen;
            if (i5 != i6) {
                configuration3.touchscreen = i6;
            }
            int i7 = configuration.keyboard;
            int i8 = configuration2.keyboard;
            if (i7 != i8) {
                configuration3.keyboard = i8;
            }
            int i9 = configuration.keyboardHidden;
            int i10 = configuration2.keyboardHidden;
            if (i9 != i10) {
                configuration3.keyboardHidden = i10;
            }
            int i11 = configuration.navigation;
            int i12 = configuration2.navigation;
            if (i11 != i12) {
                configuration3.navigation = i12;
            }
            int i13 = configuration.navigationHidden;
            int i14 = configuration2.navigationHidden;
            if (i13 != i14) {
                configuration3.navigationHidden = i14;
            }
            int i15 = configuration.orientation;
            int i16 = configuration2.orientation;
            if (i15 != i16) {
                configuration3.orientation = i16;
            }
            int i17 = configuration.screenLayout & 15;
            int i18 = configuration2.screenLayout;
            if (i17 != (i18 & 15)) {
                configuration3.screenLayout |= i18 & 15;
            }
            int i19 = configuration.screenLayout & 192;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 192)) {
                configuration3.screenLayout |= i20 & 192;
            }
            int i21 = configuration.screenLayout & 48;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 48)) {
                configuration3.screenLayout |= i22 & 48;
            }
            int i23 = configuration.screenLayout & 768;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 768)) {
                configuration3.screenLayout |= i24 & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                C0099q.m386a(configuration, configuration2, configuration3);
            }
            int i25 = configuration.uiMode & 15;
            int i26 = configuration2.uiMode;
            if (i25 != (i26 & 15)) {
                configuration3.uiMode |= i26 & 15;
            }
            int i27 = configuration.uiMode & 48;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 48)) {
                configuration3.uiMode |= i28 & 48;
            }
            int i29 = configuration.screenWidthDp;
            int i30 = configuration2.screenWidthDp;
            if (i29 != i30) {
                configuration3.screenWidthDp = i30;
            }
            int i31 = configuration.screenHeightDp;
            int i32 = configuration2.screenHeightDp;
            if (i31 != i32) {
                configuration3.screenHeightDp = i32;
            }
            int i33 = configuration.smallestScreenWidthDp;
            int i34 = configuration2.smallestScreenWidthDp;
            if (i33 != i34) {
                configuration3.smallestScreenWidthDp = i34;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                C0097o.m384a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }
}
