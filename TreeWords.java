/*****************************************************

  	File Name:		 TreeWords.java 
  	
  	This program will create a tree, it will read the file words.txt
  	and decode the file using decoded.txt, the final decode message
  	will be print
******************************************************/

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author Patricia Reyes
 *
 */

public class TreeWords {
			
	
	private TreeNode root;
	// constructor
	public TreeWords() {
		this.root = new TreeNode(" ");
	}
		        
	/**
	 * This method will insert data into the tree
	 * @param data String
	 * @param key symbols +-
	 */
	public void insert(String data,String key) {
		TreeNode temp = this.root;
			        	
		for(int i = 0; i<key.length()-1; i++) {
			if(key.charAt(i) == '+') {
				temp = temp.getLeft();
			}	
			else {
				temp = temp.getRight();
			}
		}
		if(key.charAt(key.length()-1) == '+') {
			temp.setLeft(new TreeNode(data));
		}
		else {
			temp.setRight(new TreeNode(data));
		}
	}
		
	/**
	 * This method will return the text encoded with the +- key
	 * 
	 * @param key symbol
	 * @return data text
	 */
	public String encode(String key) {
		TreeNode temp = this.root;
		 //  String res = "";
		for(int i = 0; i<key.length(); i++) {
			if(key.charAt(i) == '+') {
				temp = temp.getLeft();	                                
			}
			else {
				temp = temp.getRight();	                                
			}
		}	
		return temp.getData();                  
	}    
	
	/**
	 * This method will read files words.txt and encoded.txt, then print the tree with the message
	 */
	public static void printTree() {
			
		TreeWords tree = new TreeWords();
		
		// reads the words.txt file and inserts words into the tree
		File filename = new File("words.txt");
		try {
			try(BufferedReader br = new BufferedReader(new FileReader(filename))){
				String str;
				while((str= br.readLine())!= null) {
					String strAr[] = str.split(" ");
					tree.insert(strAr[0], strAr[1]);
				}
			}
		} catch (FileNotFoundException e1) {
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		//reads the encoded.txt file and finds the encoded text
		try {
			Scanner file = new Scanner(new File("encoded.txt"));
			String res = "";
			while(file.hasNext()) {
				String key = file.next();
				res += tree.encode(key) + " ";
			}
			//prints the text
			System.out.println(res);
		               	                 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}    
	/**
	 * 	Will call print tree to print tree in to the console 
	 * @param args main
	 * 
	 */
	public static void main(String[] args) {
		// creates the tree object
		        	
		printTree();
		
	}
		
	}