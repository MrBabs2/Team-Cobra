package com.facebook.p032t;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.C6372a;
import com.facebook.internal.C6476x;
import com.facebook.p032t.p179s.C6640a;
import com.facebook.p032t.p181u.C6651c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.o */
/* compiled from: SessionEventsState */
class C6600o {

    /* renamed from: a */
    private List<C6570c> f12253a = new ArrayList();

    /* renamed from: b */
    private List<C6570c> f12254b = new ArrayList();

    /* renamed from: c */
    private int f12255c;

    /* renamed from: d */
    private C6372a f12256d;

    /* renamed from: e */
    private String f12257e;

    public C6600o(C6372a aVar, String str) {
        this.f12256d = aVar;
        this.f12257e = str;
    }

    /* renamed from: a */
    public synchronized void mo21349a(C6570c cVar) {
        if (this.f12253a.size() + this.f12254b.size() >= 1000) {
            this.f12255c++;
        } else {
            this.f12253a.add(cVar);
        }
    }

    /* renamed from: b */
    public synchronized List<C6570c> mo21351b() {
        List<C6570c> list;
        list = this.f12253a;
        this.f12253a = new ArrayList();
        return list;
    }

    /* renamed from: a */
    public synchronized int mo21347a() {
        return this.f12253a.size();
    }

    /* renamed from: a */
    public synchronized void mo21350a(boolean z) {
        if (z) {
            this.f12253a.addAll(this.f12254b);
        }
        this.f12254b.clear();
        this.f12255c = 0;
    }

    /* renamed from: a */
    public int mo21348a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f12255c;
            C6640a.m14149a(this.f12253a);
            this.f12254b.addAll(this.f12253a);
            this.f12253a.clear();
            JSONArray jSONArray = new JSONArray();
            for (C6570c next : this.f12254b) {
                if (!next.mo21309d()) {
                    C6476x.m13528c("Event with invalid checksum: %s", next.toString());
                } else if (z || !next.mo21306a()) {
                    jSONArray.put(next.mo21307b());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m14011a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    /* renamed from: a */
    private void m14011a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = C6651c.m14188a(C6651c.C6653b.CUSTOM_APP_EVENTS, this.f12256d, this.f12257e, z, context);
            if (this.f12255c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.mo20830a(jSONObject);
        Bundle h = graphRequest.mo20838h();
        if (h == null) {
            h = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            h.putString("custom_events", jSONArray2);
            graphRequest.mo20829a((Object) jSONArray2);
        }
        graphRequest.mo20826a(h);
    }
}
