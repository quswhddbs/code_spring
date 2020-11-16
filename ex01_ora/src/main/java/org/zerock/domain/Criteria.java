package org.zerock.domain;

public class Criteria {

	private int page;
	private int startNum;
	private int endNum;
	private int perPageNum;

	public Criteria() {
		this.page = 1;
		setPerPageNum(10);
	}

	public void setPage(int page) {

		if (page <= 0) {
			this.page = 1;
			return;
		}

		this.page = page;
	}

	public void setPerPageNum(int perPageNum) {

		if (perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}

		this.perPageNum = perPageNum;
		this.startNum = getPageStart();
		this.endNum = this.startNum + (this.perPageNum -1) ;
	}

	public int getPage() {
		return page;
	}

	// method for MyBatis SQL Mapper -
	public int getPageStart() {
		return ((this.page - 1) * perPageNum) + 1 ;
	}

	// method for MyBatis SQL Mapper
	public int getPerPageNum() {

		return this.perPageNum;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", startNum=" + startNum + ", endNum=" + endNum + ", perPageNum=" + perPageNum
				+ "]";
	}

}
