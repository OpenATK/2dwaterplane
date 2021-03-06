package com.precisionag.lib;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapFragment;
import com.precisionag.waterplane.MainActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyMapFragment extends MapFragment {
	public View mOriginalContentView;
	public TouchableWrapper mTouchView;
	
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
	mOriginalContentView = super.onCreateView(inflater, parent, savedInstanceState);
	
	mTouchView = new TouchableWrapper(getActivity());
	mTouchView.addView(mOriginalContentView);

    MainActivity.mapReady = true;
	return mTouchView;
	}

	@Override
	public View getView() {
	   return mOriginalContentView;
	}
}