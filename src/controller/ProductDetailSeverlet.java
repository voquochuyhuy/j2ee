package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SanPhamDAO;
import model.SanPham;
import dao.ThongTinSanPhamDAO;
/**
 * Servlet implementation class ProductDetailSeverlet
 */
@WebServlet("/ProductDetailSeverlet")
public class ProductDetailSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailSeverlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String maSanPham =  request.getParameter("id");
		SanPham sp = new SanPhamDAO().getSanPham(maSanPham);
		request.setAttribute("sp", sp);
		request.setAttribute("ttsp", new ThongTinSanPhamDAO().getNameThongTinSanPham(sp.getMaThongTinSanPham()));
		request.getRequestDispatcher("product_detail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
