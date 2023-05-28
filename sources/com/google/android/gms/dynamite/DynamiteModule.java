package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
public final class DynamiteModule {

    /* renamed from: b */
    private static Boolean f14293b = null;

    /* renamed from: c */
    private static zzi f14294c = null;

    /* renamed from: d */
    private static zzk f14295d = null;

    /* renamed from: e */
    private static String f14296e = null;

    /* renamed from: f */
    private static int f14297f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C7256a> f14298g = new ThreadLocal<>();

    /* renamed from: h */
    private static final VersionPolicy.zza f14299h = new C7258a();
    @KeepForSdk

    /* renamed from: i */
    public static final VersionPolicy f14300i = new C7259b();
    @KeepForSdk

    /* renamed from: j */
    public static final VersionPolicy f14301j = new C7263f();

    /* renamed from: a */
    private final Context f14302a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, C7258a aVar) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C7258a aVar) {
            this(str, th);
        }
    }

    public interface VersionPolicy {

        public interface zza {
            /* renamed from: a */
            int mo25549a(Context context, String str);

            /* renamed from: a */
            int mo25550a(Context context, String str, boolean z) throws LoadingException;
        }

        public static class zzb {

            /* renamed from: a */
            public int f14303a = 0;

            /* renamed from: b */
            public int f14304b = 0;

            /* renamed from: c */
            public int f14305c = 0;
        }

        /* renamed from: a */
        zzb mo25548a(Context context, String str, zza zza2) throws LoadingException;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    private static class C7256a {

        /* renamed from: a */
        public Cursor f14306a;

        private C7256a() {
        }

        /* synthetic */ C7256a(C7258a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    private static class C7257b implements VersionPolicy.zza {

        /* renamed from: a */
        private final int f14307a;

        public C7257b(int i, int i2) {
            this.f14307a = i;
        }

        /* renamed from: a */
        public final int mo25549a(Context context, String str) {
            return this.f14307a;
        }

        /* renamed from: a */
        public final int mo25550a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new C7260c();
        new C7261d();
        new C7262e();
        new C7264g();
    }

    private DynamiteModule(Context context) {
        Preconditions.m16037a(context);
        this.f14302a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static DynamiteModule m16419a(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        VersionPolicy.zzb a;
        C7256a aVar = f14298g.get();
        C7256a aVar2 = new C7256a((C7258a) null);
        f14298g.set(aVar2);
        try {
            a = versionPolicy.mo25548a(context, str, f14299h);
            int i = a.f14303a;
            int i2 = a.f14304b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (a.f14305c == 0 || ((a.f14305c == -1 && a.f14303a == 0) || (a.f14305c == 1 && a.f14304b == 0))) {
                int i3 = a.f14303a;
                int i4 = a.f14304b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (C7258a) null);
            } else if (a.f14305c == -1) {
                DynamiteModule c = m16428c(context, str);
                Cursor cursor = aVar2.f14306a;
                if (cursor != null) {
                    cursor.close();
                }
                f14298g.set(aVar);
                return c;
            } else if (a.f14305c == 1) {
                DynamiteModule a2 = m16420a(context, str, a.f14304b);
                Cursor cursor2 = aVar2.f14306a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f14298g.set(aVar);
                return a2;
            } else {
                int i5 = a.f14305c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new LoadingException(sb3.toString(), (C7258a) null);
            }
        } catch (LoadingException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (a.f14303a == 0 || versionPolicy.mo25548a(context, str, new C7257b(a.f14303a, 0)).f14305c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, (C7258a) null);
            }
            DynamiteModule c2 = m16428c(context, str);
            Cursor cursor3 = aVar2.f14306a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f14298g.set(aVar);
            return c2;
        } catch (Throwable th) {
            Cursor cursor4 = aVar2.f14306a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f14298g.set(aVar);
            throw th;
        }
    }

    /* renamed from: b */
    private static int m16424b(Context context, String str, boolean z) {
        zzi a = m16421a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo25556f1() >= 2) {
                return a.mo25552a(ObjectWrapper.m16391a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo25554b(ObjectWrapper.m16391a(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m16427c(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f14296e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f14297f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$a> r10 = f14298g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r10 = (com.google.android.gms.dynamite.DynamiteModule.C7256a) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.f14306a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.f14306a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.C7258a) r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m16427c(android.content.Context, java.lang.String, boolean):int");
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m16423b(Context context, String str) {
        return m16418a(context, str, false);
    }

    /* renamed from: b */
    private static DynamiteModule m16425b(Context context, String str, int i) throws LoadingException, RemoteException {
        zzk zzk;
        IObjectWrapper iObjectWrapper;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            zzk = f14295d;
        }
        if (zzk != null) {
            C7256a aVar = f14298g.get();
            if (aVar == null || aVar.f14306a == null) {
                throw new LoadingException("No result cursor", (C7258a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = aVar.f14306a;
            ObjectWrapper.m16391a(null);
            if (m16426b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                iObjectWrapper = zzk.mo25558b(ObjectWrapper.m16391a(applicationContext), str, i, ObjectWrapper.m16391a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                iObjectWrapper = zzk.mo25557a(ObjectWrapper.m16391a(applicationContext), str, i, ObjectWrapper.m16391a(cursor));
            }
            Context context2 = (Context) ObjectWrapper.m16390H(iObjectWrapper);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (C7258a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (C7258a) null);
    }

    /* renamed from: c */
    private static DynamiteModule m16428c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m16417a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: b */
    private static Boolean m16426b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f14297f >= 2);
        }
        return valueOf;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: a */
    public static int m16418a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r1 = f14293b     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m16422a((java.lang.ClassLoader) r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m16427c(r8, r9, r10)     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r5 = f14296e     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f14296e     // Catch:{ LoadingException -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r6 = f14296e     // Catch:{ LoadingException -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x007e }
            m16422a((java.lang.ClassLoader) r5)     // Catch:{ LoadingException -> 0x007e }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x007e }
            f14293b = r5     // Catch:{ LoadingException -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00b8
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            goto L_0x0092
        L_0x0091:
            r1 = move-exception
        L_0x0092:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ed }
            int r3 = r3.length()     // Catch:{ all -> 0x00ed }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>(r3)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ed }
            r4.append(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ed }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ed }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ed }
        L_0x00b8:
            f14293b = r1     // Catch:{ all -> 0x00ed }
        L_0x00ba:
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00e8
            int r8 = m16427c(r8, r9, r10)     // Catch:{ LoadingException -> 0x00c6 }
            return r8
        L_0x00c6:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f0 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00f0 }
            int r1 = r9.length()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00f0 }
            goto L_0x00e3
        L_0x00de:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00f0 }
            r9.<init>(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00e3:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00f0 }
            r8 = 0
            return r8
        L_0x00e8:
            int r8 = m16424b((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ all -> 0x00f0 }
            return r8
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            throw r9     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r9 = move-exception
            com.google.android.gms.common.util.CrashUtils.m16263a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m16418a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static DynamiteModule m16420a(Context context, String str, int i) throws LoadingException {
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        try {
            synchronized (DynamiteModule.class) {
                bool = f14293b;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (C7258a) null);
            } else if (bool.booleanValue()) {
                return m16425b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                zzi a = m16421a(context);
                if (a != null) {
                    if (a.mo25556f1() >= 2) {
                        iObjectWrapper = a.mo25555b(ObjectWrapper.m16391a(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        iObjectWrapper = a.mo25553a(ObjectWrapper.m16391a(context), str, i);
                    }
                    if (ObjectWrapper.m16390H(iObjectWrapper) != null) {
                        return new DynamiteModule((Context) ObjectWrapper.m16390H(iObjectWrapper));
                    }
                    throw new LoadingException("Failed to load remote module.", (C7258a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (C7258a) null);
            }
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, (C7258a) null);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Throwable th) {
            CrashUtils.m16263a(context, th);
            throw new LoadingException("Failed to load remote module.", th, (C7258a) null);
        }
    }

    /* renamed from: a */
    private static zzi m16421a(Context context) {
        zzi zzi;
        synchronized (DynamiteModule.class) {
            if (f14294c != null) {
                zzi zzi2 = f14294c;
                return zzi2;
            } else if (GoogleApiAvailabilityLight.m15275a().mo24869c(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzi = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof zzi) {
                            zzi = (zzi) queryLocalInterface;
                        } else {
                            zzi = new zzj(iBinder);
                        }
                    }
                    if (zzi != null) {
                        f14294c = zzi;
                        return zzi;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
            }
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: a */
    public final Context mo25546a() {
        return this.f14302a;
    }

    /* renamed from: a */
    private static void m16422a(ClassLoader classLoader) throws LoadingException {
        zzk zzk;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzk = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzk) {
                    zzk = (zzk) queryLocalInterface;
                } else {
                    zzk = new zzl(iBinder);
                }
            }
            f14295d = zzk;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (C7258a) null);
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public final IBinder mo25547a(String str) throws LoadingException {
        try {
            return (IBinder) this.f14302a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C7258a) null);
        }
    }
}
