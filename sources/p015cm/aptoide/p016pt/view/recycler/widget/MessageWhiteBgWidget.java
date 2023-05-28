package p015cm.aptoide.p016pt.view.recycler.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.MessageWhiteBgDisplayable;

/* renamed from: cm.aptoide.pt.view.recycler.widget.MessageWhiteBgWidget */
public class MessageWhiteBgWidget extends Widget<MessageWhiteBgDisplayable> {
    private TextView message;

    public MessageWhiteBgWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.message = (TextView) view.findViewById(C1086R.C1088id.message);
    }

    public void bindView(MessageWhiteBgDisplayable messageWhiteBgDisplayable, int i) {
        String message2 = messageWhiteBgDisplayable.getMessage();
        if (TextUtils.isEmpty(message2)) {
            this.message.setVisibility(8);
        } else {
            this.message.setText(message2);
        }
    }
}
