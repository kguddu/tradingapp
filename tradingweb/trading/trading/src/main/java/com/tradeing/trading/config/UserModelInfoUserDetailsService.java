package com.tradeing.trading.config;

import com.tradeing.trading.model.UserModel;
import com.tradeing.trading.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.HsqlTableMetaDataProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserModelInfoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("1st");
        Optional<UserModel> user = UserRepo.findByEmail(username);

        return user.map(UserInfoDetails::new).orElseThrow(() -> new UsernameNotFoundException("User Does Not exist"));

    }

}
