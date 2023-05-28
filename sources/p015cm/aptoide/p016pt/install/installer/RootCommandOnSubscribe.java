package p015cm.aptoide.p016pt.install.installer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.install.RootCommandTimeoutException;
import p015cm.aptoide.p016pt.install.exception.InstallationException;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.root.RootShell;
import p015cm.aptoide.p016pt.root.exceptions.RootDeniedException;
import p015cm.aptoide.p016pt.root.execution.Command;
import p015cm.aptoide.p016pt.root.execution.Shell;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p128t.C12889e;

/* renamed from: cm.aptoide.pt.install.installer.RootCommandOnSubscribe */
public class RootCommandOnSubscribe implements C5368e.C5370a<Void> {
    public static final String SUCCESS_OUTPUT_CONFIRMATION = "success";
    /* access modifiers changed from: private */
    public static final String TAG = "RootCommandOnSubscribe";
    public static final String TIMEOUT_EXCEPTION = "Timeout Exception";
    /* access modifiers changed from: private */
    public InstallerAnalytics analytics;
    private String command;
    /* access modifiers changed from: private */
    public final int installId;
    /* access modifiers changed from: private */
    public boolean success = false;

    public RootCommandOnSubscribe(int i, String str, InstallerAnalytics installerAnalytics) {
        this.installId = i;
        this.command = str;
        this.analytics = installerAnalytics;
    }

    /* renamed from: a */
    static /* synthetic */ void m6498a(Shell shell) {
        try {
            shell.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void call(final C12475j<? super Void> jVar) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "call: start with installation id: " + this.installId);
        try {
            Shell shell = RootShell.getShell(true);
            if (!RootShell.isRootAvailable()) {
                jVar.onError(new InstallationException("No root permissions"));
                Logger.getInstance().mo12975d(TAG, "call: root not available");
                return;
            }
            this.analytics.rootInstallStart();
            C32921 r2 = new Command(this.installId, new String[]{this.command}) {
                public void commandCompleted(int i, int i2) {
                    Logger instance = Logger.getInstance();
                    String access$000 = RootCommandOnSubscribe.TAG;
                    instance.mo12975d(access$000, "commandCompleted: " + i2);
                    if (!jVar.isUnsubscribed() && RootCommandOnSubscribe.this.installId == i) {
                        if (RootCommandOnSubscribe.this.success || i2 == 0) {
                            jVar.onCompleted();
                            RootCommandOnSubscribe.this.analytics.rootInstallCompleted(i2);
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("success message wasn't received. Exit code: " + i2);
                            RootCommandOnSubscribe.this.analytics.rootInstallFail(illegalStateException);
                            jVar.onError(illegalStateException);
                        }
                    }
                    super.commandCompleted(i, i2);
                }

                public void commandOutput(int i, String str) {
                    Logger instance = Logger.getInstance();
                    String access$000 = RootCommandOnSubscribe.TAG;
                    instance.mo12975d(access$000, "commandOutput: " + str);
                    if (i == RootCommandOnSubscribe.this.installId && str.toLowerCase().equals(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                        boolean unused = RootCommandOnSubscribe.this.success = true;
                    }
                    super.commandOutput(i, str);
                }

                public void commandTerminated(int i, String str) {
                    Logger instance = Logger.getInstance();
                    String access$000 = RootCommandOnSubscribe.TAG;
                    instance.mo12975d(access$000, "commandTerminated: " + str);
                    super.commandTerminated(i, str);
                    if (RootCommandOnSubscribe.this.installId != i) {
                        return;
                    }
                    if (str.equals(RootCommandOnSubscribe.TIMEOUT_EXCEPTION)) {
                        RootCommandOnSubscribe.this.analytics.rootInstallTimeout();
                        jVar.onError(new RootCommandTimeoutException());
                    } else if (!jVar.isUnsubscribed()) {
                        IllegalStateException illegalStateException = new IllegalStateException(str);
                        RootCommandOnSubscribe.this.analytics.rootInstallFail(illegalStateException);
                        jVar.onError(illegalStateException);
                    }
                }
            };
            jVar.add(C12889e.m41501a(new C3319m0(shell)));
            shell.add(r2);
        } catch (RootDeniedException | IOException | TimeoutException e) {
            if (e instanceof RootDeniedException) {
                this.analytics.rootInstallCancelled();
                jVar.onError(new InstallationException("User didn't accept root permissions"));
            } else if (e instanceof TimeoutException) {
                jVar.onError(new RootCommandTimeoutException());
                this.analytics.rootInstallTimeout();
                Logger.getInstance().mo12975d(TAG, "call: timeout reached");
            } else {
                this.analytics.rootInstallFail(e);
                jVar.onError(e);
            }
        }
    }
}
