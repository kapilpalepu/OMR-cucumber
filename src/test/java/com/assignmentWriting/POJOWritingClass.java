package com.assignmentWriting;

import java.util.ArrayList;


public class POJOWritingClass {
private int page;
private int per_page;
private int total;
private int total_pages;
private ArrayList<POJODataWriting>  data;
private POJOSuport support;



public POJOWritingClass(int page, int per_page, int total, int total_pages, ArrayList<POJODataWriting> data,
		POJOSuport support) {
	super();
	this.page = page;
	this.per_page = per_page;
	this.total = total;
	this.total_pages = total_pages;
	this.data = data;
	this.support = support;
}
public POJOSuport getSupport() {
	return support;
}
public void setSupport(POJOSuport support) {
	this.support = support;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getPer_page() {
	return per_page;
}
public void setPer_page(int per_page) {
	this.per_page = per_page;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getTotal_pages() {
	return total_pages;
}
public void setTotal_pages(int total_pages) {
	this.total_pages = total_pages;
}
public ArrayList<POJODataWriting> getData() {
	return data;
}
public void setData(ArrayList<POJODataWriting> data) {
	this.data = data;
}






}
