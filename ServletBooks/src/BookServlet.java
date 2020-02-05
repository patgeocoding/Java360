import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BookServlet extends HttpServlet {
	private String title;
	private String author;
	private double price;
	private int bookId;

	   public void init() throws ServletException {
	   }

	   public void doGet(HttpServletRequest request, 
	      HttpServletResponse response)
	      throws ServletException, IOException 
	   {
	   }
	   
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

					PrintWriter pw = response.getWriter();
			
			title = request.getParameter("title");
			author = request.getParameter("author");
			price = Long.parseLong(request.getParameter("price"));
			bookId = Integer.parseInt(request.getParameter("bookId"));

			Book newBook = new Book(title, author, price, bookId);
			
			pw.println("<!DOCTYPE html>"
					+ "<html>"
					+ "<head>"
					+ "<meta charset='ISO-8859-1'>"
					+ "<title>Book Servlet Demo</title>"
					+ "</head>"
					+ "<body>"
					+ "<h2>Thanks!</h2>"
					+ "<p>Information below from given data.</p>"
					+ "<h2>Your Information:</h2>");
			pw.println("<p>Book Title: " + newBook.getTitle() +
	                        "</p><p>Author: " + newBook.getAuthor() + "</p><p>Book Price: "
	                        + newBook.getPrice() + "</p><p>Book ID: " +
	                        newBook.getBookId());
			pw.println("</body>"
					+ "</html>");
	    }

	   public void destroy() {
	      /* leaving empty for now this can be
	       * used when we want to do something at the end
	       * of Servlet life cycle
	       */
	   }
}
