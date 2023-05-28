package com.bumptech.glide;

import com.bumptech.glide.load.C5904d;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.C6029k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C5961i;
import com.bumptech.glide.load.engine.C5989s;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.load.p148m.C6038f;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p150n.C6103o;
import com.bumptech.glide.load.p150n.C6104p;
import com.bumptech.glide.load.p152o.p158h.C6226e;
import com.bumptech.glide.load.p152o.p158h.C6227f;
import com.bumptech.glide.p161o.C6256a;
import com.bumptech.glide.p161o.C6258b;
import com.bumptech.glide.p161o.C6259c;
import com.bumptech.glide.p161o.C6260d;
import com.bumptech.glide.p161o.C6261e;
import com.bumptech.glide.p161o.C6263f;
import com.bumptech.glide.p166r.p167l.C6318a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p050l.p075h.p083k.C5005e;

public class Registry {

    /* renamed from: a */
    private final C6104p f10598a;

    /* renamed from: b */
    private final C6256a f10599b;

    /* renamed from: c */
    private final C6261e f10600c;

    /* renamed from: d */
    private final C6263f f10601d;

    /* renamed from: e */
    private final C6038f f10602e;

    /* renamed from: f */
    private final C6227f f10603f;

    /* renamed from: g */
    private final C6258b f10604g;

    /* renamed from: h */
    private final C6260d f10605h = new C6260d();

    /* renamed from: i */
    private final C6259c f10606i = new C6259c();

    /* renamed from: j */
    private final C5005e<List<Throwable>> f10607j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        C5005e<List<Throwable>> b = C6318a.m13009b();
        this.f10607j = b;
        this.f10598a = new C6104p(b);
        this.f10599b = new C6256a();
        this.f10600c = new C6261e();
        this.f10601d = new C6263f();
        this.f10602e = new C6038f();
        this.f10603f = new C6227f();
        this.f10604g = new C6258b();
        mo19941a((List<String>) Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C5961i<Data, TResource, Transcode>> m11463c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f10600c.mo20619b(cls, cls2)) {
            for (Class next2 : this.f10603f.mo20555b(next, cls3)) {
                arrayList.add(new C5961i(cls, next, next2, this.f10600c.mo20616a(cls, next), this.f10603f.mo20553a(next, next2), this.f10607j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry mo19935a(Class<Data> cls, C5904d<Data> dVar) {
        this.f10599b.mo20607a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> mo19947b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f10605h.mo20614a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> b : this.f10598a.mo20407a((Class<?>) cls)) {
                for (Class next : this.f10600c.mo20619b(b, cls2)) {
                    if (!this.f10603f.mo20555b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f10605h.mo20615a(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo19937a(Class<Data> cls, Class<TResource> cls2, C6028j<Data, TResource> jVar) {
        mo19940a("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo19940a(String str, Class<Data> cls, Class<TResource> cls2, C6028j<Data, TResource> jVar) {
        this.f10600c.mo20617a(str, jVar, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final Registry mo19941a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f10600c.mo20618a((List<String>) arrayList);
        return this;
    }

    /* renamed from: a */
    public <TResource> Registry mo19936a(Class<TResource> cls, C6029k<TResource> kVar) {
        this.f10601d.mo20622a(cls, kVar);
        return this;
    }

    /* renamed from: a */
    public Registry mo19934a(C6036e.C6037a<?> aVar) {
        this.f10602e.mo20342a(aVar);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> Registry mo19939a(Class<TResource> cls, Class<Transcode> cls2, C6226e<TResource, Transcode> eVar) {
        this.f10603f.mo20554a(cls, cls2, eVar);
        return this;
    }

    /* renamed from: a */
    public Registry mo19933a(ImageHeaderParser imageHeaderParser) {
        this.f10604g.mo20610a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> Registry mo19938a(Class<Model> cls, Class<Data> cls2, C6103o<Model, Data> oVar) {
        this.f10598a.mo20409a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C5989s<Data, TResource, Transcode> mo19942a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5989s<Data, TResource, Transcode> a = this.f10606i.mo20611a(cls, cls2, cls3);
        if (this.f10606i.mo20613a(a)) {
            return null;
        }
        if (a == null) {
            List<C5961i<Data, TResource, Transcode>> c = m11463c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                a = new C5989s<>(cls, cls2, cls3, c, this.f10607j);
            }
            this.f10606i.mo20612a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: c */
    public <X> C5904d<X> mo19949c(X x) throws NoSourceEncoderAvailableException {
        C5904d<X> a = this.f10599b.mo20606a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: b */
    public boolean mo19948b(C5992u<?> uVar) {
        return this.f10601d.mo20621a(uVar.mo20239d()) != null;
    }

    /* renamed from: b */
    public <X> C6036e<X> mo19946b(X x) {
        return this.f10602e.mo20341a(x);
    }

    /* renamed from: a */
    public <X> C6029k<X> mo19943a(C5992u<X> uVar) throws NoResultEncoderAvailableException {
        C6029k<X> a = this.f10601d.mo20621a(uVar.mo20239d());
        if (a != null) {
            return a;
        }
        throw new NoResultEncoderAvailableException(uVar.mo20239d());
    }

    /* renamed from: a */
    public <Model> List<C6101n<Model, ?>> mo19945a(Model model) {
        List<C6101n<Model, ?>> a = this.f10598a.mo20408a(model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    /* renamed from: a */
    public List<ImageHeaderParser> mo19944a() {
        List<ImageHeaderParser> a = this.f10604g.mo20609a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoImageHeaderParserException();
    }
}
