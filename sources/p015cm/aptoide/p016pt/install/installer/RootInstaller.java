package p015cm.aptoide.p016pt.install.installer;

import java.io.File;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.install.installer.RootInstaller */
public class RootInstaller implements C5368e.C5370a<Void> {
    private static final String TAG = "RootInstaller";
    private final InstallerAnalytics analytics;
    private Installation installation;
    private final String packageName;
    private Root root = new Root();

    public RootInstaller(String str, InstallerAnalytics installerAnalytics, Installation installation2) {
        this.packageName = str;
        this.analytics = installerAnalytics;
        this.installation = installation2;
    }

    private int getFilesSize(Installation installation2) {
        int i = 0;
        for (RoomFileToDownload next : installation2.getFiles()) {
            i = (int) (((long) i) + new File(next.getPath() + next.getFileName()).length());
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(p123rx.C12475j<? super java.lang.Void> r13) {
        /*
            r12 = this;
            cm.aptoide.pt.logger.Logger r0 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "call: start with installation package name: "
            r1.append(r2)
            cm.aptoide.pt.install.installer.Installation r2 = r12.installation
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RootInstaller"
            r0.mo12975d((java.lang.String) r2, (java.lang.String) r1)
            cm.aptoide.pt.install.InstallerAnalytics r0 = r12.analytics
            r0.rootInstallStart()
            cm.aptoide.pt.install.installer.Root r0 = r12.root
            boolean r0 = r0.isTerminated()
            if (r0 != 0) goto L_0x0035
            cm.aptoide.pt.install.installer.Root r0 = r12.root
            boolean r0 = r0.isAcquired()
            if (r0 != 0) goto L_0x0054
        L_0x0035:
            p015cm.aptoide.p016pt.install.installer.Root.requestRoot()
            cm.aptoide.pt.install.installer.Root r0 = r12.root
            boolean r0 = r0.isAcquired()
            if (r0 != 0) goto L_0x0054
            cm.aptoide.pt.logger.Logger r0 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.String r1 = "root is not available"
            r0.mo12975d((java.lang.String) r2, (java.lang.String) r1)
            cm.aptoide.pt.install.exception.InstallationException r0 = new cm.aptoide.pt.install.exception.InstallationException
            java.lang.String r1 = "No root permissions"
            r0.<init>((java.lang.String) r1)
            r13.onError(r0)
            return
        L_0x0054:
            cm.aptoide.pt.install.installer.Root r0 = r12.root
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "pm install-create -i "
            r3.append(r4)
            java.lang.String r4 = r12.packageName
            r3.append(r4)
            java.lang.String r4 = " --user %s -r -S %d"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "0"
            r7 = 0
            r5[r7] = r6
            cm.aptoide.pt.install.installer.Installation r6 = r12.installation
            int r6 = r12.getFilesSize(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 1
            r5[r8] = r6
            java.lang.String r1 = java.lang.String.format(r1, r3, r5)
            java.lang.String r0 = r0.exec(r1)
            if (r0 == 0) goto L_0x01ac
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0099
            goto L_0x01ac
        L_0x0099:
            java.lang.String r1 = "(\\d+)"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            r0.find()
            java.lang.String r0 = r0.group(r8)
            int r0 = java.lang.Integer.parseInt(r0)
            cm.aptoide.pt.install.installer.Installation r1 = r12.installation
            java.util.List r1 = r1.getFiles()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0148
            java.lang.Object r3 = r1.next()
            cm.aptoide.pt.database.room.RoomFileToDownload r3 = (p015cm.aptoide.p016pt.database.room.RoomFileToDownload) r3
            cm.aptoide.pt.logger.Logger r5 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "started instalation of file: "
            r6.append(r9)
            java.lang.String r9 = r3.getFileName()
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.mo12975d((java.lang.String) r2, (java.lang.String) r6)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.getPath()
            r6.append(r9)
            java.lang.String r3 = r3.getFileName()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.<init>(r3)
            cm.aptoide.pt.install.installer.Root r3 = r12.root
            java.util.Locale r6 = java.util.Locale.getDefault()
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = r5.getAbsolutePath()
            r9[r7] = r10
            long r10 = r5.length()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9[r8] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r9[r4] = r10
            r10 = 3
            java.lang.String r5 = r5.getName()
            r9[r10] = r5
            java.lang.String r5 = "cat \"%s\" | pm install-write -S %d %d \"%s\""
            java.lang.String r5 = java.lang.String.format(r6, r5, r9)
            java.lang.String r3 = r3.exec(r5)
            if (r3 == 0) goto L_0x0134
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00b8
        L_0x0134:
            cm.aptoide.pt.install.exception.InstallationException r0 = new cm.aptoide.pt.install.exception.InstallationException
            cm.aptoide.pt.install.installer.Root r1 = r12.root
            java.lang.String r1 = r1.readError()
            r0.<init>((java.lang.String) r1)
            cm.aptoide.pt.install.InstallerAnalytics r1 = r12.analytics
            r1.rootInstallFail(r0)
            r13.onError(r0)
            return
        L_0x0148:
            cm.aptoide.pt.install.installer.Root r1 = r12.root
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r7] = r0
            java.lang.String r0 = "pm install-commit %d "
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            java.lang.String r0 = r1.exec(r0)
            if (r0 == 0) goto L_0x0198
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0169
            goto L_0x0198
        L_0x0169:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "success"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0184
            boolean r0 = r13.isUnsubscribed()
            if (r0 != 0) goto L_0x0183
            cm.aptoide.pt.install.InstallerAnalytics r0 = r12.analytics
            r0.rootInstallCompleted(r7)
            r13.onCompleted()
        L_0x0183:
            return
        L_0x0184:
            cm.aptoide.pt.install.exception.InstallationException r0 = new cm.aptoide.pt.install.exception.InstallationException
            cm.aptoide.pt.install.installer.Root r1 = r12.root
            java.lang.String r1 = r1.readError()
            r0.<init>((java.lang.String) r1)
            cm.aptoide.pt.install.InstallerAnalytics r1 = r12.analytics
            r1.rootInstallFail(r0)
            r13.onError(r0)
            return
        L_0x0198:
            cm.aptoide.pt.install.exception.InstallationException r0 = new cm.aptoide.pt.install.exception.InstallationException
            cm.aptoide.pt.install.installer.Root r1 = r12.root
            java.lang.String r1 = r1.readError()
            r0.<init>((java.lang.String) r1)
            cm.aptoide.pt.install.InstallerAnalytics r1 = r12.analytics
            r1.rootInstallFail(r0)
            r13.onError(r0)
            return
        L_0x01ac:
            cm.aptoide.pt.install.exception.InstallationException r0 = new cm.aptoide.pt.install.exception.InstallationException
            cm.aptoide.pt.install.installer.Root r1 = r12.root
            java.lang.String r1 = r1.readError()
            r0.<init>((java.lang.String) r1)
            cm.aptoide.pt.install.InstallerAnalytics r1 = r12.analytics
            r1.rootInstallFail(r0)
            r13.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.install.installer.RootInstaller.call(rx.j):void");
    }
}
