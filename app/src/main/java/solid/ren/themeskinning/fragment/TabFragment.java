package solid.ren.themeskinning.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import solid.ren.themeskinning.R;

public class TabFragment extends BasicFragment
{

    private String title;

    public static TabFragment newInstance(String color)
    {
        TabFragment s = new TabFragment();
        s.title = color;
        return s;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab, null);
        TextView textView = v.findViewById(R.id.textView);
        textView.setText(title);
        return v;
    }
}
