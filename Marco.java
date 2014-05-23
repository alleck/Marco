package Marco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;


public class Getfiles {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		/* The loop that has the program continue to send data */
		try {
		int x = 0;
		while(x==0) {
			
			/* The Try / Catch statement that writes errors and stack traces to the Marco.log file */
			try {
				
				PrintWriter writer = new PrintWriter( new FileOutputStream( new File("C:/temp/Marco-error.log"), true));
				PrintWriter writeMain = new PrintWriter( new FileOutputStream( new File("C:/temp/Marco-main.log"), true));
				if(new File("C:/Users/Alleck/Desktop/X-Plane 10/MemoryLog.txt").exists()){
					
							File newfile = new File( "C:/Users/Alleck/Desktop/X-Plane 10/MemoryLog.txt" );
			
									
									/* The Try / Catch to scan the log file for the data to send to the collection server */
									try {
										
										Scanner input = new Scanner( newfile );
										
										Date d1 = new Date();
										System.out.println(d1);
										
										while(input.hasNext()){
										
											System.out.println(input.nextLine());
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
								Thread.sleep(60000);
								
								
								
							} catch (InterruptedException WaitInterruption) {
								Date d1 = new Date();
								writer.println(d1);
								WaitInterruption.printStackTrace(writer);
								writer.println("\n");
								System.exit(1);
							}
				
				}
				////////////////////////*ColdFusion 11*////////////////////////
				
				else if(new File("C:/ColdFusion11/cfusion/logs/coldfusion-out.log").exists()){
					
					File newfile = new File( "C:/ColdFusion11/cfusion/logs/coldfusion-out.log" );
	
							
							/* The Try / Catch to scan the log file for the data to send to the collection server */
							try {
								
								Scanner input = new Scanner( newfile );
								
								Date d1 = new Date();
								System.out.println(d1);
								
								while(input.hasNext()){
								
									System.out.println(input.nextLine());
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
						Thread.sleep(60000);
						
						
						
					} catch (InterruptedException WaitInterruption) {
						Date d1 = new Date();
						writer.println(d1);
						WaitInterruption.printStackTrace(writer);
						writer.println("\n");
						System.exit(1);
					}
		
				}
				
				/////////////////////*ColdFusion 10*////////////////////////
				
				else if(new File("C:/ColdFusion10/cfusion/logs/coldfusion-out.log").exists()){
					
					File newfile = new File( "C:/ColdFusion10/cfusion/logs/coldfusion-out.log" );
	
							
							/* The Try / Catch to scan the log file for the data to send to the collection server */
							try {
								
								Scanner input = new Scanner( newfile );
								
								Date d1 = new Date();
								System.out.println(d1);
								
								while(input.hasNext()){
								
									System.out.println(input.nextLine());
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
						Thread.sleep(60000);
						
						
						
					} catch (InterruptedException WaitInterruption) {
						Date d1 = new Date();
						writer.println(d1);
						WaitInterruption.printStackTrace(writer);
						writer.println("\n");
						System.exit(1);
					}
		
				}
				
				////////////////////////*ColdFusion 9*////////////////////////
				
				else if(new File("C:/ColdFusion9/logs/application.log").exists()){
					
					File newfile = new File( "C:/ColdFusion9/logs/application.log" );
	
							
							/* The Try / Catch to scan the log file for the data to send to the collection server */
							try {
								
								Scanner input = new Scanner( newfile );
								
								Date d1 = new Date();
								System.out.println(d1);
								
								while(input.hasNext()){
								
									System.out.println(input.nextLine());
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
						Thread.sleep(60000);
						
						
						
					} catch (InterruptedException WaitInterruption) {
						Date d1 = new Date();
						writer.println(d1);
						WaitInterruption.printStackTrace(writer);
						writer.println("\n");
						writer.close();
						System.exit(1);
					}
		
				} else {
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
