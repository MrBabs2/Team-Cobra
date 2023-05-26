package p015cm.aptoide.p016pt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cm.aptoide.pt.utils.MultiDexHelper */
public final class MultiDexHelper {
    private static final String EXTRACTED_NAME_EXT = ".classes";
    public static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String PREFS_FILE = "multidex.version";
    private static final String SECONDARY_FOLDER_NAME = ("code_cache" + File.separator + "secondary-dexes");

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        throw new java.io.IOException("Error at loading dex file '" + r1 + "'");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r2 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAllClasses(android.content.Context r6) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r6 = getSourcePaths(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x000d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.String r3 = ".zip"
            boolean r3 = r1.endsWith(r3)     // Catch:{ IOException -> 0x0060 }
            if (r3 == 0) goto L_0x0039
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0060 }
            r3.<init>()     // Catch:{ IOException -> 0x0060 }
            r3.append(r1)     // Catch:{ IOException -> 0x0060 }
            java.lang.String r4 = ".tmp"
            r3.append(r4)     // Catch:{ IOException -> 0x0060 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0060 }
            r4 = 0
            dalvik.system.DexFile r2 = dalvik.system.DexFile.loadDex(r1, r3, r4)     // Catch:{ IOException -> 0x0060 }
            goto L_0x003f
        L_0x0039:
            dalvik.system.DexFile r3 = new dalvik.system.DexFile     // Catch:{ IOException -> 0x0060 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0060 }
            r2 = r3
        L_0x003f:
            java.util.Enumeration r3 = r2.entries()     // Catch:{ IOException -> 0x0060 }
        L_0x0043:
            boolean r4 = r3.hasMoreElements()     // Catch:{ IOException -> 0x0060 }
            if (r4 == 0) goto L_0x0058
            java.util.AbstractMap$SimpleImmutableEntry r4 = new java.util.AbstractMap$SimpleImmutableEntry     // Catch:{ IOException -> 0x0060 }
            java.lang.Object r5 = r3.nextElement()     // Catch:{ IOException -> 0x0060 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0060 }
            r4.<init>(r5, r1)     // Catch:{ IOException -> 0x0060 }
            r0.add(r4)     // Catch:{ IOException -> 0x0060 }
            goto L_0x0043
        L_0x0058:
            if (r2 == 0) goto L_0x000d
            r2.close()
            goto L_0x000d
        L_0x005e:
            r6 = move-exception
            goto L_0x007c
        L_0x0060:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r0.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "Error at loading dex file '"
            r0.append(r3)     // Catch:{ all -> 0x005e }
            r0.append(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "'"
            r0.append(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x005e }
            r6.<init>(r0)     // Catch:{ all -> 0x005e }
            throw r6     // Catch:{ all -> 0x005e }
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            r2.close()
        L_0x0081:
            throw r6
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.utils.MultiDexHelper.getAllClasses(android.content.Context):java.util.List");
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    public static List<String> getSourcePaths(Context context) throws PackageManager.NameNotFoundException, IOException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        File file2 = new File(applicationInfo.dataDir, SECONDARY_FOLDER_NAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + EXTRACTED_NAME_EXT;
        int i = getMultiDexPreferences(context).getInt(KEY_DEX_NUMBER, 1);
        int i2 = 2;
        while (i2 <= i) {
            File file3 = new File(file2, str + i2 + EXTRACTED_SUFFIX);
            if (file3.isFile()) {
                arrayList.add(file3.getAbsolutePath());
                i2++;
            } else {
                throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
            }
        }
        return arrayList;
    }
}
