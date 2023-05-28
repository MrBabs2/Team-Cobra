package com.trello.rxlifecycle;

import com.trello.rxlifecycle.p210i.C9015a;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

/* renamed from: com.trello.rxlifecycle.c */
/* compiled from: RxLifecycle */
public class C4750c {
    /* renamed from: a */
    public static <T, R> C4749b<T> m7795a(C5368e<R> eVar, R r) {
        C9015a.m29574a(eVar, "lifecycle == null");
        C9015a.m29574a(r, "event == null");
        return new C9006f(eVar, r);
    }

    /* renamed from: a */
    public static <T, R> C4749b<T> m7796a(C5368e<R> eVar, C5379n<R, R> nVar) {
        C9015a.m29574a(eVar, "lifecycle == null");
        C9015a.m29574a(nVar, "correspondingEvents == null");
        return new C9005e(eVar.mo18688g(), nVar);
    }
}
