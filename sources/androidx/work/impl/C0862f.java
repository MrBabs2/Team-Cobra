package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.C0832g;
import androidx.work.C0834i;
import androidx.work.C0964l;
import androidx.work.C0973o;
import androidx.work.C0976r;
import androidx.work.impl.utils.C0934b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.f */
/* compiled from: WorkContinuationImpl */
public class C0862f extends C0973o {

    /* renamed from: j */
    private static final String f3087j = C0834i.m3721a("WorkContinuationImpl");

    /* renamed from: a */
    private final C0868h f3088a;

    /* renamed from: b */
    private final String f3089b;

    /* renamed from: c */
    private final C0832g f3090c;

    /* renamed from: d */
    private final List<? extends C0976r> f3091d;

    /* renamed from: e */
    private final List<String> f3092e;

    /* renamed from: f */
    private final List<String> f3093f;

    /* renamed from: g */
    private final List<C0862f> f3094g;

    /* renamed from: h */
    private boolean f3095h;

    /* renamed from: i */
    private C0964l f3096i;

    C0862f(C0868h hVar, String str, C0832g gVar, List<? extends C0976r> list) {
        this(hVar, str, gVar, list, (List<C0862f>) null);
    }

    /* renamed from: a */
    public C0964l mo4784a() {
        if (!this.f3095h) {
            C0934b bVar = new C0934b(this);
            this.f3088a.mo4809g().mo4961a(bVar);
            this.f3096i = bVar.mo4924b();
        } else {
            C0834i.m3720a().mo4730e(f3087j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f3092e)}), new Throwable[0]);
        }
        return this.f3096i;
    }

    /* renamed from: b */
    public C0832g mo4785b() {
        return this.f3090c;
    }

    /* renamed from: c */
    public List<String> mo4786c() {
        return this.f3092e;
    }

    /* renamed from: d */
    public String mo4787d() {
        return this.f3089b;
    }

    /* renamed from: e */
    public List<C0862f> mo4788e() {
        return this.f3094g;
    }

    /* renamed from: f */
    public List<? extends C0976r> mo4789f() {
        return this.f3091d;
    }

    /* renamed from: g */
    public C0868h mo4790g() {
        return this.f3088a;
    }

    /* renamed from: h */
    public boolean mo4791h() {
        return m3835a(this, new HashSet());
    }

    /* renamed from: i */
    public boolean mo4792i() {
        return this.f3095h;
    }

    /* renamed from: j */
    public void mo4793j() {
        this.f3095h = true;
    }

    C0862f(C0868h hVar, String str, C0832g gVar, List<? extends C0976r> list, List<C0862f> list2) {
        this.f3088a = hVar;
        this.f3089b = str;
        this.f3090c = gVar;
        this.f3091d = list;
        this.f3094g = list2;
        this.f3092e = new ArrayList(this.f3091d.size());
        this.f3093f = new ArrayList();
        if (list2 != null) {
            for (C0862f fVar : list2) {
                this.f3093f.addAll(fVar.f3093f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C0976r) list.get(i)).mo4979a();
            this.f3092e.add(a);
            this.f3093f.add(a);
        }
    }

    /* renamed from: a */
    private static boolean m3835a(C0862f fVar, Set<String> set) {
        set.addAll(fVar.mo4786c());
        Set<String> a = m3834a(fVar);
        for (String contains : set) {
            if (a.contains(contains)) {
                return true;
            }
        }
        List<C0862f> e = fVar.mo4788e();
        if (e != null && !e.isEmpty()) {
            for (C0862f a2 : e) {
                if (m3835a(a2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.mo4786c());
        return false;
    }

    /* renamed from: a */
    public static Set<String> m3834a(C0862f fVar) {
        HashSet hashSet = new HashSet();
        List<C0862f> e = fVar.mo4788e();
        if (e != null && !e.isEmpty()) {
            for (C0862f c : e) {
                hashSet.addAll(c.mo4786c());
            }
        }
        return hashSet;
    }
}
