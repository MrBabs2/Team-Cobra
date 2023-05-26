package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@SafeParcelable.Class
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting

    /* renamed from: s */
    private static Clock f13524s = DefaultClock.m16265d();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13525f;
    @SafeParcelable.Field

    /* renamed from: g */
    private String f13526g;
    @SafeParcelable.Field

    /* renamed from: h */
    private String f13527h;
    @SafeParcelable.Field

    /* renamed from: i */
    private String f13528i;
    @SafeParcelable.Field

    /* renamed from: j */
    private String f13529j;
    @SafeParcelable.Field

    /* renamed from: k */
    private Uri f13530k;
    @SafeParcelable.Field

    /* renamed from: l */
    private String f13531l;
    @SafeParcelable.Field

    /* renamed from: m */
    private long f13532m;
    @SafeParcelable.Field

    /* renamed from: n */
    private String f13533n;
    @SafeParcelable.Field

    /* renamed from: o */
    private List<Scope> f13534o;
    @SafeParcelable.Field

    /* renamed from: p */
    private String f13535p;
    @SafeParcelable.Field

    /* renamed from: q */
    private String f13536q;

    /* renamed from: r */
    private Set<Scope> f13537r = new HashSet();

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List<Scope> list, @SafeParcelable.Param(id = 11) String str7, @SafeParcelable.Param(id = 12) String str8) {
        this.f13525f = i;
        this.f13526g = str;
        this.f13527h = str2;
        this.f13528i = str3;
        this.f13529j = str4;
        this.f13530k = uri;
        this.f13531l = str5;
        this.f13532m = j;
        this.f13533n = str6;
        this.f13534o = list;
        this.f13535p = str7;
        this.f13536q = str8;
    }

    /* renamed from: A */
    private final JSONObject m15124A() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo24742t() != null) {
                jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, mo24742t());
            }
            if (mo24743u() != null) {
                jSONObject.put("tokenId", mo24743u());
            }
            if (mo24739o() != null) {
                jSONObject.put("email", mo24739o());
            }
            if (mo24735d() != null) {
                jSONObject.put("displayName", mo24735d());
            }
            if (mo24741q() != null) {
                jSONObject.put("givenName", mo24741q());
            }
            if (mo24740p() != null) {
                jSONObject.put("familyName", mo24740p());
            }
            if (mo24744v() != null) {
                jSONObject.put("photoUrl", mo24744v().toString());
            }
            if (mo24747x() != null) {
                jSONObject.put("serverAuthCode", mo24747x());
            }
            jSONObject.put("expirationTime", this.f13532m);
            jSONObject.put("obfuscatedIdentifier", this.f13533n);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f13534o.toArray(new Scope[this.f13534o.size()]);
            Arrays.sort(scopeArr, C7144a.f13572f);
            for (Scope d : scopeArr) {
                jSONArray.put(d.mo24975d());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static GoogleSignInAccount m15126a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m15127a(jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f13531l = jSONObject.optString("serverAuthCode", (String) null);
        return a;
    }

    /* renamed from: d */
    public String mo24735d() {
        return this.f13529j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f13533n.equals(this.f13533n) && googleSignInAccount.mo24745w().equals(mo24745w());
    }

    public Account getAccount() {
        if (this.f13528i == null) {
            return null;
        }
        return new Account(this.f13528i, "com.google");
    }

    public int hashCode() {
        return ((this.f13533n.hashCode() + 527) * 31) + mo24745w().hashCode();
    }

    /* renamed from: o */
    public String mo24739o() {
        return this.f13528i;
    }

    /* renamed from: p */
    public String mo24740p() {
        return this.f13536q;
    }

    /* renamed from: q */
    public String mo24741q() {
        return this.f13535p;
    }

    /* renamed from: t */
    public String mo24742t() {
        return this.f13526g;
    }

    /* renamed from: u */
    public String mo24743u() {
        return this.f13527h;
    }

    /* renamed from: v */
    public Uri mo24744v() {
        return this.f13530k;
    }

    @KeepForSdk
    /* renamed from: w */
    public Set<Scope> mo24745w() {
        HashSet hashSet = new HashSet(this.f13534o);
        hashSet.addAll(this.f13537r);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13525f);
        SafeParcelWriter.m16143a(parcel, 2, mo24742t(), false);
        SafeParcelWriter.m16143a(parcel, 3, mo24743u(), false);
        SafeParcelWriter.m16143a(parcel, 4, mo24739o(), false);
        SafeParcelWriter.m16143a(parcel, 5, mo24735d(), false);
        SafeParcelWriter.m16140a(parcel, 6, (Parcelable) mo24744v(), i, false);
        SafeParcelWriter.m16143a(parcel, 7, mo24747x(), false);
        SafeParcelWriter.m16136a(parcel, 8, this.f13532m);
        SafeParcelWriter.m16143a(parcel, 9, this.f13533n, false);
        SafeParcelWriter.m16155c(parcel, 10, this.f13534o, false);
        SafeParcelWriter.m16143a(parcel, 11, mo24741q(), false);
        SafeParcelWriter.m16143a(parcel, 12, mo24740p(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: x */
    public String mo24747x() {
        return this.f13531l;
    }

    /* renamed from: y */
    public final String mo24748y() {
        return this.f13533n;
    }

    /* renamed from: z */
    public final String mo24749z() {
        JSONObject A = m15124A();
        A.remove("serverAuthCode");
        return A.toString();
    }

    /* renamed from: a */
    private static GoogleSignInAccount m15127a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f13524s.mo25498b() / 1000) : l).longValue();
        Preconditions.m16046b(str7);
        Preconditions.m16037a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }
}
