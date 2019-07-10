package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	// This should change based on the pipeline.
	private static final String DEFAULT_DB = "mysql";
	
	//需要输入我们想要什么样的DB
	public static DBConnection getConnection(String db) {
		switch (db) {
		case "mysql":
			 return new MySQLConnection();
			//return null;
		case "mongodb":
			//return new MongoDBConnection();
			return null;
		default:
			//return new MySQLConnection();
			throw new IllegalArgumentException("Invalid db:" + db);
		}

	}

	//在code中调用DBConnectionFactory.getConnection的时候，如果input是空，那么就调用了这个函数
	public static DBConnection getConnection() {
		//强制以mysql为input去调用上面那个重名函数，就可以创建一个mysqlconnection
		return getConnection(DEFAULT_DB);
	}
}
