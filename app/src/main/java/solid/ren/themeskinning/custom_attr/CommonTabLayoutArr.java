package solid.ren.themeskinning.custom_attr;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

import com.flyco.tablayout.CommonTabLayout;

import java.util.ArrayList;
import java.util.List;

import solid.ren.skinlibrary.attr.base.SkinAttr;
import solid.ren.skinlibrary.utils.SkinResourcesUtils;

public class CommonTabLayoutArr extends SkinAttr
{
    private static List<Drawable> selectList = new ArrayList<>();
    private static List<Drawable> unselectList = new ArrayList<>();

    @Override
    protected void applySkin(View view)
    {
        if (view instanceof CommonTabLayout && !TextUtils.isEmpty(attrName))
        {
            CommonTabLayout ctl = (CommonTabLayout) view;
            switch (attrName)
            {
                case "tl_textSelectColor":
                    ctl.setTextSelectColor(SkinResourcesUtils.getColor(attrValueRefId));
                    break;
                case "tl_textUnselectColor":
                    ctl.setTextUnselectColor(SkinResourcesUtils.getColor(attrValueRefId));
                    break;
                case "tl_mipmaps_select":
                    for (String resName : attrValueRefName.split(","))
                    {
                        selectList.add(SkinResourcesUtils.getDrawable(resName));
                    }
                    update(ctl);
                    break;
                case "tl_mipmaps_unselect":
                    for (String resName : attrValueRefName.split(","))
                    {
                        unselectList.add(SkinResourcesUtils.getDrawable(resName));
                    }
                    update(ctl);
                    break;
            }
        }
    }

    private void update(CommonTabLayout ctl)
    {
        if (selectList.size() == unselectList.size())
        {
            ctl.changeTabData(selectList, unselectList);
            selectList.clear();
            unselectList.clear();
        }
    }
}
