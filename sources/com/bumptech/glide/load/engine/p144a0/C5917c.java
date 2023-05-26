package com.bumptech.glide.load.engine.p144a0;

import com.bumptech.glide.p166r.C6315j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.a0.c */
/* compiled from: DiskCacheWriteLocker */
final class C5917c {

    /* renamed from: a */
    private final Map<String, C5918a> f10804a = new HashMap();

    /* renamed from: b */
    private final C5919b f10805b = new C5919b();

    /* renamed from: com.bumptech.glide.load.engine.a0.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C5918a {

        /* renamed from: a */
        final Lock f10806a = new ReentrantLock();

        /* renamed from: b */
        int f10807b;

        C5918a() {
        }
    }

    C5917c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20098a(String str) {
        C5918a aVar;
        synchronized (this) {
            aVar = this.f10804a.get(str);
            if (aVar == null) {
                aVar = this.f10805b.mo20100a();
                this.f10804a.put(str, aVar);
            }
            aVar.f10807b++;
        }
        aVar.f10806a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20099b(String str) {
        C5918a aVar;
        synchronized (this) {
            C5918a aVar2 = this.f10804a.get(str);
            C6315j.m12978a(aVar2);
            aVar = aVar2;
            if (aVar.f10807b >= 1) {
                int i = aVar.f10807b - 1;
                aVar.f10807b = i;
                if (i == 0) {
                    C5918a remove = this.f10804a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f10805b.mo20101a(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f10807b);
            }
        }
        aVar.f10806a.unlock();
    }

    /* renamed from: com.bumptech.glide.load.engine.a0.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C5919b {

        /* renamed from: a */
        private final Queue<C5918a> f10808a = new ArrayDeque();

        C5919b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5918a mo20100a() {
            C5918a poll;
            synchronized (this.f10808a) {
                poll = this.f10808a.poll();
            }
            return poll == null ? new C5918a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20101a(C5918a aVar) {
            synchronized (this.f10808a) {
                if (this.f10808a.size() < 10) {
                    this.f10808a.offer(aVar);
                }
            }
        }
    }
}
