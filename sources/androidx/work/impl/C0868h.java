package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C0822b;
import androidx.work.C0831f;
import androidx.work.C0832g;
import androidx.work.C0834i;
import androidx.work.C0962k;
import androidx.work.C0964l;
import androidx.work.C0970m;
import androidx.work.C0972n;
import androidx.work.C0975q;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemjob.C0857b;
import androidx.work.impl.p007j.p008a.C0873a;
import androidx.work.impl.utils.C0931a;
import androidx.work.impl.utils.C0937e;
import androidx.work.impl.utils.C0940g;
import androidx.work.impl.utils.C0941h;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.p014k.C0956a;
import androidx.work.impl.utils.p014k.C0957b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.h */
/* compiled from: WorkManagerImpl */
public class C0868h extends C0975q {

    /* renamed from: j */
    private static C0868h f3101j;

    /* renamed from: k */
    private static C0868h f3102k;

    /* renamed from: l */
    private static final Object f3103l = new Object();

    /* renamed from: a */
    private Context f3104a;

    /* renamed from: b */
    private C0822b f3105b;

    /* renamed from: c */
    private WorkDatabase f3106c;

    /* renamed from: d */
    private C0956a f3107d;

    /* renamed from: e */
    private List<C0860d> f3108e;

    /* renamed from: f */
    private C0858c f3109f;

    /* renamed from: g */
    private C0937e f3110g;

    /* renamed from: h */
    private boolean f3111h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f3112i;

    public C0868h(Context context, C0822b bVar, C0956a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(C0972n.workmanager_test_configuration));
    }

    /* renamed from: a */
    public static C0868h m3846a(Context context) {
        C0868h j;
        synchronized (f3103l) {
            j = m3850j();
            if (j == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C0822b.C0824b) {
                    m3847a(applicationContext, ((C0822b.C0824b) applicationContext).mo4683a());
                    j = m3846a(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return j;
    }

    @Deprecated
    /* renamed from: j */
    public static C0868h m3850j() {
        synchronized (f3103l) {
            if (f3101j != null) {
                C0868h hVar = f3101j;
                return hVar;
            }
            C0868h hVar2 = f3102k;
            return hVar2;
        }
    }

    /* renamed from: b */
    public C0822b mo4801b() {
        return this.f3105b;
    }

    /* renamed from: c */
    public C0937e mo4803c() {
        return this.f3110g;
    }

    /* renamed from: d */
    public C0858c mo4805d() {
        return this.f3109f;
    }

    /* renamed from: e */
    public List<C0860d> mo4807e() {
        return this.f3108e;
    }

    /* renamed from: f */
    public WorkDatabase mo4808f() {
        return this.f3106c;
    }

    /* renamed from: g */
    public C0956a mo4809g() {
        return this.f3107d;
    }

    /* renamed from: h */
    public void mo4810h() {
        synchronized (f3103l) {
            this.f3111h = true;
            if (this.f3112i != null) {
                this.f3112i.finish();
                this.f3112i = null;
            }
        }
    }

    /* renamed from: i */
    public void mo4811i() {
        if (Build.VERSION.SDK_INT >= 23) {
            C0857b.m3817a(mo4794a());
        }
        mo4808f().mo4734d().mo4902d();
        C0861e.m3833a(mo4801b(), mo4808f(), mo4807e());
    }

    /* renamed from: b */
    private C0862f m3849b(String str, C0831f fVar, C0970m mVar) {
        C0832g gVar;
        if (fVar == C0831f.KEEP) {
            gVar = C0832g.KEEP;
        } else {
            gVar = C0832g.REPLACE;
        }
        return new C0862f(this, str, gVar, Collections.singletonList(mVar));
    }

    /* renamed from: c */
    public void mo4804c(String str) {
        mo4800a(str, (WorkerParameters.C0820a) null);
    }

    /* renamed from: d */
    public void mo4806d(String str) {
        this.f3107d.mo4961a(new C0941h(this, str));
    }

    public C0868h(Context context, C0822b bVar, C0956a aVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase a = WorkDatabase.m3733a(applicationContext, bVar.mo4678f(), z);
        C0834i.m3722a((C0834i) new C0834i.C0835a(bVar.mo4677e()));
        Context context2 = context;
        C0822b bVar2 = bVar;
        C0956a aVar2 = aVar;
        WorkDatabase workDatabase = a;
        List<C0860d> a2 = mo4798a(applicationContext, aVar);
        m3848a(context2, bVar2, aVar2, workDatabase, a2, new C0858c(context2, bVar2, aVar2, workDatabase, a2));
    }

    /* renamed from: b */
    public C0964l mo4802b(String str) {
        C0931a a = C0931a.m4053a(str, this, true);
        this.f3107d.mo4961a(a);
        return a.mo4918a();
    }

    /* renamed from: a */
    public static void m3847a(Context context, C0822b bVar) {
        synchronized (f3103l) {
            if (f3101j != null) {
                if (f3102k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (f3101j == null) {
                Context applicationContext = context.getApplicationContext();
                if (f3102k == null) {
                    f3102k = new C0868h(applicationContext, bVar, new C0957b(bVar.mo4678f()));
                }
                f3101j = f3102k;
            }
        }
    }

    /* renamed from: a */
    public Context mo4794a() {
        return this.f3104a;
    }

    /* renamed from: a */
    public C0964l mo4797a(String str, C0832g gVar, List<C0962k> list) {
        return new C0862f(this, str, gVar, list).mo4784a();
    }

    /* renamed from: a */
    public C0964l mo4796a(String str, C0831f fVar, C0970m mVar) {
        return m3849b(str, fVar, mVar).mo4784a();
    }

    /* renamed from: a */
    public C0964l mo4795a(String str) {
        C0931a a = C0931a.m4052a(str, this);
        this.f3107d.mo4961a(a);
        return a.mo4918a();
    }

    /* renamed from: a */
    public void mo4800a(String str, WorkerParameters.C0820a aVar) {
        this.f3107d.mo4961a(new C0940g(this, str, aVar));
    }

    /* renamed from: a */
    public void mo4799a(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f3103l) {
            this.f3112i = pendingResult;
            if (this.f3111h) {
                pendingResult.finish();
                this.f3112i = null;
            }
        }
    }

    /* renamed from: a */
    private void m3848a(Context context, C0822b bVar, C0956a aVar, WorkDatabase workDatabase, List<C0860d> list, C0858c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3104a = applicationContext;
        this.f3105b = bVar;
        this.f3107d = aVar;
        this.f3106c = workDatabase;
        this.f3108e = list;
        this.f3109f = cVar;
        this.f3110g = new C0937e(applicationContext);
        this.f3111h = false;
        this.f3107d.mo4961a(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: a */
    public List<C0860d> mo4798a(Context context, C0956a aVar) {
        return Arrays.asList(new C0860d[]{C0861e.m3832a(context, this), new C0873a(context, aVar, this)});
    }
}
