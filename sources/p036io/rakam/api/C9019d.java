package p036io.rakam.api;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: io.rakam.api.d */
/* compiled from: DeviceInfo */
public class C9019d {

    /* renamed from: a */
    private boolean f25524a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f25525b;

    /* renamed from: c */
    private C9021b f25526c;

    /* renamed from: io.rakam.api.d$b */
    /* compiled from: DeviceInfo */
    private class C9021b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f25527a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f25528b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f25529c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f25530d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f25531e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f25532f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f25533g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f25534h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f25535i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f25536j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f25537k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f25538l;

        /* renamed from: m */
        private String m29656m() {
            return Build.MODEL;
        }

        /* renamed from: n */
        private String m29657n() {
            return "android";
        }

        /* renamed from: o */
        private String m29658o() {
            return Build.VERSION.RELEASE;
        }

        /* renamed from: p */
        private String m29659p() {
            try {
                return C9019d.this.f25525b.getPackageManager().getPackageInfo(C9019d.this.f25525b.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                C9022e.m29662c().mo33355a("Failed to get version name", e);
                return null;
            }
        }

        private C9021b() {
            this.f25527a = m29634b();
            this.f25529c = m29659p();
            this.f25530d = m29657n();
            this.f25531e = m29658o();
            this.f25532f = m29640e();
            this.f25533g = m29654l();
            this.f25534h = m29656m();
            this.f25535i = m29642f();
            this.f25528b = m29644g();
            this.f25536j = m29652k();
            this.f25538l = m29633a();
        }

        /* renamed from: a */
        private boolean m29633a() {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke((Object) null, new Object[]{C9019d.this.f25525b});
                if (num == null || num.intValue() != 0) {
                    return false;
                }
                return true;
            } catch (NoClassDefFoundError e) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services Util not found!");
                C9022e.m29662c().mo33355a("Failed to check GPS enabled", e);
                return false;
            } catch (ClassNotFoundException e2) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services Util not found!");
                C9022e.m29662c().mo33355a("Failed to check GPS enabled", e2);
                return false;
            } catch (NoSuchMethodException e3) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9022e.m29662c().mo33355a("Failed to check GPS enabled", e3);
                return false;
            } catch (InvocationTargetException e4) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9022e.m29662c().mo33355a("Failed to check GPS enabled", e4);
                return false;
            } catch (IllegalAccessException e5) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9022e.m29662c().mo33355a("Failed to check GPS enabled", e5);
                return false;
            } catch (Exception e6) {
                C9026i a = C9026i.m29670a();
                a.mo33375d("io.rakam.api.DeviceInfo", "Error when checking for Google Play Services: " + e6);
                C9022e.m29662c().mo33355a("Failed to check GPS enabled", e6);
                return false;
            }
        }

        /* renamed from: b */
        private String m29634b() {
            if ("Amazon".equals(m29654l())) {
                return m29636c();
            }
            return m29638d();
        }

        /* renamed from: c */
        private String m29636c() {
            ContentResolver contentResolver = C9019d.this.f25525b.getContentResolver();
            boolean z = false;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1) {
                z = true;
            }
            this.f25537k = z;
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            this.f25527a = string;
            return string;
        }

        /* renamed from: d */
        private String m29638d() {
            try {
                boolean z = true;
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{C9019d.this.f25525b});
                Boolean bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f25537k = z;
                this.f25527a = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException e) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services SDK not found!");
                C9022e.m29662c().mo33355a("Failed to get ADID", e);
            } catch (InvocationTargetException e2) {
                C9026i.m29670a().mo33375d("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9022e.m29662c().mo33355a("Failed to get ADID", e2);
            } catch (Exception e3) {
                C9026i.m29670a().mo33370a("io.rakam.api.DeviceInfo", "Encountered an error connecting to Google Play Services", e3);
                C9022e.m29662c().mo33355a("Failed to get ADID", e3);
            }
            return this.f25527a;
        }

        /* renamed from: e */
        private String m29640e() {
            return Build.BRAND;
        }

        /* renamed from: f */
        private String m29642f() {
            try {
                return ((TelephonyManager) C9019d.this.f25525b.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception e) {
                C9022e.m29662c().mo33355a("Failed to get carrier", e);
                return null;
            }
        }

        /* renamed from: g */
        private String m29644g() {
            String i = m29648i();
            if (!C9028k.m29695a(i)) {
                return i;
            }
            String j = m29650j();
            if (!C9028k.m29695a(j)) {
                return j;
            }
            return m29646h();
        }

        /* renamed from: h */
        private String m29646h() {
            return Locale.getDefault().getCountry();
        }

        /* renamed from: i */
        private String m29648i() {
            Location i;
            List<Address> fromLocation;
            if (C9019d.this.mo33351o() && (i = C9019d.this.mo33345i()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = C9019d.this.mo33341e().getFromLocation(i.getLatitude(), i.getLongitude(), 1)) != null) {
                        for (Address next : fromLocation) {
                            if (next != null) {
                                return next.getCountryCode();
                            }
                        }
                    }
                } catch (IOException e) {
                    C9022e.m29662c().mo33355a("Failed to get country from location", e);
                } catch (NullPointerException e2) {
                    C9022e.m29662c().mo33355a("Failed to get country from location", e2);
                } catch (NoSuchMethodError e3) {
                    C9022e.m29662c().mo33355a("Failed to get country from location", e3);
                } catch (IllegalArgumentException e4) {
                    C9022e.m29662c().mo33355a("Failed to get country from location", e4);
                } catch (IllegalStateException e5) {
                    C9022e.m29662c().mo33355a("Failed to get country from location", e5);
                }
            }
            return null;
        }

        /* renamed from: j */
        private String m29650j() {
            String networkCountryIso;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C9019d.this.f25525b.getSystemService("phone");
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                return networkCountryIso.toUpperCase(Locale.US);
            } catch (Exception e) {
                C9022e.m29662c().mo33355a("Failed to get country from network", e);
                return null;
            }
        }

        /* renamed from: k */
        private String m29652k() {
            return Locale.getDefault().getLanguage();
        }

        /* renamed from: l */
        private String m29654l() {
            return Build.MANUFACTURER;
        }
    }

    public C9019d(Context context) {
        this.f25525b = context;
    }

    /* renamed from: q */
    public static String m29614q() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: r */
    private C9021b m29615r() {
        if (this.f25526c == null) {
            this.f25526c = new C9021b();
        }
        return this.f25526c;
    }

    /* renamed from: b */
    public String mo33338b() {
        return m29615r().f25532f;
    }

    /* renamed from: c */
    public String mo33339c() {
        return m29615r().f25535i;
    }

    /* renamed from: d */
    public String mo33340d() {
        return m29615r().f25528b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Geocoder mo33341e() {
        return new Geocoder(this.f25525b, Locale.ENGLISH);
    }

    /* renamed from: f */
    public String mo33342f() {
        return m29615r().f25536j;
    }

    /* renamed from: g */
    public String mo33343g() {
        return m29615r().f25533g;
    }

    /* renamed from: h */
    public String mo33344h() {
        return m29615r().f25534h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0032 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location mo33345i() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r8.mo33351o()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            android.content.Context r1 = r8.f25525b
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch:{ SecurityException -> 0x001d }
            goto L_0x0026
        L_0x001d:
            r3 = move-exception
            io.rakam.api.e r4 = p036io.rakam.api.C9022e.m29662c()
            r4.mo33355a(r0, r3)
            r3 = r2
        L_0x0026:
            if (r3 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch:{ IllegalArgumentException -> 0x004c, SecurityException -> 0x0043 }
            goto L_0x0055
        L_0x0043:
            r5 = move-exception
            io.rakam.api.e r6 = p036io.rakam.api.C9022e.m29662c()
            r6.mo33355a(r0, r5)
            goto L_0x0054
        L_0x004c:
            r5 = move-exception
            io.rakam.api.e r6 = p036io.rakam.api.C9022e.m29662c()
            r6.mo33355a(r0, r5)
        L_0x0054:
            r5 = r2
        L_0x0055:
            if (r5 == 0) goto L_0x0032
            r4.add(r5)
            goto L_0x0032
        L_0x005b:
            r0 = -1
            java.util.Iterator r3 = r4.iterator()
        L_0x0061:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007b
            java.lang.Object r4 = r3.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0061
            long r0 = r4.getTime()
            r2 = r4
            goto L_0x0061
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C9019d.mo33345i():android.location.Location");
    }

    /* renamed from: j */
    public String mo33346j() {
        return m29615r().f25530d;
    }

    /* renamed from: k */
    public String mo33347k() {
        return m29615r().f25531e;
    }

    /* renamed from: l */
    public String mo33348l() {
        return m29615r().f25529c;
    }

    /* renamed from: m */
    public boolean mo33349m() {
        return m29615r().f25538l;
    }

    /* renamed from: n */
    public boolean mo33350n() {
        return m29615r().f25537k;
    }

    /* renamed from: o */
    public boolean mo33351o() {
        return this.f25524a;
    }

    /* renamed from: p */
    public void mo33352p() {
        m29615r();
    }

    /* renamed from: a */
    public String mo33337a() {
        return m29615r().f25527a;
    }
}
