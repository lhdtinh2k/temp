package bo;

import java.util.ArrayList;

import bean.loaibean;
import bean.sachbean;
import dao.loaidao;
import dao.sachdao;

public class sachbo {
	sachdao sdao= new sachdao();
	public ArrayList<sachbean> getsach(){
		return sdao.getsach();
	}
	
/*	public ArrayList<loaibean> TimLoaiSach(ArrayList<loaibean> ds, String loaisach){
		ArrayList<loaibean> tam= new ArrayList<loaibean>();
		for(loaibean lb: ds) {
			if(ldao.getloai().equals(loaisach))
    			tam.add(lb);
		}
    	return tam;	
	}*/
	 public ArrayList<sachbean> TimLoai(ArrayList<sachbean> ds,String maloai){
    	 ArrayList<sachbean> tam= new ArrayList<sachbean>();
    	 for(sachbean s: ds)
    		 if(s.getMaloai().equals(maloai))
    			   tam.add(s);
    	 return tam;
     }
	
/*	public ArrayList<sachbean> Tim(ArrayList<sachbean> ds, String key){
    	ArrayList<sachbean> tam= new ArrayList<sachbean>();
    	for(sachbean sb: ds)
    		if(sb.getTensach().contains(key)||sb.getTacgia().toLowerCase().contains(key.toLowerCase()))
    			tam.add(sb);
    	return tam;
    }
*/
	public ArrayList<sachbean> Tim(ArrayList<sachbean> ds,String key){
   	 ArrayList<sachbean> tam= new ArrayList<sachbean>();
   	 for(sachbean s: ds)
   		 if(s.getTensach().toLowerCase().contains(key.toLowerCase()) ||
   				 s.getTacgia().toLowerCase().contains(key.toLowerCase()))
   			   tam.add(s);
   	 return tam;
    }	
	
/*	public int DemSachTheoMaLoai(ArrayList<loaibean> ds, String loaisach){
		ArrayList<loaibean> tam= new ArrayList<loaibean>();
		int dem=0;
		for(loaibean lb: ds) {
			if(ldao.getMaloai().equals(loaisach))
    			dem++;
		}
    	return dem;	
	}	*/
	public int DemLoai(ArrayList<sachbean> ds,String maloai){
    	int d=0;
    	 for(sachbean s: ds)
    		 if(s.getMaloai().equals(maloai))
    			d++;
    	 return d;
     }
	public String TimAnh(ArrayList<sachbean> ds,String masach){
    	String m="haha";
    	 for(sachbean s: ds)
    		 if(s.getMasach().equals(masach))
    			m=s.getAnh();
    	 return m;
     }

}
