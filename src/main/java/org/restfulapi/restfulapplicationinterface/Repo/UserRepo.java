package org.restfulapi.restfulapplicationinterface.Repo;

import org.restfulapi.restfulapplicationinterface.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
