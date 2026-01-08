package com.example.Loveable.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;//instant is class used to define time

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)//makes all the entity private so we don't need to define them private seperately
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String email;
    String passwordHash;
    String name;

    String avatarURL;

    @CreationTimestamp
    Instant createdAt;//same as localDateTime but here you get more functionality

    @UpdateTimestamp
    Instant updatedAt;

    Instant deletedAt;




}
