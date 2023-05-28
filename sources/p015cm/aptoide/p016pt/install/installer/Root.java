package p015cm.aptoide.p016pt.install.installer;

import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.install.installer.Root */
public class Root {
    private static final String TAG = "Root";
    private BufferedReader mErrorReader;
    private boolean mIsAcquired = true;
    private boolean mIsTerminated;
    private BufferedReader mReader;
    private Process mSuProcess;
    private BufferedWriter mWriter;

    public Root() {
        try {
            this.mSuProcess = Runtime.getRuntime().exec("su");
            this.mWriter = new BufferedWriter(new OutputStreamWriter(this.mSuProcess.getOutputStream()));
            this.mReader = new BufferedReader(new InputStreamReader(this.mSuProcess.getInputStream()));
            this.mErrorReader = new BufferedReader(new InputStreamReader(this.mSuProcess.getErrorStream()));
            exec("echo test");
        } catch (IOException e) {
            this.mIsAcquired = false;
            this.mIsTerminated = true;
            Log.w(TAG, "Unable to acquire root access: ");
            Log.w(TAG, e);
        }
    }

    public static boolean requestRoot() {
        try {
            Process exec = Runtime.getRuntime().exec("su -c exit");
            exec.waitFor();
            if (exec.exitValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.w(TAG, "Unable to acquire root access: ");
            Log.w(TAG, e);
            return false;
        }
    }

    public String exec(String str) {
        int indexOf;
        Logger instance = Logger.getInstance();
        instance.mo12975d(InstallAnalytics.RAKAM_INSTALL_EVENT, "executing command : " + str);
        try {
            StringBuilder sb = new StringBuilder();
            BufferedWriter bufferedWriter = this.mWriter;
            bufferedWriter.write(str + "\necho " + "『BREAKER』" + "\n");
            this.mWriter.flush();
            char[] cArr = new char[256];
            do {
                sb.append(cArr, 0, this.mReader.read(cArr));
                indexOf = sb.indexOf("『BREAKER』");
            } while (indexOf == -1);
            sb.delete(indexOf, indexOf + 9);
            return sb.toString().trim();
        } catch (Exception e) {
            this.mIsAcquired = false;
            this.mIsTerminated = true;
            Log.w(TAG, "Unable execute command: ");
            Log.w(TAG, e);
            return null;
        }
    }

    public boolean isAcquired() {
        return this.mIsAcquired;
    }

    public boolean isTerminated() {
        return this.mIsTerminated;
    }

    public String readError() {
        int indexOf;
        try {
            StringBuilder sb = new StringBuilder();
            BufferedWriter bufferedWriter = this.mWriter;
            bufferedWriter.write("echo " + "『BREAKER』" + " >&2\n");
            this.mWriter.flush();
            char[] cArr = new char[256];
            do {
                sb.append(cArr, 0, this.mErrorReader.read(cArr));
                indexOf = sb.indexOf("『BREAKER』");
            } while (indexOf == -1);
            sb.delete(indexOf, indexOf + 9);
            return sb.toString().trim();
        } catch (Exception e) {
            this.mIsAcquired = false;
            this.mIsTerminated = true;
            Log.w(TAG, "Unable execute command: ");
            Log.w(TAG, e);
            return null;
        }
    }

    public void terminate() {
        if (!this.mIsTerminated) {
            this.mIsTerminated = true;
            this.mSuProcess.destroy();
        }
    }
}
