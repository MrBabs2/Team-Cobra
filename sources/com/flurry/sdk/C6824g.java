package com.flurry.sdk;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.g */
public final class C6824g {

    /* renamed from: a */
    String f12756a = "";

    /* renamed from: b */
    final Set<String> f12757b;

    /* renamed from: com.flurry.sdk.g$a */
    class C6825a implements FilenameFilter {
        C6825a(C6824g gVar) {
        }

        public final boolean accept(File file, String str) {
            return str.startsWith(".flurryagent.");
        }
    }

    C6824g() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add((Object) null);
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        this.f12757b = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    static void m14527a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File fileStreamPath = C6747b0.m14386a().getFileStreamPath(".flurryb.");
            if (C6749b2.m14390a(fileStreamPath)) {
                DataOutputStream dataOutputStream = null;
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(fileStreamPath));
                    try {
                        dataOutputStream2.writeInt(1);
                        dataOutputStream2.writeUTF(str);
                        C6766c2.m14420a((Closeable) dataOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        try {
                            C6792d1.m14477a(6, "DeviceIdProvider", "Error when saving deviceId", th);
                        } finally {
                            C6766c2.m14420a((Closeable) dataOutputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C6792d1.m14477a(6, "DeviceIdProvider", "Error when saving deviceId", th);
                }
            }
        }
    }

    /* renamed from: b */
    static String m14528b() {
        DataInputStream dataInputStream;
        File fileStreamPath = C6747b0.m14386a().getFileStreamPath(".flurryb.");
        String str = null;
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (1 == dataInputStream.readInt()) {
                    str = dataInputStream.readUTF();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C6792d1.m14477a(6, "DeviceIdProvider", "Error when loading deviceId", th);
                    C6766c2.m14420a((Closeable) dataInputStream);
                    return str;
                } catch (Throwable th2) {
                    C6766c2.m14420a((Closeable) dataInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
            C6792d1.m14477a(6, "DeviceIdProvider", "Error when loading deviceId", th);
            C6766c2.m14420a((Closeable) dataInputStream);
            return str;
        }
        C6766c2.m14420a((Closeable) dataInputStream);
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo23587a() {
        String[] list;
        File fileStreamPath;
        DataInputStream dataInputStream;
        File filesDir = C6747b0.m14386a().getFilesDir();
        String str = null;
        if (filesDir == null || (list = filesDir.list(new C6825a(this))) == null || list.length == 0 || (fileStreamPath = C6747b0.m14386a().getFileStreamPath(list[0])) == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (46586 == dataInputStream.readUnsignedShort() && 2 == dataInputStream.readUnsignedShort()) {
                    dataInputStream.readUTF();
                    str = dataInputStream.readUTF();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C6792d1.m14477a(6, "DeviceIdProvider", "Error when loading deviceId", th);
                    C6766c2.m14420a((Closeable) dataInputStream);
                    return str;
                } catch (Throwable th2) {
                    C6766c2.m14420a((Closeable) dataInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
            C6792d1.m14477a(6, "DeviceIdProvider", "Error when loading deviceId", th);
            C6766c2.m14420a((Closeable) dataInputStream);
            return str;
        }
        C6766c2.m14420a((Closeable) dataInputStream);
        return str;
    }
}
