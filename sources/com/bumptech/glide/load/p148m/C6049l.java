package com.bumptech.glide.load.p148m;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.p148m.C6034d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.l */
/* compiled from: LocalUriFetcher */
public abstract class C6049l<T> implements C6034d<T> {

    /* renamed from: f */
    private final Uri f11128f;

    /* renamed from: g */
    private final ContentResolver f11129g;

    /* renamed from: h */
    private T f11130h;

    public C6049l(ContentResolver contentResolver, Uri uri) {
        this.f11129g = contentResolver;
        this.f11128f = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo20322a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* renamed from: a */
    public final void mo20327a(C5878g gVar, C6034d.C6035a<? super T> aVar) {
        try {
            T a = mo20322a(this.f11128f, this.f11129g);
            this.f11130h = a;
            aVar.mo20141a(a);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo20140a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20325a(T t) throws IOException;

    /* renamed from: b */
    public void mo20329b() {
        T t = this.f11130h;
        if (t != null) {
            try {
                mo20325a(t);
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
