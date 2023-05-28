package p015cm.aptoide.p016pt.packageinstaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cm.aptoide.pt.packageinstaller.AppInstall */
public class AppInstall {
    private File baseApk;
    private String packageName;
    private List<File> splitApks;

    /* renamed from: cm.aptoide.pt.packageinstaller.AppInstall$InstallBuilder */
    public static final class InstallBuilder {
        /* access modifiers changed from: private */
        public File baseApk;
        /* access modifiers changed from: private */
        public String packageName;
        /* access modifiers changed from: private */
        public List<File> splitApks;

        public InstallBuilder addApkSplit(File file) {
            this.splitApks.add(file);
            return this;
        }

        public AppInstall build() {
            if (this.packageName == null) {
                throw new IllegalArgumentException("AppInstall needs to specify a package name");
            } else if (this.baseApk != null) {
                return new AppInstall(this);
            } else {
                throw new IllegalArgumentException("AppInstall needs a base apk to install");
            }
        }

        public InstallBuilder setBaseApk(File file) {
            this.baseApk = file;
            return this;
        }

        public InstallBuilder setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        private InstallBuilder() {
            this.splitApks = new ArrayList();
        }
    }

    public static InstallBuilder builder() {
        return new InstallBuilder();
    }

    public File getBaseApk() {
        return this.baseApk;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<File> getSplitApks() {
        return this.splitApks;
    }

    private AppInstall(InstallBuilder installBuilder) {
        this.packageName = installBuilder.packageName;
        this.baseApk = installBuilder.baseApk;
        this.splitApks = installBuilder.splitApks;
    }
}
