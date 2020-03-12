package com.nive.hotelroom.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ErrorConstant;

public class ConnectionUtil {

		public static  Connection getConnect() throws ClassNotFoundException, DBException {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException(ErrorConstant.INVALID_CON);
			}
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@13.235.147.120:1521:XE","nivetha","nivetha");
			return con;
		}
}
