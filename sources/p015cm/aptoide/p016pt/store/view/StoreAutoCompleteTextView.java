package p015cm.aptoide.p016pt.store.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/* renamed from: cm.aptoide.pt.store.view.StoreAutoCompleteTextView */
public class StoreAutoCompleteTextView extends AutoCompleteTextView {
    private static final int DEFAULT_AUTOCOMPLETE_DELAY = 2000;
    private static final int MESSAGE_TEXT_CHANGED = 100;
    private int mAutoCompleteDelay = DEFAULT_AUTOCOMPLETE_DELAY;
    private final Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            StoreAutoCompleteTextView.super.performFiltering((CharSequence) message.obj, message.arg1);
        }
    };

    public StoreAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFilterComplete(int i) {
        super.onFilterComplete(i);
    }

    /* access modifiers changed from: protected */
    public void performFiltering(CharSequence charSequence, int i) {
        this.mHandler.removeMessages(100);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(100, charSequence), (long) this.mAutoCompleteDelay);
    }
}
