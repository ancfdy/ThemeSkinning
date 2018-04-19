package solid.ren.themeskinning.custom_attr;

import android.support.design.widget.NavigationView;
import android.view.View;

import solid.ren.skinlibrary.attr.base.SkinAttr;
import solid.ren.skinlibrary.utils.SkinResourcesUtils;

public class NavigationViewArr extends SkinAttr
{
    @Override
    protected void applySkin(View view)
    {
        if (view instanceof NavigationView)
        {
            if (isColor()) {
                NavigationView nv = (NavigationView) view;
                nv.setItemIconTintList(SkinResourcesUtils.getColorStateList(attrValueRefId));
            }
        }
    }
}
