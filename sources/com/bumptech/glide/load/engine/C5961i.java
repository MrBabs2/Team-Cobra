package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.load.p152o.p158h.C6226e;
import com.bumptech.glide.p166r.C6315j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.i */
/* compiled from: DecodePath */
public class C5961i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f10933a;

    /* renamed from: b */
    private final List<? extends C6028j<DataType, ResourceType>> f10934b;

    /* renamed from: c */
    private final C6226e<ResourceType, Transcode> f10935c;

    /* renamed from: d */
    private final C5005e<List<Throwable>> f10936d;

    /* renamed from: e */
    private final String f10937e;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    /* compiled from: DecodePath */
    interface C5962a<ResourceType> {
        /* renamed from: a */
        C5992u<ResourceType> mo20184a(C5992u<ResourceType> uVar);
    }

    public C5961i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C6028j<DataType, ResourceType>> list, C6226e<ResourceType, Transcode> eVar, C5005e<List<Throwable>> eVar2) {
        this.f10933a = cls;
        this.f10934b = list;
        this.f10935c = eVar;
        this.f10936d = eVar2;
        this.f10937e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public C5992u<Transcode> mo20194a(C6036e<DataType> eVar, int i, int i2, C6027i iVar, C5962a<ResourceType> aVar) throws GlideException {
        return this.f10935c.mo20552a(aVar.mo20184a(m11833a(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f10933a + ", decoders=" + this.f10934b + ", transcoder=" + this.f10935c + '}';
    }

    /* renamed from: a */
    private C5992u<ResourceType> m11833a(C6036e<DataType> eVar, int i, int i2, C6027i iVar) throws GlideException {
        List<Throwable> a = this.f10936d.mo17456a();
        C6315j.m12978a(a);
        List list = a;
        try {
            return m11834a(eVar, i, i2, iVar, (List<Throwable>) list);
        } finally {
            this.f10936d.mo17457a(list);
        }
    }

    /* renamed from: a */
    private C5992u<ResourceType> m11834a(C6036e<DataType> eVar, int i, int i2, C6027i iVar, List<Throwable> list) throws GlideException {
        int size = this.f10934b.size();
        C5992u<ResourceType> uVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C6028j jVar = (C6028j) this.f10934b.get(i3);
            try {
                if (jVar.mo20320a(eVar.mo20337a(), iVar)) {
                    uVar = jVar.mo20319a(eVar.mo20337a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e);
                }
                list.add(e);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f10937e, (List<Throwable>) new ArrayList(list));
    }
}
