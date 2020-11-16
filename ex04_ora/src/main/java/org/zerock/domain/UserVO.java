package org.zerock.domain;

public class UserVO {

	private String uid1;
	private String upw1;
	private String uname1;
	private int upoint1;
	public String getUid1() {
		return uid1;
	}
	public void setUid1(String uid1) {
		this.uid1 = uid1;
	}
	public String getUpw1() {
		return upw1;
	}
	public void setUpw1(String upw1) {
		this.upw1 = upw1;
	}
	public String getUname1() {
		return uname1;
	}
	public void setUname1(String uname1) {
		this.uname1 = uname1;
	}
	public int getUpoint1() {
		return upoint1;
	}
	public void setUpoint1(int upoint1) {
		this.upoint1 = upoint1;
	}
	@Override
	public String toString() {
		return "UserVO [uid1=" + uid1 + ", upw1=" + upw1 + ", uname1=" + uname1 + ", upoint1=" + upoint1 + "]";
	}

}
