package com.flurry.sdk;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.flurry.sdk.x6 */
public final class C7084x6 {
    /* renamed from: a */
    public static boolean m15025a(C7073w6 w6Var) {
        return new File(w6Var.f13336a, w6Var.f13337b).delete();
    }

    /* renamed from: b */
    public static boolean m15028b(C7073w6 w6Var, C7073w6 w6Var2) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3 = null;
        try {
            File file = new File(w6Var.f13336a, w6Var.f13337b);
            FileChannel channel = new FileInputStream(new File(w6Var2.f13336a, w6Var2.f13337b)).getChannel();
            try {
                fileChannel3 = new FileOutputStream(file, true).getChannel();
                fileChannel3.transferFrom(channel, fileChannel3.size(), channel.size());
                C6766c2.m14420a((Closeable) channel);
                C6766c2.m14420a((Closeable) fileChannel3);
                return true;
            } catch (Exception unused) {
                FileChannel fileChannel4 = fileChannel3;
                fileChannel3 = channel;
                fileChannel = fileChannel4;
                C6766c2.m14420a((Closeable) fileChannel3);
                C6766c2.m14420a((Closeable) fileChannel);
                return false;
            } catch (Throwable th) {
                th = th;
                FileChannel fileChannel5 = fileChannel3;
                fileChannel3 = channel;
                fileChannel2 = fileChannel5;
                C6766c2.m14420a((Closeable) fileChannel3);
                C6766c2.m14420a((Closeable) fileChannel2);
                throw th;
            }
        } catch (Exception unused2) {
            fileChannel = null;
            C6766c2.m14420a((Closeable) fileChannel3);
            C6766c2.m14420a((Closeable) fileChannel);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileChannel2 = null;
            C6766c2.m14420a((Closeable) fileChannel3);
            C6766c2.m14420a((Closeable) fileChannel2);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m15026a(C7073w6 w6Var, C7073w6 w6Var2) {
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            File file = new File(w6Var.f13336a, w6Var.f13337b);
            File file2 = new File(w6Var2.f13336a, w6Var2.f13337b);
            file2.getParentFile().mkdirs();
            file2.delete();
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel2 = new FileOutputStream(file2).getChannel();
                fileChannel2.transferFrom(channel, 0, channel.size());
                C6766c2.m14420a((Closeable) channel);
                C6766c2.m14420a((Closeable) fileChannel2);
                return true;
            } catch (Exception e) {
                e = e;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                try {
                    C6792d1.m14476a(6, "FileProcessor", "Copy file failed. " + e.getMessage());
                    C6766c2.m14420a((Closeable) fileChannel2);
                    C6766c2.m14420a((Closeable) fileChannel);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C6766c2.m14420a((Closeable) fileChannel2);
                    C6766c2.m14420a((Closeable) fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel4 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel4;
                C6766c2.m14420a((Closeable) fileChannel2);
                C6766c2.m14420a((Closeable) fileChannel);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileChannel = null;
            C6792d1.m14476a(6, "FileProcessor", "Copy file failed. " + e.getMessage());
            C6766c2.m14420a((Closeable) fileChannel2);
            C6766c2.m14420a((Closeable) fileChannel);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
            C6766c2.m14420a((Closeable) fileChannel2);
            C6766c2.m14420a((Closeable) fileChannel);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m15027a(File file, File file2) {
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            file2.getParentFile().mkdirs();
            file2.delete();
            file2.createNewFile();
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel2 = new FileOutputStream(file2).getChannel();
                fileChannel2.transferFrom(channel, 0, channel.size());
                C6766c2.m14420a((Closeable) channel);
                C6766c2.m14420a((Closeable) fileChannel2);
                return true;
            } catch (Exception e) {
                e = e;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                try {
                    C6792d1.m14476a(6, "FileProcessor", "Copy file failed. " + e.getMessage());
                    C6766c2.m14420a((Closeable) fileChannel2);
                    C6766c2.m14420a((Closeable) fileChannel);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C6766c2.m14420a((Closeable) fileChannel2);
                    C6766c2.m14420a((Closeable) fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel4 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel4;
                C6766c2.m14420a((Closeable) fileChannel2);
                C6766c2.m14420a((Closeable) fileChannel);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileChannel = null;
            C6792d1.m14476a(6, "FileProcessor", "Copy file failed. " + e.getMessage());
            C6766c2.m14420a((Closeable) fileChannel2);
            C6766c2.m14420a((Closeable) fileChannel);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
            C6766c2.m14420a((Closeable) fileChannel2);
            C6766c2.m14420a((Closeable) fileChannel);
            throw th;
        }
    }
}
