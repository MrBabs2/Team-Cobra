package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C7112b;
import com.google.ads.mediation.C7121e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p112n.p277e.p278a.C10569c;

@zzard
public final class zzant<NETWORK_EXTRAS extends C7121e, SERVER_PARAMETERS extends MediationServerParameters> extends zzamt {

    /* renamed from: f */
    private final C7112b<NETWORK_EXTRAS, SERVER_PARAMETERS> f18238f;

    /* renamed from: g */
    private final NETWORK_EXTRAS f18239g;

    public zzant(C7112b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f18238f = bVar;
        this.f18239g = network_extras;
    }

    /* renamed from: c */
    private static boolean m19696c(zzxz zzxz) {
        if (zzxz.f22986k) {
            return true;
        }
        zzyt.m25666a();
        return zzazt.m20474a();
    }

    /* renamed from: t */
    private final SERVER_PARAMETERS m19697t(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f18238f.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.mo23786a(hashMap);
        return server_parameters;
    }

    /* renamed from: B0 */
    public final Bundle mo27402B0() {
        return new Bundle();
    }

    /* renamed from: Q */
    public final IObjectWrapper mo27403Q() throws RemoteException {
        C7112b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f18238f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.m20523d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.m16391a(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: U */
    public final zzang mo27404U() {
        return null;
    }

    /* renamed from: a */
    public final void mo27405a(IObjectWrapper iObjectWrapper, zzaiq zzaiq, List<zzaiw> list) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27406a(IObjectWrapper iObjectWrapper, zzatk zzatk, List<String> list) {
    }

    /* renamed from: a */
    public final void mo27407a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27408a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzatk zzatk, String str2) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27410a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv, zzady zzady, List<String> list) {
    }

    /* renamed from: a */
    public final void mo27411a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        mo27412a(iObjectWrapper, zzyd, zzxz, str, (String) null, zzamv);
    }

    /* renamed from: a */
    public final void mo27413a(zzxz zzxz, String str) {
    }

    /* renamed from: a */
    public final void mo27414a(zzxz zzxz, String str, String str2) {
    }

    /* renamed from: b */
    public final void mo27415b(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        mo27409a(iObjectWrapper, zzxz, str, (String) null, zzamv);
    }

    /* renamed from: c1 */
    public final zzand mo27416c1() {
        return null;
    }

    public final void destroy() throws RemoteException {
        try {
            this.f18238f.destroy();
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: g0 */
    public final zzafe mo27418g0() {
        return null;
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final zzaar getVideoController() {
        return null;
    }

    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: n0 */
    public final boolean mo27422n0() {
        return false;
    }

    /* renamed from: n1 */
    public final zzana mo27423n1() {
        return null;
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void showInterstitial() throws RemoteException {
        C7112b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f18238f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.m20523d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbad.m20516a("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f18238f).showInterstitial();
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    /* renamed from: t */
    public final void mo27429t(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: w */
    public final void mo27430w(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final Bundle zzsh() {
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo27412a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException {
        C10569c cVar;
        C7112b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f18238f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.m20523d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbad.m20516a("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f18238f;
            zzanu zzanu = new zzanu(zzamv);
            Activity activity = (Activity) ObjectWrapper.m16390H(iObjectWrapper);
            MediationServerParameters t = m19697t(str);
            int i = 0;
            C10569c[] cVarArr = {C10569c.f28428b, C10569c.f28429c, C10569c.f28430d, C10569c.f28431e, C10569c.f28432f, C10569c.f28433g};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].mo36115b() == zzyd.f23020j && cVarArr[i].mo36114a() == zzyd.f23017g) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new C10569c(zzb.zza(zzyd.f23020j, zzyd.f23017g, zzyd.f23016f));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanu, activity, t, cVar, zzaog.m19722a(zzxz, m19696c(zzxz)), this.f18239g);
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27409a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException {
        C7112b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f18238f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            zzbad.m20523d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbad.m20516a("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f18238f).requestInterstitialAd(new zzanu(zzamv), (Activity) ObjectWrapper.m16390H(iObjectWrapper), m19697t(str), zzaog.m19722a(zzxz, m19696c(zzxz)), this.f18239g);
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            throw new RemoteException();
        }
    }
}
