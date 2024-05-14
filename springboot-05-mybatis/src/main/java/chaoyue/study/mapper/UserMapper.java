package chaoyue.study.mapper;

import chaoyue.study.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from springboot_study_user")
    List<User> findAll();
}
