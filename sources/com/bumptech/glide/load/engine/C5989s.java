package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.engine.C5961i;
import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.p166r.C6315j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.s */
/* compiled from: LoadPath */
public class C5989s<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final C5005e<List<Throwable>> f11016a;

    /* renamed from: b */
    private final List<? extends C5961i<Data, ResourceType, Transcode>> f11017b;

    /* renamed from: c */
    private final String f11018c;

    public C5989s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C5961i<Data, ResourceType, Transcode>> list, C5005e<List<Throwable>> eVar) {
        this.f11016a = eVar;
        C6315j.m12981a(list);
        this.f11017b = list;
        this.f11018c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public C5992u<Transcode> mo20249a(C6036e<Data> eVar, C6027i iVar, int i, int i2, C5961i.C5962a<ResourceType> aVar) throws GlideException {
        List<Throwable> a = this.f11016a.mo17456a();
        C6315j.m12978a(a);
        List list = a;
        try {
            return m11921a(eVar, iVar, i, i2, aVar, list);
        } finally {
            this.f11016a.mo17457a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f11017b.toArray()) + '}';
    }

    /* renamed from: a */
    private C5992u<Transcode> m11921a(C6036e<Data> eVar, C6027i iVar, int i, int i2, C5961i.C5962a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        List<Throwable> list2 = list;
        int size = this.f11017b.size();
        C5992u<Transcode> uVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                uVar = ((C5961i) this.f11017b.get(i3)).mo20194a(eVar, i, i2, iVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f11018c, (List<Throwable>) new ArrayList(list2));
    }
}
