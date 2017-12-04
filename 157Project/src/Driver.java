// package jdbcdemo;

import java.sql.*;

public class Driver {

	// Queries for adding titles table
	static String titles[] = {
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0743250974','1','2004','12.20','The 7 Habits','6')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0814436714','1','2017','20.75','Ask More Questions','7')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('1250093465','1','2017','41.20','The Code of Trust','9')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('1501124021','1','2017','1314.20','Principles: Life and Work','10')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0062457713','1','2016','245.20','The Subtle Art','12')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0375869026','1','2012','1.20','Wonder','1')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0143111728','1','2017','65.20','Find your why','11')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('1623156122','1','2016','34.20','The Instant Pot','0')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0545392551','1','2012','23.20','Giraffes cant dance','2')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0316512583','1','2017','12.20','Obama','3')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0385514239','1','2017','76.20','Origin','4')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0399593489','1','2017','65.20','The Midnight Line','5')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('1632861054','1','2017','43.20','A More Beautiful Question','8')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('150117813X','1','2017','35.20','In the Midst of Winter','13')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0545791324','1','2016','99.20','Harry Potter','14')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0385514200','1','1995','23.24','Alice','3')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('1300523489','1','2005','65.02','The Wolf','15')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('2400861054','1','2017','24.65','My Life','11')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('000137213X','1','2003','46.78','Basketball Time','23')",
			"INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('1115741315','1','2010','100.99','Lives Matter','1')"
	};
	
	// Queries for adding publishers table
	static String publishers[] = {
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Rockridge Press')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Knopf Books for Young Reader')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Cartwheel Books')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Brown and Company')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Doubleday')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Delacorte Press')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Touchstone')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Amacom')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Bloomsbury USA')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('St. Martin Press')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Simon and Schuster')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Portfolio')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('HarperOne')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Atria Books')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Arthur A. Levine Books')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Pearson')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Informa')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Mondadori')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Wiley')",
			"INSERT IGNORE INTO publishers(publisherName) VALUES ('Cornelsen')",
	};
	
	// Queries for adding authors table
	static String authors[] = {
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Laurel','Randolph')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('RJ','Palacio')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Giles','Andreae')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Pete','Randolph')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Dan','Brown')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Lee','Child')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Stephen','Covey')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Frank','Sesno')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Warren','Berger')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Robin','Dreeke')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Ray','Dalio')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Simon','Sinek')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Mark','Manson')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Isabel','Allende')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('JK','Rowling')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Lebron','James')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Kevin','Durrant')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Jeremy','Lin')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Yao','Ming')",
			"INSERT IGNORE INTO authors(firstName, lastName) VALUES ('Stephen','Curry')",
	};
	
	// Queries for adding authorISBN table
	static String authorISBN[] = {
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('0','1623156122')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('1','0375869026')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('2','0545392551')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('3','0316512583')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('4','0385514239')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('5','0399593489')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('6','0743250974')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('7','0814436714')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('8','1632861054')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('9','1250093465')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('10','1501124021')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('11','0143111728')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('12','0062457713')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('13','150117813X')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('13','0545791324')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('14','1235124021')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('15','0523131728')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('16','1063454613')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('17','1524387133')",
			"INSERT IGNORE INTO authorISBN(authorID, ISBN) VALUES ('18','1336745324')",
	};
			
	public static void resetDatabase(Connection conn){
		try {
			Statement stm = conn.createStatement();
			//drop the database every time run the code. and create it again
			stm.execute("DROP DATABASE Books");
		} catch(Exception e) {
			
		}
		try{
			// Use Database
			Statement stm = conn.createStatement();
			stm.execute("CREATE DATABASE Books");
			stm.execute("USE Books");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Cannot connect to the database");
			System.exit(0);
		}
		
	}
	
	public static void createTable(Connection conn){
		
		try {
			Statement stm = conn.createStatement();
			// it has to be this order,because some tables need to be referenced by other tables. when insert demo data, it also needs to be this order
			//create author table
			stm.execute("CREATE TABLE `authors` (`authorID` INT(11) NOT NULL AUTO_INCREMENT, `firstName` VARCHAR(20) NOT NULL, `lastName` VARCHAR(20) NOT NULL, PRIMARY KEY (`authorID`))");
			//create publisher table
			stm.execute("CREATE TABLE `publishers` (`publisherID` INT(11) NOT NULL AUTO_INCREMENT, `publisherName` VARCHAR(100) NOT NULL, PRIMARY KEY (`publisherID`))");
			//create title table
			stm.execute("CREATE TABLE `titles` (`isbn` VARCHAR(10) NOT NULL, `editionNumber` INT(11) NOT NULL, `year` VARCHAR(4) NOT NULL, `publisherID` INT(11) NOT NULL, `price` DECIMAL(8,2) NOT NULL, `title` VARCHAR(500) NOT NULL, PRIMARY KEY (`isbn`), INDEX `publisher_ID_FK_idx` (`publisherID` ASC), CONSTRAINT `publisher_ID_FK` FOREIGN KEY (`publisherID`) REFERENCES `publishers` (`publisherID`) ON DELETE NO ACTION ON UPDATE NO ACTION)");
			//create authorISBN table
			stm.execute("CREATE TABLE `authorISBN` (`authorID` INT(11) NOT NULL, `isbn` VARCHAR(10) NOT NULL, INDEX `ID_FK_idx` (`authorID` ASC), INDEX `title_fk_idx` (`isbn` ASC), CONSTRAINT `ID_FK` FOREIGN KEY (`authorID`) REFERENCES `authors` (`authorID`) ON DELETE NO ACTION ON UPDATE NO ACTION, CONSTRAINT `title_fk` FOREIGN KEY (`isbn`) REFERENCES `titles` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Update a current existing author in authors table
	// Prints updated authors table
	public static void updateAuthor() throws Exception {
		try {
			Connection conn = getConnection();
			String query = "UPDATE authors SET firstName = 'Stephen', lastName = 'King' WHERE authorID = '6'";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("After updating author 6");	
			getAuthors();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Update a current existing publisher in publisher table
	// Prints updated publisher table
	public static void updatePublisher() throws Exception {
		try {
			Connection conn = getConnection();
			String query = "UPDATE publishers SET publisherName = 'Penguin Random House' WHERE publisherID = '6'";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("After updating publisher 6");	
			getPublishers();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Adds a new publisher to publisher table
	// Prints updated publisher table
	public static void addNewPublisher() throws Exception {
		try {
			Connection conn = getConnection();
			String query = "INSERT IGNORE INTO publishers(publisherName) VALUES ('The Viking Press-James Lloyd');";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("After adding new Publisher");	
			getPublishers();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

	// Adds new author in authors table
	// Prints updated Authors table
	public static void addNewAuthor() throws Exception {
		try {
			Connection conn = getConnection();
			String query = "INSERT IGNORE INTO authors(firstName, lastName) VALUES ('John','Steinbeck')";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("After adding new Author");	
			getAuthors();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

	// Adds new title to titles table
	public static void addNewTitle() throws Exception {
		try {
			Connection conn = getConnection();
			String query = "INSERT IGNORE INTO titles(isbn, editionNumber, year, price, title, publisherID) VALUES ('0143039431','1','2006','10','The Grapes of Wrath','6')";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.executeUpdate();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Gets Title, Year, ISBN of books published by publisher ordered by title
	// Joins title and publishers table
	// String publisher name of the requested publisher
	public static void getSpecificPublishers(String publisher) throws Exception {
		try {
			int counter = 1;
			Connection conn = getConnection();
			String query = "SELECT title, year, isbn FROM publishers JOIN titles ON publishers.publisherID = titles.publisherID WHERE publishers.publisherName ='"+ publisher + "' ORDER BY title";
			PreparedStatement statement = conn.prepareStatement(query);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				System.out.println(counter + ": " + result.getString("title") + " " + result.getString("year") + " " + result.getString("isbn"));
				counter++;
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Prints current publishers from publisher table
	public static void getPublishers() throws Exception {
		try {
			int counter = 1;
			Connection conn = getConnection();
			String query = "SELECT publisherName FROM publishers;";
			PreparedStatement statement = conn.prepareStatement(query);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				System.out.println(counter + ": " + result.getString("publisherName"));
				counter++;
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Prints authors from authors table ordered by last name then first name
	public static void getAuthors() throws Exception {
		try {
			int counter = 1;
			Connection conn = getConnection();
			String query = "SELECT firstName, lastName FROM authors ORDER BY lastName, firstName;";
			PreparedStatement statement = conn.prepareStatement(query);
		
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				System.out.println(counter + ": " + result.getString("firstName") + " " + result.getString("lastName"));
				counter++;
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Creates a connection with the database Books
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/Books";
			String username = "root";
			String password = "password"; //EDIT FOR LOCAL CHANGES TO YOUR LOCAL PW FOR MYSQL!!!!!!!!!!!!!!!!!!!!!!!!!
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static void insertData(Connection conn) throws Exception {		
		try {

			// Insert author table
			for (int i=0; i < 20; i++){
				PreparedStatement insert = conn.prepareStatement(authors[i]);
				insert.executeUpdate();	
			}
			
			// Insert publishers table
			for (int i=0; i < 20; i++){
				PreparedStatement insert = conn.prepareStatement(publishers[i]);
				insert.executeUpdate();
			}
			// Insert titles data
			for (int i=0; i < 20; i++){
				PreparedStatement insert = conn.prepareStatement(titles[i]);
				insert.executeUpdate();
			}
			
			// Insert authorISBN
			for (int i=1; i <= 20; i++){
				PreparedStatement insert = conn.prepareStatement(authorISBN[i]);
				insert.executeUpdate();
			}
			System.out.println("authorISBN table inserted");
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	// Executes all queries
	public static void main(String[] args) throws Exception{

		// Get Connection
		Connection connect = getConnection();
		//Reset Database
		//For first time RUN attempt, make sure you already have a books database because it will try to Delete it first. 
		//If books not there, it will output Can't Connect to DB
		resetDatabase(connect);
		// Create Tables
		createTable(connect);
		// Add Demo Data
		insertData(connect);
		
		System.out.println("Select all authors");
		getAuthors();
		System.out.println("Select all publishers");
		getPublishers();
		System.out.println("Select a specific publisher");
		getSpecificPublishers("Amacom");
		System.out.println("Add new author");
		addNewAuthor();
		System.out.println("Update existing info for author");
		updateAuthor();	
		System.out.println("Add new publisher");
		addNewPublisher();
		System.out.println("Edit existing info for publisher");
		updatePublisher();
		System.out.println("Add new title for an author");
		addNewTitle();
	}
}
