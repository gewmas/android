package com.example.todolist;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import java.util.ArrayList;

public class ToDoListActivity extends Activity implements NewItemFragment.OnNewItemAddedListener {
    private ToDoItemAdapter arrayAdapter;
    private ArrayList<ToDoItem> todoItems;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        FragmentManager fragmentManager = getFragmentManager();
        ToDoListFragment todoListFragment = (ToDoListFragment)fragmentManager.findFragmentById(R.id.TodoListFragment);

        todoItems = new ArrayList<ToDoItem>();
        int resID = R.layout.todollist_item;
        arrayAdapter = new ToDoItemAdapter(this,resID,todoItems);
        todoListFragment.setListAdapter(arrayAdapter);
    }

    public void onNewItemAdded(String newItem) {
        ToDoItem newTodoItem = new ToDoItem(newItem);
        todoItems.add(0, newTodoItem);
        arrayAdapter.notifyDataSetChanged();
    }
}
