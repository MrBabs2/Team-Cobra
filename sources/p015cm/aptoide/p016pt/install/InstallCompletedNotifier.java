package p015cm.aptoide.p016pt.install;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p112n.p118g.p119b.C5305c;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.install.InstallCompletedNotifier */
public class InstallCompletedNotifier {
    private final List<App> appToCheck = new ArrayList();
    private final CrashReport crashReport;
    private final InstallManager installManager;
    private final C5305c<Void> watcher;

    /* renamed from: cm.aptoide.pt.install.InstallCompletedNotifier$App */
    private class App {
        private String md5;
        private String packageName;
        private int versionCode;

        public App(String str, int i, String str2) {
            this.packageName = str;
            this.versionCode = i;
            this.md5 = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || App.class != obj.getClass()) {
                return false;
            }
            App app = (App) obj;
            if (this.versionCode == app.versionCode && this.packageName.equals(app.packageName)) {
                return this.md5.equals(app.md5);
            }
            return false;
        }

        public int hashCode() {
            return (((this.packageName.hashCode() * 31) + this.versionCode) * 31) + this.md5.hashCode();
        }
    }

    public InstallCompletedNotifier(C5305c<Void> cVar, InstallManager installManager2, CrashReport crashReport2) {
        this.crashReport = crashReport2;
        this.watcher = cVar;
        this.installManager = installManager2;
    }

    private void installFinished(App app) {
        this.appToCheck.remove(app);
        if (this.appToCheck.isEmpty()) {
            this.watcher.call(null);
        }
    }

    public void add(String str, int i, String str2) {
        App app = new App(str, i, str2);
        if (!this.appToCheck.contains(app)) {
            this.appToCheck.add(app);
            this.installManager.getInstall(str2, str, i).mo18681d(C3407x.f6373f).mo18669c().mo18655a(new C3403w(this, app), (C5378b<Throwable>) new C3396v(this));
        }
    }

    public C5305c<Void> getWatcher() {
        return this.watcher;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12721a(App app, Install install) {
        installFinished(app);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12722a(Throwable th) {
        this.crashReport.log(th);
    }
}
