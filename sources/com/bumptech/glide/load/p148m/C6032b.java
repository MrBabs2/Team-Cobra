package com.bumptech.glide.load.p148m;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.p148m.C6034d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.b */
/* compiled from: AssetPathFetcher */
public abstract class C6032b<T> implements C6034d<T> {

    /* renamed from: f */
    private final String f11104f;

    /* renamed from: g */
    private final AssetManager f11105g;

    /* renamed from: h */
    private T f11106h;

    public C6032b(AssetManager assetManager, String str) {
        this.f11105g = assetManager;
        this.f11104f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo20326a(AssetManager assetManager, String str) throws IOException;

    /* renamed from: a */
    public void mo20327a(C5878g gVar, C6034d.C6035a<? super T> aVar) {
        try {
            T a = mo20326a(this.f11105g, this.f11104f);
            this.f11106h = a;
            aVar.mo20141a(a);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo20140a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20328a(T t) throws IOException;

    /* renamed from: b */
    public void mo20329b() {
        T t = this.f11106h;
        if (t != null) {
            try {
                mo20328a(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public C5901a mo20330c() {
        return C5901a.LOCAL;
    }

    public void cancel() {
    }
}
