package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.p013j.C0955c;
import androidx.work.impl.utils.p014k.C0956a;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C4782e;
import kotlin.p042a0.p043j.p044a.C9091j;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12191d0;
import kotlinx.coroutines.C12195e0;
import kotlinx.coroutines.C12204g0;
import kotlinx.coroutines.C12277k1;
import kotlinx.coroutines.C12288n1;
import kotlinx.coroutines.C12310t0;
import kotlinx.coroutines.C12324y;
import p112n.p277e.p298c.p299a.p300a.C10661a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bR\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo16641d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "job", "Lkotlinx/coroutines/Job;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/Job;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStopped", "", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime-ktx_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: a */
    private final C12277k1 f2922a = C12288n1.m40511a((C12277k1) null, 1, (Object) null);

    /* renamed from: b */
    private final C0955c<ListenableWorker.C0815a> f2923b;

    /* renamed from: c */
    private final C12324y f2924c;

    /* renamed from: androidx.work.CoroutineWorker$a */
    /* compiled from: CoroutineWorker.kt */
    static final class C0813a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ CoroutineWorker f2925f;

        C0813a(CoroutineWorker coroutineWorker) {
            this.f2925f = coroutineWorker;
        }

        public final void run() {
            if (this.f2925f.mo4627b().isCancelled()) {
                this.f2925f.mo4628c().cancel();
            }
        }
    }

    @C4782e(mo16621c = "androidx.work.CoroutineWorker$startWork$1", mo16622f = "CoroutineWorker.kt", mo16623l = {68}, mo16624m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$b */
    /* compiled from: CoroutineWorker.kt */
    static final class C0814b extends C9091j implements C9117p<C12191d0, C9064d<? super C10483v>, Object> {

        /* renamed from: f */
        private C12191d0 f2926f;

        /* renamed from: g */
        Object f2927g;

        /* renamed from: h */
        int f2928h;

        /* renamed from: i */
        final /* synthetic */ CoroutineWorker f2929i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0814b(CoroutineWorker coroutineWorker, C9064d dVar) {
            super(2, dVar);
            this.f2929i = coroutineWorker;
        }

        public final C9064d<C10483v> create(Object obj, C9064d<?> dVar) {
            C10202j.m34178b(dVar, "completion");
            C0814b bVar = new C0814b(this.f2929i, dVar);
            bVar.f2926f = (C12191d0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0814b) create(obj, (C9064d) obj2)).invokeSuspend(C10483v.f28357a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C9081d.m29785a();
            int i = this.f2928h;
            if (i == 0) {
                C10225p.m34214a(obj);
                C12191d0 d0Var = this.f2926f;
                CoroutineWorker coroutineWorker = this.f2929i;
                this.f2927g = d0Var;
                this.f2928h = 1;
                obj = coroutineWorker.mo4625a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C12191d0 d0Var2 = (C12191d0) this.f2927g;
                try {
                    C10225p.m34214a(obj);
                } catch (Throwable th) {
                    this.f2929i.mo4627b().mo4939a(th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f2929i.mo4627b().mo4938a((ListenableWorker.C0815a) obj);
            return C10483v.f28357a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C10202j.m34178b(context, "appContext");
        C10202j.m34178b(workerParameters, "params");
        C0955c<ListenableWorker.C0815a> d = C0955c.m4117d();
        C10202j.m34174a((Object) d, "SettableFuture.create()");
        this.f2923b = d;
        C0813a aVar = new C0813a(this);
        C0956a taskExecutor = getTaskExecutor();
        C10202j.m34174a((Object) taskExecutor, "taskExecutor");
        d.mo4937a((Runnable) aVar, taskExecutor.mo4962b());
        this.f2924c = C12310t0.m40640a();
    }

    /* renamed from: a */
    public abstract Object mo4625a(C9064d<? super ListenableWorker.C0815a> dVar);

    /* renamed from: a */
    public C12324y mo4626a() {
        return this.f2924c;
    }

    /* renamed from: b */
    public final C0955c<ListenableWorker.C0815a> mo4627b() {
        return this.f2923b;
    }

    /* renamed from: c */
    public final C12277k1 mo4628c() {
        return this.f2922a;
    }

    public final void onStopped() {
        super.onStopped();
        this.f2923b.cancel(false);
    }

    public final C10661a<ListenableWorker.C0815a> startWork() {
        C12277k1 unused = C12194e.m40236a(C12195e0.m40237a(mo4626a().plus(this.f2922a)), (C9069g) null, (C12204g0) null, new C0814b(this, (C9064d) null), 3, (Object) null);
        return this.f2923b;
    }
}
