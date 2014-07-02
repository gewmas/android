package com.example.todolist;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ToDoListActivity extends Activity implements NewItemFragment.OnNewItemAddedListener {
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> todoItems;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        FragmentManager fragmentManager = getFragmentManager();
        ToDoListFragment todoListFragment = (ToDoListFragment)fragmentManager.findFragmentById(R.id.TodoListFragment);

        todoItems = new ArrayList<String>();
        int resID = R.layout.todollist_item;
        arrayAdapter = new ArrayAdapter<String>(this,resID,todoItems);
        todoListFragment.setListAdapter(arrayAdapter);
    }

    public void onNewItemAdded(String newItem) {
        todoItems.add(newItem);
        arrayAdapter.notifyDataSetChanged();
    }
}
