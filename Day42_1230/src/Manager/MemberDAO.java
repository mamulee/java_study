package Manager;

import java.util.*;
import java.sql.*;

public class MemberDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "test1";
	String passwd = "test1";

	public MemberDAO(){
		try{
			// 드라이버 로딩. OracleDriver 클래스를 자바에서 이용하기 위해 JVM에 올려줌
			Class.forName(driver);
		}catch(Exception e){
			e.printStackTrace();
		}
	} // 생성자

	// 회원정보 보기
	public ArrayList<MemberDTO> select(){

		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			con = DriverManager.getConnection(url, userid, passwd);
			String query = "SELECT * FROM member";
			// PreparedStatement 생성. 요청할 SQL문을 전송하고 실행하는 클래스
			pstmt = con.prepareStatement(query);
			// 전송된 SQL문이 DB에서 실행되고 결과를 담아 줄 ResultSet 작성
			rs = pstmt.executeQuery();

			while(rs.next()){
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getInt("height"));
				dto.setWeight(rs.getInt("weight"));
				dto.setSex(rs.getString("sex").charAt(0));
				// 컬렉션의 리스트에다 데이터베이스의 레코드를 모두 가져와 넣어줌
				list.add(dto);
			}
		}catch(Exception e){e.printStackTrace();

		}finally{
			try{
				// 자원 반납
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();

			}catch(Exception e){e.printStackTrace();}

		}
		return list;

	} // end 회원정보 보기

	// 회원 정보 저장
	public int insert(String name, String age, String height, String weight, String sex) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;

		try{
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "INSERT INTO member(name, age, height, weight, sex)" +
					" VALUES(?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(age));
			pstmt.setInt(3, Integer.parseInt(height));
			pstmt.setInt(4, Integer.parseInt(weight));
			pstmt.setString(5, sex);
			n = pstmt.executeUpdate();
		}catch(Exception e){e.printStackTrace();

		}finally{

			try{
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e){e.printStackTrace();}
		}
		return n;

	} // 저장

	// 회원 정보 삭제
	public int delete(String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;

		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "DELETE FROM member WHERE name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			n = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	} // 삭제

	// 회원 정보 수정
	public int update(String name, String age, String height, String weight, String sex){
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;

		try{
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "UPDATE member SET age=?, height=?, " +
			    " weight=?, sex=? WHERE name = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(age));
			pstmt.setInt(2, Integer.parseInt(height));
			pstmt.setInt(3, Integer.parseInt(weight));
			pstmt.setString(4, sex);
			pstmt.setString(5, name);

			n = pstmt.executeUpdate();

		}catch(Exception e){e.printStackTrace();

		}finally{

			try{
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();

			}catch(Exception e){e.printStackTrace();}
		}
		return n;

	} // end 회원정보 수정

	// 회원 정보 조회에 사용할 이름 존재 여부 검사
	public boolean isExist(String name) {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM member WHERE name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1,  name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 회원 정보 검색
	public MemberDTO search(String name) throws RecordNotFoundException {
		
		if(!isExist(name)) {
			throw new RecordNotFoundException("\""+name+"\"(은)는 없습니다.");
		}
		
		MemberDTO dto = new MemberDTO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM member WHERE name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.setName(rs.getString(1));
				dto.setAge(rs.getInt(2));
				dto.setWeight(rs.getInt(3));
				dto.setHeight(rs.getInt(4));
				dto.setSex(rs.getString(5).charAt(0));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dto;
	} // 검색


} // MemberDAO class
