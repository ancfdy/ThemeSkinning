package solid.ren.themeskinning.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import solid.ren.skinlibrary.SkinLoaderListener;
import solid.ren.skinlibrary.base.SkinBaseActivity;
import solid.ren.skinlibrary.loader.SkinManager;
import solid.ren.themeskinning.R;

public class ChangeClothesActivity extends SkinBaseActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_clothes);
    }

    public void onClickedDefault(View view)
    {
        SkinManager.getInstance().restoreDefaultTheme();
    }

    public void onClickedRed(View view)
    {
        SkinManager.getInstance().loadSkin("theme-20180419.skin",
                new SkinLoaderListener() {
                    @Override
                    public void onStart() {
                        Log.i("SkinLoaderListener", "正在切换中");
                        //dialog.show();
                    }

                    @Override
                    public void onSuccess() {
                        Log.i("SkinLoaderListener", "切换成功");
                    }

                    @Override
                    public void onFailed(String errMsg) {
                        Log.i("SkinLoaderListener", "切换失败:" + errMsg);
                    }

                    @Override
                    public void onProgress(int progress) {
                        Log.i("SkinLoaderListener", "皮肤文件下载中:" + progress);

                    }
                }
        );
    }
}
