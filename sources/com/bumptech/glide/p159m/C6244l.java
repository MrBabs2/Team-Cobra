package com.bumptech.glide.p159m;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0485m;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5881i;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import java.util.HashMap;
import java.util.Map;
import p050l.p066e.C4868a;

/* renamed from: com.bumptech.glide.m.l */
/* compiled from: RequestManagerRetriever */
public class C6244l implements Handler.Callback {

    /* renamed from: k */
    private static final C6246b f11401k = new C6245a();

    /* renamed from: f */
    private volatile C5881i f11402f;

    /* renamed from: g */
    final Map<FragmentManager, C6242k> f11403g = new HashMap();

    /* renamed from: h */
    final Map<C0462h, C6249o> f11404h = new HashMap();

    /* renamed from: i */
    private final Handler f11405i;

    /* renamed from: j */
    private final C6246b f11406j;

    /* renamed from: com.bumptech.glide.m.l$a */
    /* compiled from: RequestManagerRetriever */
    class C6245a implements C6246b {
        C6245a() {
        }

        /* renamed from: a */
        public C5881i mo20584a(C5874c cVar, C6239h hVar, C6247m mVar, Context context) {
            return new C5881i(cVar, hVar, mVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.m.l$b */
    /* compiled from: RequestManagerRetriever */
    public interface C6246b {
        /* renamed from: a */
        C5881i mo20584a(C5874c cVar, C6239h hVar, C6247m mVar, Context context);
    }

    public C6244l(C6246b bVar) {
        new C4868a();
        new C4868a();
        new Bundle();
        this.f11406j = bVar == null ? f11401k : bVar;
        this.f11405i = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: b */
    private C5881i m12692b(Context context) {
        if (this.f11402f == null) {
            synchronized (this) {
                if (this.f11402f == null) {
                    this.f11402f = this.f11406j.mo20584a(C5874c.m11487b(context.getApplicationContext()), new C6231b(), new C6238g(), context.getApplicationContext());
                }
            }
        }
        return this.f11402f;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m12693c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: d */
    private static boolean m12694d(Activity activity) {
        return !activity.isFinishing();
    }

    /* renamed from: a */
    public C5881i mo20578a(Context context) {
        if (context != null) {
            if (C6316k.m13003d() && !(context instanceof Application)) {
                if (context instanceof C0456c) {
                    return mo20580a((C0456c) context);
                }
                if (context instanceof Activity) {
                    return mo20577a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return mo20578a(((ContextWrapper) context).getBaseContext());
                }
            }
            return m12692b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f11403g.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj3 = (C0462h) message.obj;
            obj2 = this.f11404h.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* renamed from: a */
    public C5881i mo20580a(C0456c cVar) {
        if (C6316k.m13001c()) {
            return mo20578a(cVar.getApplicationContext());
        }
        m12693c(cVar);
        return m12689a((Context) cVar, cVar.getSupportFragmentManager(), (Fragment) null, m12694d(cVar));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public C6242k mo20581b(Activity activity) {
        return m12690a(activity.getFragmentManager(), (android.app.Fragment) null, m12694d(activity));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6249o mo20582b(C0456c cVar) {
        return m12691a(cVar.getSupportFragmentManager(), (Fragment) null, m12694d(cVar));
    }

    /* renamed from: a */
    public C5881i mo20579a(Fragment fragment) {
        C6315j.m12979a(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C6316k.m13001c()) {
            return mo20578a(fragment.getActivity().getApplicationContext());
        }
        return m12689a((Context) fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: a */
    public C5881i mo20577a(Activity activity) {
        if (C6316k.m13001c()) {
            return mo20578a(activity.getApplicationContext());
        }
        m12693c(activity);
        return m12688a((Context) activity, activity.getFragmentManager(), (android.app.Fragment) null, m12694d(activity));
    }

    /* renamed from: a */
    private C6242k m12690a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C6242k kVar = (C6242k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f11403g.get(fragmentManager)) == null) {
            kVar = new C6242k();
            kVar.mo20566a(fragment);
            if (z) {
                kVar.mo20565a().mo20559b();
            }
            this.f11403g.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f11405i.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    @Deprecated
    /* renamed from: a */
    private C5881i m12688a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C6242k a = m12690a(fragmentManager, fragment, z);
        C5881i b = a.mo20568b();
        if (b != null) {
            return b;
        }
        C5881i a2 = this.f11406j.mo20584a(C5874c.m11487b(context), a.mo20565a(), a.mo20569c(), context);
        a.mo20567a(a2);
        return a2;
    }

    /* renamed from: a */
    private C6249o m12691a(C0462h hVar, Fragment fragment, boolean z) {
        C6249o oVar = (C6249o) hVar.mo2792a("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f11404h.get(hVar)) == null) {
            oVar = new C6249o();
            oVar.mo20592a(fragment);
            if (z) {
                oVar.mo20594b().mo20559b();
            }
            this.f11404h.put(hVar, oVar);
            C0485m a = hVar.mo2793a();
            a.mo2947a((Fragment) oVar, "com.bumptech.glide.manager");
            a.mo2686b();
            this.f11405i.obtainMessage(2, hVar).sendToTarget();
        }
        return oVar;
    }

    /* renamed from: a */
    private C5881i m12689a(Context context, C0462h hVar, Fragment fragment, boolean z) {
        C6249o a = m12691a(hVar, fragment, z);
        C5881i c = a.mo20595c();
        if (c != null) {
            return c;
        }
        C5881i a2 = this.f11406j.mo20584a(C5874c.m11487b(context), a.mo20594b(), a.mo20596d(), context);
        a.mo20593a(a2);
        return a2;
    }
}
