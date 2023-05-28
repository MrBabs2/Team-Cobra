package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.app.view.AppCoinsViewModel;

/* renamed from: cm.aptoide.pt.app.AppViewModel */
public class AppViewModel {
    private AppCoinsViewModel appCoinsViewModel;
    private AppModel appModel;
    private DownloadModel downloadModel;
    private MigrationModel migrationModel;

    public AppViewModel(AppModel appModel2, DownloadModel downloadModel2, AppCoinsViewModel appCoinsViewModel2, MigrationModel migrationModel2) {
        this.appModel = appModel2;
        this.downloadModel = downloadModel2;
        this.appCoinsViewModel = appCoinsViewModel2;
        this.migrationModel = migrationModel2;
    }

    public AppCoinsViewModel getAppCoinsViewModel() {
        return this.appCoinsViewModel;
    }

    public AppModel getAppModel() {
        return this.appModel;
    }

    public DownloadModel getDownloadModel() {
        return this.downloadModel;
    }

    public MigrationModel getMigrationModel() {
        return this.migrationModel;
    }

    public void setDownloadModel(DownloadModel downloadModel2) {
        this.downloadModel = downloadModel2;
    }
}
