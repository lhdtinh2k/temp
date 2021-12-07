package org.o7planning.hellospringmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung_Tinh {
	public Connection cn;
    public void KetNoi() throws Exception{
   	 //B1: Xac dinh hqtcsdl
   	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KFRCIKV\\SQLEXPRESS:1433;databaseName=SV;user=sa; password=123");
        System.out.println("Da ket noi sv");
    }
}
