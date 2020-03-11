package com.nive.hotelroom.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.exception.ErrorConstant;
import com.nive.hotelroom.controller.IndexController;
import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.util.ConnectionUtil;
@Repository
public class CustomerImpl implements CustomerDAO {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	public int save(CustomerDetails c) throws DBException {
		String sql = "insert into customer_table(user_id,user_name,mob_no,city,email_id,pass_word)values(u_id_seq.nextval,?,?,?,?,?)";
		int rows = 0;
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, c.getUserName());
			ps.setString(2, c.getMobNo());
			ps.setString(3, c.getCity());
			ps.setString(4, c.getEmailId());
			ps.setString(5, c.getPassword());
			rows = ps.executeUpdate();
			LOGGER.debug("No of rows inserted :" + rows);
		}

		catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_ADD);

		}
		return rows;

	}

	public void update(int userid) throws DBException {
		String sql = "update room set active_status='inactive', payment='paid' where userid=?";

		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, userid);
			int rows = ps.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + rows);

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_UPDATE);

		}

	}

	public void changePassword(CustomerDetails c) throws DBException {
		String sql = "update customer_table set pass_word=? where email_id=? and pass_word=?";
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, c.getPassword());
			ps.setString(2, c.getEmailId());
			ps.setString(3, c.getPassword());
			System.out.println(sql);
			int row = ps.executeUpdate(sql);
			LOGGER.debug("No of rows updated :" + row);
			if (row == 1) {
				LOGGER.debug("Update Success");
			} else {
				LOGGER.debug("Invalid EmailId/Password");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_UPDATE);

		}
		return;
	}

	public int getUserId(CustomerDetails c) throws DBException {
		String sql = "select user_id from customer_table where email_id=? and pass_word=?";
		System.out.println(sql);
		int v = 0;
		try (Connection con = ConnectionUtil.getConnect(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setString(1, c.getEmailId());
			pst.setString(2, c.getPassword());
			try (ResultSet row = pst.executeQuery();) {
				if (row.next()) {
					v = row.getInt("user_Id");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException(ErrorConstant.INVALID_SELECT);
		}
		return v;
	}
}
