package com.example.Loveable.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.Instant;//instant is class used to define time

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)//makes all the entity private so we don't need to define them private seperately
@Entity
public class User {
    Long id;
    String email;
    String passwordHash;
    String name;
    String avatarURL;
    Instant createdAt;//same as localDateTime but here you get more functionality
    Instant updatedAt;
    Instant deletedAt;




}
