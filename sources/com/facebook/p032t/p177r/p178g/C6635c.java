package com.facebook.p032t.p177r.p178g;

import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.root.execution.Command;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

/* renamed from: com.facebook.t.r.g.c */
/* compiled from: PathComponent */
public final class C6635c {

    /* renamed from: a */
    public final String f12349a;

    /* renamed from: b */
    public final int f12350b;

    /* renamed from: c */
    public final int f12351c;

    /* renamed from: d */
    public final String f12352d;

    /* renamed from: e */
    public final String f12353e;

    /* renamed from: f */
    public final String f12354f;

    /* renamed from: g */
    public final String f12355g;

    /* renamed from: h */
    public final int f12356h;

    /* renamed from: com.facebook.t.r.g.c$a */
    /* compiled from: PathComponent */
    public enum C6636a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: f */
        private final int f12363f;

        private C6636a(int i) {
            this.f12363f = i;
        }

        /* renamed from: a */
        public int mo21392a() {
            return this.f12363f;
        }
    }

    C6635c(JSONObject jSONObject) throws JSONException {
        this.f12349a = jSONObject.getString("class_name");
        this.f12350b = jSONObject.optInt("index", -1);
        this.f12351c = jSONObject.optInt(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        this.f12352d = jSONObject.optString(Command.CommandHandler.TEXT);
        this.f12353e = jSONObject.optString(StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.f12354f = jSONObject.optString("description");
        this.f12355g = jSONObject.optString("hint");
        this.f12356h = jSONObject.optInt("match_bitmask");
    }
}
