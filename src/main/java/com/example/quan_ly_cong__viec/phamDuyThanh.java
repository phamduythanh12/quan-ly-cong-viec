package com.example.quan_ly_cong__viec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class phamDuyThanh {

    private String title;
    private String desciption;
    private Date dateFinish;
    private Date hourFinish;
    // constructor
    public phamDuyThanh() {
        super();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDesciption() {
        return desciption;
    }
    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
    public Date getDateFinish() {
        return dateFinish;
    }
    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }
    public Date getHourFinish() {
        return hourFinish;
    }
    public void setHourFinish(Date hourFinish) {
        this.hourFinish = hourFinish;
    }
    // constructor
    public phamDuyThanh(String title, String desciption, Date dateFinish,
                     Date hourFinish) {
        super();
        this.title = title;
        this.desciption = desciption;
        this.dateFinish = dateFinish;
        this.hourFinish = hourFinish;
    }
      // ham dinh danh ngay thang hien thi theo form dd/MM/yyyy
    public String getDateFormat(Date d)
    {
        SimpleDateFormat dft=new
                SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dft.format(d);
    }
    // ham dinh dang thoi gian hien thi theo form hh:mm a
    public String getHourFormat(Date d)
    {
        SimpleDateFormat dft=new
                SimpleDateFormat("hh:mm a", Locale.getDefault());
        return dft.format(d);
    }
    @Override
    public String toString() {
        return this.title+"-"+
                getDateFormat(this.dateFinish)+"-"+
                getHourFormat(this.hourFinish);
    }
}
