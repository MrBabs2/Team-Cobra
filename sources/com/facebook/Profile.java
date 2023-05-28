package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new C6350b();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f11662l = Profile.class.getSimpleName();

    /* renamed from: f */
    private final String f11663f;

    /* renamed from: g */
    private final String f11664g;

    /* renamed from: h */
    private final String f11665h;

    /* renamed from: i */
    private final String f11666i;

    /* renamed from: j */
    private final String f11667j;

    /* renamed from: k */
    private final Uri f11668k;

    /* renamed from: com.facebook.Profile$b */
    static class C6350b implements Parcelable.Creator<Profile> {
        C6350b() {
        }

        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, (C6349a) null);
        }

        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    /* synthetic */ Profile(Parcel parcel, C6349a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static void m13150a(Profile profile) {
        C6536n.m13829c().mo21227a(profile);
    }

    /* renamed from: c */
    public static void m13152c() {
        AccessToken r = AccessToken.m13036r();
        if (!AccessToken.m13037s()) {
            m13150a((Profile) null);
        } else {
            C6476x.m13506a(r.mo20788k(), (C6476x.C6479c) new C6349a());
        }
    }

    /* renamed from: d */
    public static Profile m13153d() {
        return C6536n.m13829c().mo21226a();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (!this.f11663f.equals(profile.f11663f) || this.f11664g != null) {
            if (!this.f11664g.equals(profile.f11664g) || this.f11665h != null) {
                if (!this.f11665h.equals(profile.f11665h) || this.f11666i != null) {
                    if (!this.f11666i.equals(profile.f11666i) || this.f11667j != null) {
                        if (!this.f11667j.equals(profile.f11667j) || this.f11668k != null) {
                            return this.f11668k.equals(profile.f11668k);
                        }
                        if (profile.f11668k == null) {
                            return true;
                        }
                    } else if (profile.f11667j == null) {
                        return true;
                    }
                } else if (profile.f11666i == null) {
                    return true;
                }
            } else if (profile.f11665h == null) {
                return true;
            }
        } else if (profile.f11664g == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = 527 + this.f11663f.hashCode();
        String str = this.f11664g;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f11665h;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f11666i;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f11667j;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f11668k;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11663f);
        parcel.writeString(this.f11664g);
        parcel.writeString(this.f11665h);
        parcel.writeString(this.f11666i);
        parcel.writeString(this.f11667j);
        Uri uri = this.f11668k;
        parcel.writeString(uri == null ? null : uri.toString());
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C6481y.m13557a(str, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        this.f11663f = str;
        this.f11664g = str2;
        this.f11665h = str3;
        this.f11666i = str4;
        this.f11667j = str5;
        this.f11668k = uri;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo20866a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, this.f11663f);
            jSONObject.put("first_name", this.f11664g);
            jSONObject.put("middle_name", this.f11665h);
            jSONObject.put("last_name", this.f11666i);
            jSONObject.put("name", this.f11667j);
            if (this.f11668k == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f11668k.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: com.facebook.Profile$a */
    static class C6349a implements C6476x.C6479c {
        C6349a() {
        }

        /* renamed from: a */
        public void mo20872a(JSONObject jSONObject) {
            String optString = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            if (optString != null) {
                String optString2 = jSONObject.optString("link");
                Profile.m13150a(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null));
            }
        }

        /* renamed from: a */
        public void mo20871a(FacebookException facebookException) {
            String b = Profile.f11662l;
            Log.e(b, "Got unexpected exception: " + facebookException);
        }
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f11663f = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, (String) null);
        this.f11664g = jSONObject.optString("first_name", (String) null);
        this.f11665h = jSONObject.optString("middle_name", (String) null);
        this.f11666i = jSONObject.optString("last_name", (String) null);
        this.f11667j = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        this.f11668k = optString != null ? Uri.parse(optString) : uri;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f11663f = parcel.readString();
        this.f11664g = parcel.readString();
        this.f11665h = parcel.readString();
        this.f11666i = parcel.readString();
        this.f11667j = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f11668k = uri;
    }
}
