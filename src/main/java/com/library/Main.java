package com.library;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int choice, bid;
		String aname, bname;
		CRUD_Functions cf = new CRUD_Functions();
		while(flag) {
			System.out.print("1. Librarian\n2. Student\n0. Exit\nEnter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 0:
					flag = false;
					System.out.println("Thank you...");
					break;
				case 1:
					System.out.print("1. Add book\n2. Remove book\n3. View books\n4. Update book\n5. Search books\n0. Go back\nEnter your choice: ");
					choice = sc.nextInt();
					sc.nextLine();
					switch(choice){
						case 1:
							System.out.print("Enter book name: ");
							bname = sc.nextLine();
							System.out.print("Enter author name: ");
							aname = sc.nextLine();
							cf.addBook(bname, aname);
							break;
						case 2:
							System.out.print("Enter book id to remove: ");
							bid = sc.nextInt();
							cf.removeBook(bid);
							break;
						case 3:
							System.out.println("All available books in library: ");
							cf.readBooks();
							break;
						case 4:
							System.out.println("1. Update name\n2. Update author\n0. Go back\nEnter your choice: ");
							choice = sc.nextInt();
							switch(choice) {
								case 1:
									System.out.println("Enter id to update name: ");
									bid = sc.nextInt();
									sc.nextLine();
									System.out.println("Enter name to update: ");
									String name = sc.nextLine();
									cf.updateName(bid, name);
									break;
								case 2:
									System.out.println("Enter id to update author: ");
									bid = sc.nextInt();
									sc.nextLine();
									System.out.println("Enter author to update: ");
									aname = sc.nextLine();
									cf.updateAuthor(bid, aname);							
									break;
							}
						break;
						case 5:
							System.out.print("1. Search by id\n2. Search by name\n3. Search by author\n4. Go back\nEnter your choice: ");
							choice = sc.nextInt();
							sc.nextLine();
							switch(choice) {
								case 1:
									System.out.print("Enter id to search book: ");
									bid = sc.nextInt();
									cf.searchById(bid);
									break;
								case 2:
									System.out.println("Enter name to search book:");
									bname = sc.nextLine();
									cf.searchByName(bname);
									break;
								
								case 3:
									System.out.println("Enter author name to search books:");
									aname = sc.nextLine();
									cf.searchByAuthor(aname);
									break;
								case 4:
									break;
								default:
									System.out.println("Enter valid choice!");
							}
						
						break;
					default:
						System.out.println("Enter valid choice!");
					}
					break;	
				case 2:
					System.out.print("1. View books\n2. Borrow book\n3. Return book\n4. Check Availability of book\n5. Search\n0. Go back\nEnter your choice: ");
					choice = sc.nextInt();
					switch(choice) {
						case 0:
							break;
						case 1:
							System.out.println("Available books in library: ");
							cf.readBooks();
							break;
						case 2:
							System.out.println("Enter your id: ");
							int sid = sc.nextInt();
							System.out.print("Enter book id to borrow book: ");
							bid = sc.nextInt();
							cf.borrowBook(bid, sid);
							break;
						case 3:
							System.out.println("Enter your id: ");
							sid = sc.nextInt();
							System.out.print("Enter book id to return book: ");
							bid = sc.nextInt();
							cf.returnBook(bid, sid);
							break;
						case 4:
							System.out.print("Enter book id to check availabity: ");
							bid = sc.nextInt();
							if(cf.checkAvailability(bid)) {
								System.out.println("The book is unavailable");

							}
							else {
								System.out.println("The book is available!");
							}
							break;
						case 5:
							System.out.print("1. Search by id\n2. Search by name\n3. Search by author\n4. Go back\nEnter your choice: ");
							choice = sc.nextInt();
							sc.nextLine();
							switch(choice) {
								case 1:
									System.out.print("Enter id to search book: ");
									bid = sc.nextInt();
									cf.searchById(bid);
									break;
								case 2:
									System.out.println("Enter name to search book:");
									bname = sc.nextLine();
									cf.searchByName(bname);
									break;
									
								case 3:
									System.out.println("Enter author name to search books:");
									aname = sc.nextLine();
									cf.searchByAuthor(aname);
									break;
								case 4:
									break;
								default:
									System.out.println("Enter valid choice!");
							}
							break;
						default:
							System.out.println("Enter valid choice!");
					}
					
					break;
					default:
						System.out.println("Enter valid choice!");
			}
			
		}
		sc.close();
	}
}
