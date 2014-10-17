package Marco;

/* Imports for required libraries. Would not touch unless you understand Java well */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Getfiles {

	public static void main(String[] args) throws UnknownHostException {
              /* Lowers the priority of the thread, to cause the "current" least possible load on the machine it is running on. */
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

              /* Connection initialization to a MySQL database is defined here below */
		Connection Conn = null;
		String ConnString = "jdbc:mysql://localhost/sqldatabase";
		String ConnUser = "User";
		String ConnPass = "Pass123!";

		/* The loop that has the program continue to send data */
		try {
		int x = 0;
		while(x==0) {

			/* The Try / Catch statement that writes errors and stack traces to the Marco.log file */
			try {
				
				PrintWriter writer = new PrintWriter( new FileOutputStream( new File("C:/temp/Marco-error.log"), true));
				PrintWriter writeMain = new PrintWriter( new FileOutputStream( new File("C:/temp/Marco-main.log"), true));

                            /* <strictlyTestScript> */
				if(new File("C:/Users/Alleck/Desktop/X-Plane 10/MemoryLog.txt").exists()){
					
							File newfile = new File( "C:/Users/Alleck/Desktop/X-Plane 10/MemoryLog.txt" );
			
									
									/* The Try / Catch to scan the log file for the data to send to the collection server */
									try {
										
										Scanner input = new Scanner( newfile );
										
										Date d1 = new Date();
										System.out.println(d1);
										
										while(input.hasNext()){
											
											System.out.println(input.nextLine());
											
											
											try {
												String Query = "INSERT INTO Marco_main (Server, Outlogs, TimeStamp) VALUES ('" + InetAddress.getLocalHost().getHostName() +"', '" + input.nextLine().toString() + "', NOW())";
											    Conn = DriverManager.getConnection(ConnString, ConnUser, ConnPass);
											    Statement stmt = Conn.createStatement();
											    stmt.executeUpdate(Query);

											    Conn.close();
											    // Do something with the Connection

											} catch (SQLException ex) {
											    // handle any errors
											    System.out.println("SQLException: " + ex.getMessage());
											    System.out.println("SQLState: " + ex.getSQLState());
											    System.out.println("VendorError: " + ex.getErrorCode());
											}
											
											
											
										}
										writeMain.println(d1);
										writeMain.println(Thread.getAllStackTraces());
										writeMain.println("\n");
										writeMain.close();
										input.close();
									} catch (FileNotFoundException SourceFileNotFound) {
											Date d1 = new Date();
											writer.println(d1);
											SourceFileNotFound.printStackTrace(writer);
										    writer.println("\n");
										    writer.close();
										    System.exit(1);
									}
									
							/* The Try / Catch to pause the process for 1 minute per iteration */	
							try {
								System.gc();
								Thread.sleep(3600000);
								
								
								
							} catch (InterruptedException WaitInterruption) {
								Date d1 = new Date();
								writer.println(d1);
								WaitInterruption.printStackTrace(writer);
								writer.println("\n");
								System.exit(1);
							}
				
				}

                           /* </strictlyTestScript> */

				/* <ColdFusion 11> */
				else if(new File("C:/ColdFusion11/cfusion/logs/coldfusion-out.log").exists()){
					
					File newfile = new File( "C:/ColdFusion11/cfusion/logs/coldfusion-out.log" );
	
							
							/* The Try / Catch to scan the log file for the data to send to the collection server */
							try {
								
								Scanner input = new Scanner( newfile );
								
								Date d1 = new Date();
								System.out.println(d1);
								
								while(input.hasNext()){
									
									System.out.println(input.nextLine());
									
									
									try {
										String Query = "INSERT INTO Marco_main (Server, Outlogs, TimeStamp) VALUES ('" + InetAddress.getLocalHost().getHostName() +"', '" + input.nextLine().toString() + "', NOW())";
									    Conn = DriverManager.getConnection(ConnString, ConnUser, ConnPass);
									    Statement stmt = Conn.createStatement();
									    stmt.executeUpdate(Query);

									    Conn.close();
									    // Do something with the Connection

									} catch (SQLException ex) {
									    // handle any errors
									    System.out.println("SQLException: " + ex.getMessage());
									    System.out.println("SQLState: " + ex.getSQLState());
									    System.out.println("VendorError: " + ex.getErrorCode());
									}
									
									
									
								}
								writeMain.println(d1);
								writeMain.println(Thread.getAllStackTraces());
								writeMain.println("\n");
								writeMain.close();
								input.close();
							} catch (FileNotFoundException SourceFileNotFound) {
									Date d1 = new Date();
									writer.println(d1);
									SourceFileNotFound.printStackTrace(writer);
								    writer.println("\n");
								    writer.close();
								    System.exit(1);
							}
							
					/* The Try / Catch to pause the process for 1 minute per iteration */	
					try {
						System.gc();
						Thread.sleep(3600000);
						
						
						
					} catch (InterruptedException WaitInterruption) {
						Date d1 = new Date();
						writer.println(d1);
						WaitInterruption.printStackTrace(writer);
						writer.println("\n");
						System.exit(1);
					}
		
				}

                            /* </ColdFusion 11> */
				
				/* <ColdFusion 10>*/
				
				else if(new File("C:/ColdFusion10/cfusion/logs/coldfusion-out.log").exists()){
					
					File newfile = new File( "C:/ColdFusion10/cfusion/logs/coldfusion-out.log" );
	
							
							/* The Try / Catch to scan the log file for the data to send to the collection server */
							try {
								
								Scanner input = new Scanner( newfile );
								
								Date d1 = new Date();
								System.out.println(d1);
								
								
								while(input.hasNext()){
								
									System.out.println(input.nextLine());
									
									
									try {
										String Query = "INSERT INTO Marco_main (Server, Outlogs, TimeStamp) VALUES ('" + InetAddress.getLocalHost().getHostName() +"', '" + input.nextLine().toString() + "', NOW())";
									    Conn = DriverManager.getConnection(ConnString, ConnUser, ConnPass);
									    Statement stmt = Conn.createStatement();
									    stmt.executeUpdate(Query);

									    Conn.close();
									    // Do something with the Connection

									} catch (SQLException ex) {
									    // handle any errors
									    System.out.println("SQLException: " + ex.getMessage());
									    System.out.println("SQLState: " + ex.getSQLState());
									    System.out.println("VendorError: " + ex.getErrorCode());
									   
									} catch (NoSuchElementException ex){
										System.out.println("End of line!");
									}
									
									
									
								}
								writeMain.println(d1);
								writeMain.println(Thread.getAllStackTraces());
								writeMain.println("\n");
								writeMain.close();
								input.close();
							} catch (FileNotFoundException SourceFileNotFound) {
									Date d1 = new Date();
									writer.println(d1);
									SourceFileNotFound.printStackTrace(writer);
								    writer.println("\n");
								    writer.close();
								    System.exit(1);
							}
							
					/* The Try / Catch to pause the process for 1 minute per iteration */	
					try {
						System.gc();
						Thread.sleep(3600000);
						
						
						
					} catch (InterruptedException WaitInterruption) {
						Date d1 = new Date();
						writer.println(d1);
						WaitInterruption.printStackTrace(writer);
						writer.println("\n");
						System.exit(1);
					}
		
				}
                           /* </ColdFusion 10>*/
				
				/* <ColdFusion 9> */
				
				else if(new File("C:/ColdFusion9/logs/application.log").exists()){
					
					File newfile = new File( "C:/ColdFusion9/logs/application.log" );
	
							
							/* The Try / Catch to scan the log file for the data to send to the collection server */
							try {
								
								Scanner input = new Scanner( newfile );
								
								Date d1 = new Date();
								System.out.println(d1);
								
								while(input.hasNext()){
									
									System.out.println(input.nextLine());
									
									
									try {
										String Query = "INSERT INTO Marco_main (Server, Outlogs, TimeStamp) VALUES ('" + InetAddress.getLocalHost().getHostName() +"', '" + input.nextLine().toString() + "', NOW())";
									    Conn = DriverManager.getConnection(ConnString, ConnUser, ConnPass);
									    Statement stmt = Conn.createStatement();
									    stmt.executeUpdate(Query);

									    Conn.close();
									    // Do something with the Connection

									} catch (SQLException ex) {
									    // handle any errors
									    System.out.println("SQLException: " + ex.getMessage());
									    System.out.println("SQLState: " + ex.getSQLState());
									    System.out.println("VendorError: " + ex.getErrorCode());
									}
									
									
									
								}
								writeMain.println(d1);
								writeMain.println(Thread.getAllStackTraces());
								writeMain.println("\n");
								writeMain.close();
								input.close();
							} catch (FileNotFoundException SourceFileNotFound) {
									Date d1 = new Date();
									writer.println(d1);
									SourceFileNotFound.printStackTrace(writer);
								    writer.println("\n");
								    writer.close();
								    System.exit(1);
							}
							
					/* The Try / Catch to pause the process for 1 minute per iteration */	
					try {
						System.gc();
						Thread.sleep(3600000);
						
						
						
					} catch (InterruptedException WaitInterruption) {
						Date d1 = new Date();
						writer.println(d1);
						WaitInterruption.printStackTrace(writer);
						writer.println("\n");
						writer.close();
						System.exit(1);
					}
		
				} 

                            /* </ColdFusion 9> */
                            else {
					Date d1 = new Date();
					writer.println(d1);
					writer.println("The log files defined for ColdFusion were not found!");
					writer.println("\n");
					writer.close();
					System.gc();
					System.exit(1);
				}
				
			/* Final catch for the log file writer */
			} catch (FileNotFoundException LogFileNotAccessable) {
				LogFileNotAccessable.printStackTrace();
				System.exit(1);
			}
			
		}
		} catch(Error BorkedLoop) {
			BorkedLoop.printStackTrace();
			System.exit(1);
		}
	}
}
