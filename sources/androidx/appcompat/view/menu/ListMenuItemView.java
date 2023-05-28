package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.widget.C0278q0;
import p050l.p051a.C4790a;
import p050l.p051a.C4795f;
import p050l.p051a.C4796g;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

public class ListMenuItemView extends LinearLayout implements C0155n.C0156a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0142i f419f;

    /* renamed from: g */
    private ImageView f420g;

    /* renamed from: h */
    private RadioButton f421h;

    /* renamed from: i */
    private TextView f422i;

    /* renamed from: j */
    private CheckBox f423j;

    /* renamed from: k */
    private TextView f424k;

    /* renamed from: l */
    private ImageView f425l;

    /* renamed from: m */
    private ImageView f426m;

    /* renamed from: n */
    private LinearLayout f427n;

    /* renamed from: o */
    private Drawable f428o;

    /* renamed from: p */
    private int f429p;

    /* renamed from: q */
    private Context f430q;

    /* renamed from: r */
    private boolean f431r;

    /* renamed from: s */
    private Drawable f432s;

    /* renamed from: t */
    private boolean f433t;

    /* renamed from: u */
    private LayoutInflater f434u;

    /* renamed from: v */
    private boolean f435v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.listMenuViewStyle);
    }

    /* renamed from: b */
    private void m528b() {
        ImageView imageView = (ImageView) getInflater().inflate(C4796g.abc_list_menu_item_icon, this, false);
        this.f420g = imageView;
        m527a((View) imageView, 0);
    }

    /* renamed from: d */
    private void m529d() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C4796g.abc_list_menu_item_radio, this, false);
        this.f421h = radioButton;
        m526a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f434u == null) {
            this.f434u = LayoutInflater.from(getContext());
        }
        return this.f434u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f425l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo450a(C0142i iVar, int i) {
        this.f419f = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo690a((C0155n.C0156a) this));
        setCheckable(iVar.isCheckable());
        mo477a(iVar.mo726m(), iVar.mo698d());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f426m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f426m.getLayoutParams();
            rect.top += this.f426m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: c */
    public boolean mo453c() {
        return false;
    }

    public C0142i getItemData() {
        return this.f419f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C5071v.m9161a((View) this, this.f428o);
        TextView textView = (TextView) findViewById(C4795f.title);
        this.f422i = textView;
        int i = this.f429p;
        if (i != -1) {
            textView.setTextAppearance(this.f430q, i);
        }
        this.f424k = (TextView) findViewById(C4795f.shortcut);
        ImageView imageView = (ImageView) findViewById(C4795f.submenuarrow);
        this.f425l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f432s);
        }
        this.f426m = (ImageView) findViewById(C4795f.group_divider);
        this.f427n = (LinearLayout) findViewById(C4795f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f420g != null && this.f431r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f420g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f421h != null || this.f423j != null) {
            if (this.f419f.mo718i()) {
                if (this.f421h == null) {
                    m529d();
                }
                compoundButton2 = this.f421h;
                compoundButton = this.f423j;
            } else {
                if (this.f423j == null) {
                    m525a();
                }
                compoundButton2 = this.f423j;
                compoundButton = this.f421h;
            }
            if (z) {
                compoundButton2.setChecked(this.f419f.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f423j;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f421h;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f419f.mo718i()) {
            if (this.f421h == null) {
                m529d();
            }
            compoundButton = this.f421h;
        } else {
            if (this.f423j == null) {
                m525a();
            }
            compoundButton = this.f423j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f435v = z;
        this.f431r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f426m;
        if (imageView != null) {
            imageView.setVisibility((this.f433t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f419f.mo725l() || this.f435v;
        if (!z && !this.f431r) {
            return;
        }
        if (this.f420g != null || drawable != null || this.f431r) {
            if (this.f420g == null) {
                m528b();
            }
            if (drawable != null || this.f431r) {
                ImageView imageView = this.f420g;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f420g.getVisibility() != 0) {
                    this.f420g.setVisibility(0);
                    return;
                }
                return;
            }
            this.f420g.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f422i.setText(charSequence);
            if (this.f422i.getVisibility() != 0) {
                this.f422i.setVisibility(0);
            }
        } else if (this.f422i.getVisibility() != 8) {
            this.f422i.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0278q0 a = C0278q0.m1271a(getContext(), attributeSet, C4799j.MenuView, i, 0);
        this.f428o = a.mo1719b(C4799j.MenuView_android_itemBackground);
        this.f429p = a.mo1729g(C4799j.MenuView_android_itemTextAppearance, -1);
        this.f431r = a.mo1716a(C4799j.MenuView_preserveIconSpacing, false);
        this.f430q = context;
        this.f432s = a.mo1719b(C4799j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C4790a.dropDownListViewStyle, 0);
        this.f433t = obtainStyledAttributes.hasValue(0);
        a.mo1720b();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m526a(View view) {
        m527a(view, -1);
    }

    /* renamed from: a */
    private void m527a(View view, int i) {
        LinearLayout linearLayout = this.f427n;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    public void mo477a(boolean z, char c) {
        int i = (!z || !this.f419f.mo726m()) ? 8 : 0;
        if (i == 0) {
            this.f424k.setText(this.f419f.mo700e());
        }
        if (this.f424k.getVisibility() != i) {
            this.f424k.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m525a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C4796g.abc_list_menu_item_checkbox, this, false);
        this.f423j = checkBox;
        m526a(checkBox);
    }
}
