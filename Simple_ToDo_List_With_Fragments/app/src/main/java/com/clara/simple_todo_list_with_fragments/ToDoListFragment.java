package com.clara.simple_todo_list_with_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ToDoListFragment.ListItemSelectedListener} interface
 * to handle interaction events.
  */

public class ToDoListFragment extends Fragment {

	private ListItemSelectedListener mListener;


	public ToDoListFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_to_do_list, container, false);
	}


	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		if (context instanceof ListItemSelectedListener) {
			mListener = (ListItemSelectedListener) context;
		} else {
			throw new RuntimeException(context.toString()
					+ " must implement OnFragmentInteractionListener");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mListener = null;
	}


	public interface ListItemSelectedListener {
		void itemSelected(ToDoItem selected);
	}
}
