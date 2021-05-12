	package dao;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	
	import model.Persons;
		public class ListPersonsDao {
			Connection getConnect() {
	            Connection con = null;
	
	 
	
	            try {
	                Class.forName("com.mysql.cj.jdbc.Driver");
	                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java200", "root", "root");
	                System.out.println("connected");
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	            return con;
	        }
	
	 
	
	        public boolean addPerson(Persons person) {
	            boolean b = false;
	            try {
	                Connection con = getConnect();
	                PreparedStatement pst = con
	                        .prepareStatement("insert into person(ename,contactno,email,gender,address)values(?,?,?,?,?)");
	                pst.setString(1, person.getEname());
	                pst.setString(2, person.getContactno());
	                pst.setString(3, person.getEmail());
	                pst.setString(4, person.getGender());
	                pst.setString(5, person.getAddress());
	                int res = pst.executeUpdate();
	                if (res > 0) {
	                    b = true;
	                }
	
	 
	
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	            return b;
	        }
	
	 
	
	        public List<Persons> listPersons() {
	        //public List<Person> listPersons() {
	            List<Persons> list = new ArrayList<Persons>();
	            try {
	                Connection con = getConnect();
	                Statement st = con.createStatement();
	                ResultSet res = st.executeQuery("select * from person");
	                while(res.next()) {
	                    Persons p = new Persons(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
	                    list.add(p);
	                    
	                }
	                res.close();
	          }catch (Exception e) {
	                System.out.println(e);
	            }
	        return list;
	        }
	        
	        public boolean validate(String uname, String pword) {
	            boolean b = false;
	            try {
	                Connection con = getConnect();
	                PreparedStatement pst = con.prepareStatement("select * from person where ename = ? and contactno=?");
	                pst.setString(1, uname);
	                    pst.setString(2, pword);
	                    
	                    ResultSet res = pst.executeQuery();
	                    if(res.next()) {
	                        b = true;
	                    }
	                
	            }catch(Exception e) {
	                System.out.println(e);
	            }
	            return b;
	        }
	    public boolean delPerson(int num) {
	        boolean b = false;
	        try {
	            Connection con = getConnect();
	            PreparedStatement pst = con.prepareStatement("delete from person where pid = ?");
	            pst.setInt(1, num);
	            int res = pst.executeUpdate();
	            if(res > 0) {
	                b = true;
	            }
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	        return b;
	    }
		}
		 
	 
	
	
	
	
