package com.example.face_recognition_android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.face_recognition_android.R;
import com.example.face_recognition_android.model.Student;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private Context context;
    private List<Student> list;


    public StudentAdapter(Context context, List<Student> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {

        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.layout_student_item,null);
        }

        TextView tvstudentId = view.findViewById(R.id.tvStudentId);
        ImageView ivstudentImg = view.findViewById(R.id.ivStudentImg);
        TextView tvstudentName = view.findViewById(R.id.tvStudentName);
        TextView tvstudentDesc = view.findViewById(R.id.tvStudentDesc);

        Student std =list.get(i);
        tvstudentId.setText(String.valueOf(std.getStudentId()));
        ivstudentImg.setImageResource(std.getImgId());
        tvstudentName.setText(std.getStudentName());
        tvstudentDesc.setText((std.getStudentDesc()));
        return view;
    }
}
