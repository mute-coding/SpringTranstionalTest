package com.rainey.api.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rainey.api.Model.BankAccunt;

@Mapper
public interface AccuntRepository {
	@Insert("INSERT INTO bankAccunt(username,deposit) VALUES(#{username},#{deposit})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void createAccunt(BankAccunt bankAccunt);
	@Select("SELECT * FROM bankAccunt WHERE id = #{id} ")
	List<BankAccunt> getAccunt(@Param("id") int id);
	@Update("UPDATE bankAccunt SET deposit = deposit + #{amount} WHERE id = #{id} ")
	void increaseDedosit(@Param("id") int id, @Param("amount") Long amount );
	@Update("UPDATE bankAccunt SET deposit = deposit - #{amount} WHERE id = #{id} ")
	void reduceDedosit(@Param("id") int id, @Param("amount") Long amount);
}
