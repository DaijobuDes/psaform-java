/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.daijobudes.psaform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kate Aubrey Cellan
 */
public class SQLConnect {
    Connection con = null;
    Statement st = null;

    public String dbURL = "jdbc:derby://localhost:1527/psaform";
    public transient String user = "java";
    public transient String pass = "java123!@#";

    public void connectDB() throws Exception {
        con = DriverManager.getConnection(dbURL, user, pass);
        java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.INFO, "Connection OK!");
    }

    public boolean insertFillFormRecord(
        int id,
        String lastName,
        String firstName,
        String middleName,
        int month,
        int day,
        int year,
        String address,
        String country,
        String lastFName,
        String firstFName,
        String middleFName,
        String lastMName,
        String firstMName,
        String middleMName
    ) {
        boolean b = false;

        try {
            st = con.createStatement();
            String sql = "INSERT INTO userform VALUES ("+id+", '"+lastName+"', '"+firstName+"', '"+middleName+"', "+month+", "+day+", "+year+", '"+address+"', '"+country+"', '"+lastFName+"', '"+firstFName+"', '"+middleFName+"', '"+lastMName+"', '"+firstMName+"', '"+middleMName+"')";
            
            if (st.executeUpdate(sql) == 1) {
                b = true;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return b;
    }

    public boolean registerAccount(String username, String password, int priv) {
        boolean b = false;
        LocalDateTime time = java.time.LocalDateTime.now();
        try {
            st = con.createStatement();
            String sql = "INSERT INTO user_accounts VALUES ('"+time+"', '"+username+"', '"+password+"', "+priv+")";

            if (st.executeUpdate(sql) == 1) {
                b = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return b;
    }

    public boolean logToDB(String username, String info) {
        boolean b = false;
        LocalDateTime time = java.time.LocalDateTime.now();
        try {
            st = con.createStatement();
            String sql = "INSERT INTO tblLogs VALUES ('"+time+"', '"+username+"', '"+info+"')";

            if (st.executeUpdate(sql) == 1) {
                b = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return b;
    }

    public boolean disconnectDB() {
        boolean b = false;
        try {
            if (con != null) {
                con.close();
                b = true;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return b;
    }

    // Search method
    public ResultSet displaySearch(String method, String str) {
        ResultSet rs = null;
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM userform WHERE " + method + " = '" + str.toUpperCase() + "'";
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return rs;
    }

    public ResultSet searchDeleteUpdateForm(String l, String f, String m) {
        ResultSet rs = null;
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM userform WHERE lastname = '" + l.toUpperCase() + "' AND firstname = '" + f.toUpperCase() + "' AND middlename = '" + m.toUpperCase() + "'";
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return rs;
    }

    // Display all records on the table
    public ResultSet displayRecords() {
        ResultSet rs = null;
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM userform";
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return rs;
    }

    // Check username and password
    public ResultSet logonCredentials(String username) {
        ResultSet rs = null;
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM user_accounts WHERE username = '" + username + "'";
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }

        return rs;
    }

    // Delete record
    public boolean deleteRecord(int id) {
        boolean b = false;
        try {
            st = con.createStatement();
            String sql = "DELETE FROM userform WHERE tableid = " + id;
            if (st.executeUpdate(sql) == 1) {
                b = true;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return b;
    }

    // Update record
    public boolean updateRecord(
        int id,
        String lastName,
        String firstName,
        String middleName,
        int month,
        int day,
        int year,
        String address,
        String country,
        String lastFName,
        String firstFName,
        String middleFName,
        String lastMName,
        String firstMName,
        String middleMName
    ) {
        boolean b = false;
        try {
            st = con.createStatement();
            String sql = "UPDATE userform SET lastname = '"+lastName+"',firstname = '"+firstName+"', middlename = '"+middleName+"', datem = "+month+", dated = "+day+", datey = "+year+", placeofbirth = '"+address+"', country = '"+country+"', lastnamefather = '"+lastFName+"', firstnamefather = '"+firstFName+"', middlenamefather = '"+middleFName+"', lastnamemother = '"+lastMName+"', firstnamemother = '"+firstMName+"', middlenamemother ='"+middleMName+"' WHERE tableid = "+id;
            if (st.executeUpdate(sql) == 1) {
                b = true;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SQLConnect.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
        }
        return b;
    }

    public static void main(String[] args) throws Exception {
        // Test if connection to database is OK else throw exception message and stacktrace
        SQLConnect db = new SQLConnect();
        db.connectDB();
    }


}
