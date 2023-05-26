package p015cm.aptoide.p016pt.view.recycler.widget;

import android.view.View;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.FooterRowDisplayable;

/* renamed from: cm.aptoide.pt.view.recycler.widget.FooterRowWidget */
public class FooterRowWidget extends Widget<FooterRowDisplayable> {
    private TextView title;

    public FooterRowWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.title = (TextView) view.findViewById(C1086R.C1088id.title);
    }

    public void bindView(FooterRowDisplayable footerRowDisplayable, int i) {
        this.title.setText((String) footerRowDisplayable.getPojo());
        this.title.setVisibility(0);
    }
}
