package p015cm.aptoide.p016pt;

import javax.inject.Singleton;
import p015cm.aptoide.p016pt.install.DownloadService;
import p015cm.aptoide.p016pt.install.InstalledIntentService;
import p015cm.aptoide.p016pt.notification.PullingContentService;
import p015cm.aptoide.p016pt.toolbox.ToolboxContentProvider;
import p015cm.aptoide.p016pt.view.ActivityComponent;
import p015cm.aptoide.p016pt.view.ActivityModule;

@Singleton
/* renamed from: cm.aptoide.pt.ApplicationComponent */
public interface ApplicationComponent {
    void inject(AptoideApplication aptoideApplication);

    void inject(NotificationApplicationView notificationApplicationView);

    void inject(DownloadService downloadService);

    void inject(InstalledIntentService installedIntentService);

    void inject(PullingContentService pullingContentService);

    void inject(ToolboxContentProvider toolboxContentProvider);

    ActivityComponent plus(ActivityModule activityModule, FlavourActivityModule flavourActivityModule);
}
