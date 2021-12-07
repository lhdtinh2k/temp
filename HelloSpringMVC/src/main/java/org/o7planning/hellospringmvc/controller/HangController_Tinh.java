package org.o7planning.hellospringmvc.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.Hangbean_Tinh;
import org.o7planning.hellospringmvc.bo.Hangbo_Tinh;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HangController_Tinh {
	@RequestMapping("/Hang")
	public ModelAndView  dangnhap(Model model, HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		session.setAttribute("ds", null);
		try {
			String ht=request.getParameter("txtname");
			String ncc=request.getParameter("txtncc");
			System.out.println("/"+ht+"/");
			Hangbo_Tinh khbo= new Hangbo_Tinh();

			if(ht==null) {//neu lan dau
				return new ModelAndView("khachhang");
				
			}else{
				ArrayList<Hangbean_Tinh> ds = khbo.TimKiem(ht, ncc);
				if(ds!=null){//Dang nhap dung
					session.setAttribute("ds", ds);
					System.out.println("ds!=null");
					//return "redirect:/hello";
					//return new ModelAndView("redirect:/hello");
					//System.out.println(ds.get(0).getTendn());
					return new ModelAndView("khachhang");
				}
				else{//dang nhap sai
					model.addAttribute("tb", "Dang nhap sai");
					System.out.println("ds=null");
					return new ModelAndView("khachhang");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
	}
}
