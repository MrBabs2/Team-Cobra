package p112n.p312h.p313a.p318f0;

/* renamed from: n.h.a.f0.a */
/* compiled from: DownloadServiceNotConnectedHelper */
public class C10760a {
    /* renamed from: a */
    public static boolean m36474a(String str, String str2, boolean z) {
        m36472a("request start the task([%s], [%s], [%B]) in the download service", str, str2, Boolean.valueOf(z));
        return false;
    }

    /* renamed from: b */
    public static byte m36475b(int i) {
        m36472a("request get the status for the task[%d] in the download service", Integer.valueOf(i));
        return 0;
    }

    /* renamed from: c */
    public static boolean m36476c(int i) {
        m36472a("request pause the task[%d] in the download service", Integer.valueOf(i));
        return false;
    }

    /* renamed from: a */
    public static boolean m36473a(int i) {
        m36472a("request clear the task[%d] data in the database", Integer.valueOf(i));
        return false;
    }

    /* renamed from: a */
    private static void m36472a(String str, Object... objArr) {
        C10767d.m36495e(C10760a.class, str + ", but the download service isn't connected yet." + "\nYou can use FileDownloader#isServiceConnected() to check whether the service has been connected, \nbesides you can use following functions easier to control your code invoke after the service has been connected: \n1. FileDownloader#bindService(Runnable)\n2. FileDownloader#insureServiceBind()\n3. FileDownloader#insureServiceBindAsync()", objArr);
    }
}
