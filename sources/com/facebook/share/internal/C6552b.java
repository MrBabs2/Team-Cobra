package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C6492j;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import com.facebook.share.internal.C6550a;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.b */
/* compiled from: ShareInternalUtility */
public final class C6552b {

    /* renamed from: com.facebook.share.internal.b$a */
    /* compiled from: ShareInternalUtility */
    static class C6553a implements C6550a.C6551a {
        C6553a() {
        }

        /* renamed from: a */
        public JSONObject mo21258a(SharePhoto sharePhoto) {
            Uri a = sharePhoto.mo21296a();
            if (C6476x.m13532d(a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", e);
                }
            } else {
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m13891a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return C6550a.m13884a(shareOpenGraphContent.mo21283c(), (C6550a.C6551a) new C6553a());
    }

    /* renamed from: a */
    public static JSONArray m13890a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m13890a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m13892a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m13892a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m13892a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m13890a((JSONArray) obj, true);
                }
                Pair<String, String> a = m13887a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m13887a(String str) {
        String str2;
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, indexOf);
            str = str.substring(i);
        }
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static GraphRequest m13889a(AccessToken accessToken, File file, GraphRequest.C6344f fVar) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, C6492j.POST, fVar);
    }

    /* renamed from: a */
    public static GraphRequest m13888a(AccessToken accessToken, Uri uri, GraphRequest.C6344f fVar) throws FileNotFoundException {
        if (C6476x.m13529c(uri)) {
            return m13889a(accessToken, new File(uri.getPath()), fVar);
        }
        if (C6476x.m13524b(uri)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, C6492j.POST, fVar);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }
}
