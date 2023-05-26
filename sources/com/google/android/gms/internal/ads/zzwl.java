package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.internal.p398ws.WebSocketProtocol;

public final class zzwl {

    public static final class zza extends zzdob<zza, C12976zza> implements zzdpm {
        /* access modifiers changed from: private */
        public static final zza zzbxn;
        private static volatile zzdpv<zza> zzdv;

        /* renamed from: com.google.android.gms.internal.ads.zzwl$zza$zza  reason: collision with other inner class name */
        public static final class C12976zza extends zzdob.zza<zza, C12976zza> implements zzdpm {
            private C12976zza() {
                super(zza.zzbxn);
            }

            /* synthetic */ C12976zza(g50 g50) {
                this();
            }
        }

        public enum zzb implements zzdoe {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
            AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
            AD_FAILED_TO_LOAD_TIMEOUT(102),
            AD_FAILED_TO_LOAD_CANCELLED(103),
            AD_FAILED_TO_LOAD_NO_ERROR(104),
            AD_FAILED_TO_LOAD_NOT_FOUND(105),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(WebSocketProtocol.CLOSE_NO_STATUS_CODE),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
            REQUEST_FAILED_TO_RENDER(1007),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002),
            OFFLINE_UPLOAD(10003);
            

            /* renamed from: f */
            private final int f22908f;

            static {
                new h50();
            }

            private zzb(int i) {
                this.f22908f = i;
            }

            /* renamed from: c */
            public final int mo28259c() {
                return this.f22908f;
            }
        }

        static {
            zza zza = new zza();
            zzbxn = zza;
            zzdob.m24005a(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28168a(int i, Object obj, Object obj2) {
            switch (g50.f15278a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C12976zza((g50) null);
                case 3:
                    return zzdob.m24003a((zzdpk) zzbxn, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzbxn;
                case 5:
                    zzdpv<zza> zzdpv = zzdv;
                    if (zzdpv == null) {
                        synchronized (zza.class) {
                            zzdpv = zzdv;
                            if (zzdpv == null) {
                                zzdpv = new zzdob.zzb<>(zzbxn);
                                zzdv = zzdpv;
                            }
                        }
                    }
                    return zzdpv;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
