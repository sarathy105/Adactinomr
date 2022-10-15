package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
/**
 * @Description Used to  maintain the page object manager for all the pages
 * 
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class PageObjectManager {
	
	/**
	 * @Decsription Ued to integrate all page in PageObjectManager
	 * @Date 19-09-2022
	 */
		
		private LoginPage loginPage;
		private SearchHotelPage searchHotelPage;
		private SelectHotelPage selectHotelPage;
		private BookHotelPage bookHotelPage;
		private BookingConfirmationPage bookingConfirmationPage;
		private CancelBookingPage cancelBookingPage;
		
		/**
		 * @Description Create object for LoginPage when it returns null
		 * @return LoginPage
		 * @Date 19-09-2022
		 */
		
		
		public LoginPage getLoginPage() {
			return (loginPage==null)?loginPage=new LoginPage():loginPage;
		}
		
		/**
		 * @Description Create object for Searchhotel page when it returns null
		 * @return SearchHotelPage
		 * @Date 19-09-2022
		 */
		public SearchHotelPage getSearchHotelPage() {
			return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
		}
		
		/**
		 * @Description Create object for Selecthotel page when it returns null
		 * @return SelectHotelPage
		 * @Date 19-09-2022
		 */
		public SelectHotelPage getSelectHotelPage() {
			return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
		}
		
		/**
		 * @Description Create object for Bookhotel page when it returns null
		 * @return BookHotelPage
		 * @Date 19-09-2022
		 */
		public BookHotelPage getBookHotelPage() {
			return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
		}
		
		
		/**
		 * @Description Create object for Bookingconfirmation page when it returns null
		 * @return BookingConfirmationPage
		 * @Date 19-09-2022
		 */
		public BookingConfirmationPage getBookingConfirmationPage() {
			return (bookingConfirmationPage==null)?bookingConfirmationPage =new BookingConfirmationPage():bookingConfirmationPage;
		}
		
		/**
		 * @Description Create object for the Cancelbooking page when it returns null
		 * @return CancelBookingPage
		 * @Date 19-09-2022
		 */
		public CancelBookingPage getCancelBookingPage() {
			return (cancelBookingPage==null)?cancelBookingPage=new CancelBookingPage():cancelBookingPage;
		}

}
