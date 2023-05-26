package p050l.p099n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: l.n.a */
/* compiled from: MultiDex */
public final class C5137a {

    /* renamed from: a */
    private static final Set<File> f9081a = new HashSet();

    /* renamed from: b */
    private static final boolean f9082b = m9491a(System.getProperty("java.vm.version"));

    /* renamed from: l.n.a$c */
    /* compiled from: MultiDex */
    private static final class C5144c {
        /* renamed from: a */
        static void m9506a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C5137a.m9493b(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a.set(classLoader, sb.toString());
            C5137a.m9495b((Object) classLoader, "mPaths", (Object[]) strArr);
            C5137a.m9495b((Object) classLoader, "mFiles", (Object[]) fileArr);
            C5137a.m9495b((Object) classLoader, "mZips", (Object[]) zipFileArr);
            C5137a.m9495b((Object) classLoader, "mDexs", (Object[]) dexFileArr);
        }
    }

    /* renamed from: b */
    private static ApplicationInfo m9492b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static void m9496c(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f9082b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo b = m9492b(context);
                if (b == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                m9487a(context, new File(b.sourceDir), new File(b.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Field m9493b(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        android.util.Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00a4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9487a(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9, boolean r10) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f9081a
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = f9081a     // Catch:{ all -> 0x00af }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = f9081a     // Catch:{ all -> 0x00af }
            r1.add(r6)     // Catch:{ all -> 0x00af }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r2 = 20
            if (r1 <= r2) goto L_0x0055
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r3.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "MultiDex is not guaranteed to work in SDK version "
            r3.append(r4)     // Catch:{ all -> 0x00af }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r3.append(r4)     // Catch:{ all -> 0x00af }
            java.lang.String r4 = ": SDK version higher than "
            r3.append(r4)     // Catch:{ all -> 0x00af }
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = " should be backed by "
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "case here: java.vm.version=\""
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x00af }
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00af }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x00af }
        L_0x0055:
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch:{ RuntimeException -> 0x00a5 }
            if (r1 != 0) goto L_0x0064
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Context class loader is null. Must be running in test mode. Skip patching."
            android.util.Log.e(r5, r6)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0064:
            m9486a((android.content.Context) r5)     // Catch:{ all -> 0x0068 }
            goto L_0x0070
        L_0x0068:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x00af }
        L_0x0070:
            java.io.File r7 = m9483a((android.content.Context) r5, (java.io.File) r7, (java.lang.String) r8)     // Catch:{ all -> 0x00af }
            l.n.b r8 = new l.n.b     // Catch:{ all -> 0x00af }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x00af }
            r6 = 0
            r2 = 0
            java.util.List r2 = r8.mo17806a(r5, r9, r2)     // Catch:{ all -> 0x00a0 }
            m9489a((java.lang.ClassLoader) r1, (java.io.File) r7, (java.util.List<? extends java.io.File>) r2)     // Catch:{ IOException -> 0x0083 }
            goto L_0x0095
        L_0x0083:
            r2 = move-exception
            if (r10 == 0) goto L_0x009f
            java.lang.String r10 = "MultiDex"
            java.lang.String r3 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r10, r3, r2)     // Catch:{ all -> 0x00a0 }
            r10 = 1
            java.util.List r5 = r8.mo17806a(r5, r9, r10)     // Catch:{ all -> 0x00a0 }
            m9489a((java.lang.ClassLoader) r1, (java.io.File) r7, (java.util.List<? extends java.io.File>) r5)     // Catch:{ all -> 0x00a0 }
        L_0x0095:
            r8.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009a
        L_0x0099:
            r6 = move-exception
        L_0x009a:
            if (r6 != 0) goto L_0x009e
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x009e:
            throw r6     // Catch:{ all -> 0x00af }
        L_0x009f:
            throw r2     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r5 = move-exception
            r8.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r5     // Catch:{ all -> 0x00af }
        L_0x00a5:
            r5 = move-exception
            java.lang.String r6 = "MultiDex"
            java.lang.String r7 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r6, r7, r5)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00af:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p099n.C5137a.m9487a(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: l.n.a$a */
    /* compiled from: MultiDex */
    private static final class C5138a {

        /* renamed from: b */
        private static final int f9083b = 4;

        /* renamed from: a */
        private final C5139a f9084a;

        /* renamed from: l.n.a$a$a */
        /* compiled from: MultiDex */
        private interface C5139a {
            /* renamed from: a */
            Object mo17805a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: l.n.a$a$b */
        /* compiled from: MultiDex */
        private static class C5140b implements C5139a {

            /* renamed from: a */
            private final Constructor<?> f9085a;

            C5140b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f9085a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo17805a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f9085a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: l.n.a$a$c */
        /* compiled from: MultiDex */
        private static class C5141c implements C5139a {

            /* renamed from: a */
            private final Constructor<?> f9086a;

            C5141c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f9086a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo17805a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f9086a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: l.n.a$a$d */
        /* compiled from: MultiDex */
        private static class C5142d implements C5139a {

            /* renamed from: a */
            private final Constructor<?> f9087a;

            C5142d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f9087a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo17805a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f9087a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C5138a() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                l.n.a$a$b r1 = new l.n.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                l.n.a$a$c r1 = new l.n.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                l.n.a$a$d r1 = new l.n.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f9084a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p099n.C5137a.C5138a.<init>():void");
        }

        /* renamed from: a */
        static void m9498a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C5137a.m9493b(classLoader, "pathList").get(classLoader);
            Object[] a = new C5138a().m9499a(list);
            try {
                C5137a.m9495b(obj, "dexElements", a);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C5137a.m9495b(obj, "pathElements", a);
            }
        }

        /* renamed from: a */
        private Object[] m9499a(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f9084a.mo17805a(file, DexFile.loadDex(file.getPath(), m9497a(file), 0));
            }
            return objArr;
        }

        /* renamed from: a */
        private static String m9497a(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f9083b) + ".dex").getPath();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Method m9494b(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m9495b(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field b = m9493b(obj, str);
        Object[] objArr2 = (Object[]) b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b.set(obj, objArr3);
    }

    /* renamed from: l.n.a$b */
    /* compiled from: MultiDex */
    private static final class C5143b {
        /* renamed from: a */
        static void m9504a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C5137a.m9493b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C5137a.m9495b(obj, "dexElements", m9505a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = C5137a.m9493b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: a */
        private static Object[] m9505a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C5137a.m9494b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: a */
    static boolean m9491a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    /* renamed from: a */
    private static void m9489a(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                C5143b.m9504a(classLoader, list, file);
            } else if (i >= 14) {
                C5138a.m9498a(classLoader, list);
            } else {
                C5144c.m9506a(classLoader, list);
            }
        }
    }

    /* renamed from: a */
    private static void m9486a(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    /* renamed from: a */
    private static File m9483a(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m9488a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m9488a(file2);
        }
        File file3 = new File(file2, str);
        m9488a(file3);
        return file3;
    }

    /* renamed from: a */
    private static void m9488a(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
