package p112n.p118g.p301a.p311d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.d.e */
/* compiled from: TextViewTextChangeEventOnSubscribe */
final class C10713e implements C5368e.C5370a<C10712d> {

    /* renamed from: f */
    final TextView f28733f;

    /* renamed from: n.g.a.d.e$a */
    /* compiled from: TextViewTextChangeEventOnSubscribe */
    class C10714a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ C12475j f28734f;

        C10714a(C12475j jVar) {
            this.f28734f = jVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f28734f.isUnsubscribed()) {
                this.f28734f.onNext(C10712d.m36234a(C10713e.this.f28733f, charSequence, i, i2, i3));
            }
        }
    }

    /* renamed from: n.g.a.d.e$b */
    /* compiled from: TextViewTextChangeEventOnSubscribe */
    class C10715b extends C12476a {

        /* renamed from: f */
        final /* synthetic */ TextWatcher f28736f;

        C10715b(TextWatcher textWatcher) {
            this.f28736f = textWatcher;
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10713e.this.f28733f.removeTextChangedListener(this.f28736f);
        }
    }

    C10713e(TextView textView) {
        this.f28733f = textView;
    }

    /* renamed from: a */
    public void call(C12475j<? super C10712d> jVar) {
        C12476a.verifyMainThread();
        C10714a aVar = new C10714a(jVar);
        jVar.add(new C10715b(aVar));
        this.f28733f.addTextChangedListener(aVar);
        TextView textView = this.f28733f;
        jVar.onNext(C10712d.m36234a(textView, textView.getText(), 0, 0, 0));
    }
}
