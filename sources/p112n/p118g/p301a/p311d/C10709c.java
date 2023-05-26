package p112n.p118g.p301a.p311d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.d.c */
/* compiled from: TextViewAfterTextChangeEventOnSubscribe */
final class C10709c implements C5368e.C5370a<C10708b> {

    /* renamed from: f */
    final TextView f28724f;

    /* renamed from: n.g.a.d.c$a */
    /* compiled from: TextViewAfterTextChangeEventOnSubscribe */
    class C10710a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ C12475j f28725f;

        C10710a(C12475j jVar) {
            this.f28725f = jVar;
        }

        public void afterTextChanged(Editable editable) {
            if (!this.f28725f.isUnsubscribed()) {
                this.f28725f.onNext(C10708b.m36231a(C10709c.this.f28724f, editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: n.g.a.d.c$b */
    /* compiled from: TextViewAfterTextChangeEventOnSubscribe */
    class C10711b extends C12476a {

        /* renamed from: f */
        final /* synthetic */ TextWatcher f28727f;

        C10711b(TextWatcher textWatcher) {
            this.f28727f = textWatcher;
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10709c.this.f28724f.removeTextChangedListener(this.f28727f);
        }
    }

    C10709c(TextView textView) {
        this.f28724f = textView;
    }

    /* renamed from: a */
    public void call(C12475j<? super C10708b> jVar) {
        C12476a.verifyMainThread();
        C10710a aVar = new C10710a(jVar);
        jVar.add(new C10711b(aVar));
        this.f28724f.addTextChangedListener(aVar);
        TextView textView = this.f28724f;
        jVar.onNext(C10708b.m36231a(textView, textView.getEditableText()));
    }
}
