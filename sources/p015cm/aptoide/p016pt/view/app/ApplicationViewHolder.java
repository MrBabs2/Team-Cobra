package p015cm.aptoide.p016pt.view.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.view.app.ApplicationViewHolder */
public class ApplicationViewHolder extends ListStoreAppViewHolder {
    private final C12871b<Application> appClicks;
    private final ImageView iconView;
    private final TextView nameTextView;
    private final TextView rating;

    public ApplicationViewHolder(View view, C12871b<Application> bVar) {
        super(view);
        this.nameTextView = (TextView) view.findViewById(C1086R.C1088id.name);
        this.iconView = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating_label);
        this.appClicks = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo15397a(Application application, View view) {
        this.appClicks.onNext(application);
    }

    public void setApp(Application application) {
        this.nameTextView.setText(application.getName());
        ImageLoader.with(this.itemView.getContext()).load(application.getIcon(), this.iconView);
        float rating2 = application.getRating();
        if (rating2 == 0.0f) {
            this.rating.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            this.rating.setText(new DecimalFormat("0.0").format((double) rating2));
        }
        this.itemView.setOnClickListener(new C4505a1(this, application));
    }
}
