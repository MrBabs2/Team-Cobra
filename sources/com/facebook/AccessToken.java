package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.account.AndroidAccountManagerPersistence;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowFragment;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new C6330a();

    /* renamed from: q */
    private static final Date f11578q;

    /* renamed from: r */
    private static final Date f11579r;

    /* renamed from: s */
    private static final Date f11580s = new Date();

    /* renamed from: t */
    private static final C6359c f11581t = C6359c.FACEBOOK_APPLICATION_WEB;

    /* renamed from: f */
    private final Date f11582f;

    /* renamed from: g */
    private final Set<String> f11583g;

    /* renamed from: h */
    private final Set<String> f11584h;

    /* renamed from: i */
    private final Set<String> f11585i;

    /* renamed from: j */
    private final String f11586j;

    /* renamed from: k */
    private final C6359c f11587k;

    /* renamed from: l */
    private final Date f11588l;

    /* renamed from: m */
    private final String f11589m;

    /* renamed from: n */
    private final String f11590n;

    /* renamed from: o */
    private final Date f11591o;

    /* renamed from: p */
    private final String f11592p;

    /* renamed from: com.facebook.AccessToken$a */
    static class C6330a implements Parcelable.Creator {
        C6330a() {
        }

        public AccessToken createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* renamed from: com.facebook.AccessToken$b */
    public interface C6331b {
        /* renamed from: a */
        void mo20796a(AccessToken accessToken);

        /* renamed from: a */
        void mo20797a(FacebookException facebookException);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f11578q = date;
        f11579r = date;
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C6359c cVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3, (String) null);
    }

    /* renamed from: b */
    public static void m13034b(AccessToken accessToken) {
        C6353b.m13173e().mo20881a(accessToken);
    }

    /* renamed from: q */
    static void m13035q() {
        AccessToken c = C6353b.m13173e().mo20883c();
        if (c != null) {
            m13034b(m13030a(c));
        }
    }

    /* renamed from: r */
    public static AccessToken m13036r() {
        return C6353b.m13173e().mo20883c();
    }

    /* renamed from: s */
    public static boolean m13037s() {
        AccessToken c = C6353b.m13173e().mo20883c();
        return c != null && !c.mo20790o();
    }

    /* renamed from: t */
    private String m13038t() {
        if (this.f11586j == null) {
            return "null";
        }
        return C4716f.m7689a(C6494l.INCLUDE_ACCESS_TOKENS) ? this.f11586j : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: a */
    public String mo20776a() {
        return this.f11589m;
    }

    /* renamed from: c */
    public Set<String> mo20778c() {
        return this.f11584h;
    }

    /* renamed from: d */
    public Set<String> mo20779d() {
        return this.f11585i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Date mo20781e() {
        return this.f11582f;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f11582f.equals(accessToken.f11582f) && this.f11583g.equals(accessToken.f11583g) && this.f11584h.equals(accessToken.f11584h) && this.f11585i.equals(accessToken.f11585i) && this.f11586j.equals(accessToken.f11586j) && this.f11587k == accessToken.f11587k && this.f11588l.equals(accessToken.f11588l) && ((str = this.f11589m) != null ? str.equals(accessToken.f11589m) : accessToken.f11589m == null) && this.f11590n.equals(accessToken.f11590n) && this.f11591o.equals(accessToken.f11591o)) {
            String str2 = this.f11592p;
            String str3 = accessToken.f11592p;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo20783f() {
        return this.f11592p;
    }

    /* renamed from: g */
    public Date mo20784g() {
        return this.f11588l;
    }

    /* renamed from: h */
    public Set<String> mo20785h() {
        return this.f11583g;
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f11582f.hashCode()) * 31) + this.f11583g.hashCode()) * 31) + this.f11584h.hashCode()) * 31) + this.f11585i.hashCode()) * 31) + this.f11586j.hashCode()) * 31) + this.f11587k.hashCode()) * 31) + this.f11588l.hashCode()) * 31;
        String str = this.f11589m;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f11590n.hashCode()) * 31) + this.f11591o.hashCode()) * 31;
        String str2 = this.f11592p;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: j */
    public C6359c mo20787j() {
        return this.f11587k;
    }

    /* renamed from: k */
    public String mo20788k() {
        return this.f11586j;
    }

    /* renamed from: n */
    public String mo20789n() {
        return this.f11590n;
    }

    /* renamed from: o */
    public boolean mo20790o() {
        return new Date().after(this.f11582f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public JSONObject mo20791p() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f11586j);
        jSONObject.put("expires_at", this.f11582f.getTime());
        jSONObject.put("permissions", new JSONArray(this.f11583g));
        jSONObject.put("declined_permissions", new JSONArray(this.f11584h));
        jSONObject.put("expired_permissions", new JSONArray(this.f11585i));
        jSONObject.put("last_refresh", this.f11588l.getTime());
        jSONObject.put("source", this.f11587k.name());
        jSONObject.put("application_id", this.f11589m);
        jSONObject.put(TimeLineFollowFragment.BundleKeys.USER_ID, this.f11590n);
        jSONObject.put("data_access_expiration_time", this.f11591o.getTime());
        String str = this.f11592p;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m13038t());
        m13033a(sb);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11582f.getTime());
        parcel.writeStringList(new ArrayList(this.f11583g));
        parcel.writeStringList(new ArrayList(this.f11584h));
        parcel.writeStringList(new ArrayList(this.f11585i));
        parcel.writeString(this.f11586j);
        parcel.writeString(this.f11587k.name());
        parcel.writeLong(this.f11588l.getTime());
        parcel.writeString(this.f11589m);
        parcel.writeString(this.f11590n);
        parcel.writeLong(this.f11591o.getTime());
        parcel.writeString(this.f11592p);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C6359c cVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C6481y.m13557a(str, "accessToken");
        C6481y.m13557a(str2, "applicationId");
        C6481y.m13557a(str3, AndroidAccountManagerPersistence.ACCOUNT_ID);
        this.f11582f = date == null ? f11579r : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.f11583g = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.f11584h = Collections.unmodifiableSet(hashSet2);
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        this.f11585i = Collections.unmodifiableSet(hashSet3);
        this.f11586j = str;
        this.f11587k = cVar == null ? f11581t : cVar;
        this.f11588l = date2 == null ? f11580s : date2;
        this.f11589m = str2;
        this.f11590n = str3;
        this.f11591o = (date3 == null || date3.getTime() == 0) ? f11579r : date3;
        this.f11592p = str4;
    }

    /* renamed from: a */
    static AccessToken m13030a(AccessToken accessToken) {
        return new AccessToken(accessToken.f11586j, accessToken.f11589m, accessToken.mo20789n(), accessToken.mo20785h(), accessToken.mo20778c(), accessToken.mo20779d(), accessToken.f11587k, new Date(), new Date(), accessToken.f11591o);
    }

    /* renamed from: b */
    public Date mo20777b() {
        return this.f11591o;
    }

    /* renamed from: a */
    static AccessToken m13029a(Bundle bundle) {
        List<String> a = m13032a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List<String> a2 = m13032a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List<String> a3 = m13032a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String a4 = C6493k.m13602a(bundle);
        if (C6476x.m13533d(a4)) {
            a4 = C4716f.m7697f();
        }
        String str = a4;
        String c = C6493k.m13606c(bundle);
        try {
            return new AccessToken(c, str, C6476x.m13523b(c).getString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID), a, a2, a3, C6493k.m13605b(bundle), C6493k.m13603a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C6493k.m13603a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), (Date) null);
        } catch (JSONException unused) {
            return null;
        }
    }

    AccessToken(Parcel parcel) {
        this.f11582f = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f11583g = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f11584h = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f11585i = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f11586j = parcel.readString();
        this.f11587k = C6359c.valueOf(parcel.readString());
        this.f11588l = new Date(parcel.readLong());
        this.f11589m = parcel.readString();
        this.f11590n = parcel.readString();
        this.f11591o = new Date(parcel.readLong());
        this.f11592p = parcel.readString();
    }

    /* renamed from: a */
    static List<String> m13032a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: a */
    static AccessToken m13031a(JSONObject jSONObject) throws JSONException {
        Collection collection;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            C6359c valueOf = C6359c.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString(TimeLineFollowFragment.BundleKeys.USER_ID);
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            String optString = jSONObject.optString("graph_domain", (String) null);
            List<String> b = C6476x.m13522b(jSONArray);
            List<String> b2 = C6476x.m13522b(jSONArray2);
            if (optJSONArray == null) {
                collection = new ArrayList();
            } else {
                collection = C6476x.m13522b(optJSONArray);
            }
            return new AccessToken(string, string2, string3, b, b2, collection, valueOf, date, date2, date3, optString);
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    /* renamed from: a */
    private void m13033a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f11583g == null) {
            sb.append("null");
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f11583g));
        sb.append("]");
    }
}
