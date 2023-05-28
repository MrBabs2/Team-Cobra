package com.liulishuo.filedownloader.model;

import p112n.p312h.p313a.C10722a;

/* renamed from: com.liulishuo.filedownloader.model.b */
/* compiled from: FileDownloadStatus */
public class C8896b {
    /* renamed from: a */
    public static boolean m29174a(int i) {
        return i > 0;
    }

    /* renamed from: a */
    public static boolean m29175a(int i, int i2) {
        if ((i != 3 && i != 5 && i == i2) || m29177b(i)) {
            return false;
        }
        if (i >= 1 && i <= 6 && i2 >= 10 && i2 <= 11) {
            return false;
        }
        if (i == 1) {
            return i2 != 0;
        }
        if (i == 2) {
            return (i2 == 0 || i2 == 1 || i2 == 6) ? false : true;
        }
        if (i == 3) {
            return (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 6) ? false : true;
        }
        if (i == 5) {
            return (i2 == 1 || i2 == 6) ? false : true;
        }
        if (i != 6) {
            return true;
        }
        return (i2 == 0 || i2 == 1) ? false : true;
    }

    /* renamed from: b */
    public static boolean m29177b(int i) {
        return i < 0;
    }

    /* renamed from: b */
    public static boolean m29178b(int i, int i2) {
        if ((i != 3 && i != 5 && i == i2) || m29177b(i)) {
            return false;
        }
        if (i2 == -2 || i2 == -1) {
            return true;
        }
        if (i == 0) {
            return i2 == 10;
        }
        if (i == 1) {
            return i2 == 6;
        }
        if (i == 2 || i == 3) {
            return i2 == -3 || i2 == 3 || i2 == 5;
        }
        if (i == 5 || i == 6) {
            return i2 == 2 || i2 == 5;
        }
        if (i == 10) {
            return i2 == 11;
        }
        if (i != 11) {
            return false;
        }
        return i2 == -4 || i2 == -3 || i2 == 1;
    }

    /* renamed from: a */
    public static boolean m29176a(C10722a aVar) {
        return aVar.getStatus() == 0 || aVar.getStatus() == 3;
    }
}
