package com.tradeing.trading.repository;

import com.tradeing.trading.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserModel,Integer> {
 @Query(value = "select * from users where email==?1",nativeQuery = true)
//     void findByEmail(String email);
//  void  findByEmail(String email);
 Optional<UserModel> findByEmail(String email);





}
