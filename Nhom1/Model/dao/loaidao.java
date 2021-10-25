package dao;

import java.util.ArrayList;

import bean.loaibean;

public class loaidao {
	public ArrayList<loaibean> getloai(){
		ArrayList<loaibean> ds = new ArrayList<loaibean>();
		ds.add(new loaibean("kt", "Kinh tế"));
    	ds.add(new loaibean("vh", "Văn học"));
    	ds.add(new loaibean("luat", "Sách luật kinh tế"));
    	ds.add(new loaibean("cntt", "CNTT"));
    	return ds;		
	}
	
}
