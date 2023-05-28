package com.flurry.sdk;

import com.google.android.gms.ads.AdRequest;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.flurry.sdk.n7 */
public final class C6945n7 {

    /* renamed from: d */
    private static final char[] f13034d = {'F', 'C', 'B', 'M'};

    /* renamed from: e */
    private static final String f13035e = new String(f13034d);

    /* renamed from: f */
    private static final int f13036f;

    /* renamed from: g */
    private static final int f13037g;

    /* renamed from: h */
    private static final int f13038h;

    /* renamed from: i */
    private static final int f13039i;

    /* renamed from: a */
    private short f13040a;

    /* renamed from: b */
    private boolean f13041b;

    /* renamed from: c */
    public ByteBuffer f13042c;

    static {
        char[] cArr = f13034d;
        f13036f = (cArr.length * 2) + 2 + 1 + 105984;
        int length = cArr.length * 2;
        f13037g = length;
        int i = length + 2;
        f13038h = i;
        f13039i = i + 1;
    }

    C6945n7() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f13036f);
        this.f13042c = allocateDirect;
        allocateDirect.asCharBuffer().put(f13034d);
    }

    /* renamed from: a */
    private C6932m7 m14744a(int i) {
        this.f13042c.position(f13039i + (i * AdRequest.MAX_CONTENT_URL_LENGTH));
        return new C6932m7(this.f13042c.asCharBuffer().limit(this.f13042c.getInt()).toString(), this.f13042c.getLong());
    }

    /* renamed from: b */
    public static int m14745b() {
        return 1;
    }

    public final synchronized String toString() {
        short s;
        StringBuilder sb;
        if (this.f13042c == null) {
            s = 0;
        } else {
            s = this.f13041b ? 207 : this.f13040a;
        }
        sb = new StringBuilder();
        sb.append("Total number of breadcrumbs: " + s + "\n");
        for (C6932m7 m7Var : mo23665a()) {
            sb.append(m7Var.toString());
        }
        return sb.toString();
    }

    public C6945n7(File file) {
        int i;
        boolean z = true;
        C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs from %s", new Object[]{file.getAbsolutePath()}));
        this.f13042c = ByteBuffer.allocate(f13036f);
        if (file.length() != ((long) this.f13042c.capacity())) {
            C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "Crash breadcrumbs invalid file length %s != %s", new Object[]{Long.valueOf(file.length()), Integer.valueOf(this.f13042c.capacity())}));
            this.f13042c = null;
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            try {
                i = channel.read(this.f13042c);
            } catch (IOException unused) {
                C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", "Issue reading breadcrumbs from file.");
                i = 0;
            }
            C6766c2.m14420a((Closeable) channel);
            C6766c2.m14420a((Closeable) fileInputStream);
            if (i != this.f13042c.capacity()) {
                C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs unexpected read size %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f13042c.capacity())}));
                this.f13042c = null;
                return;
            }
            this.f13042c.position(0);
            String obj = this.f13042c.asCharBuffer().limit(f13034d.length).toString();
            if (!obj.equals(f13035e)) {
                C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid magic string: '%s'", new Object[]{obj}));
                this.f13042c = null;
                return;
            }
            short s = this.f13042c.getShort(f13037g);
            this.f13040a = s;
            if (s < 0 || s >= 207) {
                C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid index: '%s'", new Object[]{Short.valueOf(this.f13040a)}));
                this.f13042c = null;
                return;
            }
            this.f13041b = this.f13042c.get(f13038h) != 1 ? false : z;
        } catch (FileNotFoundException unused2) {
            C6792d1.m14476a(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", "Issue reading breadcrumbs file.");
            this.f13042c = null;
        }
    }

    /* renamed from: a */
    public final List<C6932m7> mo23665a() {
        ArrayList arrayList = new ArrayList();
        if (this.f13042c == null) {
            return arrayList;
        }
        if (this.f13041b) {
            for (int i = this.f13040a; i < 207; i++) {
                arrayList.add(m14744a(i));
            }
        }
        for (int i2 = 0; i2 < this.f13040a; i2++) {
            arrayList.add(m14744a(i2));
        }
        return arrayList;
    }
}
