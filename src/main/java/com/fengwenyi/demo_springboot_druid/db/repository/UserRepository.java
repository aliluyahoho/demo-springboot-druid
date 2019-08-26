package com.fengwenyi.demo_springboot_druid.db.repository;

import com.fengwenyi.demo_springboot_druid.db.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Erwin Feng
 * @since 2019/8/26 09:44
 */
public interface UserRepository extends JpaRepository<UserModel, String> {
}
