package org.zerock.persistence;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

public interface SampleMapper {

	@Select("select now()")
	public String getTime();

	
	@Select("select uname from tbl_user "
			+ " where uid= #{uid} and upw = #{upw}")
	public String getEmail (
			@Param("uid")String uid, 
			@Param("upw") String upw);
	
	
	@SelectProvider(type=SampleProvider.class, method="searchUserName")
	public String search(
	    @Param("type")String type, 
	    @Param("keyword")String keyword);
	
	
	// xml 이용한 메서드
	public String getUserName(
			@Param("uid")String uid, 
			@Param("upw") String upw);
	
}
