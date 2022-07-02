package com.hello.exemple01.Repositorys;

import com.hello.exemple01.Entitys.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public boolean insert (User user) {
        return true;
    }

}
