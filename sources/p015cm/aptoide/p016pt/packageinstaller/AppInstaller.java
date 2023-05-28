package p015cm.aptoide.p016pt.packageinstaller;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2;
import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;

/* renamed from: cm.aptoide.pt.packageinstaller.AppInstaller */
public final class AppInstaller {
    private static final float CLICK_INSTALL_PROGRESS_CALLBACK_VALUE = 0.90000004f;
    static final String INSTALL_SESSION_API_COMPLETE_ACTION = "install_session_api_complete";
    private static final int REQUEST_INSTALL = 22;
    private static final int SESSION_INSTALL_REQUEST_CODE = 18;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final InstallResultCallback installResultCallback;

    public AppInstaller(Context context2, InstallResultCallback installResultCallback2) {
        this.context = context2;
        this.installResultCallback = installResultCallback2;
        if (Build.VERSION.SDK_INT >= 21) {
            registerInstallResultBroadcastReceiver();
            observeInstallSession();
        }
    }

    private void addApkToInstallSession(File file, PackageInstaller.Session session) {
        try {
            OutputStream openWrite = session.openWrite(file.getName(), 0, file.length());
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read >= 0) {
                    openWrite.write(bArr, 0, read);
                } else {
                    session.fsync(openWrite);
                    openWrite.close();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private void installWithActionInstallPackageIntent(File file, String str) {
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.putExtra("android.intent.extra.RETURN_RESULT", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", this.context.getApplicationContext().getPackageName());
        intent.setData(Uri.fromFile(file));
        intent.setFlags(1);
        intent.setFlags(276824064);
        this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.INSTALLING, "Installing...", str));
        this.context.startActivity(intent);
    }

    private void installWithPackageInstaller(AppInstall appInstall) {
        PackageInstaller.Session session = null;
        try {
            PackageInstaller packageInstaller = this.context.getPackageManager().getPackageInstaller();
            PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
            sessionParams.setAppPackageName(appInstall.getPackageName());
            PackageInstaller.Session openSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
            addApkToInstallSession(appInstall.getBaseApk(), openSession);
            if (!appInstall.getSplitApks().isEmpty()) {
                for (File addApkToInstallSession : appInstall.getSplitApks()) {
                    addApkToInstallSession(addApkToInstallSession, openSession);
                }
            }
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.WAITING_INSTALL_FEEDBACK, "Installing...", appInstall.getPackageName()));
            openSession.commit(PendingIntent.getBroadcast(this.context, 18, new Intent(INSTALL_SESSION_API_COMPLETE_ACTION), 0).getIntentSender());
        } catch (IOException e) {
            throw new RuntimeException("Couldn't install package", e);
        } catch (RuntimeException e2) {
            if (session != null) {
                session.abandon();
            }
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.UNKNOWN_ERROR, e2.getMessage(), appInstall.getPackageName()));
        }
    }

    private void observeInstallSession() {
        this.context.getPackageManager().getPackageInstaller().registerSessionCallback(new PackageInstaller.SessionCallback() {
            public void onActiveChanged(int i, boolean z) {
            }

            public void onBadgingChanged(int i) {
            }

            public void onCreated(int i) {
            }

            public void onFinished(int i, boolean z) {
            }

            public void onProgressChanged(int i, float f) {
                if (Float.compare(f, AppInstaller.CLICK_INSTALL_PROGRESS_CALLBACK_VALUE) >= 0) {
                    PackageInstaller.SessionInfo sessionInfo = AppInstaller.this.context.getPackageManager().getPackageInstaller().getSessionInfo(i);
                    if (sessionInfo == null) {
                        AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Context - Activity Not Found", "n/a"));
                        return;
                    }
                    try {
                        AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.INSTALLING, "Installing...", sessionInfo.getAppPackageName()));
                    } catch (ActivityNotFoundException unused) {
                        AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Context - Activity Not Found", "n/a"));
                    }
                }
            }
        });
    }

    private void registerInstallResultBroadcastReceiver() {
        this.context.registerReceiver(new InstallResultReceiver(new PackageInstallerResultCallback() {
            public void onInstallationResult(InstallStatus installStatus) {
                AppInstaller.this.installResultCallback.onInstallationResult(installStatus);
            }

            public void onPendingUserAction(Bundle bundle) {
                Intent intent = (Intent) bundle.get("android.intent.extra.INTENT");
                if (intent != null) {
                    intent.setFlags(276824064);
                }
                try {
                    AppInstaller.this.context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Context - Activity Not Found", "n/a"));
                }
            }
        }), new IntentFilter(INSTALL_SESSION_API_COMPLETE_ACTION), (String) null, (Handler) null);
    }

    public void install(AppInstall appInstall) {
        if (Build.VERSION.SDK_INT >= 21) {
            installWithPackageInstaller(appInstall);
        } else if (!appInstall.getSplitApks().isEmpty()) {
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Can't install split apks in devices bellow api 21", appInstall.getPackageName()));
        } else {
            installWithActionInstallPackageIntent(appInstall.getBaseApk(), appInstall.getPackageName());
        }
    }

    public void onActivityResult(int i, int i2) {
        if (i != 22) {
            return;
        }
        if (i2 == -1) {
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.SUCCESS, "Install succeeded", "n/a"));
        } else if (i2 == 0) {
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.CANCELED, "Install canceled", "n/a"));
        } else {
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Install failed", "n/a"));
        }
    }
}
