package com.google.voteridapplication.things;

public class Hotel {
	
	String names[]=new String[4];
	int index=0;
	
	public int getlength(){
		return names.length;
		
	}
	
	public String savenames(String hotelnames) {
		if(this.index<getlength()) {
			names[index]=hotelnames;
			index++;
			System.out.println("Name: "+ hotelnames);
			return "Saved succussfully";
			
		}else {
			System.out.println(" "+ hotelnames);
			return "Not saved";
		}
	}
	
	public void read() {
		for(int index=0; index<this.getlength(); index++) {
			System.out.println(" "+ names[index]);
		}
		}
	
	public String update(String oldname,String newname) {
		for(int index=0; index<this.getlength(); index++) {
			if(names[index]==oldname) {
				names[index]=newname;
				System.out.println(" "+ oldname + "to"+ newname);
				
			}
		}
		return "updated successfully";
	}
	
	public String delete(String name) {
		for(int index=0; index<this.getlength(); index++) {
			if(names[index]==name) {
				names[index]=null;
				
			}
		}
		return "deleted successfully";
	}
	
	public void search(String name1) {
		for(String name2:names) {
			if(name1==name2) {
				System.out.println("Found: "+ name1);
			}
		}
	}
	
	}

