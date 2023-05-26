package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zad();
    @VisibleForTesting

    /* renamed from: o */
    public static final Scope f13542o = new Scope("profile");
    @VisibleForTesting

    /* renamed from: p */
    public static final Scope f13543p = new Scope("email");
    @VisibleForTesting

    /* renamed from: q */
    public static final Scope f13544q = new Scope("openid");
    @VisibleForTesting

    /* renamed from: r */
    public static final Scope f13545r = new Scope("https://www.googleapis.com/auth/games_lite");
    @VisibleForTesting

    /* renamed from: s */
    public static final Scope f13546s = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: t */
    public static final GoogleSignInOptions f13547t;

    /* renamed from: u */
    public static final GoogleSignInOptions f13548u;

    /* renamed from: v */
    private static Comparator<Scope> f13549v = new C7145b();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13550f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: g */
    public final ArrayList<Scope> f13551g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: h */
    public Account f13552h;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: i */
    public boolean f13553i;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: j */
    public final boolean f13554j;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: k */
    public final boolean f13555k;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: l */
    public String f13556l;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: m */
    public String f13557m;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: n */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f13558n;

    public static final class Builder {

        /* renamed from: a */
        private Set<Scope> f13559a = new HashSet();

        /* renamed from: b */
        private boolean f13560b;

        /* renamed from: c */
        private boolean f13561c;

        /* renamed from: d */
        private boolean f13562d;

        /* renamed from: e */
        private String f13563e;

        /* renamed from: f */
        private Account f13564f;

        /* renamed from: g */
        private String f13565g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f13566h = new HashMap();

        public Builder() {
        }

        /* renamed from: a */
        public final Builder mo24766a(Scope scope, Scope... scopeArr) {
            this.f13559a.add(scope);
            this.f13559a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: b */
        public final Builder mo24770b() {
            this.f13559a.add(GoogleSignInOptions.f13543p);
            return this;
        }

        /* renamed from: c */
        public final Builder mo24771c() {
            this.f13559a.add(GoogleSignInOptions.f13544q);
            return this;
        }

        /* renamed from: d */
        public final Builder mo24772d() {
            this.f13559a.add(GoogleSignInOptions.f13542o);
            return this;
        }

        /* renamed from: b */
        private final String m15164b(String str) {
            Preconditions.m16046b(str);
            String str2 = this.f13563e;
            Preconditions.m16044a(str2 == null || str2.equals(str), (Object) "two different server client ids provided");
            return str;
        }

        /* renamed from: a */
        public final Builder mo24767a(String str) {
            mo24768a(str, false);
            return this;
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            Preconditions.m16037a(googleSignInOptions);
            this.f13559a = new HashSet(googleSignInOptions.f13551g);
            this.f13560b = googleSignInOptions.f13554j;
            this.f13561c = googleSignInOptions.f13555k;
            this.f13562d = googleSignInOptions.f13553i;
            this.f13563e = googleSignInOptions.f13556l;
            this.f13564f = googleSignInOptions.f13552h;
            this.f13565g = googleSignInOptions.f13557m;
            this.f13566h = GoogleSignInOptions.m15147a((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.f13558n);
        }

        /* renamed from: a */
        public final Builder mo24768a(String str, boolean z) {
            this.f13560b = true;
            m15164b(str);
            this.f13563e = str;
            this.f13561c = z;
            return this;
        }

        /* renamed from: a */
        public final GoogleSignInOptions mo24769a() {
            if (this.f13559a.contains(GoogleSignInOptions.f13546s) && this.f13559a.contains(GoogleSignInOptions.f13545r)) {
                this.f13559a.remove(GoogleSignInOptions.f13545r);
            }
            if (this.f13562d && (this.f13564f == null || !this.f13559a.isEmpty())) {
                mo24771c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f13559a), this.f13564f, this.f13562d, this.f13560b, this.f13561c, this.f13563e, this.f13565g, this.f13566h, (C7145b) null);
        }
    }

    static {
        Builder builder = new Builder();
        builder.mo24771c();
        builder.mo24772d();
        f13547t = builder.mo24769a();
        Builder builder2 = new Builder();
        builder2.mo24766a(f13545r, new Scope[0]);
        f13548u = builder2.mo24769a();
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<Scope> arrayList, @SafeParcelable.Param(id = 3) Account account, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m15147a((List<GoogleSignInOptionsExtensionParcelable>) arrayList2));
    }

    /* renamed from: a */
    public static GoogleSignInOptions m15145a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", (String) null);
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", (String) null), jSONObject.optString("hostedDomain", (String) null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap());
    }

    /* renamed from: w */
    private final JSONObject m15156w() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f13551g, f13549v);
            ArrayList<Scope> arrayList = this.f13551g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.mo24975d());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f13552h != null) {
                jSONObject.put("accountName", this.f13552h.name);
            }
            jSONObject.put("idTokenRequested", this.f13553i);
            jSONObject.put("forceCodeForRefreshToken", this.f13555k);
            jSONObject.put("serverAuthRequested", this.f13554j);
            if (!TextUtils.isEmpty(this.f13556l)) {
                jSONObject.put("serverClientId", this.f13556l);
            }
            if (!TextUtils.isEmpty(this.f13557m)) {
                jSONObject.put("hostedDomain", this.f13557m);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo24755d() {
        return this.f13558n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f13552h.equals(r4.getAccount()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f13556l.equals(r4.mo24760p()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f13558n     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 > 0) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f13558n     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0085
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f13551g     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo24759o()     // Catch:{ ClassCastException -> 0x0085 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f13551g     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo24759o()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0085
        L_0x0035:
            android.accounts.Account r1 = r3.f13552h     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f13552h     // Catch:{ ClassCastException -> 0x0085 }
            android.accounts.Account r2 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.f13556l     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo24760p()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f13556l     // Catch:{ ClassCastException -> 0x0085 }
            java.lang.String r2 = r4.mo24760p()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.f13555k     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo24761q()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f13553i     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo24762t()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f13554j     // Catch:{ ClassCastException -> 0x0085 }
            boolean r4 = r4.mo24763u()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @KeepForSdk
    public Account getAccount() {
        return this.f13552h;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f13551g;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.mo24975d());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.mo24784a((Object) arrayList);
        hashAccumulator.mo24784a((Object) this.f13552h);
        hashAccumulator.mo24784a((Object) this.f13556l);
        hashAccumulator.mo24785a(this.f13555k);
        hashAccumulator.mo24785a(this.f13553i);
        hashAccumulator.mo24785a(this.f13554j);
        return hashAccumulator.mo24783a();
    }

    @KeepForSdk
    /* renamed from: o */
    public ArrayList<Scope> mo24759o() {
        return new ArrayList<>(this.f13551g);
    }

    @KeepForSdk
    /* renamed from: p */
    public String mo24760p() {
        return this.f13556l;
    }

    @KeepForSdk
    /* renamed from: q */
    public boolean mo24761q() {
        return this.f13555k;
    }

    @KeepForSdk
    /* renamed from: t */
    public boolean mo24762t() {
        return this.f13553i;
    }

    @KeepForSdk
    /* renamed from: u */
    public boolean mo24763u() {
        return this.f13554j;
    }

    /* renamed from: v */
    public final String mo24764v() {
        return m15156w().toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13550f);
        SafeParcelWriter.m16155c(parcel, 2, mo24759o(), false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) getAccount(), i, false);
        SafeParcelWriter.m16146a(parcel, 4, mo24762t());
        SafeParcelWriter.m16146a(parcel, 5, mo24763u());
        SafeParcelWriter.m16146a(parcel, 6, mo24761q());
        SafeParcelWriter.m16143a(parcel, 7, mo24760p(), false);
        SafeParcelWriter.m16143a(parcel, 8, this.f13557m, false);
        SafeParcelWriter.m16155c(parcel, 9, mo24755d(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f13550f = i;
        this.f13551g = arrayList;
        this.f13552h = account;
        this.f13553i = z;
        this.f13554j = z2;
        this.f13555k = z3;
        this.f13556l = str;
        this.f13557m = str2;
        this.f13558n = new ArrayList<>(map.values());
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C7145b bVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m15147a(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.mo24781d()), next);
        }
        return hashMap;
    }
}
