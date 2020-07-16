package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartObject;
import model.Item;
import model.SanPham;
import dao.SanPhamDAO;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Servlet implementation class CartSeverlet
 */
@WebServlet("/CartSeverlet")
public class CartSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartSeverlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(request.getParameter("masp")!= null && request.getParameter("quantity") != null) {
			String masp = request.getParameter("masp");
			int quantity =  Integer.parseInt( request.getParameter("quantity"));
			SanPham sp = new SanPhamDAO().getSanPham(masp);
			
			if(session.getAttribute("CartObject") == null) {
				List<Item> items = new ArrayList<Item>();
				Item item = new Item(sp,quantity);
				items.add(item);
				CartObject cartobject = new CartObject(items, quantity);
				session.setAttribute("CartObject", cartobject);
			}
			else {
				CartObject cartobject = (CartObject) session.getAttribute("CartObject");
				List<Item> items = cartobject.getListItem();
				boolean check = false;
				for (Item item:items) {
					if(item.getSanPham().getMaSanPham().equals(masp)) {
						item.setQuantity(item.getQuantity() + 1);
						check =true;
					}
				}
				if(check == false) {
					Item item = new Item(sp,quantity);
					items.add(item);
					cartobject.setListItem(items);
				}
				cartobject.setSum(cartobject.getSum() + quantity);
				session.setAttribute("CartObject", cartobject);
			}
		}
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
