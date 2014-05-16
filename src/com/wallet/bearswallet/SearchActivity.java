package com.wallet.bearswallet;

import java.util.ArrayList;
import java.util.HashMap;

import model.Person;
import model.Wallet;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class SearchActivity extends BaseActivity{
	// List view
    private ListView mListView;
     
    // Listview Adapter
    ArrayAdapter<String> mArrayAdapter;
     
    // Search EditText
    EditText mInputSearch;
     
     
    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        // Listview Data
        ArrayList<Person> people = Wallet.getWallet().getDebteur();
        int size = people.size();
        String[] peopleName = new String[size];
        for(int i=0; i<size; i++){
        	peopleName[i] = people.get(i).getName();
        }
         
        mListView = (ListView) findViewById(R.id.list_view);
        mInputSearch = (EditText) findViewById(R.id.inputSearch);
         
        // Adding items to listview
        mArrayAdapter = new ArrayAdapter<String>(this, R.layout.element_list_people, R.id.people_name, peopleName);
        mListView.setAdapter(mArrayAdapter);       
         
    }

}
