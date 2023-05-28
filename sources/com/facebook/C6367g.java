package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.g */
/* compiled from: GraphRequestAsyncTask */
public class C6367g extends AsyncTask<Void, Void, List<C6371i>> {

    /* renamed from: d */
    private static final String f11710d = C6367g.class.getCanonicalName();

    /* renamed from: a */
    private final HttpURLConnection f11711a;

    /* renamed from: b */
    private final C6368h f11712b;

    /* renamed from: c */
    private Exception f11713c;

    public C6367g(C6368h hVar) {
        this((HttpURLConnection) null, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20890a(List<C6371i> list) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                super.onPostExecute(list);
                if (this.f11713c != null) {
                    C6476x.m13528c(f11710d, String.format("onPostExecute: exception encountered during request: %s", new Object[]{this.f11713c.getMessage()}));
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            return mo20889a((Void[]) objArr);
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo20890a((List<C6371i>) (List) obj);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        if (!C6391a.m13260a((Object) this)) {
            try {
                super.onPreExecute();
                if (C4716f.m7711t()) {
                    C6476x.m13528c(f11710d, String.format("execute async task: %s", new Object[]{this}));
                }
                if (this.f11712b.mo20908g() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.f11712b.mo20897a(handler);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    public String toString() {
        return "{RequestAsyncTask: " + " connection: " + this.f11711a + ", requests: " + this.f11712b + "}";
    }

    public C6367g(HttpURLConnection httpURLConnection, C6368h hVar) {
        this.f11712b = hVar;
        this.f11711a = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C6371i> mo20889a(Void... voidArr) {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            if (this.f11711a == null) {
                return this.f11712b.mo20895a();
            }
            return GraphRequest.m13079a(this.f11711a, this.f11712b);
        } catch (Exception e) {
            this.f11713c = e;
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }
}
