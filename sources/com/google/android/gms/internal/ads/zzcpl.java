package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcpl extends zzaoz {

    /* renamed from: f */
    private final zzcpk f20738f;

    /* renamed from: g */
    private zzbbr<JSONObject> f20739g;

    /* renamed from: h */
    private final JSONObject f20740h;

    /* renamed from: i */
    private boolean f20741i = false;

    public zzcpl(zzcpk zzcpk, zzbbr<JSONObject> zzbbr) {
        JSONObject jSONObject = new JSONObject();
        this.f20740h = jSONObject;
        this.f20739g = zzbbr;
        this.f20738f = zzcpk;
        try {
            jSONObject.put("adapter_version", zzcpk.f20737c.mo27527a1().toString());
            this.f20740h.put("sdk_version", this.f20738f.f20737c.mo27520O0().toString());
            this.f20740h.put("name", this.f20738f.f20735a);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27532h(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f20741i     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.onFailure(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f20740h     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.zzbbr<org.json.JSONObject> r3 = r2.f20739g     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.f20740h     // Catch:{ all -> 0x0023 }
            r3.mo27904b(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.f20741i = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpl.mo27532h(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onFailure(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f20741i     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f20740h     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.zzbbr<org.json.JSONObject> r3 = r2.f20739g     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f20740h     // Catch:{ all -> 0x001a }
            r3.mo27904b(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f20741i = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpl.onFailure(java.lang.String):void");
    }
}
