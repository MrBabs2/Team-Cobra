package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.C0054b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0546x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p050l.p066e.C4870b;
import p050l.p075h.p083k.C5001a;
import p050l.p075h.p083k.C5002b;
import p050l.p075h.p084l.C5068s;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentManagerImpl */
final class C0466i extends C0462h implements LayoutInflater.Factory2 {

    /* renamed from: M */
    static boolean f1978M = false;

    /* renamed from: N */
    static final Interpolator f1979N = new DecelerateInterpolator(2.5f);

    /* renamed from: O */
    static final Interpolator f1980O = new DecelerateInterpolator(1.5f);

    /* renamed from: A */
    boolean f1981A;

    /* renamed from: B */
    boolean f1982B;

    /* renamed from: C */
    boolean f1983C;

    /* renamed from: D */
    boolean f1984D;

    /* renamed from: E */
    ArrayList<C0453a> f1985E;

    /* renamed from: F */
    ArrayList<Boolean> f1986F;

    /* renamed from: G */
    ArrayList<Fragment> f1987G;

    /* renamed from: H */
    Bundle f1988H = null;

    /* renamed from: I */
    SparseArray<Parcelable> f1989I = null;

    /* renamed from: J */
    ArrayList<C0480m> f1990J;

    /* renamed from: K */
    private C0481j f1991K;

    /* renamed from: L */
    Runnable f1992L = new C0468b();

    /* renamed from: h */
    ArrayList<C0478k> f1993h;

    /* renamed from: i */
    boolean f1994i;

    /* renamed from: j */
    int f1995j = 0;

    /* renamed from: k */
    final ArrayList<Fragment> f1996k = new ArrayList<>();

    /* renamed from: l */
    final HashMap<String, Fragment> f1997l = new HashMap<>();

    /* renamed from: m */
    ArrayList<C0453a> f1998m;

    /* renamed from: n */
    ArrayList<Fragment> f1999n;

    /* renamed from: o */
    private OnBackPressedDispatcher f2000o;

    /* renamed from: p */
    private final C0054b f2001p = new C0467a(false);

    /* renamed from: q */
    ArrayList<C0453a> f2002q;

    /* renamed from: r */
    ArrayList<Integer> f2003r;

    /* renamed from: s */
    ArrayList<C0462h.C0465c> f2004s;

    /* renamed from: t */
    private final CopyOnWriteArrayList<C0476i> f2005t = new CopyOnWriteArrayList<>();

    /* renamed from: u */
    int f2006u = 0;

    /* renamed from: v */
    C0461g f2007v;

    /* renamed from: w */
    C0458d f2008w;

    /* renamed from: x */
    Fragment f2009x;

    /* renamed from: y */
    Fragment f2010y;

    /* renamed from: z */
    boolean f2011z;

    /* renamed from: androidx.fragment.app.i$a */
    /* compiled from: FragmentManagerImpl */
    class C0467a extends C0054b {
        C0467a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo142a() {
            C0466i.this.mo2902w();
        }
    }

    /* renamed from: androidx.fragment.app.i$b */
    /* compiled from: FragmentManagerImpl */
    class C0468b implements Runnable {
        C0468b() {
        }

        public void run() {
            C0466i.this.mo2897t();
        }
    }

    /* renamed from: androidx.fragment.app.i$c */
    /* compiled from: FragmentManagerImpl */
    class C0469c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2014a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2015b;

        /* renamed from: androidx.fragment.app.i$c$a */
        /* compiled from: FragmentManagerImpl */
        class C0470a implements Runnable {
            C0470a() {
            }

            public void run() {
                if (C0469c.this.f2015b.getAnimatingAway() != null) {
                    C0469c.this.f2015b.setAnimatingAway((View) null);
                    C0469c cVar = C0469c.this;
                    C0466i iVar = C0466i.this;
                    Fragment fragment = cVar.f2015b;
                    iVar.mo2831a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        C0469c(ViewGroup viewGroup, Fragment fragment) {
            this.f2014a = viewGroup;
            this.f2015b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2014a.post(new C0470a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.i$d */
    /* compiled from: FragmentManagerImpl */
    class C0471d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2018a;

        /* renamed from: b */
        final /* synthetic */ View f2019b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2020c;

        C0471d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2018a = viewGroup;
            this.f2019b = view;
            this.f2020c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2018a.endViewTransition(this.f2019b);
            Animator animator2 = this.f2020c.getAnimator();
            this.f2020c.setAnimator((Animator) null);
            if (animator2 != null && this.f2018a.indexOfChild(this.f2019b) < 0) {
                C0466i iVar = C0466i.this;
                Fragment fragment = this.f2020c;
                iVar.mo2831a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$e */
    /* compiled from: FragmentManagerImpl */
    class C0472e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2022a;

        /* renamed from: b */
        final /* synthetic */ View f2023b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2024c;

        C0472e(C0466i iVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2022a = viewGroup;
            this.f2023b = view;
            this.f2024c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2022a.endViewTransition(this.f2023b);
            animator.removeListener(this);
            Fragment fragment = this.f2024c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$f */
    /* compiled from: FragmentManagerImpl */
    class C0473f extends C0460f {
        C0473f() {
        }

        /* renamed from: a */
        public Fragment mo2785a(ClassLoader classLoader, String str) {
            C0461g gVar = C0466i.this.f2007v;
            return gVar.mo2760a(gVar.mo2787c(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.i$i */
    /* compiled from: FragmentManagerImpl */
    private static final class C0476i {

        /* renamed from: a */
        final C0462h.C0464b f2033a;

        /* renamed from: b */
        final boolean f2034b;
    }

    /* renamed from: androidx.fragment.app.i$j */
    /* compiled from: FragmentManagerImpl */
    static class C0477j {

        /* renamed from: a */
        public static final int[] f2035a = {16842755, 16842960, 16842961};
    }

    /* renamed from: androidx.fragment.app.i$k */
    /* compiled from: FragmentManagerImpl */
    interface C0478k {
        /* renamed from: a */
        boolean mo2685a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.i$l */
    /* compiled from: FragmentManagerImpl */
    private class C0479l implements C0478k {

        /* renamed from: a */
        final String f2036a;

        /* renamed from: b */
        final int f2037b;

        /* renamed from: c */
        final int f2038c;

        C0479l(String str, int i, int i2) {
            this.f2036a = str;
            this.f2037b = i;
            this.f2038c = i2;
        }

        /* renamed from: a */
        public boolean mo2685a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0466i.this.f2010y;
            if (fragment != null && this.f2037b < 0 && this.f2036a == null && fragment.getChildFragmentManager().mo2805g()) {
                return false;
            }
            return C0466i.this.mo2844a(arrayList, arrayList2, this.f2036a, this.f2037b, this.f2038c);
        }
    }

    /* renamed from: androidx.fragment.app.i$m */
    /* compiled from: FragmentManagerImpl */
    static class C0480m implements Fragment.C0450e {

        /* renamed from: a */
        final boolean f2040a;

        /* renamed from: b */
        final C0453a f2041b;

        /* renamed from: c */
        private int f2042c;

        C0480m(C0453a aVar, boolean z) {
            this.f2040a = z;
            this.f2041b = aVar;
        }

        /* renamed from: a */
        public void mo2663a() {
            this.f2042c++;
        }

        /* renamed from: b */
        public void mo2664b() {
            int i = this.f2042c - 1;
            this.f2042c = i;
            if (i == 0) {
                this.f2041b.f1964s.mo2823C();
            }
        }

        /* renamed from: c */
        public void mo2916c() {
            C0453a aVar = this.f2041b;
            aVar.f1964s.mo2838a(aVar, this.f2040a, false, false);
        }

        /* renamed from: d */
        public void mo2917d() {
            boolean z = this.f2042c > 0;
            C0466i iVar = this.f2041b.f1964s;
            int size = iVar.f1996k.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = iVar.f1996k.get(i);
                fragment.setOnStartEnterTransitionListener((Fragment.C0450e) null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0453a aVar = this.f2041b;
            aVar.f1964s.mo2838a(aVar, this.f2040a, !z, true);
        }

        /* renamed from: e */
        public boolean mo2918e() {
            return this.f2042c == 0;
        }
    }

    C0466i() {
    }

    /* renamed from: E */
    private void m2293E() {
        this.f1997l.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: F */
    private void m2294F() {
        if (mo2904y()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: G */
    private void m2295G() {
        this.f1994i = false;
        this.f1986F.clear();
        this.f1985E.clear();
    }

    /* renamed from: H */
    private void m2296H() {
        for (Fragment next : this.f1997l.values()) {
            if (next != null) {
                if (next.getAnimatingAway() != null) {
                    int stateAfterAnimating = next.getStateAfterAnimating();
                    View animatingAway = next.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    next.setAnimatingAway((View) null);
                    mo2831a(next, stateAfterAnimating, 0, 0, false);
                } else if (next.getAnimator() != null) {
                    next.getAnimator().end();
                }
            }
        }
    }

    /* renamed from: I */
    private void m2297I() {
        if (this.f1990J != null) {
            while (!this.f1990J.isEmpty()) {
                this.f1990J.remove(0).mo2917d();
            }
        }
    }

    /* renamed from: J */
    private void m2298J() {
        ArrayList<C0478k> arrayList = this.f1993h;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            C0054b bVar = this.f2001p;
            if (mo2801c() <= 0 || !mo2875j(this.f2009x)) {
                z = false;
            }
            bVar.mo144a(z);
            return;
        }
        this.f2001p.mo144a(true);
    }

    /* renamed from: a */
    private void m2303a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C5002b("FragmentManager"));
        C0461g gVar = this.f2007v;
        if (gVar != null) {
            try {
                gVar.mo2752a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo2798a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public static int m2308b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: f */
    public static int m2315f(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: v */
    private void m2316v(Fragment fragment) {
        if (fragment != null && this.f1997l.get(fragment.mWho) == fragment) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2821A() {
        if (this.f2004s != null) {
            for (int i = 0; i < this.f2004s.size(); i++) {
                this.f2004s.get(i).mo2820a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Parcelable mo2822B() {
        ArrayList<String> arrayList;
        int size;
        m2297I();
        m2296H();
        mo2897t();
        this.f1981A = true;
        BackStackState[] backStackStateArr = null;
        if (this.f1997l.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.f1997l.size());
        boolean z = false;
        for (Fragment next : this.f1997l.values()) {
            if (next != null) {
                if (next.mFragmentManager == this) {
                    FragmentState fragmentState = new FragmentState(next);
                    arrayList2.add(fragmentState);
                    if (next.mState <= 0 || fragmentState.f1962r != null) {
                        fragmentState.f1962r = next.mSavedFragmentState;
                    } else {
                        fragmentState.f1962r = mo2892r(next);
                        String str = next.mTargetWho;
                        if (str != null) {
                            Fragment fragment = this.f1997l.get(str);
                            if (fragment != null) {
                                if (fragmentState.f1962r == null) {
                                    fragmentState.f1962r = new Bundle();
                                }
                                mo2795a(fragmentState.f1962r, "android:target_state", fragment);
                                int i = next.mTargetRequestCode;
                                if (i != 0) {
                                    fragmentState.f1962r.putInt("android:target_req_state", i);
                                }
                            } else {
                                m2303a((RuntimeException) new IllegalStateException("Failure saving state: " + next + " has target not in fragment manager: " + next.mTargetWho));
                                throw null;
                            }
                        }
                    }
                    if (f1978M) {
                        Log.v("FragmentManager", "Saved state of " + next + ": " + fragmentState.f1962r);
                    }
                    z = true;
                } else {
                    m2303a((RuntimeException) new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z) {
            if (f1978M) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f1996k.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f1996k.iterator();
            while (it.hasNext()) {
                Fragment next2 = it.next();
                arrayList.add(next2.mWho);
                if (next2.mFragmentManager != this) {
                    m2303a((RuntimeException) new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                } else if (f1978M) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.mWho + "): " + next2);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<C0453a> arrayList3 = this.f1998m;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f1998m.get(i2));
                if (f1978M) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1998m.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1945f = arrayList2;
        fragmentManagerState.f1946g = arrayList;
        fragmentManagerState.f1947h = backStackStateArr;
        Fragment fragment2 = this.f2010y;
        if (fragment2 != null) {
            fragmentManagerState.f1948i = fragment2.mWho;
        }
        fragmentManagerState.f1949j = this.f1995j;
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo2823C() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f1990J != null && !this.f1990J.isEmpty();
            if (this.f1993h != null && this.f1993h.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2007v.mo2788d().removeCallbacks(this.f1992L);
                this.f2007v.mo2788d().post(this.f1992L);
                m2298J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo2824D() {
        for (Fragment next : this.f1997l.values()) {
            if (next != null) {
                mo2885o(next);
            }
        }
    }

    /* renamed from: b */
    public boolean mo2800b() {
        boolean t = mo2897t();
        m2297I();
        return t;
    }

    /* renamed from: c */
    public int mo2801c() {
        ArrayList<C0453a> arrayList = this.f1998m;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2862d(int i) {
        return this.f2006u >= i;
    }

    /* renamed from: e */
    public List<Fragment> mo2803e() {
        List<Fragment> list;
        if (this.f1996k.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1996k) {
            list = (List) this.f1996k.clone();
        }
        return list;
    }

    /* renamed from: f */
    public void mo2804f() {
        mo2840a((C0478k) new C0479l((String) null, -1, 0), false);
    }

    /* renamed from: g */
    public boolean mo2805g() {
        m2294F();
        return m2307a((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0546x mo2869h(Fragment fragment) {
        return this.f1991K.mo2924d(fragment);
    }

    /* renamed from: i */
    public void mo2873i(Fragment fragment) {
        if (f1978M) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo2875j(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C0466i iVar = fragment.mFragmentManager;
        if (fragment != iVar.mo2901v() || !mo2875j(iVar.f2009x)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2877k(Fragment fragment) {
        if (this.f1997l.get(fragment.mWho) == null) {
            this.f1997l.put(fragment.mWho, fragment);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    mo2847b(fragment);
                } else {
                    mo2891q(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (f1978M) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2879l(Fragment fragment) {
        if (this.f1997l.get(fragment.mWho) != null) {
            if (f1978M) {
                Log.v("FragmentManager", "Removed fragment from active set " + fragment);
            }
            for (Fragment next : this.f1997l.values()) {
                if (next != null && fragment.mWho.equals(next.mTargetWho)) {
                    next.mTarget = fragment;
                    next.mTargetWho = null;
                }
            }
            this.f1997l.put(fragment.mWho, (Object) null);
            mo2891q(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = this.f1997l.get(str);
            }
            fragment.initState();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r0 = r0.mView;
        r1 = r11.mContainer;
        r0 = r1.indexOfChild(r0);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2881m(androidx.fragment.app.Fragment r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r10.f1997l
            java.lang.String r1 = r11.mWho
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = " to state "
            r0.append(r11)
            int r11 = r10.f2006u
            r0.append(r11)
            java.lang.String r11 = "since it is not added to "
            r0.append(r11)
            r0.append(r10)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r10.f2006u
            boolean r1 = r11.mRemoving
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0051
            boolean r1 = r11.isInBackStack()
            if (r1 == 0) goto L_0x004d
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x0051
        L_0x004d:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x0051:
            r6 = r0
            int r7 = r11.getNextTransition()
            int r8 = r11.getNextTransitionStyle()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.mo2831a((androidx.fragment.app.Fragment) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
            android.view.View r0 = r11.mView
            if (r0 == 0) goto L_0x00be
            androidx.fragment.app.Fragment r0 = r10.m2317w(r11)
            if (r0 == 0) goto L_0x0082
            android.view.View r0 = r0.mView
            android.view.ViewGroup r1 = r11.mContainer
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.mView
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x0082
            r1.removeViewAt(r4)
            android.view.View r4 = r11.mView
            r1.addView(r4, r0)
        L_0x0082:
            boolean r0 = r11.mIsNewlyAdded
            if (r0 == 0) goto L_0x00be
            android.view.ViewGroup r0 = r11.mContainer
            if (r0 == 0) goto L_0x00be
            float r0 = r11.mPostponedAlpha
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            android.view.View r4 = r11.mView
            r4.setAlpha(r0)
        L_0x0096:
            r11.mPostponedAlpha = r1
            r11.mIsNewlyAdded = r3
            int r0 = r11.getNextTransition()
            int r1 = r11.getNextTransitionStyle()
            androidx.fragment.app.i$g r0 = r10.mo2825a((androidx.fragment.app.Fragment) r11, (int) r0, (boolean) r2, (int) r1)
            if (r0 == 0) goto L_0x00be
            android.view.animation.Animation r1 = r0.f2026a
            if (r1 == 0) goto L_0x00b2
            android.view.View r0 = r11.mView
            r0.startAnimation(r1)
            goto L_0x00be
        L_0x00b2:
            android.animation.Animator r1 = r0.f2027b
            android.view.View r2 = r11.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f2027b
            r0.start()
        L_0x00be:
            boolean r0 = r11.mHiddenChanged
            if (r0 == 0) goto L_0x00c5
            r10.mo2859d((androidx.fragment.app.Fragment) r11)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0466i.mo2881m(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2883n(Fragment fragment) {
        mo2831a(fragment, this.f2006u, 0, 0, false);
    }

    /* renamed from: o */
    public void mo2885o(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f1994i) {
            this.f1984D = true;
            return;
        }
        fragment.mDeferStart = false;
        mo2831a(fragment, this.f2006u, 0, 0, false);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C0477j.f2035a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str3 == null || !C0460f.m2240b(context.getClassLoader(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str3);
        }
        if (resourceId != -1) {
            fragment = mo2790a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = mo2792a(string);
        }
        if (fragment == null && i != -1) {
            fragment = mo2790a(i);
        }
        if (f1978M) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str3 + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = mo2802d().mo2785a(context.getClassLoader(), str3);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : i;
            fragment.mContainerId = i;
            fragment.mTag = string;
            fragment.mInLayout = true;
            fragment.mFragmentManager = this;
            C0461g gVar = this.f2007v;
            fragment.mHost = gVar;
            fragment.onInflate(gVar.mo2787c(), attributeSet2, fragment.mSavedFragmentState);
            mo2836a(fragment, true);
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            C0461g gVar2 = this.f2007v;
            fragment.mHost = gVar2;
            fragment.onInflate(gVar2.mo2787c(), attributeSet2, fragment.mSavedFragmentState);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + str3);
        }
        Fragment fragment2 = fragment;
        if (this.f2006u >= 1 || !fragment2.mFromLayout) {
            mo2883n(fragment2);
        } else {
            mo2831a(fragment2, 1, 0, 0, false);
        }
        View view2 = fragment2.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment2.mView.getTag() == null) {
                fragment2.mView.setTag(string);
            }
            return fragment2.mView;
        }
        throw new IllegalStateException("Fragment " + str3 + " did not create a view.");
    }

    /* renamed from: p */
    public void mo2889p(Fragment fragment) {
        if (f1978M) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f1996k) {
                this.f1996k.remove(fragment);
            }
            if (m2318x(fragment)) {
                this.f2011z = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2891q(Fragment fragment) {
        if (mo2904y()) {
            if (f1978M) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f1991K.mo2926e(fragment) && f1978M) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Bundle mo2892r(Fragment fragment) {
        if (this.f1988H == null) {
            this.f1988H = new Bundle();
        }
        fragment.performSaveInstanceState(this.f1988H);
        mo2860d(fragment, this.f1988H, false);
        Bundle bundle = null;
        if (!this.f1988H.isEmpty()) {
            Bundle bundle2 = this.f1988H;
            this.f1988H = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            mo2895s(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2894s() {
        if (this.f1984D) {
            this.f1984D = false;
            mo2824D();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public boolean mo2897t() {
        m2313c(true);
        boolean z = false;
        while (m2311b(this.f1985E, this.f1986F)) {
            this.f1994i = true;
            try {
                m2312c(this.f1985E, this.f1986F);
                m2295G();
                z = true;
            } catch (Throwable th) {
                m2295G();
                throw th;
            }
        }
        m2298J();
        mo2894s();
        m2293E();
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2009x;
        if (fragment != null) {
            C5001a.m8886a(fragment, sb);
        } else {
            C5001a.m8886a(this.f2007v, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public LayoutInflater.Factory2 mo2899u() {
        return this;
    }

    /* renamed from: u */
    public void mo2900u(Fragment fragment) {
        if (f1978M) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2902w() {
        mo2897t();
        if (this.f2001p.mo146b()) {
            mo2805g();
        } else {
            this.f2000o.mo139a();
        }
    }

    /* renamed from: x */
    public boolean mo2903x() {
        return this.f1983C;
    }

    /* renamed from: y */
    public boolean mo2904y() {
        return this.f1981A || this.f1982B;
    }

    /* renamed from: z */
    public void mo2905z() {
        this.f1981A = false;
        this.f1982B = false;
        int size = this.f1996k.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: x */
    private boolean m2318x(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo2871h();
    }

    /* renamed from: c */
    public void mo2856c(Fragment fragment) {
        if (f1978M) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f1996k.contains(fragment)) {
                if (f1978M) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f1996k) {
                    this.f1996k.add(fragment);
                }
                fragment.mAdded = true;
                if (m2318x(fragment)) {
                    this.f2011z = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2859d(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0474g a = mo2825a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a == null || (animator = a.f2027b) == null) {
                if (a != null) {
                    fragment.mView.startAnimation(a.f2026a);
                    a.f2026a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    a.f2027b.addListener(new C0472e(this, viewGroup, view, fragment));
                }
                a.f2027b.start();
            }
        }
        if (fragment.mAdded && m2318x(fragment)) {
            this.f2011z = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2865f(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), (ViewGroup) null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                mo2834a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2870h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2870h(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2819g(this, fragment);
            }
        }
    }

    /* renamed from: n */
    public void mo2882n() {
        m2314e(3);
    }

    /* renamed from: b */
    public C0462h.C0463a mo2799b(int i) {
        return this.f1998m.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0481j mo2867g(Fragment fragment) {
        return this.f1991K.mo2922c(fragment);
    }

    /* renamed from: v */
    public Fragment mo2901v() {
        return this.f2010y;
    }

    /* renamed from: androidx.fragment.app.i$g */
    /* compiled from: FragmentManagerImpl */
    private static class C0474g {

        /* renamed from: a */
        public final Animation f2026a;

        /* renamed from: b */
        public final Animator f2027b;

        C0474g(Animation animation) {
            this.f2026a = animation;
            this.f2027b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0474g(Animator animator) {
            this.f2026a = null;
            this.f2027b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2847b(Fragment fragment) {
        if (mo2904y()) {
            if (f1978M) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f1991K.mo2919a(fragment) && f1978M) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2868g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2868g(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2818f(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2895s(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.f1989I;
            if (sparseArray == null) {
                this.f1989I = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f1989I);
            if (this.f1989I.size() > 0) {
                fragment.mSavedViewState = this.f1989I;
                this.f1989I = null;
            }
        }
    }

    /* renamed from: w */
    private Fragment m2317w(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f1996k.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1996k.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public void mo2872i() {
        this.f1981A = false;
        this.f1982B = false;
        m2314e(2);
    }

    /* renamed from: j */
    public void mo2874j() {
        this.f1981A = false;
        this.f1982B = false;
        m2314e(1);
    }

    /* renamed from: androidx.fragment.app.i$h */
    /* compiled from: FragmentManagerImpl */
    private static class C0475h extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f2028f;

        /* renamed from: g */
        private final View f2029g;

        /* renamed from: h */
        private boolean f2030h;

        /* renamed from: i */
        private boolean f2031i;

        /* renamed from: j */
        private boolean f2032j = true;

        C0475h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2028f = viewGroup;
            this.f2029g = view;
            addAnimation(animation);
            this.f2028f.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f2032j = true;
            if (this.f2030h) {
                return !this.f2031i;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2030h = true;
                C5068s.m9132a(this.f2028f, this);
            }
            return true;
        }

        public void run() {
            if (this.f2030h || !this.f2032j) {
                this.f2028f.endViewTransition(this.f2029g);
                this.f2031i = true;
                return;
            }
            this.f2032j = false;
            this.f2028f.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2032j = true;
            if (this.f2030h) {
                return !this.f2031i;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2030h = true;
                C5068s.m9132a(this.f2028f, this);
            }
            return true;
        }
    }

    /* renamed from: e */
    public void mo2863e(Fragment fragment) {
        if (f1978M) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (f1978M) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f1996k) {
                    this.f1996k.remove(fragment);
                }
                if (m2318x(fragment)) {
                    this.f2011z = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2884o() {
        m2298J();
        m2316v(this.f2010y);
    }

    /* renamed from: q */
    public void mo2890q() {
        this.f1981A = false;
        this.f1982B = false;
        m2314e(3);
    }

    /* renamed from: k */
    public void mo2876k() {
        this.f1983C = true;
        mo2897t();
        m2314e(0);
        this.f2007v = null;
        this.f2008w = null;
        this.f2009x = null;
        if (this.f2000o != null) {
            this.f2001p.mo147c();
            this.f2000o = null;
        }
    }

    /* renamed from: b */
    public Fragment mo2846b(String str) {
        Fragment findFragmentByWho;
        for (Fragment next : this.f1997l.values()) {
            if (next != null && (findFragmentByWho = next.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo2871h() {
        boolean z = false;
        for (Fragment next : this.f1997l.values()) {
            if (next != null) {
                z = m2318x(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public void mo2896t(Fragment fragment) {
        if (fragment == null || (this.f1997l.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            Fragment fragment2 = this.f2010y;
            this.f2010y = fragment;
            m2316v(fragment2);
            m2316v(this.f2010y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: a */
    public C0485m mo2793a() {
        return new C0453a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2866f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2866f(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2817e(this, fragment);
            }
        }
    }

    /* renamed from: a */
    public void mo2797a(String str, int i) {
        mo2840a((C0478k) new C0479l(str, -1, i), false);
    }

    /* renamed from: b */
    public int mo2845b(C0453a aVar) {
        synchronized (this) {
            if (this.f2003r != null) {
                if (this.f2003r.size() > 0) {
                    int intValue = this.f2003r.remove(this.f2003r.size() - 1).intValue();
                    if (f1978M) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.f2002q.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.f2002q == null) {
                this.f2002q = new ArrayList<>();
            }
            int size = this.f2002q.size();
            if (f1978M) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f2002q.add(aVar);
            return size;
        }
    }

    /* renamed from: l */
    public void mo2878l() {
        m2314e(1);
    }

    /* renamed from: p */
    public void mo2888p() {
        this.f1981A = false;
        this.f1982B = false;
        m2314e(4);
    }

    /* renamed from: a */
    public void mo2794a(int i, int i2) {
        if (i >= 0) {
            mo2840a((C0478k) new C0479l((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: a */
    private boolean m2307a(String str, int i, int i2) {
        mo2897t();
        m2313c(true);
        Fragment fragment = this.f2010y;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo2805g()) {
            return true;
        }
        boolean a = mo2844a(this.f1985E, this.f1986F, str, i, i2);
        if (a) {
            this.f1994i = true;
            try {
                m2312c(this.f1985E, this.f1986F);
            } finally {
                m2295G();
            }
        }
        m2298J();
        mo2894s();
        m2293E();
        return a;
    }

    /* renamed from: c */
    public void mo2855c(int i) {
        synchronized (this) {
            this.f2002q.set(i, (Object) null);
            if (this.f2003r == null) {
                this.f2003r = new ArrayList<>();
            }
            if (f1978M) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f2003r.add(Integer.valueOf(i));
        }
    }

    /* renamed from: r */
    public void mo2893r() {
        this.f1982B = true;
        m2314e(2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m2314e(int i) {
        try {
            this.f1994i = true;
            mo2827a(i, false);
            this.f1994i = false;
            mo2897t();
        } catch (Throwable th) {
            this.f1994i = false;
            throw th;
        }
    }

    /* renamed from: c */
    private void m2313c(boolean z) {
        if (this.f1994i) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2007v == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2007v.mo2788d().getLooper()) {
            if (!z) {
                m2294F();
            }
            if (this.f1985E == null) {
                this.f1985E = new ArrayList<>();
                this.f1986F = new ArrayList<>();
            }
            this.f1994i = true;
            try {
                m2304a((ArrayList<C0453a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1994i = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2864e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2864e(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2815d(this, fragment);
            }
        }
    }

    /* renamed from: b */
    public void mo2851b(C0478k kVar, boolean z) {
        if (!z || (this.f2007v != null && !this.f1983C)) {
            m2313c(z);
            if (kVar.mo2685a(this.f1985E, this.f1986F)) {
                this.f1994i = true;
                try {
                    m2312c(this.f1985E, this.f1986F);
                } finally {
                    m2295G();
                }
            }
            m2298J();
            mo2894s();
            m2293E();
        }
    }

    /* renamed from: d */
    public C0460f mo2802d() {
        if (super.mo2802d() == C0462h.f1976g) {
            Fragment fragment = this.f2009x;
            if (fragment != null) {
                return fragment.mFragmentManager.mo2802d();
            }
            mo2796a((C0460f) new C0473f());
        }
        return super.mo2802d();
    }

    /* renamed from: a */
    public void mo2795a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        m2303a((RuntimeException) new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: a */
    public Fragment mo2791a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f1997l.get(string);
        if (fragment != null) {
            return fragment;
        }
        m2303a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* renamed from: m */
    public void mo2880m() {
        for (int i = 0; i < this.f1996k.size(); i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2861d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2861d(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2813c(this, fragment);
            }
        }
    }

    /* renamed from: a */
    public Fragment.SavedState mo2789a(Fragment fragment) {
        Bundle r;
        if (fragment.mFragmentManager != this) {
            m2303a((RuntimeException) new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
            throw null;
        } else if (fragment.mState <= 0 || (r = mo2892r(fragment)) == null) {
            return null;
        } else {
            return new Fragment.SavedState(r);
        }
    }

    /* renamed from: b */
    private void m2309b(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0453a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = arrayList3.get(i5).f2066q;
        ArrayList<Fragment> arrayList5 = this.f1987G;
        if (arrayList5 == null) {
            this.f1987G = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f1987G.addAll(this.f1996k);
        Fragment v = mo2901v();
        boolean z2 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            C0453a aVar = arrayList3.get(i7);
            if (!arrayList4.get(i7).booleanValue()) {
                v = aVar.mo2677a(this.f1987G, v);
            } else {
                v = aVar.mo2687b(this.f1987G, v);
            }
            z2 = z2 || aVar.f2057h;
        }
        this.f1987G.clear();
        if (!z) {
            C0487n.m2471a(this, arrayList, arrayList2, i, i2, false);
        }
        m2305a(arrayList, arrayList2, i, i2);
        if (z) {
            C4870b bVar = new C4870b();
            m2306a((C4870b<Fragment>) bVar);
            int a = m2299a(arrayList, arrayList2, i, i2, (C4870b<Fragment>) bVar);
            m2310b((C4870b<Fragment>) bVar);
            i3 = a;
        } else {
            i3 = i6;
        }
        if (i3 != i5 && z) {
            C0487n.m2471a(this, arrayList, arrayList2, i, i3, true);
            mo2827a(this.f2006u, true);
        }
        while (i5 < i6) {
            C0453a aVar2 = arrayList3.get(i5);
            if (arrayList4.get(i5).booleanValue() && (i4 = aVar2.f1966u) >= 0) {
                mo2855c(i4);
                aVar2.f1966u = -1;
            }
            aVar2.mo2697h();
            i5++;
        }
        if (z2) {
            mo2821A();
        }
    }

    /* renamed from: c */
    private void m2312c(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m2304a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f2066q) {
                    if (i2 != i) {
                        m2309b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2066q) {
                            i2++;
                        }
                    }
                    m2309b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m2309b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: a */
    public void mo2798a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f1997l.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment next : this.f1997l.values()) {
                printWriter.print(str);
                printWriter.println(next);
                if (next != null) {
                    next.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f1996k.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size5; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f1996k.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1999n;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size4; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1999n.get(i2).toString());
            }
        }
        ArrayList<C0453a> arrayList2 = this.f1998m;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C0453a aVar = this.f1998m.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo2682a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.f2002q != null && (size2 = this.f2002q.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size2; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f2002q.get(i4));
                }
            }
            if (this.f2003r != null && this.f2003r.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2003r.toArray()));
            }
        }
        ArrayList<C0478k> arrayList3 = this.f1993h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i5 = 0; i5 < size; i5++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(this.f1993h.get(i5));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2007v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2008w);
        if (this.f2009x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2009x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2006u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1981A);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1982B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1983C);
        if (this.f2011z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2011z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2860d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2860d(fragment, bundle, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2816d(this, fragment, bundle);
            }
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2857c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2857c(fragment, bundle, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2814c(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2858c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2858c(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2810b(this, fragment);
            }
        }
    }

    /* renamed from: b */
    private void m2310b(C4870b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment j = bVar.mo16927j(i);
            if (!j.mAdded) {
                View requireView = j.requireView();
                j.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2311b(java.util.ArrayList<androidx.fragment.app.C0453a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.i$k> r0 = r4.f1993h     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<androidx.fragment.app.i$k> r0 = r4.f1993h     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<androidx.fragment.app.i$k> r0 = r4.f1993h     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<androidx.fragment.app.i$k> r3 = r4.f1993h     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            androidx.fragment.app.i$k r3 = (androidx.fragment.app.C0466i.C0478k) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo2685a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<androidx.fragment.app.i$k> r5 = r4.f1993h     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            androidx.fragment.app.g r5 = r4.f2007v     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo2788d()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f1992L     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003f:
            throw r5
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0466i.m2311b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: b */
    public void mo2852b(boolean z) {
        for (int size = this.f1996k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1996k.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo2853b(Menu menu) {
        if (this.f2006u < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1996k.size(); i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo2854b(MenuItem menuItem) {
        if (this.f2006u < 1) {
            return false;
        }
        for (int i = 0; i < this.f1996k.size(); i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2848b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2848b(fragment, context, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2811b((C0462h) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2849b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2849b(fragment, bundle, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2812b((C0462h) this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    static C0474g m2301a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1979N);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f1980O);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0474g((Animation) animationSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2850b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2850b(fragment, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2806a(this, fragment);
            }
        }
    }

    /* renamed from: a */
    static C0474g m2300a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1980O);
        alphaAnimation.setDuration(220);
        return new C0474g((Animation) alphaAnimation);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0474g mo2825a(Fragment fragment, int i, boolean z, int i2) {
        int b;
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C0474g(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C0474g(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.f2007v.mo2787c().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2007v.mo2787c(), nextAnim);
                    if (loadAnimation != null) {
                        return new C0474g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2007v.mo2787c(), nextAnim);
                    if (loadAnimator != null) {
                        return new C0474g(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2007v.mo2787c(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new C0474g(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (b = m2308b(i, z)) < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m2301a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m2301a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m2301a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m2301a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m2300a(0.0f, 1.0f);
            case 6:
                return m2300a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f2007v.mo2758h()) {
                    i2 = this.f2007v.mo2757g();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04d4;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2831a(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r20
            goto L_0x0016
        L_0x0011:
            r0 = r20
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r19.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0037
            if (r0 <= r10) goto L_0x0037
            r0 = 2
        L_0x0037:
            androidx.lifecycle.f$b r1 = r7.mMaxState
            androidx.lifecycle.f$b r2 = androidx.lifecycle.C0514f.C0516b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.mState
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x0323
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            android.view.View r0 = r19.getAnimatingAway()
            if (r0 != 0) goto L_0x0068
            android.animation.Animator r0 = r19.getAnimator()
            if (r0 == 0) goto L_0x007c
        L_0x0068:
            r7.setAnimatingAway(r14)
            r7.setAnimator(r14)
            int r2 = r19.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r1 = r19
            r0.mo2831a((androidx.fragment.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x007c:
            int r0 = r7.mState
            if (r0 == 0) goto L_0x008e
            if (r0 == r8) goto L_0x01e5
            if (r0 == r10) goto L_0x008b
            if (r0 == r9) goto L_0x0088
            goto L_0x04d4
        L_0x0088:
            r0 = 3
            goto L_0x02fd
        L_0x008b:
            r0 = 2
            goto L_0x02db
        L_0x008e:
            if (r11 <= 0) goto L_0x01e5
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x00a8:
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00ff
            androidx.fragment.app.g r1 = r6.f2007v
            android.content.Context r1 = r1.mo2787c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.mo2791a((android.os.Bundle) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.mWho
            goto L_0x00d1
        L_0x00d0:
            r0 = r14
        L_0x00d1:
            r7.mTargetWho = r0
            if (r0 == 0) goto L_0x00df
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00df:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r14
            goto L_0x00f6
        L_0x00ec:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00f6:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00ff
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00ff
            r11 = 2
        L_0x00ff:
            androidx.fragment.app.g r0 = r6.f2007v
            r7.mHost = r0
            androidx.fragment.app.Fragment r1 = r6.f2009x
            r7.mParentFragment = r1
            if (r1 == 0) goto L_0x010c
            androidx.fragment.app.i r0 = r1.mChildFragmentManager
            goto L_0x010e
        L_0x010c:
            androidx.fragment.app.i r0 = r0.f1975j
        L_0x010e:
            r7.mFragmentManager = r0
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r15 = " that does not belong to this FragmentManager!"
            java.lang.String r5 = " declared target fragment "
            java.lang.String r4 = "Fragment "
            if (r0 == 0) goto L_0x0169
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f1997l
            java.lang.String r0 = r0.mWho
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x0147
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x013c
            r2 = 1
            r3 = 0
            r16 = 0
            r17 = 1
            r0 = r18
            r9 = r4
            r4 = r16
            r10 = r5
            r5 = r17
            r0.mo2831a((androidx.fragment.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x013e
        L_0x013c:
            r9 = r4
            r10 = r5
        L_0x013e:
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r0 = r0.mWho
            r7.mTargetWho = r0
            r7.mTarget = r14
            goto L_0x016b
        L_0x0147:
            r9 = r4
            r10 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            androidx.fragment.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0169:
            r9 = r4
            r10 = r5
        L_0x016b:
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x01a8
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f1997l
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0188
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x01a8
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r0.mo2831a((androidx.fragment.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x01a8
        L_0x0188:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r2 = r7.mTargetWho
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a8:
            androidx.fragment.app.g r0 = r6.f2007v
            android.content.Context r0 = r0.mo2787c()
            r6.mo2848b((androidx.fragment.app.Fragment) r7, (android.content.Context) r0, (boolean) r13)
            r19.performAttach()
            androidx.fragment.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x01be
            androidx.fragment.app.g r0 = r6.f2007v
            r0.mo2748a((androidx.fragment.app.Fragment) r7)
            goto L_0x01c1
        L_0x01be:
            r0.onAttachFragment(r7)
        L_0x01c1:
            androidx.fragment.app.g r0 = r6.f2007v
            android.content.Context r0 = r0.mo2787c()
            r6.mo2832a((androidx.fragment.app.Fragment) r7, (android.content.Context) r0, (boolean) r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x01de
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo2857c(r7, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo2849b((androidx.fragment.app.Fragment) r7, (android.os.Bundle) r0, (boolean) r13)
            goto L_0x01e5
        L_0x01de:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x01e5:
            if (r11 <= 0) goto L_0x01ea
            r18.mo2865f((androidx.fragment.app.Fragment) r19)
        L_0x01ea:
            if (r11 <= r8) goto L_0x008b
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x0204
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0204:
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x02c4
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x027a
            r1 = -1
            if (r0 == r1) goto L_0x025b
            androidx.fragment.app.d r1 = r6.f2008w
            android.view.View r0 = r1.mo2661a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x027b
            boolean r1 = r7.mRestored
            if (r1 == 0) goto L_0x021e
            goto L_0x027b
        L_0x021e:
            android.content.res.Resources r0 = r19.getResources()     // Catch:{ NotFoundException -> 0x0229 }
            int r1 = r7.mContainerId     // Catch:{ NotFoundException -> 0x0229 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x0229 }
            goto L_0x022b
        L_0x0229:
            java.lang.String r0 = "unknown"
        L_0x022b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.m2303a((java.lang.RuntimeException) r1)
            throw r14
        L_0x025b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m2303a((java.lang.RuntimeException) r0)
            throw r14
        L_0x027a:
            r0 = r14
        L_0x027b:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r7.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r7.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x02c2
            r7.mInnerView = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0298
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x0298:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x02a3
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x02a3:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r7.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r6.mo2834a((androidx.fragment.app.Fragment) r7, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02be
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x02be
            goto L_0x02bf
        L_0x02be:
            r8 = 0
        L_0x02bf:
            r7.mIsNewlyAdded = r8
            goto L_0x02c4
        L_0x02c2:
            r7.mInnerView = r14
        L_0x02c4:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo2833a((androidx.fragment.app.Fragment) r7, (android.os.Bundle) r0, (boolean) r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02d7
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreViewState(r0)
        L_0x02d7:
            r7.mSavedFragmentState = r14
            goto L_0x008b
        L_0x02db:
            if (r11 <= r0) goto L_0x0088
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x02f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02f5:
            r19.performStart()
            r6.mo2866f(r7, r13)
            goto L_0x0088
        L_0x02fd:
            if (r11 <= r0) goto L_0x04d4
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x0317
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0317:
            r19.performResume()
            r6.mo2864e(r7, r13)
            r7.mSavedFragmentState = r14
            r7.mSavedViewState = r14
            goto L_0x04d4
        L_0x0323:
            if (r0 <= r11) goto L_0x04d4
            if (r0 == r8) goto L_0x0403
            r1 = 2
            if (r0 == r1) goto L_0x0373
            r1 = 3
            if (r0 == r1) goto L_0x0352
            r1 = 4
            if (r0 == r1) goto L_0x0332
            goto L_0x04d4
        L_0x0332:
            if (r11 >= r1) goto L_0x0352
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x034c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x034c:
            r19.performPause()
            r6.mo2861d(r7, r13)
        L_0x0352:
            r0 = 3
            if (r11 >= r0) goto L_0x0373
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x036d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x036d:
            r19.performStop()
            r6.mo2868g(r7, r13)
        L_0x0373:
            r0 = 2
            if (r11 >= r0) goto L_0x0403
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x038e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x038e:
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x03a1
            androidx.fragment.app.g r0 = r6.f2007v
            boolean r0 = r0.mo2754b(r7)
            if (r0 == 0) goto L_0x03a1
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x03a1
            r18.mo2895s(r19)
        L_0x03a1:
            r19.performDestroyView()
            r6.mo2870h(r7, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x03f4
            android.view.ViewGroup r1 = r7.mContainer
            if (r1 == 0) goto L_0x03f4
            r1.endViewTransition(r0)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r19.getParentFragment()
            if (r0 == 0) goto L_0x03c5
            androidx.fragment.app.Fragment r0 = r19.getParentFragment()
            boolean r0 = r0.mRemoving
            if (r0 != 0) goto L_0x03f4
        L_0x03c5:
            int r0 = r6.f2006u
            r1 = 0
            if (r0 <= 0) goto L_0x03e5
            boolean r0 = r6.f1983C
            if (r0 != 0) goto L_0x03e5
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03e5
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03e5
            r0 = r21
            r2 = r22
            androidx.fragment.app.i$g r0 = r6.mo2825a((androidx.fragment.app.Fragment) r7, (int) r0, (boolean) r13, (int) r2)
            goto L_0x03e6
        L_0x03e5:
            r0 = r14
        L_0x03e6:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x03ed
            r6.m2302a((androidx.fragment.app.Fragment) r7, (androidx.fragment.app.C0466i.C0474g) r0, (int) r11)
        L_0x03ed:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x03f4:
            r7.mContainer = r14
            r7.mView = r14
            r7.mViewLifecycleOwner = r14
            androidx.lifecycle.p<androidx.lifecycle.j> r0 = r7.mViewLifecycleOwnerLiveData
            r0.mo3003b(r14)
            r7.mInnerView = r14
            r7.mInLayout = r13
        L_0x0403:
            if (r11 >= r8) goto L_0x04d4
            boolean r0 = r6.f1983C
            if (r0 == 0) goto L_0x042a
            android.view.View r0 = r19.getAnimatingAway()
            if (r0 == 0) goto L_0x041a
            android.view.View r0 = r19.getAnimatingAway()
            r7.setAnimatingAway(r14)
            r0.clearAnimation()
            goto L_0x042a
        L_0x041a:
            android.animation.Animator r0 = r19.getAnimator()
            if (r0 == 0) goto L_0x042a
            android.animation.Animator r0 = r19.getAnimator()
            r7.setAnimator(r14)
            r0.cancel()
        L_0x042a:
            android.view.View r0 = r19.getAnimatingAway()
            if (r0 != 0) goto L_0x04d0
            android.animation.Animator r0 = r19.getAnimator()
            if (r0 == 0) goto L_0x0438
            goto L_0x04d0
        L_0x0438:
            boolean r0 = f1978M
            if (r0 == 0) goto L_0x0450
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0450:
            boolean r0 = r7.mRemoving
            if (r0 == 0) goto L_0x045c
            boolean r0 = r19.isInBackStack()
            if (r0 != 0) goto L_0x045c
            r0 = 1
            goto L_0x045d
        L_0x045c:
            r0 = 0
        L_0x045d:
            if (r0 != 0) goto L_0x046b
            androidx.fragment.app.j r1 = r6.f1991K
            boolean r1 = r1.mo2928f(r7)
            if (r1 == 0) goto L_0x0468
            goto L_0x046b
        L_0x0468:
            r7.mState = r13
            goto L_0x049c
        L_0x046b:
            androidx.fragment.app.g r1 = r6.f2007v
            boolean r2 = r1 instanceof androidx.lifecycle.C0547y
            if (r2 == 0) goto L_0x0478
            androidx.fragment.app.j r1 = r6.f1991K
            boolean r8 = r1.mo2925d()
            goto L_0x048d
        L_0x0478:
            android.content.Context r1 = r1.mo2787c()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x048d
            androidx.fragment.app.g r1 = r6.f2007v
            android.content.Context r1 = r1.mo2787c()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x048d:
            if (r0 != 0) goto L_0x0491
            if (r8 == 0) goto L_0x0496
        L_0x0491:
            androidx.fragment.app.j r1 = r6.f1991K
            r1.mo2921b(r7)
        L_0x0496:
            r19.performDestroy()
            r6.mo2850b((androidx.fragment.app.Fragment) r7, (boolean) r13)
        L_0x049c:
            r19.performDetach()
            r6.mo2858c((androidx.fragment.app.Fragment) r7, (boolean) r13)
            if (r23 != 0) goto L_0x04d4
            if (r0 != 0) goto L_0x04cc
            androidx.fragment.app.j r0 = r6.f1991K
            boolean r0 = r0.mo2928f(r7)
            if (r0 == 0) goto L_0x04af
            goto L_0x04cc
        L_0x04af:
            r7.mHost = r14
            r7.mParentFragment = r14
            r7.mFragmentManager = r14
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x04d4
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f1997l
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x04d4
            boolean r1 = r0.getRetainInstance()
            if (r1 == 0) goto L_0x04d4
            r7.mTarget = r0
            goto L_0x04d4
        L_0x04cc:
            r18.mo2879l(r19)
            goto L_0x04d4
        L_0x04d0:
            r7.setStateAfterAnimating(r11)
            goto L_0x04d5
        L_0x04d4:
            r8 = r11
        L_0x04d5:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x0501
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.mState = r8
        L_0x0501:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0466i.mo2831a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m2302a(Fragment fragment, C0474g gVar, int i) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (gVar.f2026a != null) {
            C0475h hVar = new C0475h(gVar.f2026a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            hVar.setAnimationListener(new C0469c(viewGroup, fragment));
            fragment.mView.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f2027b;
        fragment.setAnimator(animator);
        animator.addListener(new C0471d(viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2827a(int i, boolean z) {
        C0461g gVar;
        if (this.f2007v == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2006u) {
            this.f2006u = i;
            int size = this.f1996k.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo2881m(this.f1996k.get(i2));
            }
            for (Fragment next : this.f1997l.values()) {
                if (next != null && ((next.mRemoving || next.mDetached) && !next.mIsNewlyAdded)) {
                    mo2881m(next);
                }
            }
            mo2824D();
            if (this.f2011z && (gVar = this.f2007v) != null && this.f2006u == 4) {
                gVar.mo2759i();
                this.f2011z = false;
            }
        }
    }

    /* renamed from: a */
    public void mo2836a(Fragment fragment, boolean z) {
        if (f1978M) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo2877k(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f1996k.contains(fragment)) {
            synchronized (this.f1996k) {
                this.f1996k.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2318x(fragment)) {
                this.f2011z = true;
            }
            if (z) {
                mo2883n(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: a */
    public Fragment mo2790a(int i) {
        for (int size = this.f1996k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1996k.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (Fragment next : this.f1997l.values()) {
            if (next != null && next.mFragmentId == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo2792a(String str) {
        if (str != null) {
            for (int size = this.f1996k.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1996k.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment next : this.f1997l.values()) {
            if (next != null && str.equals(next.mTag)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo2840a(C0478k kVar, boolean z) {
        if (!z) {
            m2294F();
        }
        synchronized (this) {
            if (!this.f1983C) {
                if (this.f2007v != null) {
                    if (this.f1993h == null) {
                        this.f1993h = new ArrayList<>();
                    }
                    this.f1993h.add(kVar);
                    mo2823C();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo2826a(int i, C0453a aVar) {
        synchronized (this) {
            if (this.f2002q == null) {
                this.f2002q = new ArrayList<>();
            }
            int size = this.f2002q.size();
            if (i < size) {
                if (f1978M) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + aVar);
                }
                this.f2002q.set(i, aVar);
            } else {
                while (size < i) {
                    this.f2002q.add((Object) null);
                    if (this.f2003r == null) {
                        this.f2003r = new ArrayList<>();
                    }
                    if (f1978M) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f2003r.add(Integer.valueOf(size));
                    size++;
                }
                if (f1978M) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + aVar);
                }
                this.f2002q.add(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m2304a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0480m> arrayList3 = this.f1990J;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0480m mVar = this.f1990J.get(i);
            if (arrayList != null && !mVar.f2040a && (indexOf2 = arrayList.indexOf(mVar.f2041b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                this.f1990J.remove(i);
                i--;
                size--;
                mVar.mo2916c();
            } else if (mVar.mo2918e() || (arrayList != null && mVar.f2041b.mo2684a(arrayList, 0, arrayList.size()))) {
                this.f1990J.remove(i);
                i--;
                size--;
                if (arrayList == null || mVar.f2040a || (indexOf = arrayList.indexOf(mVar.f2041b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    mVar.mo2917d();
                } else {
                    mVar.mo2916c();
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    private int m2299a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C4870b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0453a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo2695g() && !aVar.mo2684a(arrayList, i4 + 1, i2)) {
                if (this.f1990J == null) {
                    this.f1990J = new ArrayList<>();
                }
                C0480m mVar = new C0480m(aVar, booleanValue);
                this.f1990J.add(mVar);
                aVar.mo2681a((Fragment.C0450e) mVar);
                if (booleanValue) {
                    aVar.mo2694f();
                } else {
                    aVar.mo2689b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m2306a(bVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2838a(C0453a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo2689b(z3);
        } else {
            aVar.mo2694f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0487n.m2471a(this, (ArrayList<C0453a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            mo2827a(this.f2006u, true);
        }
        for (Fragment next : this.f1997l.values()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && aVar.mo2690b(next.mContainerId)) {
                float f = next.mPostponedAlpha;
                if (f > 0.0f) {
                    next.mView.setAlpha(f);
                }
                if (z3) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2305a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0453a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo2679a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo2689b(z);
            } else {
                aVar.mo2679a(1);
                aVar.mo2694f();
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m2306a(C4870b<Fragment> bVar) {
        int i = this.f2006u;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f1996k.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f1996k.get(i2);
                if (fragment.mState < min) {
                    mo2831a(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2837a(C0453a aVar) {
        if (this.f1998m == null) {
            this.f1998m = new ArrayList<>();
        }
        this.f1998m.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2844a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0453a> arrayList3 = this.f1998m;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1998m.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f1998m.size() - 1;
                while (size2 >= 0) {
                    C0453a aVar = this.f1998m.get(size2);
                    if ((str != null && str.equals(aVar.getName())) || (i >= 0 && i == aVar.f1966u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0453a aVar2 = this.f1998m.get(size2);
                        if ((str == null || !str.equals(aVar2.getName())) && (i < 0 || i != aVar2.f1966u)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f1998m.size() - 1) {
                return false;
            }
            for (int size3 = this.f1998m.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f1998m.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2829a(Parcelable parcelable) {
        FragmentState fragmentState;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1945f != null) {
                for (Fragment next : this.f1991K.mo2923c()) {
                    if (f1978M) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + next);
                    }
                    Iterator<FragmentState> it = fragmentManagerState.f1945f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fragmentState = null;
                            break;
                        }
                        fragmentState = it.next();
                        if (fragmentState.f1951g.equals(next.mWho)) {
                            break;
                        }
                    }
                    if (fragmentState == null) {
                        if (f1978M) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next + " that was not found in the set of active Fragments " + fragmentManagerState.f1945f);
                        }
                        Fragment fragment = next;
                        mo2831a(fragment, 1, 0, 0, false);
                        next.mRemoving = true;
                        mo2831a(fragment, 0, 0, 0, false);
                    } else {
                        fragmentState.f1963s = next;
                        next.mSavedViewState = null;
                        next.mBackStackNesting = 0;
                        next.mInLayout = false;
                        next.mAdded = false;
                        Fragment fragment2 = next.mTarget;
                        next.mTargetWho = fragment2 != null ? fragment2.mWho : null;
                        next.mTarget = null;
                        Bundle bundle = fragmentState.f1962r;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f2007v.mo2787c().getClassLoader());
                            next.mSavedViewState = fragmentState.f1962r.getSparseParcelableArray("android:view_state");
                            next.mSavedFragmentState = fragmentState.f1962r;
                        }
                    }
                }
                this.f1997l.clear();
                Iterator<FragmentState> it2 = fragmentManagerState.f1945f.iterator();
                while (it2.hasNext()) {
                    FragmentState next2 = it2.next();
                    if (next2 != null) {
                        Fragment a = next2.mo2669a(this.f2007v.mo2787c().getClassLoader(), mo2802d());
                        a.mFragmentManager = this;
                        if (f1978M) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + a.mWho + "): " + a);
                        }
                        this.f1997l.put(a.mWho, a);
                        next2.f1963s = null;
                    }
                }
                this.f1996k.clear();
                ArrayList<String> arrayList = fragmentManagerState.f1946g;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next3 = it3.next();
                        Fragment fragment3 = this.f1997l.get(next3);
                        if (fragment3 != null) {
                            fragment3.mAdded = true;
                            if (f1978M) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + fragment3);
                            }
                            if (!this.f1996k.contains(fragment3)) {
                                synchronized (this.f1996k) {
                                    this.f1996k.add(fragment3);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + fragment3);
                            }
                        } else {
                            m2303a((RuntimeException) new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                            throw null;
                        }
                    }
                }
                if (fragmentManagerState.f1947h != null) {
                    this.f1998m = new ArrayList<>(fragmentManagerState.f1947h.length);
                    int i = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f1947h;
                        if (i >= backStackStateArr.length) {
                            break;
                        }
                        C0453a a2 = backStackStateArr[i].mo2485a(this);
                        if (f1978M) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a2.f1966u + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new C5002b("FragmentManager"));
                            a2.mo2683a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1998m.add(a2);
                        int i2 = a2.f1966u;
                        if (i2 >= 0) {
                            mo2826a(i2, a2);
                        }
                        i++;
                    }
                } else {
                    this.f1998m = null;
                }
                String str = fragmentManagerState.f1948i;
                if (str != null) {
                    Fragment fragment4 = this.f1997l.get(str);
                    this.f2010y = fragment4;
                    m2316v(fragment4);
                }
                this.f1995j = fragmentManagerState.f1949j;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2839a(androidx.fragment.app.C0461g r3, androidx.fragment.app.C0458d r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.g r0 = r2.f2007v
            if (r0 != 0) goto L_0x004b
            r2.f2007v = r3
            r2.f2008w = r4
            r2.f2009x = r5
            if (r5 == 0) goto L_0x000f
            r2.m2298J()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.C0055c
            if (r4 == 0) goto L_0x0026
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0055c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f2000o = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f2000o
            androidx.activity.b r1 = r2.f2001p
            r0.mo140a(r4, r1)
        L_0x0026:
            if (r5 == 0) goto L_0x0031
            androidx.fragment.app.i r3 = r5.mFragmentManager
            androidx.fragment.app.j r3 = r3.mo2867g(r5)
            r2.f1991K = r3
            goto L_0x004a
        L_0x0031:
            boolean r4 = r3 instanceof androidx.lifecycle.C0547y
            if (r4 == 0) goto L_0x0042
            androidx.lifecycle.y r3 = (androidx.lifecycle.C0547y) r3
            androidx.lifecycle.x r3 = r3.getViewModelStore()
            androidx.fragment.app.j r3 = androidx.fragment.app.C0481j.m2426a((androidx.lifecycle.C0546x) r3)
            r2.f1991K = r3
            goto L_0x004a
        L_0x0042:
            androidx.fragment.app.j r3 = new androidx.fragment.app.j
            r4 = 0
            r3.<init>(r4)
            r2.f1991K = r3
        L_0x004a:
            return
        L_0x004b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0466i.mo2839a(androidx.fragment.app.g, androidx.fragment.app.d, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    public void mo2841a(boolean z) {
        for (int size = this.f1996k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1996k.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public void mo2828a(Configuration configuration) {
        for (int i = 0; i < this.f1996k.size(); i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: a */
    public boolean mo2842a(Menu menu, MenuInflater menuInflater) {
        if (this.f2006u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f1996k.size(); i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1999n != null) {
            for (int i2 = 0; i2 < this.f1999n.size(); i2++) {
                Fragment fragment2 = this.f1999n.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1999n = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo2843a(MenuItem menuItem) {
        if (this.f2006u < 1) {
            return false;
        }
        for (int i = 0; i < this.f1996k.size(); i++) {
            Fragment fragment = this.f1996k.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2830a(Menu menu) {
        if (this.f2006u >= 1) {
            for (int i = 0; i < this.f1996k.size(); i++) {
                Fragment fragment = this.f1996k.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2835a(Fragment fragment, C0514f.C0516b bVar) {
        if (this.f1997l.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2832a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2832a(fragment, context, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2807a((C0462h) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2833a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2833a(fragment, bundle, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2808a((C0462h) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2834a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2009x;
        if (fragment2 != null) {
            C0462h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0466i) {
                ((C0466i) fragmentManager).mo2834a(fragment, view, bundle, true);
            }
        }
        Iterator<C0476i> it = this.f2005t.iterator();
        while (it.hasNext()) {
            C0476i next = it.next();
            if (!z || next.f2034b) {
                next.f2033a.mo2809a(this, fragment, view, bundle);
            }
        }
    }
}
