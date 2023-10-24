package com.dev.otp.Alert.Repo;

import com.dev.otp.Alert.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DBStore extends JpaRepository<UserEntity,String> {

}
