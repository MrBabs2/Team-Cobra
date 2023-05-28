package com.bumptech.glide.load.p148m.p149o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p148m.C6041g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.o.c */
/* compiled from: ThumbFetcher */
public class C6054c implements C6034d<InputStream> {

    /* renamed from: f */
    private final Uri f11132f;

    /* renamed from: g */
    private final C6058e f11133g;

    /* renamed from: h */
    private InputStream f11134h;

    /* renamed from: com.bumptech.glide.load.m.o.c$a */
    /* compiled from: ThumbFetcher */
    static class C6055a implements C6057d {

        /* renamed from: b */
        private static final String[] f11135b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f11136a;

        C6055a(ContentResolver contentResolver) {
            this.f11136a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo20358a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f11136a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f11135b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: com.bumptech.glide.load.m.o.c$b */
    /* compiled from: ThumbFetcher */
    static class C6056b implements C6057d {

        /* renamed from: b */
        private static final String[] f11137b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f11138a;

        C6056b(ContentResolver contentResolver) {
            this.f11138a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo20358a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f11138a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f11137b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    C6054c(Uri uri, C6058e eVar) {
        this.f11132f = uri;
        this.f11133g = eVar;
    }

    /* renamed from: a */
    public static C6054c m12157a(Context context, Uri uri) {
        return m12158a(context, uri, new C6055a(context.getContentResolver()));
    }

    /* renamed from: b */
    public static C6054c m12159b(Context context, Uri uri) {
        return m12158a(context, uri, new C6056b(context.getContentResolver()));
    }

    /* renamed from: d */
    private InputStream m12160d() throws FileNotFoundException {
        InputStream b = this.f11133g.mo20360b(this.f11132f);
        int a = b != null ? this.f11133g.mo20359a(this.f11132f) : -1;
        return a != -1 ? new C6041g(b, a) : b;
    }

    /* renamed from: c */
    public C5901a mo20330c() {
        return C5901a.LOCAL;
    }

    public void cancel() {
    }

    /* renamed from: a */
    private static C6054c m12158a(Context context, Uri uri, C6057d dVar) {
        return new C6054c(uri, new C6058e(C5874c.m11487b(context).mo19962g().mo19944a(), dVar, C5874c.m11487b(context).mo19956b(), context.getContentResolver()));
    }

    /* renamed from: b */
    public void mo20329b() {
        InputStream inputStream = this.f11134h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo20327a(C5878g gVar, C6034d.C6035a<? super InputStream> aVar) {
        try {
            InputStream d = m12160d();
            this.f11134h = d;
            aVar.mo20141a(d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo20140a((Exception) e);
        }
    }

    /* renamed from: a */
    public Class<InputStream> mo20323a() {
        return InputStream.class;
    }
}
