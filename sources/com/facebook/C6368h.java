package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.h */
/* compiled from: GraphRequestBatch */
public class C6368h extends AbstractList<GraphRequest> {

    /* renamed from: l */
    private static AtomicInteger f11714l = new AtomicInteger();

    /* renamed from: f */
    private Handler f11715f;

    /* renamed from: g */
    private List<GraphRequest> f11716g = new ArrayList();

    /* renamed from: h */
    private int f11717h = 0;

    /* renamed from: i */
    private final String f11718i = Integer.valueOf(f11714l.incrementAndGet()).toString();

    /* renamed from: j */
    private List<C6369a> f11719j = new ArrayList();

    /* renamed from: k */
    private String f11720k;

    /* renamed from: com.facebook.h$a */
    /* compiled from: GraphRequestBatch */
    public interface C6369a {
        /* renamed from: a */
        void mo20886a(C6368h hVar);
    }

    /* renamed from: com.facebook.h$b */
    /* compiled from: GraphRequestBatch */
    public interface C6370b extends C6369a {
        /* renamed from: a */
        void mo20917a(C6368h hVar, long j, long j2);
    }

    public C6368h(Collection<GraphRequest> collection) {
        this.f11716g = new ArrayList(collection);
    }

    /* renamed from: a */
    public void mo20898a(C6369a aVar) {
        if (!this.f11719j.contains(aVar)) {
            this.f11719j.add(aVar);
        }
    }

    /* renamed from: b */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return this.f11716g.set(i, graphRequest);
    }

    /* renamed from: c */
    public final C6367g mo20904c() {
        return mo20906d();
    }

    public final void clear() {
        this.f11716g.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6367g mo20906d() {
        return GraphRequest.m13093b(this);
    }

    /* renamed from: f */
    public final String mo20907f() {
        return this.f11720k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Handler mo20908g() {
        return this.f11715f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final List<C6369a> mo20910h() {
        return this.f11719j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo20911j() {
        return this.f11718i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final List<GraphRequest> mo20912k() {
        return this.f11716g;
    }

    /* renamed from: n */
    public int mo20913n() {
        return this.f11717h;
    }

    public final int size() {
        return this.f11716g.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C6371i> mo20903b() {
        return GraphRequest.m13078a(this);
    }

    public final GraphRequest get(int i) {
        return this.f11716g.get(i);
    }

    public final GraphRequest remove(int i) {
        return this.f11716g.remove(i);
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        return this.f11716g.add(graphRequest);
    }

    /* renamed from: a */
    public final void add(int i, GraphRequest graphRequest) {
        this.f11716g.add(i, graphRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20897a(Handler handler) {
        this.f11715f = handler;
    }

    /* renamed from: a */
    public final List<C6371i> mo20895a() {
        return mo20903b();
    }

    public C6368h(GraphRequest... graphRequestArr) {
        this.f11716g = Arrays.asList(graphRequestArr);
    }
}
