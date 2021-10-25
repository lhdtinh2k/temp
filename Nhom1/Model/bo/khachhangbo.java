package bo;

import java.util.ArrayList;

import bean.khachhangbean;
import bean.sachbean;
import dao.khachhangdao;


public class khachhangbo {
		khachhangdao khdao= new khachhangdao();
		public ArrayList<khachhangbean> getkh(){
			return khdao.getkh();
		}
		
		 public khachhangbean ktdn(String makh,String password) {
				for(khachhangbean kh : getkh()) {
					if(kh.getMakh().equals(makh) && kh.getMatkhau().equals(password)) {
						return kh;
					}
				}
				return null;
			}
}
	    	
