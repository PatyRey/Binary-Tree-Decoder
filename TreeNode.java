/****************************************************************
 
  	File Name:		 TreeNode.java 
  	  	
  	This program will define the Nodes use to create the tree 
****************************************************************/

	/**
	 * @author Patricia Reyes
	 */
	class TreeNode {
		
		private String data;
	    private TreeNode left;
	    private TreeNode right;
	    
	    /**
	     * constructor 
	     * @param data tree String data
	     */
	    public TreeNode(String data) {
	    	this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	    
	    /**
	     * @return data getters
	     */
	    public String getData() {
	    	return data;
	    }
	  
	    /**
	     * @param data setter
	     */
	    public void setData(String data) {
	    	this.data = data;
	    }
	    
	    /** 
	     * @return left Node, getter
	     */
	    public TreeNode getLeft() {
	    	return left;
	    }
	    
	   /** 
	    * @param left Node, setter
	    */
	    public void setLeft(TreeNode left) {
	    	this.left = left;
	    }
	   
	    /**
	     * @return right Node, getter
	     */
	    public TreeNode getRight() {
	    	return right;
	    }
	   
	    /** 
	     * @param right Node, setter
	     */
	    public void setRight(TreeNode right) {
	    	this.right = right;
	    }
	        
	
	}