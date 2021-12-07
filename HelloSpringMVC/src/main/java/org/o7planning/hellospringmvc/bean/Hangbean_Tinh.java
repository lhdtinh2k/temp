package org.o7planning.hellospringmvc.bean;


public class Hangbean_Tinh {
	private String Mahang;
    private String tenhang;
    private String nhacungcap;
    private Double gia;
	public String getMahang() {
		return Mahang;
	}
	public void setMahang(String mahang) {
		Mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public String getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
	}
	public Hangbean_Tinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hangbean_Tinh(String mahang, String tenhang, String nhacungcap, Double gia) {
		super();
		Mahang = mahang;
		this.tenhang = tenhang;
		this.nhacungcap = nhacungcap;
		this.gia = gia;
	}

    
}
