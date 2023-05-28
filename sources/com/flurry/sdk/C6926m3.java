package com.flurry.sdk;

import com.flurry.sdk.C6826g0;
import com.flurry.sdk.C6868i2;
import com.flurry.sdk.C6972p3;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.flurry.sdk.m3 */
public final class C6926m3 extends C6916l2 implements C6972p3 {

    /* renamed from: p */
    protected static BufferedOutputStream f12989p;

    /* renamed from: q */
    private static int f12990q;

    /* renamed from: n */
    private C6955o3 f12991n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ReentrantLock f12992o;

    /* renamed from: com.flurry.sdk.m3$a */
    class C6927a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f12993h;

        /* renamed from: i */
        final /* synthetic */ C6972p3.C6973a f12994i;

        C6927a(C7044u6 u6Var, C6972p3.C6973a aVar) {
            this.f12993h = u6Var;
            this.f12994i = aVar;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6926m3.this.f12992o.lock();
            try {
                C6926m3.m14710a(C6926m3.this, this.f12993h);
                if (this.f12994i != null) {
                    this.f12994i.mo23685a();
                }
            } finally {
                C6926m3.this.f12992o.unlock();
            }
        }
    }

    /* renamed from: com.flurry.sdk.m3$b */
    class C6928b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f12996h;

        C6928b(C7044u6 u6Var) {
            this.f12996h = u6Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6926m3.this.f12992o.lock();
            try {
                C6926m3.m14710a(C6926m3.this, this.f12996h);
            } finally {
                C6926m3.this.f12992o.unlock();
            }
        }
    }

    public C6926m3() {
        super("BufferedFrameAppender", C6868i2.m14604a(C6868i2.C6870b.CORE));
        this.f12991n = null;
        this.f12992o = new ReentrantLock(true);
        this.f12991n = new C6955o3();
    }

    /* renamed from: b */
    public final void mo23653b() {
        this.f12992o.lock();
        try {
            if (mo23654c()) {
                mo23570a();
            }
            C7073w6 w6Var = new C7073w6(C6988q2.m14844c(), "currentFile");
            File file = new File(w6Var.f13336a, w6Var.f13337b);
            C6826g0.C6828b a = C6940n3.m14738a(file);
            if (a != C6826g0.C6828b.SUCCEED) {
                C6826g0.m14532b().mo23590a(a);
                boolean delete = file.delete();
                C6792d1.m14476a(5, "BufferedFrameAppender", "File deleted status: " + delete + " InProgress.");
            } else {
                boolean z = false;
                C7073w6 w6Var2 = new C7073w6(C6988q2.m14842b(), String.format(Locale.US, "completed-%d", new Object[]{Long.valueOf(System.currentTimeMillis())}));
                if (C7004r2.m14872a(w6Var, w6Var2)) {
                    if (C7004r2.m14873a(w6Var.f13336a, w6Var.f13337b, w6Var2.f13336a, w6Var2.f13337b)) {
                        boolean a2 = C7084x6.m15026a(w6Var, w6Var2);
                        z = a2 ? C7084x6.m15025a(w6Var) : a2;
                    }
                }
                C6792d1.m14476a(4, "BufferedFrameAppender", "File moved status: " + z + " InProgress to Completed.");
            }
        } finally {
            this.f12992o.unlock();
        }
    }

    /* renamed from: c */
    public final boolean mo23654c() {
        return f12989p != null;
    }

    /* renamed from: a */
    public final void mo23651a(C7044u6 u6Var, C6972p3.C6973a aVar) {
        C6792d1.m14476a(2, "BufferedFrameAppender", "Appending Frame:" + u6Var.mo23538a());
        mo23563c(new C6927a(u6Var, aVar));
    }

    /* renamed from: a */
    public final void mo23650a(C7044u6 u6Var) {
        C6792d1.m14476a(2, "BufferedFrameAppender", "Appending Frame:" + u6Var.mo23538a());
        mo23564d(new C6928b(u6Var));
    }

    /* renamed from: a */
    public final void mo23570a() {
        C6792d1.m14476a(2, "BufferedFrameAppender", "Close");
        this.f12992o.lock();
        try {
            f12990q = 0;
            C6766c2.m14420a((Closeable) f12989p);
            f12989p = null;
        } finally {
            this.f12992o.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo23652a(String str, String str2) {
        C6792d1.m14476a(2, "BufferedFrameAppender", "Open");
        this.f12992o.lock();
        boolean z = true;
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                if (!C6749b2.m14390a(file)) {
                    throw new IOException("Frame file: Error creating directory for :" + file.getAbsolutePath());
                }
            }
            f12989p = new BufferedOutputStream(new FileOutputStream(file, true));
            try {
                f12990q = 0;
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            z = false;
            try {
                C6792d1.m14476a(6, "BufferedFrameAppender", "Error in opening file:" + str2 + " Message:" + e.getMessage());
                this.f12992o.unlock();
                return z;
            } catch (Throwable th) {
                this.f12992o.unlock();
                throw th;
            }
        }
        this.f12992o.unlock();
        return z;
    }

    /* renamed from: a */
    static /* synthetic */ void m14710a(C6926m3 m3Var, C7044u6 u6Var) {
        boolean z = true;
        f12990q++;
        byte[] a = m3Var.f12991n.mo23677a(u6Var);
        if (a != null) {
            try {
                f12989p.write(a);
                f12989p.flush();
            } catch (IOException e) {
                C6792d1.m14476a(2, "BufferedFrameAppender", "Error appending frame:" + e.getMessage());
            }
            C6792d1.m14476a(2, "BufferedFrameAppender", "Appending Frame " + u6Var.mo23538a() + " frameSaved:" + z + " frameCount:" + f12990q);
        }
        z = false;
        C6792d1.m14476a(2, "BufferedFrameAppender", "Appending Frame " + u6Var.mo23538a() + " frameSaved:" + z + " frameCount:" + f12990q);
    }
}
