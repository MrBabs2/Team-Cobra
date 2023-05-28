package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C5903c;

/* renamed from: com.bumptech.glide.load.engine.j */
/* compiled from: DiskCacheStrategy */
public abstract class C5963j {

    /* renamed from: a */
    public static final C5963j f10938a = new C5965b();

    /* renamed from: b */
    public static final C5963j f10939b = new C5966c();

    /* renamed from: c */
    public static final C5963j f10940c = new C5967d();

    /* renamed from: d */
    public static final C5963j f10941d = new C5968e();

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    /* compiled from: DiskCacheStrategy */
    class C5964a extends C5963j {
        C5964a() {
        }

        /* renamed from: a */
        public boolean mo20196a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo20197a(C5901a aVar) {
            return aVar == C5901a.REMOTE;
        }

        /* renamed from: b */
        public boolean mo20199b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo20198a(boolean z, C5901a aVar, C5903c cVar) {
            return (aVar == C5901a.RESOURCE_DISK_CACHE || aVar == C5901a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    /* compiled from: DiskCacheStrategy */
    class C5965b extends C5963j {
        C5965b() {
        }

        /* renamed from: a */
        public boolean mo20196a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo20197a(C5901a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo20198a(boolean z, C5901a aVar, C5903c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo20199b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    /* compiled from: DiskCacheStrategy */
    class C5966c extends C5963j {
        C5966c() {
        }

        /* renamed from: a */
        public boolean mo20196a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo20197a(C5901a aVar) {
            return (aVar == C5901a.DATA_DISK_CACHE || aVar == C5901a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: a */
        public boolean mo20198a(boolean z, C5901a aVar, C5903c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo20199b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    /* compiled from: DiskCacheStrategy */
    class C5967d extends C5963j {
        C5967d() {
        }

        /* renamed from: a */
        public boolean mo20196a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo20197a(C5901a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo20198a(boolean z, C5901a aVar, C5903c cVar) {
            return (aVar == C5901a.RESOURCE_DISK_CACHE || aVar == C5901a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo20199b() {
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$e */
    /* compiled from: DiskCacheStrategy */
    class C5968e extends C5963j {
        C5968e() {
        }

        /* renamed from: a */
        public boolean mo20196a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo20197a(C5901a aVar) {
            return aVar == C5901a.REMOTE;
        }

        /* renamed from: b */
        public boolean mo20199b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo20198a(boolean z, C5901a aVar, C5903c cVar) {
            return ((z && aVar == C5901a.DATA_DISK_CACHE) || aVar == C5901a.LOCAL) && cVar == C5903c.TRANSFORMED;
        }
    }

    static {
        new C5964a();
    }

    /* renamed from: a */
    public abstract boolean mo20196a();

    /* renamed from: a */
    public abstract boolean mo20197a(C5901a aVar);

    /* renamed from: a */
    public abstract boolean mo20198a(boolean z, C5901a aVar, C5903c cVar);

    /* renamed from: b */
    public abstract boolean mo20199b();
}
