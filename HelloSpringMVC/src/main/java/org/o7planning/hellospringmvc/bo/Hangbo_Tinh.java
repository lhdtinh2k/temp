package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.Hangbean_Tinh;
import org.o7planning.hellospringmvc.dao.Hangdao_Tinh;

public class Hangbo_Tinh {
	Hangdao_Tinh hdao= new Hangdao_Tinh();
	public ArrayList<Hangbean_Tinh> TimKiem(String hoten,String nhacungcap) throws Exception{
		return hdao.Tim(hoten, nhacungcap);
	}
}
