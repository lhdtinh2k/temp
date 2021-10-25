package dao;

import java.util.ArrayList;

import bean.khachhangbean;

public class khachhangdao {
	public ArrayList<khachhangbean> getkh(){
		ArrayList<khachhangbean> ds = new ArrayList<khachhangbean>();
		ds.add(new khachhangbean("kh1", "Hồ Nam", "Hue", "mk1"));
		ds.add(new khachhangbean("kh2", "Nguyễn Quang Nam", "Hue", "mk2"));
		ds.add(new khachhangbean("kh3", "Hồ Văn", "Hue", "mk3"));
		ds.add(new khachhangbean("kh4", "Phan Tiến", "Hue", "mk4"));
		ds.add(new khachhangbean("kh5", "Châu Hà", "Hue", "mk5"));
    	return ds;		
	}
	
}
