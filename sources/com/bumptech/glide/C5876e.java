package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C5969k;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.C6273h;
import com.bumptech.glide.p162p.p163l.C6283e;
import com.bumptech.glide.p162p.p163l.C6288j;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
/* compiled from: GlideContext */
public class C5876e extends ContextWrapper {

    /* renamed from: j */
    static final C5885j<?, ?> f10635j = new C5873b();

    /* renamed from: a */
    private final C5999b f10636a;

    /* renamed from: b */
    private final Registry f10637b;

    /* renamed from: c */
    private final C6283e f10638c;

    /* renamed from: d */
    private final C6273h f10639d;

    /* renamed from: e */
    private final List<C6272g<Object>> f10640e;

    /* renamed from: f */
    private final Map<Class<?>, C5885j<?, ?>> f10641f;

    /* renamed from: g */
    private final C5969k f10642g;

    /* renamed from: h */
    private final boolean f10643h;

    /* renamed from: i */
    private final int f10644i;

    public C5876e(Context context, C5999b bVar, Registry registry, C6283e eVar, C6273h hVar, Map<Class<?>, C5885j<?, ?>> map, List<C6272g<Object>> list, C5969k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f10636a = bVar;
        this.f10637b = registry;
        this.f10638c = eVar;
        this.f10639d = hVar;
        this.f10640e = list;
        this.f10641f = map;
        this.f10642g = kVar;
        this.f10643h = z;
        this.f10644i = i;
    }

    /* renamed from: a */
    public <T> C5885j<?, T> mo19972a(Class<T> cls) {
        C5885j<?, T> jVar = this.f10641f.get(cls);
        if (jVar == null) {
            for (Map.Entry next : this.f10641f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    jVar = (C5885j) next.getValue();
                }
            }
        }
        return jVar == null ? f10635j : jVar;
    }

    /* renamed from: b */
    public List<C6272g<Object>> mo19975b() {
        return this.f10640e;
    }

    /* renamed from: c */
    public C6273h mo19976c() {
        return this.f10639d;
    }

    /* renamed from: d */
    public C5969k mo19977d() {
        return this.f10642g;
    }

    /* renamed from: e */
    public int mo19978e() {
        return this.f10644i;
    }

    /* renamed from: f */
    public Registry mo19979f() {
        return this.f10637b;
    }

    /* renamed from: g */
    public boolean mo19980g() {
        return this.f10643h;
    }

    /* renamed from: a */
    public <X> C6288j<ImageView, X> mo19974a(ImageView imageView, Class<X> cls) {
        return this.f10638c.mo20717a(imageView, cls);
    }

    /* renamed from: a */
    public C5999b mo19973a() {
        return this.f10636a;
    }
}
