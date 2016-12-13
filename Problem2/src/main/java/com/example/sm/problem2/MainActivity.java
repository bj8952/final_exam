package com.example.sm.problem2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, Payment {
    MyBaseAdapter adapter;
    ListView listview;
    Employee employee  = new Employee("a",10,0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // need something here

        ArrayList<Employee> emp_list = new ArrayList<>();// ++++++++++++
        adapter = new MyBaseAdapter(this, emp_list);
        listview = (ListView) findViewById(R.id.listView1) ;
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((AdapterView.OnItemClickListener)adapter);
    }
    @Override
    public void onClick(View v){
        EditText edit_name = (EditText) findViewById(R.id.edit_name);
        EditText edit_age = (EditText) findViewById(R.id.edit_age);
        EditText edit_salary = (EditText) findViewById(R.id.edit_salary);



        switch (v.getId()){
            case R.id.btn_inc:

                employee.increase();
                int b = employee.getSalary();
                edit_salary.setText(b+""); // need something here
                employee = new Employee("a",10,b);
                break;

            case R.id.btn_dec:
                employee.decrease();
                int c = employee.getSalary();
                edit_salary.setText(c+""); // need something here
                employee = new Employee("a",10,c);// need something here
                break;

            case R.id.btn_store:
                // need something here
                break;

            case R.id.btn_modify:
                // need something here
                break;

            case R.id.btn_delete:
                // need something here
                break;
        }
    }

    @Override
    public void increase() {

    }

    @Override
    public void decrease() {

    }
}

interface Payment {
    void increase();
    void decrease();
}
