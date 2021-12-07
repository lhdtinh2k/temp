package org.o7planning.hellospringmvc.dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.Hangbean_Tinh;


public class Hangdao_Tinh {
	public ArrayList<Hangbean_Tinh> Tim(String tenhang1, String nhacungcap1) throws Exception{
		ArrayList<Hangbean_Tinh>  ds1= new ArrayList<Hangbean_Tinh>();
		DungChung_Tinh dc= new DungChung_Tinh();
		//b1: ket noi vao csdl
		dc.KetNoi();
		//b2: Lay du lieu ve
		String sql="Select * from Hang where tenhang like'%?%' or nhacungcap like'%?%'";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		//b3: Truyen tham so vao cau lenh sql
		cmd.setString(1,tenhang1);
		cmd.setString(2,nhacungcap1);
		//b4: Thuc hien cau lieu
		ResultSet rs= cmd.executeQuery();
		//kiem tra xem nguoi dung dang nhap dung hay khong
		//neu rs.next==false return null;
		
		while(rs.next()==true)
		{
			String Mahang=rs.getString("Mahang");
			String tenhang=rs.getString("tenhang");
			String nhacungcap=rs.getString("nhacungcap");
		    Double gia=rs.getDouble("sodt");

			ds1.add(new Hangbean_Tinh(Mahang,tenhang,nhacungcap,gia));
		}
		rs.close();
		dc.cn.close();
		return ds1;
	}
}
