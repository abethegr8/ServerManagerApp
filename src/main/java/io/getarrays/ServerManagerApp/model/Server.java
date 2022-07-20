package io.getarrays.ServerManagerApp.model;

import io.getarrays.ServerManagerApp.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Server {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;                // server id, represent id of the server, also primary key in a DB
    @Column(unique = true)          // throws exception cannot have same IP twice
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;       // server IP
    private String name;            // server name
    private String memory;          // server memory
    private String type;            // server type
    private String imageUrl;        // every server will have an image to represent a server
    private Status status;          //server up or server down
}
