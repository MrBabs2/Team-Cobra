package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: com.liulishuo.filedownloader.model.a */
/* compiled from: FileDownloadModel */
public class C8895a {

    /* renamed from: a */
    private int f25258a;

    /* renamed from: b */
    private String f25259b;

    /* renamed from: c */
    private String f25260c;

    /* renamed from: d */
    private boolean f25261d;

    /* renamed from: e */
    private String f25262e;

    /* renamed from: f */
    private byte f25263f;

    /* renamed from: g */
    private long f25264g;

    /* renamed from: h */
    private long f25265h;

    /* renamed from: i */
    private String f25266i;

    /* renamed from: j */
    private String f25267j;

    /* renamed from: k */
    private boolean f25268k;

    /* renamed from: a */
    public void mo32729a(int i) {
        this.f25258a = i;
    }

    /* renamed from: b */
    public void mo32734b(long j) {
        this.f25268k = j > 2147483647L;
        this.f25265h = j;
    }

    /* renamed from: c */
    public void mo32737c(String str) {
        this.f25262e = str;
    }

    /* renamed from: d */
    public void mo32739d(String str) {
        this.f25259b = str;
    }

    /* renamed from: e */
    public String mo32740e() {
        return this.f25260c;
    }

    /* renamed from: f */
    public long mo32741f() {
        return this.f25264g;
    }

    /* renamed from: g */
    public byte mo32742g() {
        return this.f25263f;
    }

    /* renamed from: h */
    public String mo32743h() {
        return C10771f.m36503a(mo32740e(), mo32748m(), mo32736c());
    }

    /* renamed from: i */
    public String mo32744i() {
        if (mo32743h() == null) {
            return null;
        }
        return C10771f.m36519g(mo32743h());
    }

    /* renamed from: j */
    public long mo32745j() {
        return this.f25265h;
    }

    /* renamed from: k */
    public String mo32746k() {
        return this.f25259b;
    }

    /* renamed from: l */
    public boolean mo32747l() {
        return this.f25268k;
    }

    /* renamed from: m */
    public boolean mo32748m() {
        return this.f25261d;
    }

    /* renamed from: n */
    public ContentValues mo32749n() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(mo32738d()));
        contentValues.put("url", mo32746k());
        contentValues.put("path", mo32740e());
        contentValues.put("status", Byte.valueOf(mo32742g()));
        contentValues.put("sofar", Long.valueOf(mo32741f()));
        contentValues.put("total", Long.valueOf(mo32745j()));
        contentValues.put("errMsg", mo32733b());
        contentValues.put("etag", mo32727a());
        contentValues.put("pathAsDirectory", Boolean.valueOf(mo32748m()));
        if (mo32748m() && mo32736c() != null) {
            contentValues.put("filename", mo32736c());
        }
        return contentValues;
    }

    public String toString() {
        return C10771f.m36504a("id[%d], url[%s], path[%s], status[%d], sofar[%d], total[%d], etag[%s], %s", Integer.valueOf(this.f25258a), this.f25259b, this.f25260c, Byte.valueOf(this.f25263f), Long.valueOf(this.f25264g), Long.valueOf(this.f25265h), this.f25267j, super.toString());
    }

    /* renamed from: a */
    public void mo32732a(String str, boolean z) {
        this.f25260c = str;
        this.f25261d = z;
    }

    /* renamed from: c */
    public String mo32736c() {
        return this.f25262e;
    }

    /* renamed from: d */
    public int mo32738d() {
        return this.f25258a;
    }

    /* renamed from: b */
    public String mo32733b() {
        return this.f25266i;
    }

    /* renamed from: a */
    public void mo32728a(byte b) {
        this.f25263f = b;
    }

    /* renamed from: b */
    public void mo32735b(String str) {
        this.f25266i = str;
    }

    /* renamed from: a */
    public void mo32730a(long j) {
        this.f25264g = j;
    }

    /* renamed from: a */
    public String mo32727a() {
        return this.f25267j;
    }

    /* renamed from: a */
    public void mo32731a(String str) {
        this.f25267j = str;
    }
}
