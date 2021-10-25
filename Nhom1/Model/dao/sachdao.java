package dao;

import java.util.ArrayList;

import bean.sachbean;

public class sachdao {
	public ArrayList<sachbean> getsach(){
		ArrayList<sachbean>  ds= new ArrayList<sachbean>();
   	 ds.add(new sachbean("ctdl", "Cấu trúc dữ liệu", "Lê Thanh Nam", (long)100000, "b1.jpg", "cntt"));
   	 ds.add(new sachbean("csdl", "Cơ sở dữ liệu", "Trần Phú Độ", (long)100000, "b2.jpg", "cntt"));
   	 ds.add(new sachbean("trr", "Toán rời rạc", "Lê Thanh Nam", (long)100000, "b3.jpg", "cntt"));
   	 ds.add(new sachbean("ctdlnc", "Cấu trúc dữ liệu nâng cao", "Lê Thanh Nam", (long)100000, "b4.jpg", "cntt"));
   	 ds.add(new sachbean("kt1", "Cấu trúc dữ liệu kinh tế", "Lê Thanh Nam", (long)100000, "b5.jpg", "kt"));
   	 ds.add(new sachbean("kt2", "Cấu trúc dữ liệu kinh tế 2", "Lê Thanh Nam", (long)100000, "b6.jpg", "kt"));
   	 ds.add(new sachbean("l1", "Luật 1", "Lê Thanh Nam", (long)100000, "b7.jpg", "luat"));
   	 ds.add(new sachbean("l2", "Luật 2", "Lê Thanh Nam", (long)100000, "b8.jpg", "luat"));
   	 return ds;
	}
}
