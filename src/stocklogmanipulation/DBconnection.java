package stocklogmanipulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private String url = "jdbc:mysql://localhost:3306/jdbc";
    private String user = "root";  // MySQL 사용자명
    private String password = "1234";  // MySQL 비밀번호

    private Connection connection;

    public DBconnection() {
        try {
            // JDBC 드라이버 로드 (수동으로 추가)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 데이터베이스 연결
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connected successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ MySQL JDBC Driver not found! JAR 파일이 추가되었는지 확인하세요.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Database connection failed!");
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("SQL State: " + e.getSQLState());
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("✅ Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBconnection db = new DBconnection(); // 연결 시도
        db.closeConnection(); // 연결 종료
    }
}
