package com.bumptech.glide.load.p148m.p149o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C5905e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.m.o.e */
/* compiled from: ThumbnailStreamOpener */
class C6058e {

    /* renamed from: f */
    private static final C6052a f11139f = new C6052a();

    /* renamed from: a */
    private final C6052a f11140a;

    /* renamed from: b */
    private final C6057d f11141b;

    /* renamed from: c */
    private final C5999b f11142c;

    /* renamed from: d */
    private final ContentResolver f11143d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f11144e;

    C6058e(List<ImageHeaderParser> list, C6057d dVar, C5999b bVar, ContentResolver contentResolver) {
        this(list, f11139f, dVar, bVar, contentResolver);
    }

    /* renamed from: c */
    private String m12169c(Uri uri) {
        Cursor a = this.f11141b.mo20358a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    return a.getString(0);
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo20359a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f11143d.openInputStream(uri);
            int a = C5905e.m11673a(this.f11144e, openInputStream, this.f11142c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public InputStream mo20360b(Uri uri) throws FileNotFoundException {
        String c = m12169c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f11140a.mo20355a(c);
        if (!m12168a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f11143d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    C6058e(List<ImageHeaderParser> list, C6052a aVar, C6057d dVar, C5999b bVar, ContentResolver contentResolver) {
        this.f11140a = aVar;
        this.f11141b = dVar;
        this.f11142c = bVar;
        this.f11143d = contentResolver;
        this.f11144e = list;
    }

    /* renamed from: a */
    private boolean m12168a(File file) {
        return this.f11140a.mo20356a(file) && 0 < this.f11140a.mo20357b(file);
    }
}
