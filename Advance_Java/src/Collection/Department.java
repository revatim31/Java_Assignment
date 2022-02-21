package Collection;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

 class  Department   {
		 
		 private int did;
		 private String dname;
	
		 
		 public int getDid() {
			return did;
		}



		public void setDid(int did) {
			this.did = did;
		}



		public String getDname() {
			return dname;
		}



		public void setDname(String dname) {
			this.dname = dname;
		}



		public Department(int did, String dname) {
		  super();
		  this.did = did;
		  this.dname = dname;
		  
		 }
		 
		 
		 
		 
		 
		
		  
		 @Override
		  public String toString() {
			
		   return "Department [id=" + did + ", name=" + dname+ ",]";
		   
		  }
		 
		}
	
		 

