package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0466i;
import androidx.fragment.app.C0485m;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0514f;
import java.io.PrintWriter;
import java.util.ArrayList;
import okhttp3.internal.cache.DiskLruCache;
import p050l.p075h.p083k.C5002b;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
final class C0453a extends C0485m implements C0462h.C0463a, C0466i.C0478k {

    /* renamed from: s */
    final C0466i f1964s;

    /* renamed from: t */
    boolean f1965t;

    /* renamed from: u */
    int f1966u = -1;

    public C0453a(C0466i iVar) {
        this.f1964s = iVar;
    }

    /* renamed from: a */
    public void mo2682a(String str, PrintWriter printWriter) {
        mo2683a(str, printWriter, true);
    }

    /* renamed from: b */
    public C0485m mo2688b(Fragment fragment) {
        C0466i iVar = fragment.mFragmentManager;
        if (iVar == null || iVar == this.f1964s) {
            super.mo2688b(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: c */
    public C0485m mo2691c(Fragment fragment) {
        C0466i iVar = fragment.mFragmentManager;
        if (iVar == null || iVar == this.f1964s) {
            super.mo2691c(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: d */
    public void mo2693d() {
        mo2952e();
        this.f1964s.mo2851b((C0466i.C0478k) this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2694f() {
        int size = this.f2050a.size();
        for (int i = 0; i < size; i++) {
            C0485m.C0486a aVar = this.f2050a.get(i);
            Fragment fragment = aVar.f2069b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2055f, this.f2056g);
            }
            switch (aVar.f2068a) {
                case 1:
                    fragment.setNextAnim(aVar.f2070c);
                    this.f1964s.mo2836a(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f2071d);
                    this.f1964s.mo2889p(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2071d);
                    this.f1964s.mo2873i(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2070c);
                    this.f1964s.mo2900u(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2071d);
                    this.f1964s.mo2863e(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2070c);
                    this.f1964s.mo2856c(fragment);
                    break;
                case 8:
                    this.f1964s.mo2896t(fragment);
                    break;
                case 9:
                    this.f1964s.mo2896t((Fragment) null);
                    break;
                case 10:
                    this.f1964s.mo2835a(fragment, aVar.f2075h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2068a);
            }
            if (!(this.f2066q || aVar.f2068a == 1 || fragment == null)) {
                this.f1964s.mo2881m(fragment);
            }
        }
        if (!this.f2066q) {
            C0466i iVar = this.f1964s;
            iVar.mo2827a(iVar.f2006u, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo2695g() {
        for (int i = 0; i < this.f2050a.size(); i++) {
            if (m2174b(this.f2050a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f2059j;
    }

    /* renamed from: h */
    public void mo2697h() {
        if (this.f2067r != null) {
            for (int i = 0; i < this.f2067r.size(); i++) {
                this.f2067r.get(i).run();
            }
            this.f2067r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1966u >= 0) {
            sb.append(" #");
            sb.append(this.f1966u);
        }
        if (this.f2059j != null) {
            sb.append(" ");
            sb.append(this.f2059j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo2683a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2059j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1966u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1965t);
            if (this.f2055f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2055f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2056g));
            }
            if (!(this.f2051b == 0 && this.f2052c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2051b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2052c));
            }
            if (!(this.f2053d == 0 && this.f2054e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2053d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2054e));
            }
            if (!(this.f2060k == 0 && this.f2061l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2060k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2061l);
            }
            if (!(this.f2062m == 0 && this.f2063n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2062m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2063n);
            }
        }
        if (!this.f2050a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2050a.size();
            for (int i = 0; i < size; i++) {
                C0485m.C0486a aVar = this.f2050a.get(i);
                switch (aVar.f2068a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = DiskLruCache.REMOVE;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2068a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2069b);
                if (z) {
                    if (!(aVar.f2070c == 0 && aVar.f2071d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2070c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2071d));
                    }
                    if (aVar.f2072e != 0 || aVar.f2073f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2072e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2073f));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public int mo2686b() {
        return mo2676a(true);
    }

    /* renamed from: c */
    public void mo2692c() {
        mo2952e();
        this.f1964s.mo2851b((C0466i.C0478k) this, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2690b(int i) {
        int size = this.f2050a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2050a.get(i2).f2069b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2689b(boolean z) {
        for (int size = this.f2050a.size() - 1; size >= 0; size--) {
            C0485m.C0486a aVar = this.f2050a.get(size);
            Fragment fragment = aVar.f2069b;
            if (fragment != null) {
                fragment.setNextTransition(C0466i.m2315f(this.f2055f), this.f2056g);
            }
            switch (aVar.f2068a) {
                case 1:
                    fragment.setNextAnim(aVar.f2073f);
                    this.f1964s.mo2889p(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f2072e);
                    this.f1964s.mo2836a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2072e);
                    this.f1964s.mo2900u(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2073f);
                    this.f1964s.mo2873i(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2072e);
                    this.f1964s.mo2856c(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2073f);
                    this.f1964s.mo2863e(fragment);
                    break;
                case 8:
                    this.f1964s.mo2896t((Fragment) null);
                    break;
                case 9:
                    this.f1964s.mo2896t(fragment);
                    break;
                case 10:
                    this.f1964s.mo2835a(fragment, aVar.f2074g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2068a);
            }
            if (!(this.f2066q || aVar.f2068a == 3 || fragment == null)) {
                this.f1964s.mo2881m(fragment);
            }
        }
        if (!this.f2066q && z) {
            C0466i iVar = this.f1964s;
            iVar.mo2827a(iVar.f2006u, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Fragment mo2687b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2050a.size() - 1; size >= 0; size--) {
            C0485m.C0486a aVar = this.f2050a.get(size);
            int i = aVar.f2068a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2069b;
                            break;
                        case 10:
                            aVar.f2075h = aVar.f2074g;
                            break;
                    }
                }
                arrayList.add(aVar.f2069b);
            }
            arrayList.remove(aVar.f2069b);
        }
        return fragment;
    }

    /* renamed from: b */
    private static boolean m2174b(C0485m.C0486a aVar) {
        Fragment fragment = aVar.f2069b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2680a(int i, Fragment fragment, String str, int i2) {
        super.mo2680a(i, fragment, str, i2);
        fragment.mFragmentManager = this.f1964s;
    }

    /* renamed from: a */
    public C0485m mo2678a(Fragment fragment, C0514f.C0516b bVar) {
        if (fragment.mFragmentManager != this.f1964s) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f1964s);
        } else if (bVar.mo3041a(C0514f.C0516b.CREATED)) {
            super.mo2678a(fragment, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + C0514f.C0516b.CREATED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2679a(int i) {
        if (this.f2057h) {
            if (C0466i.f1978M) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2050a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0485m.C0486a aVar = this.f2050a.get(i2);
                Fragment fragment = aVar.f2069b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (C0466i.f1978M) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2069b + " to " + aVar.f2069b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo2675a() {
        return mo2676a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2676a(boolean z) {
        if (!this.f1965t) {
            if (C0466i.f1978M) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C5002b("FragmentManager"));
                mo2682a("  ", printWriter);
                printWriter.close();
            }
            this.f1965t = true;
            if (this.f2057h) {
                this.f1966u = this.f1964s.mo2845b(this);
            } else {
                this.f1966u = -1;
            }
            this.f1964s.mo2840a((C0466i.C0478k) this, z);
            return this.f1966u;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: a */
    public boolean mo2685a(ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0466i.f1978M) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f2057h) {
            return true;
        }
        this.f1964s.mo2837a(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2684a(ArrayList<C0453a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2050a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2050a.get(i4).f2069b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0453a aVar = arrayList.get(i6);
                    int size2 = aVar.f2050a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f2050a.get(i7).f2069b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo2677a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2050a.size()) {
            C0485m.C0486a aVar = this.f2050a.get(i);
            int i2 = aVar.f2068a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2069b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2050a.add(i, new C0485m.C0486a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0485m.C0486a aVar2 = new C0485m.C0486a(3, fragment4);
                                aVar2.f2070c = aVar.f2070c;
                                aVar2.f2072e = aVar.f2072e;
                                aVar2.f2071d = aVar.f2071d;
                                aVar2.f2073f = aVar.f2073f;
                                this.f2050a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2050a.remove(i);
                        i--;
                    } else {
                        aVar.f2068a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f2069b);
                    Fragment fragment5 = aVar.f2069b;
                    if (fragment5 == fragment2) {
                        this.f2050a.add(i, new C0485m.C0486a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2050a.add(i, new C0485m.C0486a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2069b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f2069b);
            i++;
        }
        return fragment2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2681a(Fragment.C0450e eVar) {
        for (int i = 0; i < this.f2050a.size(); i++) {
            C0485m.C0486a aVar = this.f2050a.get(i);
            if (m2174b(aVar)) {
                aVar.f2069b.setOnStartEnterTransitionListener(eVar);
            }
        }
    }
}
