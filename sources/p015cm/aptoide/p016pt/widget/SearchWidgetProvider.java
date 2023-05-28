package p015cm.aptoide.p016pt.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

/* renamed from: cm.aptoide.pt.widget.SearchWidgetProvider */
public class SearchWidgetProvider extends AppWidgetProvider {
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int updateAppWidget : iArr) {
            Intent intent = new Intent(context, DeepLinkIntentReceiver.class);
            intent.setData(Uri.parse("aptoide://cm.aptoide.pt/deeplink?name=search"));
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C1086R.layout.widget_search_layout);
            remoteViews.setOnClickPendingIntent(C1086R.C1088id.widget_search_bar, activity);
            appWidgetManager.updateAppWidget(updateAppWidget, remoteViews);
        }
    }
}
