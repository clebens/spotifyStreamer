package biz.globochem.spotifystreamer;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SearchFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        String[] dummyData={ "foo", "bar" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.search_result_list_item, dummyData);
        ((ListView) getActivity().findViewById(R.id.search_result_list)).setAdapter(adapter);

    }



}
