package io.getarrays.ServerManagerApp.service;

import io.getarrays.ServerManagerApp.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);         //limit of servers or rows when asking for servers, in case there are hundreds of servers
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);

}
