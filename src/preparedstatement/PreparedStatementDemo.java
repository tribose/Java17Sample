package preparedstatement;

import java.sql.*;

public class PreparedStatementDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.Driver");

        Connection connection = DriverManager.getConnection("connection_url", "user_name", "password");

        String stmnt = "SELECT emp.name as emp_name from employee emp where emp.age > ?";
        PreparedStatement preparedStatement = connection.prepareStatement(stmnt);
        preparedStatement.setDouble(1, 30);

        ResultSet rs = preparedStatement.executeQuery();

        StringBuilder sb = new StringBuilder();

        while (!rs.next()) {
            sb.append(rs.getString("emp_name"));
        }

    }
}
