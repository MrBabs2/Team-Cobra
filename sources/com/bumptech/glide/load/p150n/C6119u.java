package com.bumptech.glide.load.p150n;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p150n.C6101n;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.u */
/* compiled from: StringLoader */
public class C6119u<Data> implements C6101n<String, Data> {

    /* renamed from: a */
    private final C6101n<Uri, Data> f11220a;

    /* renamed from: com.bumptech.glide.load.n.u$a */
    /* compiled from: StringLoader */
    public static final class C6120a implements C6103o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C6101n<String, AssetFileDescriptor> mo20366a(C6109r rVar) {
            return new C6119u(rVar.mo20414a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.n.u$b */
    /* compiled from: StringLoader */
    public static class C6121b implements C6103o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C6101n<String, ParcelFileDescriptor> mo20366a(C6109r rVar) {
            return new C6119u(rVar.mo20414a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.n.u$c */
    /* compiled from: StringLoader */
    public static class C6122c implements C6103o<String, InputStream> {
        /* renamed from: a */
        public C6101n<String, InputStream> mo20366a(C6109r rVar) {
            return new C6119u(rVar.mo20414a(Uri.class, InputStream.class));
        }
    }

    public C6119u(C6101n<Uri, Data> nVar) {
        this.f11220a = nVar;
    }

    /* renamed from: b */
    private static Uri m12322b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m12323c(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m12323c(str) : parse;
    }

    /* renamed from: c */
    private static Uri m12323c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public boolean mo20364a(String str) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(String str, int i, int i2, C6027i iVar) {
        Uri b = m12322b(str);
        if (b == null || !this.f11220a.mo20364a(b)) {
            return null;
        }
        return this.f11220a.mo20362a(b, i, i2, iVar);
    }
}
