package db;


//这个interface定义一堆method, 这些method是我们用任何Database都会override的method，比如说我们db.mysql的MySQLConnection
public interface DBConnection {
	/**
	 * Close the connection.
	 */
	public void close();

	
	public String getFullname(String userId);

	/**
	 * Return whether the credential is correct. (This is not needed for main
	 * course, just for demo and extension)
	 * 
	 * @param userId
	 * @param password
	 * @return boolean
	 */
	public boolean verifyLogin(String userId, String password);
	
	/**
	 * Register one user
	 * 
	 * @param userId
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @return boolean
	 */
	public boolean registerUser(String userId, String password, String firstname, String lastname);

}
