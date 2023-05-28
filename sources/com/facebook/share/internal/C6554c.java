package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C6476x;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.c */
/* compiled from: WebDialogParameters */
public class C6554c {
    /* renamed from: a */
    public static Bundle m13895a(ShareLinkContent shareLinkContent) {
        Bundle a = m13894a((ShareContent) shareLinkContent);
        C6476x.m13501a(a, "href", shareLinkContent.mo21259a());
        C6476x.m13502a(a, "quote", shareLinkContent.mo21272c());
        return a;
    }

    /* renamed from: a */
    public static Bundle m13896a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m13894a((ShareContent) shareOpenGraphContent);
        C6476x.m13502a(a, "action_type", shareOpenGraphContent.mo21283c().mo21276c());
        try {
            JSONObject a2 = C6552b.m13892a(C6552b.m13891a(shareOpenGraphContent), false);
            if (a2 != null) {
                C6476x.m13502a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    /* renamed from: a */
    public static Bundle m13894a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b = shareContent.mo21260b();
        if (b != null) {
            C6476x.m13502a(bundle, "hashtag", b.mo21263a());
        }
        return bundle;
    }
}
