package io.getarrays.ServerManagerApp.repo;

import io.getarrays.ServerManagerApp.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);



}
