package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.C4789l;
import kotlin.jvm.internal.C10203k;
import kotlin.p042a0.C9058b;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo16641d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "Key", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.c1 */
/* compiled from: Executors.kt */
public abstract class C12186c1 extends C12324y implements Closeable {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo16641d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.c1$a */
    /* compiled from: Executors.kt */
    public static final class C12187a extends C9058b<C12324y, C12186c1> {

        /* renamed from: kotlinx.coroutines.c1$a$a */
        /* compiled from: Executors.kt */
        static final class C12188a extends C10203k implements C9113l<C9069g.C9072b, C12186c1> {

            /* renamed from: f */
            public static final C12188a f31956f = new C12188a();

            C12188a() {
                super(1);
            }

            /* renamed from: a */
            public final C12186c1 invoke(C9069g.C9072b bVar) {
                if (!(bVar instanceof C12186c1)) {
                    bVar = null;
                }
                return (C12186c1) bVar;
            }
        }

        public /* synthetic */ C12187a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12187a() {
            super(C12324y.f32145f, C12188a.f31956f);
        }
    }

    static {
        new C12187a((DefaultConstructorMarker) null);
    }
}
