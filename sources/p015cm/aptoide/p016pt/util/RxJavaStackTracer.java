package p015cm.aptoide.p016pt.util;

import p015cm.aptoide.p016pt.utils.BaseException;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.p411q.C12861d;

/* renamed from: cm.aptoide.pt.util.RxJavaStackTracer */
public class RxJavaStackTracer extends C12861d {

    /* renamed from: cm.aptoide.pt.util.RxJavaStackTracer$OperatorTraceOnError */
    static class OperatorTraceOnError<T> implements C5368e.C5371b<T, T> {
        /* access modifiers changed from: private */
        public final StackTraceElement[] trace = new Throwable().getStackTrace();

        /* renamed from: cm.aptoide.pt.util.RxJavaStackTracer$OperatorTraceOnError$TracedException */
        private static class TracedException extends RuntimeException {
            public TracedException(Throwable th, StackTraceElement[] stackTraceElementArr) {
                super(th);
                setStackTrace(stackTraceElementArr);
            }
        }

        OperatorTraceOnError() {
        }

        public static <T> OperatorTraceOnError<T> traceOnError() {
            return new OperatorTraceOnError<>();
        }

        public C12475j<? super T> call(final C12475j<? super T> jVar) {
            C44371 r0 = new C12475j<T>() {
                public void onCompleted() {
                    jVar.onCompleted();
                }

                public void onError(Throwable th) {
                    if (BaseException.class.isAssignableFrom(th.getClass())) {
                        jVar.onError(th);
                    } else {
                        jVar.onError(new TracedException(th, OperatorTraceOnError.this.trace));
                    }
                }

                public void onNext(T t) {
                    jVar.onNext(t);
                }
            };
            jVar.add(r0);
            return r0;
        }
    }

    public <T> C5368e.C5370a<T> onSubscribeStart(C5368e<? extends T> eVar, final C5368e.C5370a<T> aVar) {
        return new C5368e.C5370a<T>() {
            public void call(C12475j<? super T> jVar) {
                C12475j jVar2;
                try {
                    jVar2 = (C12475j) RxJavaStackTracer.this.onLift(OperatorTraceOnError.traceOnError()).call(jVar);
                    jVar2.onStart();
                    aVar.call(jVar2);
                } catch (Throwable th) {
                    C12472a.m40945c(th);
                    jVar.onError(th);
                }
            }
        };
    }
}
